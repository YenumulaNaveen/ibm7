public interface Hello {

	String sayHello();
	
	default String sayBye() {
		return "Asta La Vista";
		
	}
	static void greet() {
		System.out.println("Happy Holidays");
	}

}
