public class StringPattrenDemo {

	public static void main(String[] args) {
		String name = "Naveen";
		String namePattren = "[A-Z{1}[a-z]{3,}";
        
		System.out.println(name.matches(namePattren));
		
		String cc = "3456735347892598";
		String ccPattern = "[1-9]{1}[0-9]{15}";
		System.out.println(cc.matches(ccPattern));
	}

}
