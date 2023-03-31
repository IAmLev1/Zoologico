package Model;

public class AnimalDomestico extends Animal {

    private String raza;

    public AnimalDomestico() {
    }

    public AnimalDomestico(String raza, String codigo, String nombre) {
        super(codigo, nombre);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "AnimalesDomesticos{" + "uso=" + raza + '}';
    }
}
