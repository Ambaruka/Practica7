public class Cotizacion {
    private int dias;
    private String destino;
    private String T_habitacion;
    private boolean T_pago;
    private float subtotal;
    private float iva;
    private float total;
    private float mensualidad;

    public Cotizacion(int dias, String destino, String t_habitacion, boolean t_pago, float subtotal, float iva, float total, float mensualidad) {
        this.dias = dias;
        this.destino = destino;
        T_habitacion = t_habitacion;
        T_pago = t_pago;
        this.subtotal = subtotal;
        this.iva = iva;
        this.total = total;
        this.mensualidad = mensualidad;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getT_habitacion() {
        return T_habitacion;
    }

    public void setT_habitacion(String t_habitacion) {
        T_habitacion = t_habitacion;
    }

    public boolean isT_pago() {
        return T_pago;
    }

    public void setT_pago(boolean t_pago) {
        T_pago = t_pago;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(float mensualidad) {
        this.mensualidad = mensualidad;
    }
}
