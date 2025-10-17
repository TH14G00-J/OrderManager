import model.Client;
import model.Order;
import model.OrderItem;
import model.Product;
import model.enuns.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String data = sc.nextLine();
        LocalDate date = LocalDate.parse(data, formatter);
        Client client = new Client(name, email, date);
        System.out.print("Status: ");
        String status = sc.next();
        System.out.println("Enter order data: ");
        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        LocalDateTime dateTime = LocalDateTime.now();
        Order order = new Order(client, dateTime, OrderStatus.valueOf(status.trim().toUpperCase()));
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            System.out.printf("Enter #%d° item data:%n", i);
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(productPrice, new Product(productName), quantity);
            order.addItem(orderItem);
        }
        System.out.println();
        System.out.println(order);
    }
}