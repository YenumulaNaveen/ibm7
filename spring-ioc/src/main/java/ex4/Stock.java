package ex4;

import org.springframework.stereotype.Component;

@Component("stk")
public class Stock {
	public Stock() {
		System.out.println("Stock constructor");
	}
	private static Stock stock;
	
	public static Stock get() {
		if(stock == null)
			System.out.println("Singleton");
			stock = new Stock();
		return stock;
	}

}
