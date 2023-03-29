
package Model;

/**
 *
 * @author Levi.ing
 */
public class Client extends Persona {
    
    private float lvlFrecuencia; 
    // se creara el metodo de este campo cuando ea ingresen a arraylist
    private float dinero;
    private Plan plan;
    
    public Client() {
    }

    public Client(String nombre, String cedula, String correo, String sexo, int edad, float dinero, Plan plan) {
        super(nombre, cedula, correo, sexo, edad);
        lvlFrecuencia = 0.0f;
        this.dinero=dinero;
        this.plan = plan;
    }

    public float getLvlFrecuencia() {
        return lvlFrecuencia;
    }

    public void setLvlFrecuencia(float lvlFrecuencia) {
        this.lvlFrecuencia = lvlFrecuencia;
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    @Override
    public String toString() {
        return "Client{" + "lvlFrecuencia=" + lvlFrecuencia + ", dinero=" + dinero + "plan = " + plan.getNumPlan();
    }
}
