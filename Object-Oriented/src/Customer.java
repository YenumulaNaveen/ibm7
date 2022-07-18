public class Customer {
	private String custName;
	private int credit;
	private int custid;

	public void setState(String pcustName, int pcredit, int pcustid) {
		custName = pcustName;
		credit = pcredit;
		custid = pcustid;
	}
    public void print() {
    	System.out.println("CustomerName: " + custName + "\tCustomerID: " + custid + "\tCustomerCreditLimit: " + credit);
    }
    public static void main(String[] args) {
    	Customer p = new Customer();
    	p.setState("Naveen", 500000, 5);
    	p.print();
    }

}
