package udla.mmunoz.repaso.Medico;

public class PerfilMedico {
    protected String nombre;
    protected String apellido;
    protected int idPersonal;
    private static int contId = 1;

    /**Creacion de Constructores*/


    /**
     * Constructores & Destructores
     */
    public PerfilMedico() {
    }

    public PerfilMedico(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.idPersonal = contId++;
    }


    /**
     * Getters & Setters
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
    }

    public static int getContId() {
        return contId;
    }

    public static void setContId(int contId) {
        PerfilMedico.contId = contId;
    }
}
