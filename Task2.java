import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.io.BufferedReader;

public class Task2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        File file = new File("task.txt");
        String[] finish;
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;

            while ((line = reader.readLine()) != null) {
                finish = line.replace("\"", "").split(":|,");
                sb.append(
                    "Студент ").
                    append(finish[1] + " ").
                    append("получил ").
                    append(finish[3]+ " ").
                    append("по предмету ").
                    append(finish[5]+ " ").
                    append("\n");

                }
                System.out.println(sb);
            
            reader.close();;
        } 
        
        catch (Exception e) {
            System.out.println("ОШИБКА");
        }        
    }  
}
