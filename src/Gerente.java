public class Gerente extends Empleado {
    private String departamento;
    private int empleadosACargo;

    public Gerente(String nombre, String id, double salarioBase,
                   TipoContrato tipoContrato, String departamento, int empleadosACargo) {
        super(nombre, id, salarioBase, tipoContrato);
        this.departamento = departamento;
        this.empleadosACargo = empleadosACargo;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (empleadosACargo * 100); // Bono por empleado a cargo
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " está gestionando el departamento de " + departamento);
    }

    @Override
    public String obtenerInformacion() {
        return super.obtenerInformacion() +
                "\nDepartamento: " + departamento +
                "\nEmpleados a cargo: " + empleadosACargo;
    }
}
