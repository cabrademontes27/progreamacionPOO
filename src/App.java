import java.util.Scanner;

public class App {
    public static void main(String[] args) 
    {
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 10 % 10);


        try (Scanner input = new Scanner(System.in)) {
            System.out.print("cuanto es: " + number1 + " + " + number2 + " ? ");

            int respuesta = input.nextInt();

            System.out.println(number1 + " + " + number2 + " = " + "la respuesta es: " + (number1 + number2 == respuesta));
        }
        


    }
}
