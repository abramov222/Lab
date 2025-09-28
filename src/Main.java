import geometry2d.Circle;
import geometry2d.Rectangle;
import geometry3d.Cylinder;

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
	        
	        
	        System.out.println("-----------------------------------------------------------\n6 Задание:\n");
	        
	        Circle circle = new Circle(5);
	        Rectangle rectangle = new Rectangle(4, 6);
	        
	        System.out.println("=== 2D ФИГУРЫ ===");
	        System.out.println(circle.toString());
	        System.out.println("Площадь круга: " + circle.area());
	        System.out.println("Периметр круга: " + circle.perimeter());
	        System.out.println();
	        
	        System.out.println(rectangle.toString());
	        System.out.println("Площадь прямоугольника: " + rectangle.area());
	        System.out.println("Периметр прямоугольника: " + rectangle.perimeter());
	        System.out.println();
	        
	        
	        Cylinder cylinder1 = new Cylinder(circle, 10);
	        Cylinder cylinder2 = new Cylinder(rectangle, 8);
	        
	        System.out.println("=== 3D ФИГУРЫ ===");
	        System.out.println(cylinder1.toString());
	        System.out.println("Объем цилиндра: " + cylinder1.volume());
	        System.out.println();
	        
	        System.out.println(cylinder2.toString());
	        System.out.println("Объем цилиндра: " + cylinder2.volume());
	}
	
}
