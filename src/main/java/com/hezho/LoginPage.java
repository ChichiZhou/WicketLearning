package com.hezho;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;

public class LoginPage extends WebPage {
    public LoginPage(){
        Form form = new Form<>("form"){
            @Override
            protected void onSubmit(){
                super.onSubmit();
                System.out.println("submit");
            }
        };
        Label loginLabel = new Label("loginLabel", "Login: ");
        TextField loginTextField = new TextField("loginTextField", Model.of(""));
        Label passwordLabel = new Label("passwordLabel", "PassWorld");
        PasswordTextField passwordTextField = new PasswordTextField("passwordTextField", Model.of(""));
        Button button = new Button("submit");

        form.add(loginLabel);
        form.add(loginTextField);
        form.add(passwordLabel);
        form.add(passwordTextField);
        form.add(button);
        add(form);


    }

}
