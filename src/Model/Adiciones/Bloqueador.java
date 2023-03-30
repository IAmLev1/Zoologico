package Model.Adiciones;

public class Bloqueador implements Adicion {

    @Override
    public String nombre() {
        String nombre = "Bloqueador para el sol\n";
        return nombre;
    }

    @Override
    public float precio() {
        float precio = 7000f;
        return precio;
    }
}
