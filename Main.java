
public class Main {
	public static void main (String []args) {
		
	Laptop l1  = new Laptop();
	Processor p1 = new Processor();
	
		
		l1.price = 80000;
		l1.modelNo = 123456;
		l1.brand ="acer";
				
		l1.switch_on();
		System.out.println("the brand is "+ l1.brand);
		
		p1.brand = "AMD";
		p1.cache = 35;
		p1.model = 3200;
		p1.speed = 3500;
		p1.socket = "AM5";	
		p1.status();
		
		l1.switch_off();
		
		
		
	}

}

