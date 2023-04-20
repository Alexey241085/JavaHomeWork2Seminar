import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class Task1 {

    public static void main(String[] args) throws SecurityException, IOException {
        int[] arr = new int[] { 1, 9, 71, 12, 11, 37, 41, 9, 44 };
        showArray("Исходный массив: ", arr);
        showArray("Отсортированный массив: ", bubble_sort(arr));
    }

    
    public static int[] bubble_sort(int[] array) throws SecurityException, IOException {

        Logger ll = Logger.getLogger(Task1.class.getName());
        String logPath = "file.txt";
        FileHandler fh = new FileHandler(logPath,false);
        ll.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
      

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    ll.info(Arrays.toString(array));
                   
                }
            }
        }
        return array;
    }


    public static void showArray(String msg, int[] array) {
        System.out.println();
        System.out.println(msg);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}