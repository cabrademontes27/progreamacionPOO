import java.util.Scanner;
public class parImpar {
    public static void prueba() 
    {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("ingresa un numero");

            int numeroIngresado = input.nextInt();

            boolean respuesta = (numeroIngresado % 2 == 0)?true:false;

            if(respuesta == true)
            {
                System.out.println(" tu numero es par");
            }else{System.out.println("tu numero es impar");}
        }



    }

    


}
