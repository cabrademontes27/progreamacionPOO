public class Perro {
    public String nombre;
    public int edad;


    public Perro()
    {
        
    }

    public Perro (String nombre)
    {
        this.nombre = nombre;
    }

    public Perro(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void ladrar()
    {
        System.out.println("guao");
    }
    public void comer ()
    {
        System.out.println("estoy comiendo ");
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}
