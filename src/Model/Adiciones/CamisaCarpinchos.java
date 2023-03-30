package Model.Adiciones;

public class CamisaCarpinchos implements Adicion {
    @Override
    public String nombre() {
        String nombre = "Camiseta (Amor por los carpinchos)";
        return nombre;
    }

    @Override
    public float precio() {
        float precio = 18000f;
        return precio;
    }
}
