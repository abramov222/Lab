public class Balance {
    public int rightWeight;
    public int leftWeight;
    
    public void addRight(int weight) {
        rightWeight += weight;
        System.out.println("Добавлено " + weight + " на правую чашу");
    }
    
    public void addLeft(int weight) {
        leftWeight += weight;
        System.out.println("Добавлено " + weight + " на левую чашу");
    }
    
    public void result() {
        if (rightWeight > leftWeight) {
            System.out.println("*Перевес вправо*");
        } else if (leftWeight > rightWeight) {
            System.out.println("*Перевес влево*");
        } else {
            System.out.println("*Равны по весу*");
        }
    }
}