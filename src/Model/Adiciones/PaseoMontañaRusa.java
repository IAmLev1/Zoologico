package Model.Adiciones;

public class PaseoMontañaRusa implements Adicion{
    @Override
    public String nombre() {
        String nombre = "Paseo en semi montaña rusa";
        return nombre;
    }

    @Override
    public float precio() {
        float precio = 8000f;
        return precio;
    }
}
