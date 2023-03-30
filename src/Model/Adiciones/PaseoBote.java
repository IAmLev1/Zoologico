package Model.Adiciones;

public class PaseoBote implements Adicion{
    @Override
    public String nombre() {
        String nombre = "Paseo en bote por el lago de pesca";
        return nombre;
    }

    @Override
    public float precio() {
        float precio = 10000f;
        return precio;
    }
}
