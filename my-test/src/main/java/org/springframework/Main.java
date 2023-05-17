package org.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Main {

	public void init() {
		System.out.println("Hello world!");
	}

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);

		Main app = (Main) applicationContext.getBean("main");

		app.init();


	}
}