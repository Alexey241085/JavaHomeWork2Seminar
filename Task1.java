
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class Task1 {

    public static void main(String[] args) throws IOException {
        Logger ll = Logger.getLogger(Task1.class.getName());
        String logPath = "file.txt";
        FileHandler fh = new FileHandler(logPath, true);
        ll.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
        ll.log(Level.INFO, logPath);;
        
        StringBuilder sb = new StringBuilder();
        int[] array = {3,56,7,96,2,46,8,3,1};
        int temp = 0;
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j-1]){
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                } 
                sb.append(Arrays.toString(array)).append("\n");
                FileWriter fw = new FileWriter("file.txt", true);
                fw.write(sb.toString());
                fw.close();
            } 
        }       
        System.out.println(sb);
    }
}
