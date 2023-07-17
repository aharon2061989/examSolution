package ExamSolution;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer firstCustomer = new Customer(1,"aharon","ben-shimol","ahron2061989@gmail.com","habracha-eilat"
                ,CustomerType.VIP,200);
        Customer secondCustomer = new Customer(2,"zion","zah","zion12345@gmail.com","yotam-eilat"
                ,CustomerType.REGULAR,0);

        OrderItem first = new OrderItem(1,"computer",1000);
        OrderItem second = new OrderItem(2,"TV",800);
        OrderItem third = new OrderItem(3,"PSP",500);
        OrderItem four = new OrderItem(4,"Nintendo",300);
        ArrayList<OrderItem> orderItems = new ArrayList<>();
        orderItems.add(first);
        orderItems.add(second);

        VipOrder firstRegularOrder = new VipOrder(1,OrderName.VIP,"eilat",orderItems,firstCustomer,0,PaymentType.CASH,LocalDate.now());
        System.out.println(firstRegularOrder.getOrderTotalPrice());




    }
}
