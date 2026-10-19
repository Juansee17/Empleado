public class PruebaEmpleado {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Carlos", "Mena", 800.00);
        Empleado empleado2 = new Empleado("Lucia", "Vargas", 1200.00);


        System.out.println("--- SALARIOS ANUALES ORIGINALES ---");
        System.out.println("Salario anual de " + empleado1.getPrimerNombre() + ": $" + (empleado1.getSalarioMensual() * 12));
        System.out.println("Salario anual de " + empleado2.getPrimerNombre() + ": $" + (empleado2.getSalarioMensual() * 12));


        empleado1.setSalarioMensual(empleado1.getSalarioMensual() * 1.10);
        empleado2.setSalarioMensual(empleado2.getSalarioMensual() * 1.10);


        System.out.println("\n--- SALARIOS ANUALES CON 10% DE AUMENTO ---");
        System.out.println("Nuevo salario de " + empleado1.getPrimerNombre() + ": $" + (empleado1.getSalarioMensual() * 12));
        System.out.println("Nuevo salario de " + empleado2.getPrimerNombre() + ": $" + (empleado2.getSalarioMensual() * 12));
    }
}