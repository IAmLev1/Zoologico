package Model.Adiciones;

public class FotoFiton implements Adicion{
    @Override
    public String nombre() {
        String nombre = "Foto con Fiton (piton del zoo)";
        return nombre;
    }

    @Override
    public float precio() {
        float precio = 10000f;
        return precio;
    }
}
