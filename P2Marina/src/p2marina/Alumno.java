

public class Alumno {
    //Desarrollar una clase llamada Alumno que:
    //  Tenga tres atributos private de tipo Asignatura.
    private Asignatura asignatura1;
    private Asignatura asignatura2;
    private Asignatura asignatura3;

    //  Tenga un constructor con tres parámetros de tipo Asignatura que inicialice los tres atributos.
    public Alumno(Asignatura asignatura1, Asignatura asignatura2, Asignatura asignatura3) {
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.asignatura3 = asignatura3;
    }

    //  Tenga un constructor con tres parámetros de tipo int que inicialice los tres atributos.
    public Alumno(int idAsignatura1, int idAsignatura2, int idAsignatura3) {
        this.asignatura1 = new Asignatura(idAsignatura1);
        this.asignatura2 = new Asignatura(idAsignatura2);
        this.asignatura3 = new Asignatura(idAsignatura3);
    }

    //  Tenga un getter para cada uno de los atributos.
    public Asignatura getAsignatura1() {
        return asignatura1;
    }

    public Asignatura getAsignatura2() {
        return asignatura2;
    }

    public Asignatura getAsignatura3() {
        return asignatura3;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "asignatura1=" + asignatura1 +
                ", asignatura2=" + asignatura2 +
                ", asignatura3=" + asignatura3 +
                '}';
    }
}