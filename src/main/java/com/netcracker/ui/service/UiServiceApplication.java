package com.netcracker.ui.service;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@SpringUI
public class UiServiceApplication extends UI
{
	public static void main(String[] args) 
        {
		SpringApplication.run(UiServiceApplication.class, args);
	}
        @Override
        protected void init(VaadinRequest vaadinRequest) {
            setContent(new Label("Hello! I'm the root UI!"));
        }
}
