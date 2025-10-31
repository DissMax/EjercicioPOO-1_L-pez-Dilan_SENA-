package empresa;

public class Practicante extends Empleado {
    int horasDePractica;

    public Practicante(String nombre, int edad, int horasP) {
        super(nombre, edad);
        this.horasDePractica = horasDePractica;
    }

    public String describir(){
        return "Soy un practicante en formacion";
    }

    public double calcularPago(){
        return horasDePractica * 15000;
    }
}
