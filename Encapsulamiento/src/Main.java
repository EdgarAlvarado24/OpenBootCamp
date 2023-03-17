public class Main {
    public static void main(String[] args) {
        Persona adulto1 = new Persona();

        System.out.println(adulto1.getEdad());
        System.out.println(adulto1.getNombre());
        System.out.println(adulto1.getTelefono());

        adulto1.setNombre("Pedro");
        System.out.println("Ahora esta persona se llama " + adulto1.getNombre());
        adulto1.setTelefono(5512333);
        System.out.println("Y se compro un numero de telefono, el cual es " + adulto1.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public Persona() {
        this.edad = 18;
        this.nombre ="Sin Nombre";
        this.telefono= 0;
    }
    public Persona(int edad, String nombre, int telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono= telefono;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
}