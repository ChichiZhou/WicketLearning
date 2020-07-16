package com.hezho;

import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

	public HomePage(final PageParameters parameters) {
		super(parameters);

		Label label = new Label("label", "LABEL TEST");

		add(label);

		add(new TextField<String>("textfield"));


	}
}
