public enum TipoContrato {
    TIEMPO_COMPLETO("Tiempo Completo", 160),
    MEDIO_TIEMPO("Medio Tiempo", 80),
    TEMPORAL("Temporal", 120);

    private final String descripcion;
    private final int horasBase;

    TipoContrato(String descripcion, int horasBase) {
        this.descripcion = descripcion;
        this.horasBase = horasBase;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getHorasBase() {
        return horasBase;
    }
}
