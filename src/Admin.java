import java.util.ArrayList;

public class Admin extends User {
    ArrayList<Product> products = new ArrayList<Product>();

    public Admin(int userID, String name, String email , String password) {
        super(userID, name, email, password);
    }

    @Override
    public void displayDetails(String password) {
        if (password.equals(super.password)) {
            System.out.println(" ");
            System.out.println("Admin details are:");
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
            System.out.println("UserID: " + userID);
            System.out.println("List of products: ");
            System.out.println("=====================");

            // Показать список товаров
            for (Product product : products) {
                System.out.println(" ");
                product.displayDetails();
            }
            System.out.println("=====================");
            System.out.println(" ");
        }
    }

    int prodCount = 0;
    public void addProduct(String name, double price, int stock) {
        Product productToAdd = new Product("" + prodCount, name, price, stock);
        products.add(productToAdd);
        prodCount++;
    }

    public void removeProduct(String productId) {
        Product productToRemove = null;
        for (Product product : products) {
            if (product.productId.equals(productId)) {
                productToRemove = product;
                break;
            }
        }
        products.remove(productToRemove);
    }

    public void updateStock(String productId, int stock) {
        for (Product product : products) {
            if (product.productId.equals(productId)) {
                product.stock = stock;
                break;
            }
        }
    }
}















