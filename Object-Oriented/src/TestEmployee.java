import com.ibm.emp.Executive;
import com.ibm.emp.Manager;

public class TestEmployee {

	public static void main(String[] args) {
		Executive ex1 = new Executive(102, "Mike", 3000, 1000);
		
		Manager mg1 = new Manager(103, "Mona", 5000, 2000);
		
		showSalary(ex1);
		showSalary(mg1);
	}
	private static void showSalary(Manager mg1) {
		System.out.println("Manager Salary:" + mg1.getSalary());
	}
	private static void showSalary(Executive ex1) {
		System.out.println("Executive Salary:" + ex1.getSalary());
	}
}
