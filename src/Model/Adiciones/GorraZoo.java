package Model.Adiciones;

public class GorraZoo implements Adicion {
    @Override
    public String nombre() {
        String nombre = "Gorra con logo del zoo";
        return nombre;
    }

    @Override
    public float precio() {
        float precio = 10000f;
        return precio;
    }
}
