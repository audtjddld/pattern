package proxy;

public class ProxyPatternDemo {
	public static void main(String[] args) {
		Image image = new ProxyImage("1.png");
		
		image.display();
		System.out.println("");
		
		image.display();
	}
}
