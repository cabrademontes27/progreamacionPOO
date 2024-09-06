public class App {
    public static void main(String[] args) throws Exception {
        

        int [] arregloDeCalificaiones = {10,2,5,6,7,9,7,9,6,5,9,10};


        totalAlumnos(arregloDeCalificaiones);

    }


    public static void printFinalGrade(int calificaion)
    {
        if(calificaion <= 6)
        {
            System.out.println("mal");
        }else if(calificaion > 6 && calificaion < 8)
        {
           System.out.println("regular");
        }else if(calificaion > 7 && calificaion <= 9)
        {   
            System.out.println("bien");
        }else if(calificaion == 10)
        {
            System.out.println("excelente");
        }else
        {
            System.out.println("imposible");
        }
    }

    public static void totalAlumnos(int [] arregloDeCalificaiones)
    {
        for(int i = 0; i < arregloDeCalificaiones.length; i++){
            printFinalGrade(arregloDeCalificaiones[i]);
        }
    }



}
