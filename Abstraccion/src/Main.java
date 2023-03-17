public class Main {
    public static void main(String[] args) {
        Gato gato1 = new Gato("ivan", 24);
        Perro perro1 = new Perro("max", 7);
        Loro loro1 = new Loro("loro",48);

        gato1.hacerSonido();
        perro1.hacerSonido();
        loro1.hacerSonido();
        gato1.dormir();
    }
}

abstract class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract void hacerSonido();

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    public void dormir() {
        System.out.println(nombre + " está durmiendo.");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

class Gato extends Animal {
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: Miau.");
    }
}

class Perro extends Animal {
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: Guau.");
    }
}
class Loro extends Animal {
    public Loro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: Jueputa, Jueputa.");
    }
}
