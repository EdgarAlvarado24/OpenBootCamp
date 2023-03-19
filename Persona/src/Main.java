public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Pedro");
        cliente.setTelefono("0414-5145068");
        cliente.setEdad(23);
        cliente.setCredito(2000);

        System.out.println("El nombre del cliente es " + cliente.getNombre() + "\nsu edad es " + cliente.getEdad() + " años \ny su numero de telefono es " + cliente.getTelefono() + " \ny su credito es de " + cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Juan");
        trabajador.setTelefono("0273-5145068");
        trabajador.setEdad(23);
        trabajador.setSalario(200);

        System.out.println("\nEl nombre del Trabajador es " + trabajador.getNombre() + "\nsu edad es " + trabajador.getEdad() + " años \ny su numero de telefono es " + trabajador.getTelefono() + " \ny su salario es de " + trabajador.getSalario());

    }
}

class Persona {
    int edad;
    String nombre;
    String telefono;

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona {
    int credito;

    public int getCredito() {
        return credito;
    }
    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona{
    int salario;

    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario){
        this.salario = salario;
    }
}