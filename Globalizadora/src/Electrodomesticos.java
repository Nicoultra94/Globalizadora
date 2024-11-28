
public class Electrodomesticos extends Productos{
	
	private String categoria;

	public Electrodomesticos(double precio, String marca, String categoria) {
		super(precio, marca);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Electrodomestico: Categoria: " + categoria + ", Precio: " + precio + ", Marca: " + marca;
	}
	

}
