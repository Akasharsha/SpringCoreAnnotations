package spring.core.hello.world.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.core.hello.world.repository.MyRepository;

@Configuration
@ComponentScan(basePackages = { "spring.core" })
public class MyConfig {

	@Bean
	public MyRepository myRepository() {
		return new MyRepository();
	}
}
