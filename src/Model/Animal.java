package Model;

public class Animal {

    private String codigo;
    private String nombre;

    public Animal() {
    }

    public Animal(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Animal{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }

}
