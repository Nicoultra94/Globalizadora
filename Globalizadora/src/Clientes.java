
public class Clientes {

	private String nombre;

	public Clientes(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return " Cliente: " + nombre ;
	}
	
	
	
}
