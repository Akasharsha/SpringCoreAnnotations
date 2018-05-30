package spring.core.hello.world.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import spring.core.hello.world.repository.MyRepository;

@Service("myService")
public class MyService {

	@Autowired
	@Qualifier("myRepository")
	private MyRepository myRepository;

	public void method1() {
		System.out.println("MyService->method1()");
		myRepository.method1();
	}

}
