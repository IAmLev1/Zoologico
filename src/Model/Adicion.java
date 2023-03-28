package Model;

public class Adicion {
    private String beneficio;
    private float precio;

    public Adicion(String beneficio, float precio) {
        this.beneficio = beneficio;
        this.precio = precio;
    }

    public String getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(String beneficio) {
        this.beneficio = beneficio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
