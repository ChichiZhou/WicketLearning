package com.hezho;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.Model;
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

		Label label = new Label("label", "HELLO WORLD, EVERYONE");

		add(label);

		Label label1 = new Label("thanks", "Thanks");
		label1.setVisible(false);

		add(label1);

		Form form = new Form<>("form"){
			@Override
			protected void onSubmit(){
				label1.setVisible(true);
				super.onSubmit();
			}
		};
		form.add(new Label("name", "HE"));
		form.add(new Label("surname", "ZHOU"));
		form.add(new TextField("nameText", Model.of("")));
		form.add(new TextField("surnameText", Model.of("")));
		form.add(new Button("submit"));

		add(form);
		int messageAmount = 0;
		WebMarkupContainer webMarkupContainer = new WebMarkupContainer("messages"){
			@Override
			protected void onConfigure(){
				super.onConfigure();
				setVisible(messageAmount <= 0);   // 这个可以用来判断是否显示 container 这部分
			}
		};
		webMarkupContainer.add(new Label("amountMessage", messageAmount));
		add(webMarkupContainer);



	}
}
