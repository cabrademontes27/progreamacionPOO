import java.util.Scanner;
public class IMC {
    public static void sacarIMC()
    {
        double peso = 0.0; 
        double altura = 0.0;
        
        Scanner input = new Scanner(System.in);


        
        System.out.println("ingresa tu peso en kg.gramos");
        peso = input.nextDouble();
        System.out.println("ahora ingresa tu altura en metros, ejempl: 1.75");
        altura = input.nextDouble();
        double IMC = peso/(altura*altura);

        System.out.println(" tu IMC es de " + IMC);



        






    }
}
