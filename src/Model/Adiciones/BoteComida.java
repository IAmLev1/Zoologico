package Model.Adiciones;

public class BoteComida implements Adicion{
    @Override
    public String nombre() {
        String nombre = "Bote de comida para animales";
        return nombre;
    }

    @Override
    public float precio() {
        float precio = 4000f;
        return precio;
    }
}
