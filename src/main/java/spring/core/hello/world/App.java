package spring.core.hello.world;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.core.hello.world.config.MyConfig;
import spring.core.hello.world.controller.MyController;

public class App {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		MyController myController = context.getBean(MyController.class);
		myController.method1();
		context.close();
	}
}
