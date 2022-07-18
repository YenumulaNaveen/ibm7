import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class TestLifeCycle {
private  List<String> cart;
@BeforeAll
public static void setupAll() {
	System.out.println("Before all testcases");
	}
@BeforeEach
public void setupEach() {
	cart=new ArrayList<String>();
	System.out.println("Before each testcases");
	}
@AfterAll
public static void SetDownAll() {
	System.out.println("After all testcases");
}
@AfterEach
public void setdownEach() {
	cart=null;
	System.out.println("After each testcases");
}
@Test 
public void testEmptyCart() {
	System.out.println("Testing Empty cart");
	assertTrue(cart.isEmpty());
}
@Test 
public void testOneCart() {
	cart.add("apple");
	System.out.println("Testing one item in cart");
	assertEquals(1,cart.size());
}
}