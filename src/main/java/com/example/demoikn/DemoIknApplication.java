package com.example.demoikn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.theme.Theme;

@Theme(value = "my-app")
@SpringBootApplication
public class DemoIknApplication implements AppShellConfigurator {

	public static void main(String[] args) {
		SpringApplication.run(DemoIknApplication.class, args);
	}

}
