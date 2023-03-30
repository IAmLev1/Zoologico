package Model.Adiciones;

public class ZonaCapybaras implements Adicion {
    @Override
    public String nombre() {
        String nombre = "Entrada a zona de Capybaras";
        return nombre;
    }

    @Override
    public float precio() {
        float precio = 8000f;
        return precio;
    }
}
