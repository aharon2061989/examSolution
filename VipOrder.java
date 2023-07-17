package ExamSolution;

import java.time.LocalDate;
import java.util.ArrayList;

public class VipOrder extends Order{
    public VipOrder(int id, OrderName name, String deliveryAddress, ArrayList<OrderItem> orderItems, Customer orderCustomer, int orderTotalPrice, PaymentType paymentType, LocalDate orderDate) {
        super(id, name, deliveryAddress, orderItems, orderCustomer, orderTotalPrice, paymentType, orderDate);
        calculateTotalPrice();
    }
}
