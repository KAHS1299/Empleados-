public class Main {
    public static void main(String[] args) {
        // Crear instancias de empleados
        Desarrollador dev1 = new Desarrollador(
                "Ana García",
                "51699958",
                3000000.0,
                TipoContrato.TIEMPO_COMPLETO,
                "Java"
        );

        Gerente gerente1 = new Gerente(
                "Carlos Rodríguez",
                "79108765",
                5000000.0,
                TipoContrato.TIEMPO_COMPLETO,
                "Tecnología",
                5
        );

        // Probar funcionalidades
        System.out.println("=== Información del Desarrollador ===");
        System.out.println(dev1.obtenerInformacion());
        dev1.trabajar();
        dev1.completarProyecto();
        System.out.println("Salario del desarrollador: $" + dev1.calcularSalario());

        System.out.println("\n=== Información del Gerente ===");
        System.out.println(gerente1.obtenerInformacion());
        gerente1.trabajar();
        System.out.println("Salario del gerente: $" + gerente1.calcularSalario());
    }
}