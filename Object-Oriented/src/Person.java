public class Person {
	private String name;
	private int age;
	
	public Person() {
		this("Anonymous", -1);
	}
	public Person(String pname, int page) {
		name = pname;
		age = page;
		
	}
    public void print() {
    	System.out.println("Name: " + name + "\tAge: " + age);
    }
    @Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person) obj;
			if(p.name.equals(this.name) && p.age == this.age)
				return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "Name: " + name + "\tAge: " + age;
	}
	public static void main(String[] args) {
    	Person p = new Person("Naveen", 22);
    	System.out.println(p);
    }
}
