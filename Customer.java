package ExamSolution;

import java.util.ArrayList;

public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String deliveryAddress;
    private CustomerType customerType;
    private int discount;
    private ArrayList<OrderItem> favoriteItems;
    private Gift customerGift;

    public Customer(int id, String firstName, String lastName, String email, String deliveryAddress, CustomerType customerType, int discount) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.deliveryAddress = deliveryAddress;
        this.customerType = customerType;
        this.discount = discount;
        this.favoriteItems = new ArrayList<>();
    }

    public void addOrderToFavoriteItems(ArrayList<OrderItem> orderItems) {
        for (OrderItem orderItem : orderItems) {
            boolean itemExists = false;
            for (OrderItem favoriteItem : orderItems) {
                if (orderItem.getItemName().equals(favoriteItem.getItemName())) {
                    itemExists = true;
                    break;
                }
            }
            if (!itemExists) {
                favoriteItems.add(orderItem);
            }
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }
    public int getDiscount() {
        return discount;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }
    public ArrayList<OrderItem> getFevoriteItems() {
        return favoriteItems;
    }
    public void setFevoriteItems(ArrayList<OrderItem> fevoriteItems) {
        this.favoriteItems = fevoriteItems;
    }
    public Gift getCustomerGift() {
        return customerGift;
    }
    public void setCustomerGift(Gift customerGift) {
        this.customerGift = customerGift;
    }
    public void takeGift(Gift gift) {
        this.customerGift = gift;
    }
    public void openGift() {
        if (customerGift != null) {
            System.out.println("Congratulations! you got a new gift! Enjoy!");
            customerGift.openGift();
        } else {
            System.out.println("Sorry, you don't have a gift to open.");
        }
    }
    public void addFavoriteItem(OrderItem item) {
        if (!favoriteItems.contains(item)) {
            favoriteItems.add(item);
        }
    }

    public void removeFavoriteItem(OrderItem item) {
        favoriteItems.remove(item);
    }


}