public class Product {
    protected String productId;
	protected String name;
	protected double price;
	protected int stock;

    public Product(String productId, String name, double price, int stock) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void reduceStock() {
        this.stock -= 1;
    }

    public void increaseStock() {
        this.stock += 1;
    }

    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
        System.out.println("Product Stock: " + stock);
    }
}
