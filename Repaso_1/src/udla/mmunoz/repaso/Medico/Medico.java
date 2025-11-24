package udla.mmunoz.repaso.Medico;

public class Medico extends PerfilMedico {
    private String especialidad;
    private int anioosExperiencia;
    private String licenciaMedica;

    /**Creacion de Constructores*/
    public Medico(String nombre, String apellido, String especialidad, int anioosExperiencia, String licenciaMedica) {
        super(nombre, apellido); // Llamar al constructor del padre que asigna ID automáticamente
        this.especialidad = especialidad;
        this.anioosExperiencia = anioosExperiencia;
        this.licenciaMedica = licenciaMedica;
    }

    /**Creacion de Getters & Setters*/
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAnioosExperiencia() {
        return anioosExperiencia;
    }

    public void setAnioosExperiencia(int anioosExperiencia) {
        this.anioosExperiencia = anioosExperiencia;
    }

    public String getLicenciaMedica() {
        return licenciaMedica;
    }

    public void setLicenciaMedica(String licenciaMedica) {
        this.licenciaMedica = licenciaMedica;
    }
    public void mostrarInfoMedico() {
        System.out.println("ID Medico: " + this.getIdPersonal());
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Apellido: " + this.getApellido());
        System.out.println("Especialidad: " + this.especialidad);
        System.out.println("Años de Experiencia: " + this.anioosExperiencia);
        System.out.println("Licencia Medica: " + this.licenciaMedica);
    }
}
