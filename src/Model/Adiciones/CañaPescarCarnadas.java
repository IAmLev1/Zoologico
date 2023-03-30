package Model.Adiciones;

public class CañaPescarCarnadas implements Adicion {
    @Override
    public String nombre() {
        String nombre = "Alquiler de caña de pescar con carnadas\n";
        return nombre;
    }

    @Override
    public float precio() {
        float precio = 35000f;
        return precio;
    }
}
