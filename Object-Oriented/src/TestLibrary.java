import com.ibm.lib.Book;
import com.ibm.lib.Member;

public class TestLibrary {
	public static void main(String[] args) {
		Book b1 = new Book("The Alchemist");
		Member m1 = new Member("Naveen");
		
		b1.status();
		m1.status();
		
		b1.issues(m1);
		
		b1.status();
		m1.status();
	}

}
