package aop_test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import model.Type;
@Configuration
@Scope("prototype")
public class cnf {
	@Bean
    public Type transferService() {
       return new Type(2,"2222");
    }
}
