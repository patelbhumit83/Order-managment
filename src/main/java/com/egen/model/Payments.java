package com.egen.model;

public class Payments {
    private String payment_id;
    private String order_payment_method;
    private String order_payment_date;
    private String order_payment_confirmation_number;

    public Payments()
    {

    }

    public Payments(String payment_id, String order_payment_method, String order_payment_date, String order_payment_confirmation_number) {
        this.payment_id = payment_id;
        this.order_payment_method = order_payment_method;
        this.order_payment_date = order_payment_date;
        this.order_payment_confirmation_number = order_payment_confirmation_number;
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
}
