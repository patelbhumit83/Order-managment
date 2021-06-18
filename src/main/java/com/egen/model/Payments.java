package com.egen.model;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class Payments {
    @Id
    private String id;
    private String amount;
    private String order_payment_method;
    private String order_payment_date;
    private String order_payment_confirmation_number;

    @OneToOne
    private Address billingAddress;

    @ManyToOne()
    @JoinColumn(name = "order_id")
    private Order order;


    public Payments() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getOrder_payment_method() {
        return order_payment_method;
    }

    public void setOrder_payment_method(String order_payment_method) {
        this.order_payment_method = order_payment_method;
    }

    public String getOrder_payment_date() {
        return order_payment_date;
    }

    public void setOrder_payment_date(String order_payment_date) {
        this.order_payment_date = order_payment_date;
    }

    public String getOrder_payment_confirmation_number() {
        return order_payment_confirmation_number;
    }

    public void setOrder_payment_confirmation_number(String order_payment_confirmation_number) {
        this.order_payment_confirmation_number = order_payment_confirmation_number;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Payments(String amount, String order_payment_method, String order_payment_date, String order_payment_confirmation_number, Address billingAddress, Order order) {
        this.amount = amount;
        this.order_payment_method = order_payment_method;
        this.order_payment_date = order_payment_date;
        this.order_payment_confirmation_number = order_payment_confirmation_number;
        this.billingAddress = billingAddress;
        this.order = order;
    }
}