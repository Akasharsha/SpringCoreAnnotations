package spring.core.hello.world.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import spring.core.hello.world.service.MyService;

@Controller
public class MyController {
	@Autowired
	@Qualifier("myService")
	private MyService myService;

	public void method1() {
		System.out.println("MyController->method1()");
		myService.method1();

	}

}
