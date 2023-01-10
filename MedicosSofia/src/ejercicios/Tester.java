package ejercicios;

public class Tester {

	public static void main(String[] args) {

		CentroSalud centro = new CentroSalud(1, "Ejemplo", "Madrid", 28000);
		MedicoCentroSalud m1 = new MedicoCentroSalud("Ejemplo", 45, false, 43, 4, centro);
		MedicoAsistenciaDomiciliaria m2 = new MedicoAsistenciaDomiciliaria("Ejemplo", 40, false, 45, 23, 23);
		
		m2.getKmVisitas()[0] = 23;
		m2.getKmVisitas()[1] = 3;

		System.out.println(m1.calcularSalario());
		System.out.println(m2.calcularSalario());
		
		System.out.println(m1.mostrarDatos());
		System.out.println(m2.mostrarDatos());
	}

}
