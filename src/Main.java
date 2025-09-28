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
	        
	        System.out.println("-----------------------------------------------------------\n4 Задание:\n");
	        
	        OddEvenSeparator separator = new OddEvenSeparator();
	        
	        separator.addNumber(1);
	        separator.addNumber(2);
	        separator.addNumber(3);
	        separator.addNumber(4);
	        separator.addNumber(5);
	        
	        separator.even(); 
	        separator.odd();  
	        
	        System.out.println("-----------------------------------------------------------\n5 Задание:\n");
	        
	        Table table = new Table(3, 4);
	        
	        table.setValue(0, 0, 5);
	        table.setValue(1, 1, 10);
	        table.setValue(2, 2, 15);
	        
	        System.out.println("Таблица:");
	        System.out.println(table.toString());
	        
	        System.out.println("Значение в ячейке (1,1): " + table.getValue(1, 1));
	        System.out.println("Количество строк: " + table.rows());
	        System.out.println("Количество столбцов: " + table.cols());
	        System.out.println("Среднее арифметическое: " + table.average());
	}
	
}
