import java.util.LinkedList;

public class Usuario {
    private String usuario,contra;
    LinkedList <Cotizacion> cotizacions=new LinkedList<>();

    public Usuario(String usuario, String contra, LinkedList<Cotizacion> cotizacions) {
        this.usuario = usuario;
        this.contra = contra;
        this.cotizacions = cotizacions;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public LinkedList<Cotizacion> getCotizacions() {
        return cotizacions;
    }

    public void setCotizacions(LinkedList<Cotizacion> cotizacions) {
        this.cotizacions = cotizacions;
    }
}
