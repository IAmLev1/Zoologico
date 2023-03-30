package Model.Adiciones;

public class VisitaIslaKong implements Adicion{
    @Override
    public String nombre() {
        String nombre = "Visita a la isla de Kong";
        return nombre;
    }

    @Override
    public float precio() {
        float precio = 17000f;
        return precio;
    }
}
