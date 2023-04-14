
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

public class Task3 {
    
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder();
        char symbol;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = in.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = in.nextDouble();

        System.out.print("Введите знак '*', '/' , '+', '-': ");
        symbol = in.next().charAt(0);
        System.out.println(symbol);
        double result =0;
       

        switch (symbol) {
            case '+': result = num1 + num2;
                break;
            case '-': result = num1 - num2;
                break;
            case '*': result = num1 * num2;
                break;
            case '/': result = num1 / num2;
                break;
        
            default: 
                break;
        }
            System.out.println(result);

            sb.append(num1).
            append(" ").
            append(symbol).
            append(" ").
            append(num2).
            append(" ").
            append("=").
            append(" ").
            append(result);

            System.out.println(sb);


            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("calc.txt"));
                writer.append(sb);
                writer.close();

                
            } catch (Exception e) {
                System.out.println("ОШИБКА");
        }

    }
      
}
    


    


        
