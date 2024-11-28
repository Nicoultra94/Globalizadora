
public class Productos {

	protected double precio;
	protected String marca;
	public Productos(double precio, String marca) {
		super();
		this.precio = precio;
		this.marca = marca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
}
