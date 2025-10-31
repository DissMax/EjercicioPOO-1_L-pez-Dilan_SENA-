package empresa;

public class Gerente extends Empleado{
    private int numeroEmpleados;

    public Gerente(String nombre, int edad, double salarioBase) {
        super(nombre, edad, salarioBase);
        this.numeroEmpleados = numeroEmpleados;
    }

    public String describir(){
        return "Soy un gerente y lidero un equipo";
    }

    public double calcularPago(double salarioBase){
        return salarioBase + ((salarioBase * 20) / 100);
    }

    public double calcularPago(double bono, double bonoLiderazgo) {
        return bono + bonoLiderazgo;
    }

    public String trabajar (int horas){
        return getNombre() + " coordino el equipo durante " + horas + " horas";
    }

}
