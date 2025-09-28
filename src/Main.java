public class Main {
	public static void main(String[] args)
	{
		System.out.println("1 Задание:\n");
		int counter = 0;
		Button button = new Button();
		
		button.click();
		button.click();
		button.click();
		
		System.out.println("-----------------------------------------------------------\n2 Задание:\n");
		
		 Balance balance = new Balance();
	        
	        balance.addRight(10);
	        balance.addLeft(5);
	        balance.result();
	        
	        balance.addLeft(5);
	        balance.result(); 
	        
	        balance.addLeft(5);
	        balance.result(); 
	        
	        balance.addLeft(99);
	        balance.result(); 
	        
	        System.out.println("-----------------------------------------------------------\n3 Задание:\n");
	        
	        Bell bell = new Bell();
	        
	        bell.sound(); 
	        bell.sound(); 
	        bell.sound(); 
	        bell.sound(); 
	}
	
}
