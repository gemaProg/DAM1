package ejercicios;

public class CentroSalud {
	private int identificador;
	private String nombre;
	private String domicilio;
	private int codigoPostal;
	
	public CentroSalud(int id, String nombre, String domicilio, int cd) {
		this.identificador=id;
		this.nombre=nombre;
		this.domicilio=domicilio;
		this.codigoPostal=cd;
		
		
	}
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public int getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

    @Override
    public String toString() {
        return "CentroSalud{" + "identificador=" + identificador + ", nombre=" + nombre + ", domicilio=" + domicilio + ", codigoPostal=" + codigoPostal + '}';
    }
        
}
