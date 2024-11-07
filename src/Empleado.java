public abstract class Empleado implements Trabajador {
    protected String nombre;
    protected String id;
    protected double salarioBase;
    protected TipoContrato tipoContrato;

    public Empleado(String nombre, String id, double salarioBase, TipoContrato tipoContrato) {
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
        this.tipoContrato = tipoContrato;
    }

    @Override
    public abstract double calcularSalario();

    @Override
    public String obtenerInformacion() {
        return "Empleado: " + nombre +
                "\nID: " + id +
                "\nTipo de Contrato: " + tipoContrato.getDescripcion();
    }
}