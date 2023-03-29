package Model;

import java.util.ArrayList;
import java.util.List;

public class Plan {
    private String numPlan;
    private List<String> beneficios;
    private Float precio;
    private List<Adicion> adiciones;

    public Plan() {
    }
    
    public Plan(Float precio, String numPlan) {
        beneficios = new ArrayList<String>();
        adiciones = new ArrayList<Adicion>();
        this.precio = precio;
        this.numPlan = numPlan;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public List<String> getBeneficios() {
        return beneficios;
    }

    public void addBeneficios(String beneficio) {
        beneficios.add(beneficio);
    }

    public String getNumPlan() {
        return numPlan;
    }

    public void setNumPlan(String numPlan) {
        this.numPlan = numPlan;
    }

    public List<Adicion> getAdiciones() {
        return adiciones;
    }

    public void addAdiciones(Adicion adicion) {
        adiciones.add(adicion);
    }
    
    
}
