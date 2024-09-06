import java.util.Scanner;
import java.util.Random ;
public class bucles {

    public void test()
    {
        /*
         * Escriba un programa que genere aleatoriamente un entero entre 1 y 7 y muestre el nombre de
        un color en el arco iris (violeta, añil, azul, verde, amarillo, naranja y rojo) para los números 1, 2,
        3, . . .7
        */

        int numeroRandom = (int)Math.random();

        switch(numeroRandom)
        {
            case 1: System.out.println("violeta");break;
            case 2:System.out.println("añil");break;
            case 3:;System.out.println("azul");break;
            case 4:System.out.println("verde");break;
            case 5:System.out.println("amarillo");break;
            case 6:System.out.println("naranja");break;
            case 7:System.out.println("rojo");break;
            default: System.out.println("no hay ese color");
        }
    }


    public void piedraPapel()
    {
        /*
            Escribe un programa que juegue al popular juego de tijera-piedra-papel. (Una tijera puede
            cortar un papel, una piedra puede golpear una tijera y un papel puede envolver una piedra). El
            programa genera aleatoriamente un número 0, 1 o 2 que representa tijera, piedra y papel. El
            programa solicita al usuario que introduzca un número 0, 1 o 2 y muestra un mensaje que
            indica si el usuario o el equipo gana, pierde o empata. Aquí hay ejecuciones de ejemplo
        */


        System.out.println("ingresa un numero, tomando en cuenta 0: piedra, 1: papel, 2: tijeras");
        Scanner input = new Scanner(System.in); 
        int decision = input.nextInt();
        

        Random random1 = new Random();
        int aleatorio = random1.nextInt(2);


        

        System.out.println(aleatorio);


        switch(decision)
        {
            case 0: 
            System.out.print("ingresastes piedra:");
            if(aleatorio == 1)
            {
                System.out.println(" y yo papel te gane ");
            }else if(aleatorio == 2)
            {
                System.out.println(" me ganaste");
            }
            ;break;

            case 1: 
            System.out.print("ingresastes papel:");
            if(aleatorio == 1)
            {
                System.out.println(" y yo papel me ganaste ");
            }else if(aleatorio == 2)
            {
                System.out.println(" te gane");
            }
            ;break;
            case 2:
            System.out.print("ingresastes tijeras:");
            if(aleatorio == 1)
            {
                System.out.println(" y yo papel te gane ");
            }else if(aleatorio == 2)
            {
                System.out.println(" me ganaste");
            }
            ;break;
            
        }
        
    }
       
}
