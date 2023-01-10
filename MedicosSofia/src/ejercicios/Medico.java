/*
Crear la clase Medico con los siguientes atributos y métodos:
nombre
edad
sexo (M = masculino, F = femenino)
horas
SalarioHora
Método mostrarDatos
Método abstracto calcularSalario
*/
package ejercicios;

public abstract class Medico {
  
	private String nombre;
	private int edad;
	private boolean sexo;
	private double horas;
	private double salarioHora;
	
	
	public Medico(String nombre, int edad, boolean sexo, double horas, double salarioHora) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.horas = horas;
		this.salarioHora = salarioHora;
	}

	public String mostrarDatos() {
		return this.nombre +" "+ this.edad+" "+ this.sexo+" "+ this.horas+" "+this.salarioHora;
	}
	
	public abstract double calcularSalario();

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}

	public double getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}
	
	
	
}
