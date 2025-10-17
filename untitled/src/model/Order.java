package model;

import model.enuns.OrderStatus;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDateTime date;
    private OrderStatus status;
    private List<OrderItem> orderItemList = new ArrayList<>();
    private Client client;

    public Order() {}

    public Order(Client client, LocalDateTime date, OrderStatus status) {
        this.client = client;
        this.date = date;
        this.status = status;
    }

    public void addItem(OrderItem item) {
        if (item != null) {
            orderItemList.add(item);
        }else {
            System.out.println("The item cannot be null");
        }
    }

    public Double total() {
        return orderItemList.stream().mapToDouble(OrderItem::subTotal).sum();
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return """
                ORDER SUMMARY:
                Order moment: %s
                Order statud: %s
                Client: %s
                Order items: %s
                Total price: %.2f
                """.formatted(getDate().format(formatter), getStatus(), getClient(), getOrderItemList() , total());
    }

    public void removeItem(OrderItem item) {
        orderItemList.remove(item);
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
