import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class StudentGrades {
    public ArrayList<String> studentNames = new ArrayList<>();
    public ArrayList<Double> studentAverages = new ArrayList<>();
    
    public void analyze(String filename) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            
            System.out.println("=== АНАЛИЗ ОЦЕНОК ===");
            
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                
                if (parts.length > 1) {
                    String studentName = parts[0];
                    int sum = 0;
                    
                    for (int i = 1; i < parts.length; i++) {
                        sum += Integer.parseInt(parts[i]);
                    }
                    
                    double average = (double) sum / (parts.length - 1);
                    studentNames.add(studentName);
                    studentAverages.add(average);
                    
                    System.out.println(studentName + ": " + average);
                }
            }
            
            reader.close();
            System.out.println();
            
        } catch (IOException e) {
            System.out.println("Файл не найден!");
        }
    }
    
    public String bestStudent() {
        if (studentNames.isEmpty()) {
            return "Нет данных";
        }
        
        int bestIndex = 0;
        for (int i = 1; i < studentAverages.size(); i++) {
            if (studentAverages.get(i) > studentAverages.get(bestIndex)) {
                bestIndex = i;
            }
        }
        
        return studentNames.get(bestIndex) + " (" + studentAverages.get(bestIndex) + ")";
    }
    
    public String worstStudent() {
        if (studentNames.isEmpty()) {
            return "Нет данных";
        }
        
        int worstIndex = 0;
        for (int i = 1; i < studentAverages.size(); i++) {
            if (studentAverages.get(i) < studentAverages.get(worstIndex)) {
                worstIndex = i;
            }
        }
        
        return studentNames.get(worstIndex) + " (" + studentAverages.get(worstIndex) + ")";
    }
}