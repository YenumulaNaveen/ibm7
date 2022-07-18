import com.ibm.shop.Product;
import com.ibm.shop.ShoppingCart;

public class TestShopping {
	
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Product p1 = new Product("AirPods", 9000);
		cart.addToCart(p1);
		
		cart.addToCart(new Product("Apple Watch", 22000));
		
		cart.checkout();
	}

}
