import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestAccount {
	private Account acnt;
	
	@BeforeEach
	public void init() {
		acnt = new Account(1000);
	}
	@Test
	public void testVaildDeposit() {
		assertEquals(2000, acnt.deposit(1000));
	}
	@Test
	public void testNegativeDeposit() {
		assertThrows(NumberFormatException.class, () -> acnt.deposit(-100));
	}

}
