
public class Ropa extends Productos{
	
	private String prenda;
	private String talle;
	
	public Ropa(double precio, String marca, String prenda, String talle) {
		super(precio, marca);
		this.prenda = prenda;
		this.talle = talle;
	}

	public String getPrenda() {
		return prenda;
	}

	public void setPrenda(String prenda) {
		this.prenda = prenda;
	}

	public String getTalle() {
		return talle;
	}

	public void setTalle(String talle) {
		this.talle = talle;
	}

	@Override
	public String toString() {
		return "Ropa:  Prenda: " + prenda + ", Talle: " + talle + ", Precio: " + precio + ", Marca: " + marca;
	}
	

}
