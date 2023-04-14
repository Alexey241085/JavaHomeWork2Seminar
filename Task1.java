import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
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
             try {
                FileWriter fw = new FileWriter("file.txt", false);
                fw.write(sb.toString());
                fw.close();
             } 
             catch (IOException e) {
                System.out.println("ОШИБКА");
              }
                
            }
        }
    }
}
