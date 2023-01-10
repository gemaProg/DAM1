
public class P2 {

    public static void main(String[] args) {
        //Desarrollar una clase llamada P2 que en su método main:
        //  Cree e inicialice tres Asignaturas.
        Asignatura asignatura1 = new Asignatura(Constantes.ID_ASIGNATURA1_ALUMNO1);
        Asignatura asignatura2 = new Asignatura(Constantes.ID_ASIGNATURA2_ALUMNO1);
        Asignatura asignatura3 = new Asignatura(Constantes.ID_ASIGNATURA3_ALUMNO1);

        //  Cree un Alumno con las tres Asignaturas. (Este lo creo a partir de asignaturas)
        Alumno alumno1 = new Alumno(asignatura1, asignatura2, asignatura3);
        Alumno alumno2 = new Alumno(Constantes.ID_ASIGNATURA1_ALUMNO2, Constantes.ID_ASIGNATURA2_ALUMNO2, Constantes.ID_ASIGNATURA3_ALUMNO2);
        //Hago esto para acordarme de que aunque las asignaturas del alumno1 y del alumno2 tengan el mismo número, se hacen en constructores distintos y no tienen nada que ver.
        //O sea, el código de asignatura es único por alumno y asignatura

        //  Cree un Profesor que le ponga calificaciones al Alumno y muestre por pantalla la media del Alumno.
        
        Profesor.ponerNotas(alumno1);
        Profesor.ponerNotas(alumno2);

        System.out.println(Constantes.BOLETIN_DE_NOTAS + Constantes.DEL_ALUMNO_1);
        System.out.printf(Constantes.ASIGNATURA_D_N_NOTA_DEL_ALUMNO1_2_F_N, asignatura1.getIdentificador(), alumno1.getAsignatura1().getNota());
        System.out.printf(Constantes.ASIGNATURA_D_N_NOTA_DEL_ALUMNO1_2_F_N, asignatura2.getIdentificador(), alumno1.getAsignatura2().getNota());
        System.out.printf(Constantes.ASIGNATURA_D_N_NOTA_DEL_ALUMNO1_2_F_N, asignatura3.getIdentificador(), alumno1.getAsignatura3().getNota());
        System.out.println();
        System.out.printf(Constantes.NOTA_MEDIA_DEL_ALUMNO1_2_F, Profesor.calcularMedia(alumno1));
        System.out.println();
        System.out.println();
        System.out.println(Constantes.SEPARADOR);
        System.out.println();
        System.out.println(Constantes.BOLETIN_DE_NOTAS + Constantes.DEL_ALUMNO_2);
        System.out.printf(Constantes.ASIGNATURA_D_N_NOTA_DEL_ALUMNO2_2_F_N, asignatura1.getIdentificador(), alumno2.getAsignatura1().getNota());
        System.out.printf(Constantes.ASIGNATURA_D_N_NOTA_DEL_ALUMNO2_2_F_N, asignatura2.getIdentificador(), alumno2.getAsignatura2().getNota());
        System.out.printf(Constantes.ASIGNATURA_D_N_NOTA_DEL_ALUMNO2_2_F_N, asignatura3.getIdentificador(), alumno2.getAsignatura3().getNota());
        System.out.println();
        System.out.printf(Constantes.NOTA_MEDIA_DEL_ALUMNO2_2_F, Profesor.calcularMedia(alumno2));
        System.out.println();
        System.out.println();
    }
}