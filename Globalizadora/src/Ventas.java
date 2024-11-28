
public class Ventas {

	private Productos productos;
	private Clientes clientes;
	public Ventas(Productos productos, Clientes clientes) {
		super();
		this.productos = productos;
		this.clientes = clientes;
	}
	public Productos getProductos() {
		return productos;
	}
	public void setProductos(Productos productos) {
		this.productos = productos;
	}
	public Clientes getClientes() {
		return clientes;
	}
	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
	}
	@Override
	public String toString() {
		return "Ventas: " + productos + "," + clientes ;
	}
	
	
	
}
