package com.hezho;

import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.WebPage;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

	public HomePage(final PageParameters parameters) {
		super(parameters);

		// 这里的 Link 要有尖括号 <>
		// 参考 https://stackoverflow.com/questions/51931500/wicket-8-wicket-setdefaultmodel-clashes-with-setdefaultmodel
		add(new Link<>("linkId"){
			@Override
			public void onClick() {
				setResponsePage(FormPage.class);
			}
		});


	}
}
