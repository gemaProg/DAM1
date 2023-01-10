/*Atributo: Clase CentroSalud (int identificador, String nombre,
 *  String domicilio, localidad (código postal))
Método mostrarDatos que muestra todos sus atributos.
Método calcularSalario()
 que a partir de las horas 
 trabajadas devuelve el importe del sueldo correspondiente.
*/
package ejercicios;

public class MedicoCentroSalud extends Medico {

	private CentroSalud centro;

	public MedicoCentroSalud(String nombre, int edad, boolean sexo, double horas, double salarioHora, CentroSalud centro) {
		super(nombre, edad, sexo, horas, salarioHora);
		this.centro = centro;
	}

	public String mostrarDatos() {
		return super.mostrarDatos() + " " + centro;
	}

	public double calcularSalario() {

		return getHoras() * getSalarioHora();
	}

}
