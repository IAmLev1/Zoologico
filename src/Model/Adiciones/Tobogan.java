package Model.Adiciones;

public class Tobogan implements Adicion {
    @Override
    public String nombre() {
        String nombre = "Acceso a tobogan de agua\n";
        return nombre;
    }

    @Override
    public float precio() {
        float precio = 15000f;
        return precio;
    }
}
