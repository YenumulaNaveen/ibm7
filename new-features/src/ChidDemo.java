public class ChidDemo<Z, S> extends Demo<Z> {
	private S temp;

	public ChidDemo(Z data,S temp) {
		super(data);
		this.temp = temp;
	}
	
	public S getTemp() {
		return temp;
	}
	
	public void setTemp(S temp) {
		this.temp = temp;
	}
	
	public static void main(String[] args) {
		ChidDemo<String, Integer> cd = new ChidDemo<String, Integer>("Polo", 21);
		System.out.println(cd.getData() + "\t" + cd.getTemp());
	}

}
