public class Perro : Animal
{
    private String nombre;
    private String raza;   
    private int edad;

    public Perro(String nombre, String raza,int edad ){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad
    }

    public virtual void  emiteSonido()
    {
        Console.WriteLine("el perro ladra");
    }
}