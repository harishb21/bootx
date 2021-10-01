package com.citius.bootx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.citius.bootx.model.Customer;
import com.citius.bootx.service.GreetingService;

@SpringBootApplication
public class BootxApplication implements CommandLineRunner {

	@Autowired
	private GreetingService greetingService;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	public static void main(String[] args) {
		SpringApplication.run(BootxApplication.class, args);
//	ApplicationContext ctx = SpringApplication.run(BootxApplication.class, args);

//	GreetingService  gs =  ctx.getBean("greetingService",GreetingService.class);
		// gs.greet();

		/*
		 * for (String s: ctx.getBeanDefinitionNames()) { System.out.println(s); }
		 */

	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		greetingService.greet();
		
		jdbcTemplate.query("select * from customers", new BeanPropertyRowMapper<Customer>(Customer.class)).stream().forEach(System.out::println);;
		

	}

	@Bean
	public GreetingService greetingService() {
		return new GreetingService();
	}

}
