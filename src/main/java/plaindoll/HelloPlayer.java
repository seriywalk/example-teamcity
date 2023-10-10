package plaindoll;

public class HelloPlayer{
	public static void main(String[] args) {
		Welcomer welcomer = new Welcomer();
		System.out.println(welcomer.sayHi());
		System.out.println(welcomer.sayFarewell());
	}
}
