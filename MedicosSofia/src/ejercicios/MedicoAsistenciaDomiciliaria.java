/*Atributo kmVisitas, que recoge el número de km de cada visita.
 *  El array es de enteros. Si todas sus posiciones están a 0-> no ha hecho visitas. 
 *  Si ha hecho dos visitas tendrá dos posiciones con el kilometraje de cada visita.
Atributo tarifaKm, double en el que se almacena 
lo que cobra el médico por el km recorrido para atender la visita.
Método mostrarDatos que muestra todos sus atributos.
Método calcularSalario() que a partir de las horas trabajadas devuelve el importe del sueldo correspondiente más el salario derivado del kilometraje realizado en las visitas.
*/

package ejercicios;

import java.util.Arrays;

public class MedicoAsistenciaDomiciliaria extends Medico {

	private int[] kmVisitas;
	private double tarifakm;

	public MedicoAsistenciaDomiciliaria(String nombre, int edad, boolean sexo, double horas, double salarioHora, double tarifaKm) {
		super(nombre, edad, sexo, horas, salarioHora);
		this.kmVisitas = new int[10];
		this.tarifakm = tarifaKm;
	}

	
	public int[] getKmVisitas() {
		return kmVisitas;
	}


	public String mostrarDatos() {
		return super.mostrarDatos() + " " + Arrays.toString(this.kmVisitas) + " " + this.tarifakm;

	}

	public double calcularSalario() {
		double suma = 0;

		for (int i = 0; i < this.kmVisitas.length; i++) {

			suma += this.kmVisitas[i] * this.tarifakm;

		}

		return suma + getHoras() * getSalarioHora();

	}

}
