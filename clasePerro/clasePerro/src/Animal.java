public class Animal {
    
    private String nombre;
    private String raza;
    private int edad;

    public Animal(String nombre, String raza, int edad)
    {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public void ladrar()
    {
        System.out.println("emite sonido");
    }
    
}
