package com.example.is2011_car;

public class Car {
    private String name; // название
    private String opis;  // столица
    private int imageCar; // ресурс флага
    private int count;
    private String unit;

    public Car(String name, String opis, int image, String unit){

        this.name=name;
        this.opis=opis;
        this.imageCar=image;
        this.count=0;
        this.unit = unit;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOpis() {
        return this.opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public int getimageCar() {
        return this.imageCar;
    }

    public void setimageCar(int imageCar) {
        this.imageCar = imageCar;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public String getUnit() {
        return this.unit;
    }

  
}

