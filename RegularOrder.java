package ExamSolution;

import java.time.LocalDate;
import java.util.ArrayList;

public class RegularOrder extends Order{
    public RegularOrder(int id, OrderName name, String deliveryAddress, ArrayList<OrderItem> orderItems, Customer orderCustomer, int orderTotalPrice, PaymentType paymentType, LocalDate orderDate) {
        super(id, name, deliveryAddress, orderItems, orderCustomer, orderTotalPrice, paymentType, orderDate);
        calculateTotalPrice();
    }
}
