import java.util.ArrayList;

public class Customer extends User {
    private ArrayList<Order> orders = new ArrayList<Order>();
    private String shippingAddress;
    private double shippingCost;

    public Customer(int userID, String name, String email , String password, String shippingAddress) {
        super(userID, name, email, password);
        this.shippingAddress = shippingAddress;
    }

    // Показать все данные пользователя
    @Override
    public void displayDetails(String password){
        if (password.equals(super.password)) {
            System.out.println(" ");
            System.out.println("Account details are:");
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
            System.out.println("UserID: " + userID);
            System.out.println("Shipping Address: " + shippingAddress);
            System.out.println("List of orders: ");
            System.out.println("=====================");

            // Показать список заказов
            for (Order order : orders) {
                order.displayOrderDetails();
                shippingCost += order.quantity * order.product.price;
            }
            System.out.println("Shipping Cost: " + shippingCost);
            System.out.println("=====================");
            System.out.println(" ");
        }
    }

    // Добавить товар в корзину
    public void placeOrder(String orderId, Customer customer, Product product, int quantity ) {
        orders.add(new Order(orderId, customer, product, quantity, product.price * quantity, "Placed"));
        for (int i = 0; i < quantity; i++) {
            product.reduceStock();
        }
    }

    // Удалить товар из корзины
    public void cancelOrder(String orderId) {
        for (Order order : orders) {
            if (order.orderId.equals(orderId)) {
                order.cancelOrder();
                orders.remove(order);
            }
        }
    }
}





















