public class OddEvenSeparator {
    public int[] numbers = new int[100];
    public int count = 0;
    
    public void addNumber(int number) {
        numbers[count] = number;
        count++;
        System.out.println("Добавлено число: " + number);
    }
    
    public void even() {
        System.out.print("Четные числа: ");
        for (int i = 0; i < count; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
    }
    
    public void odd() {
        System.out.print("Нечетные числа: ");
        for (int i = 0; i < count; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
    }
}