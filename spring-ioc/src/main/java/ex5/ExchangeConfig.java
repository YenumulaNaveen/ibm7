package ex5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class ExchangeConfig {
	
	@Bean("xe")
	public ExchangeService getService() {
		System.out.println("abc");
		return new ExchangeService();
	}

}
