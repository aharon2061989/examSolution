package ExamSolution;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Order {
    private int id;
    private OrderName name;
    private String deliveryAddress;
    private ArrayList<OrderItem> orderItems;
    private Customer orderCustomer;
    private int orderTotalPrice;
    private PaymentType paymentType;
    private LocalDate orderDate;
    private int totalPrice;

    public Order(int id,OrderName name,String deliveryAddress,ArrayList<OrderItem> orderItems,Customer orderCustomer,int orderTotalPrice,PaymentType paymentType,LocalDate orderDate){
        this.id = id;
        this.name = name;
        this.deliveryAddress = deliveryAddress;
        this.orderItems = orderItems;
        this.orderCustomer = orderCustomer;
        this.orderTotalPrice = orderTotalPrice;
        this.paymentType = paymentType;
        this.orderDate = orderDate;
        calculateTotalPrice();
        orderCustomer.addOrderToFavoriteItems(orderItems);
    }
    public void calculateTotalPrice() {
        int totalPrice = 0;
        int discountedPrice = 0;
        for (OrderItem orderItem : orderItems){
            if (orderCustomer.getCustomerType().equals(CustomerType.REGULAR)){
                totalPrice += orderItem.getItemPrice();
                this.orderTotalPrice = totalPrice;
            } else if (orderCustomer.getCustomerType().equals(CustomerType.VIP)){
                int discount = orderCustomer.getDiscount();
                totalPrice += orderItem.getItemPrice();
                discountedPrice = totalPrice - discount;
                this.orderTotalPrice = discountedPrice;
            } else {
                throw new Error("Error: Regular customer cannot place a VIP order!");
            }
        }
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OrderName getName() {
        return name;
    }

    public void setName(OrderName name) {
        this.name = name;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(ArrayList<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public Customer getOrderCustomer() {
        return orderCustomer;
    }

    public void setOrderCustomer(Customer orderCustomer) {
        this.orderCustomer = orderCustomer;
    }

    public double getOrderTotalPrice() {
        return orderTotalPrice;
    }

    public void setOrderTotalPrice(int orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }


}
