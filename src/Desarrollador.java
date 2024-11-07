public class Desarrollador extends Empleado {
    private String lenguajePrincipal;
    private int proyectosCompletados;

    public Desarrollador(String nombre, String id, double salarioBase,
                         TipoContrato tipoContrato, String lenguajePrincipal) {
        super(nombre, id, salarioBase, tipoContrato);
        this.lenguajePrincipal = lenguajePrincipal;
        this.proyectosCompletados = 0;
    }

    @Override
    public double calcularSalario() {
        double salario = salarioBase;
        if (proyectosCompletados > 5) {
            salario += salarioBase * 0.10; // Bono del 10% por más de 5 proyectos
        }
        return salario;
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " está programando en " + lenguajePrincipal);
    }

    public void completarProyecto() {
        proyectosCompletados++;
        System.out.println("Proyecto completado. Total: " + proyectosCompletados);
    }
}