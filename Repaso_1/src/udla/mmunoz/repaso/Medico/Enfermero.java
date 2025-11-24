package udla.mmunoz.repaso.Medico;

public class Enfermero extends PerfilMedico{
    private Turno turno;
    private String areaAsig;

    /**Creacion de Constructores*/
    public Enfermero(String nombre, String apellido, Turno turno, String areaAsignada) {
        super(nombre, apellido); // Asigna ID automáticamente
        this.turno = turno;
        this.areaAsig = areaAsignada;
    }
    /**Creacion de Getters & Setters*/
    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public String getAreaAsig() {
        return areaAsig;
    }

    public void setAreaAsig(String areaAsig) {
        this.areaAsig = areaAsig;
    }
}
