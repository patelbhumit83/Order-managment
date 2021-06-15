package com.egen.model;

public class Order {
    private  String id;
    private String order_id;
    private String order_status;
    private String order_customer_id;
    private String order_item_name;
    private String order_item_qty;
    private String order_subtotal;
    private String order_tax;
    private String order_shipping_charges;
    private String order_total;

    public Order()
    {

    }


    public Order(String id, String order_id, String order_status, String order_customer_id, String order_item_name, String order_item_qty, String order_subtotal, String order_tax, String order_shipping_charges, String order_total) {
        this.id = id;
        this.order_id = order_id;
        this.order_status = order_status;
        this.order_customer_id = order_customer_id;
        this.order_item_name = order_item_name;
        this.order_item_qty = order_item_qty;
        this.order_subtotal = order_subtotal;
        this.order_tax = order_tax;
        this.order_shipping_charges = order_shipping_charges;
        this.order_total = order_total;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    public String getOrder_customer_id() {
        return order_customer_id;
    }

    public void setOrder_customer_id(String order_customer_id) {
        this.order_customer_id = order_customer_id;
    }

    public String getOrder_item_name() {
        return order_item_name;
    }

    public void setOrder_item_name(String order_item_name) {
        this.order_item_name = order_item_name;
    }

    public String getOrder_item_qty() {
        return order_item_qty;
    }

    public void setOrder_item_qty(String order_item_qty) {
        this.order_item_qty = order_item_qty;
    }

    public String getOrder_subtotal() {
        return order_subtotal;
    }

    public void setOrder_subtotal(String order_subtotal) {
        this.order_subtotal = order_subtotal;
    }

    public String getOrder_tax() {
        return order_tax;
    }

    public void setOrder_tax(String order_tax) {
        this.order_tax = order_tax;
    }

    public String getOrder_shipping_charges() {
        return order_shipping_charges;
    }

    public void setOrder_shipping_charges(String order_shipping_charges) {
        this.order_shipping_charges = order_shipping_charges;
    }

    public String getOrder_total() {
        return order_total;
    }

    public void setOrder_total(String order_total) {
        this.order_total = order_total;
    }

    public Order(String id){
        this.id = id;
    }


}
