package empresa;

public class Empleado extends Persona implements Reportable{
    private double salarioBase;

    public Empleado(String nombre, int edad, double salarioBase) {
        super(nombre, edad);
        this.salarioBase = salarioBase;
    }

    public Empleado(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String describir() {
        return "Soy un empleado";
    }

    @Override
    public double calcularPago() {
        return salarioBase;
    }

    public double calcularPago (double pago){
        return salarioBase + pago;
    }

    public String trabajar(){
        return getNombre() + "esta trabajando";
    }

    public String trabajar (int horas){
        return getNombre() + "trabajó " + horas + " horas";
    }
    public String generarReporte(){
        return  "Reporte de empleados: nombre=" + getNombre()
                + " edad=" + getEdad()
                + " salarioBase=" + salarioBase;
    }

    @Override
    public String generateReporte() {
        return  "Reporte de empleados: nombre=" + getNombre()
                + " edad=" + getEdad()
                + " salarioBase=" + salarioBase;
    }
}