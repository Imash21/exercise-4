package com.example;

public class Car {
    private String model;
    private String brand;
    private int year;
    private int price;
    private String color;
    private int quantity;

    public Car(String model, String brand, int Year, int price, String color, int quantity) {
        this.model = model;
        this.brand = brand;
        this.year = Year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }
    void sell(int sold){
        quantity -= sold;
    }
    void delivery (int delivery){
        quantity += delivery;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand(){
        return brand;
    }
    public void setBrand (String brand){
        this.brand = brand;
    }
    public int getYear(){
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public String getColor(){
        return color;
    }
    public void  setColor(String color){
        this.color = color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        return "Car{" +
                "model='" + model + '\'' +
                ",brand ='" + brand + '\'' +
                ", year = '" + year + '\'' +
                ", price ='" + price + '\'' +
                ", color ='" + color + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }

}

public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car("C5", "Citreon", 2021, 45000, "Black", 1);
        System.out.println(car1.toString());
        car1.sell(1);
        car1.delivery(2);
        int Year = car1.getYear();
        car1.setColor("Black");
        System.out.println(car1.toString());
    }
}
