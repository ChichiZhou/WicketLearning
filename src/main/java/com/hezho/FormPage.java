package com.hezho;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.TextField;

public class FormPage extends WebPage {
    public FormPage(){
        add(new FormPanel("formPanel"));
    }

}
