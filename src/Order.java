public class Order {
    protected String orderId;
	protected Customer customer;
    protected Product product;
    protected int quantity;
    protected double totalPrice;
    protected String status;

    public Order(String orderId, Customer customer, Product product, int quantity, double totalPrice, String status) {
        this.orderId = orderId;
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.status = status;
    }

    // Отменить заказ полностью
    public void cancelOrder() {
        status = "CANCELLED";
        for (int i = 0; i < quantity; i++) {
            product.increaseStock();
        }
    }

    // Отоброзить
    public void displayOrderDetails() {
        System.out.println(
                "Product: " + product.name +
                " Price: " + product.price +
                " Quantity: " + quantity
        );
    }
}
