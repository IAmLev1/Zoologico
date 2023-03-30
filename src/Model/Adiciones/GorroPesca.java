package Model.Adiciones;

public class GorroPesca implements Adicion{
    @Override
    public String nombre() {
        String nombre = "Gorro de pesca";
        return nombre;
    }

    @Override
    public float precio() {
        float precio = 13000f;
        return precio;
    }
}
