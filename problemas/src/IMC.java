import java.util.Scanner;
public class IMC {
    @SuppressWarnings("resource")
    public static void sacarIMC()
    {
        double peso = 0.0; 
        double altura = 0.0;
        
        Scanner input = new Scanner(System.in);



        System.out.println("ingresa tu peso en kg.gramos");
        peso = input.nextDouble();
        System.out.println("ahora ingresa tu altura en metros, ejempl: 1.75");
        altura = input.nextDouble();
        double IMC = peso/(Math.pow(altura, 2));
        
        

        System.out.printf(" tu IMC es de %.2f " ,IMC);

        



        if (IMC < 18.5) {
            System.out.println("Bajo de peso");
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("Normal");
        } else if (IMC >= 25.0 && IMC <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (IMC >= 30.0) {
            System.out.println("Obesidad");
        } else {
            System.out.println("Error en el cálculo del IMC");
        }
        









    }
}
