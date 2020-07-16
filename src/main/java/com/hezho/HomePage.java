package com.hezho;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.MultiLineLabel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

	public HomePage(final PageParameters parameters) {
		super(parameters);

		WebMarkupContainer container = new WebMarkupContainer("container");

		add(container);

		container.add(new MultiLineLabel("message", "HELLO WORLD \n Make Love with Shilin"));

	}
}
