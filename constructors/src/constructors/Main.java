package constructors;



public class Main {

	public static void main(String[] args) {

		Product product2 = new Product(8,"Laptop","DELL Laptop",11000,3,"siyah");
		Product product = new Product();
		
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("DELL Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		
		
		ProductManager productManager = new ProductManager();
		productManager.ekle(product);
		System.out.println(product.getKod());
	}

}
