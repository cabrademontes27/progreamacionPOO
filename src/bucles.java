public class bucles {
    public void bucle()
    {
        int contador = 0;


        while(contador <= 100 )
        {
            contador++;
            System.out.println("Hola mundo num: " + contador);
        }

        for(int i = 0; i <= contador; i++)
        {
            System.out.println("Hola mundo con for num: " + contador);
        }

        do
        {
            System.out.println("Hola mundo con dowhile");
            contador++;
        }
        while(contador <= 100);
    }
}
