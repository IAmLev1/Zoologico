package Model;

/**
 *
 * @author Levi.ing
 */
public class AnimalesDomesticos extends Animal {

    private String uso;

    public AnimalesDomesticos() {
    }

    public AnimalesDomesticos(String uso, int codigo, String nombre) {
        super(codigo, nombre);
        this.uso = uso;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    @Override
    public String toString() {
        return "AnimalesDomesticos{" + "uso=" + uso + '}';
    }
}
