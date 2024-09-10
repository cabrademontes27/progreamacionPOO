public class App {
    public static void main(String[] args) throws Exception {
        
        String[] nombres = {"pepe","tomas","andres","antonio"};
        //int numeroRandom =  Math.random() * 100;
        

        for(int i = 0; i < nombres.length;i++)
        {
            System.out.println(nombres[i]);
        }

        for(String nombre : nombres)
        {
            System.out.println(nombre);
        }




        

    }
}
