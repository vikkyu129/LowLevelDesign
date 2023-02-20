package com.lld.solid;
// A class should have only one reason to change

class Marker{
    private  String name;
    private String color;
    private int year;
    private int price;

    public Marker(String name, String color, int year, int price) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

class  InvoiceWithMultipleResponsibilities{
    private Marker marker;
    private int quantity;

    public InvoiceWithMultipleResponsibilities(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }
    public int CalculateTotal(){
        return marker.getPrice() * this.quantity;
    }

    public void SaveToDb(){
        //save to DB
    }

    public void PrintInvoice(){
        //prints invoice
    }
}

// Splitting the multiple Responsibilities to Single Responsibilities
class  Invoice{
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }
    public int CalculateTotal(){
        return marker.getPrice() * this.quantity;
    }
}
class InvoiceDao{
    private Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }
    public void SaveToDb(){
        //save to DB
    }
}

class InvoicePrinter{
    private Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }
    public void PrintInvoice(){
        //prints invoice
    }

}

public class SingleResponsibility {
}
