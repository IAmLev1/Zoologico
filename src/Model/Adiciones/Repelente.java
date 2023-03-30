package Model.Adiciones;

public class Repelente implements Adicion{
    @Override
    public String nombre() {
        String nombre = "Repelente para mosquitos\n";
        return nombre;
    }

    @Override
    public float precio() {
        float precio = 15000f;
        return precio;
    }
}
