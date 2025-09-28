public class Table {
    public int[][] data;
    public int rowCount;
    public int colCount;
    
    public Table(int rows, int cols) {
        rowCount = rows;
        colCount = cols;
        data = new int[rows][cols];
    }
    
    public int getValue(int row, int col) {
        return data[row][col];
    }
    
    public void setValue(int row, int col, int value) {
        data[row][col] = value;
        System.out.println("Установлено значение " + value + " в ячейку (" + row + "," + col + ")");
    }
    
    public int rows() {
        return rowCount;
    }
    
    public int cols() {
        return colCount;
    }
    
    public String toString() {
        String result = "";
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                result += data[i][j] + " ";
            }
            result += "\n";
        }
        return result;
    }
    
    public double average() {
        int sum = 0;
        int totalElements = rowCount * colCount;
        
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                sum += data[i][j];
            }
        }
        
        return (double)sum / totalElements;
    }
}