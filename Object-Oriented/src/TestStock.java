import com.ibm.stock.Broker;
import com.ibm.stock.Exchange;
import com.ibm.stock.Holder;
import com.ibm.stock.Stock;

public class TestStock {
	public static void main(String[] args) {
		Stock ibm = new Stock();
		
		Holder h = ibm;
		h.view();
		
		Broker b = ibm;
		b.get();
		
		Exchange x = ibm;
		x.set();
	}

}
