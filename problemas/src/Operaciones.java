public class Operaciones
{
    public int suma(int a, int b)
    {
        return a + b;
    }    

    public int resta(int a, int b)
    {
        int max = a;
        if(max < b)
        {   
            b = a;
            return b - a;
        }else 
        {
            return a - b;
        }
    }   





}
