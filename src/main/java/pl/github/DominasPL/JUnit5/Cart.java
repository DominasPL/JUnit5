package pl.github.DominasPL.JUnit5;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Order> orders = new ArrayList<>();

    public void addOrderToCart(Order order) {
        orders.add(order);
    }

    public void clearCart() {
        this.orders.clear();
    }

    void simulateLargeOrder() {

        for (int i = 1; i < 1000; i++) {

            Meal meal = new Meal(i%10, "Hamburger no " + i);
            Order order = new Order();
            order.addMealToOrder(meal);
            addOrderToCart(order);
        }

        System.out.println("Cart size: " + orders.size());
        clearCart();

    }
}
