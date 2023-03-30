package Model.Adiciones;

public class Fogata implements Adicion{
    @Override
    public String nombre() {
        String nombre = "Acceso a fogata con malvaviscos\n";
        return nombre;
    }

    @Override
    public float precio() {
        float precio = 8000f;
        return precio;
    }
}
