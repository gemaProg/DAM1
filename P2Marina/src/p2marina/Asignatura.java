
public class Asignatura {
    //Desarrollar una clase llamada Asignatura que:
    //  Tenga dos atributos private de tipo int (el identificador) y de tipo double (la calificación).
    private int identificador;
    private double nota;

    //  Tenga un constructor con un parámetro de tipo int.
    public Asignatura(int idAsignaturaAlumno) {
        identificador = idAsignaturaAlumno;
    }

    //  Tenga un getter para cada uno de los atributos.
    public int getIdentificador() {
        return identificador;
    }

    public double getNota() {
        return nota;
    }

    //  Tenga un setter para la calificación.
    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "identificador=" + identificador +
                ", nota=" + nota +
                '}';
    }
}