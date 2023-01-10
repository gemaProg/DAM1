

public class Profesor {

    //Desarrollar una clase llamada Profesor que:
    //  Tenga un método ponerNotas que recibe un parámetro de tipo Alumno y que no devuelve nada.
    //  Pondrá una calificación aleatoria a cada una de las asignaturas del alumno.
    //      Nota: Para calcular un número aleatorio usaremos Math.random() que devuelve un double entre 0.0 y 1.0
    public static void ponerNotas(Alumno alumno) {
        alumno.getAsignatura1().setNota(Math.random() * Constantes.NOTA_MAX);//uso el constructor del Alumno que llama al de Asignatura
        alumno.getAsignatura2().setNota(Math.random() * Constantes.NOTA_MAX);
        alumno.getAsignatura3().setNota(Math.random() * Constantes.NOTA_MAX);
    }

    //  Tenga un método calcularMedia que recibe un parámetro de tipo Alumno y devuelve un double.
    public static double calcularMedia(Alumno alumno) {
        double notaAsignatura1 = alumno.getAsignatura1().getNota();
        double notaAsignatura2 = alumno.getAsignatura2().getNota();
        double notaAsignatura3 = alumno.getAsignatura3().getNota();
        return (notaAsignatura1 + notaAsignatura2 + notaAsignatura3) / 3;
    }
}