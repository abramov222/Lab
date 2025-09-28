import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileAnalyzer {
    
    public void analyze(String filename) {
        try {
            
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            
            int lineCount = 0;
            int wordCount = 0;
            int charCount = 0;
            String line;
            
            
            while ((line = reader.readLine()) != null) {
                lineCount++; 
                
                
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount++;
                    }
                }
                
                
                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);
                    if (c != ' ' && c != '\t') {
                        charCount++;
                    }
                }
            }
            
           
            reader.close();
            
            
            System.out.println("Строк: " + lineCount);
            System.out.println("Слов: " + wordCount);
            System.out.println("Символов: " + charCount);
            System.out.println();
            
        } catch (IOException e) {
            System.out.println("Файл не найден!");
        }
    }
}