package model;

public class OrderItem {
    private Integer quantity;
    private Double price;
    private Product product;

    public OrderItem() {}

    public OrderItem(Double price, Product product, Integer quantity) {
        this.price = price;
        this.product = product;
        this.quantity = quantity;
    }

    public Double subTotal() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return """
                %s, $%.2f, Quantity: %d, Subtotal: %.2f
                """.formatted(getProduct().getName(), getPrice(), getQuantity(), subTotal());
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
