
public class Processor {

	Integer speed, cache, model;
	String brand, socket; 
	
	public void status() {
		System.out.println("The processor runs at "+ speed);
		System.out.println("The processor has "+ cache);
		System.out.println("The processor uses "+socket +" socket");
		
	}
}
