package Model;

/**
 *
 * @author Levi.ing
 */
public class AnimalSalvaje extends Animal {

    private String nivelPeligrosidad;

    public AnimalSalvaje() {
    }

    public AnimalSalvaje(String nivelPeligrosidad, int codigo, String nombre) {
        super(codigo, nombre);
        this.nivelPeligrosidad = nivelPeligrosidad;
    }

    public String getNivelPeligrosidad() {
        return nivelPeligrosidad;
    }

    public void setNivelPeligrosidad(String nivelPeligrosidad) {
        this.nivelPeligrosidad = nivelPeligrosidad;
    }

    @Override
    public String toString() {
        return "AnimalSalvaje{" + "nivelPeligrosidad=" + nivelPeligrosidad + '}';
    }

}
