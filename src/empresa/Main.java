package empresa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ingrese el nombre del empleado: ");
            String nombreEmp = sc.nextLine();
            System.out.println("Ingrese edad del empleado: ");
            int edadE = Integer.parseInt(sc.nextLine());
            System.out.println("Ingrese salario base del empleado: ");
            double salarioE = Double.parseDouble(sc.nextLine());

            Empleado e1 = new Empleado(nombreEmp, edadE, salarioE);

            System.out.println("Ingrese nombre del gerente: ");
            String nombreG = sc.nextLine();
            System.out.println("Ingrese edad del gerente: ");
            int edadG = Integer.parseInt(sc.nextLine());
            System.out.println("Ingrese salario base del gerente: ");
            double salarioG = Double.parseDouble(sc.nextLine());
            System.out.println("Ingrese numero de empleados a cargo del gerente: ");
            int numEmp = Integer.parseInt(sc.nextLine());

            Gerente g1 = new Gerente(nombreG, edadG, salarioG);

            System.out.println("Ingrese nombre del practicante: ");
            String nombreP = sc.nextLine();
            System.out.println("Ingrese edad del practicante: ");
            int edadP = Integer.parseInt(sc.nextLine());
            System.out.println("Ingrese horas totales de prectica: ");
            int horasP = Integer.parseInt(sc.nextLine());

            Practicante p1 = new Practicante(nombreP, edadP, horasP);

            System.out.println(g1.toString());
            System.out.println(g1.toString());

            //polimorfismo: referencia base
            Persona[] personas = new Persona[] {e1,g1};
            for (Persona p : personas) {
                System.out.println(p.describir());
                System.out.println("Pago = " + p.calcularPago());
            }

            //sobrecarga en empleado
            System.out.println("Ingrese bono para el empleado");
            double bpnpE  = Double.parseDouble(sc.nextLine());
            System.out.println("Pago empledo con bono: " + e1.calcularPago());

            //sobrecarga y sobrescritura en Gerente
            System.out.println(g1.trabajar());
            System.out.println("Ingrese horas trabajadas del gerente: ");
            int horasG = Integer.parseInt(sc.nextLine());
            System.out.println(g1.trabajar(horasG));
        }
    }
}
