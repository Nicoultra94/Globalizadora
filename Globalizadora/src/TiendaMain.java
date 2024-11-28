
public class TiendaMain {

	public static void main(String[] args) {

		Ropa r1 = new Ropa(5000, "Nike", "Remera", "M");
		Ropa r2 = new Ropa(15000, "Lacoste", "Jeans", "40");
		Ropa r3 = new Ropa(25000, "Salomon", "Campera", "L");
		Electrodomesticos e1 = new Electrodomesticos(50000, "Motorola", "Telefonia");
		Electrodomesticos e2 = new Electrodomesticos(200000, "Samsung", "Entretenimiento");
		Electrodomesticos e3 = new Electrodomesticos(100000, "Drean", "Refrigeracion");
		
		Clientes c1 = new Clientes("Nicolas");
		Clientes c2 = new Clientes("Juan");
		Clientes c3 = new Clientes("Pedro");
		Clientes c4 = new Clientes("Milena");
		Clientes c5 = new Clientes("Sol");

		
		Ventas v1 = new Ventas(e2, c3);
		Ventas v2 = new Ventas(r3, c1);
		Ventas v3 = new Ventas(r1, c5);
		Ventas v4 = new Ventas(e3, c2);
		Ventas v5 = new Ventas(e1, c4);
		
	System.out.println(v1);
	System.out.println(v2);
	System.out.println(v3);
	System.out.println(v4);
	System.out.println(v5);
		
	}

}
