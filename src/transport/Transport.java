package transport;

import java.util.Objects;

public abstract class Transport {
    private  String brand;
    private  String model;
    private   int productionYear;
    private   String productionCountry;
    private String color;
    private  int maxSpeed;


    public  Transport (String brand, String model,
                       int productionYear, String productionCountry,
                       String color, int maxSpeed) {

        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            brand = "ошибка";
        }
        this.brand = brand;

        if (model == null || model.isEmpty() || model.isBlank()) {
            model = "ошибка";
        }
        this.model = model;


        if (productionYear <= 0 ) {
            productionYear = 2000;
        }
        this.productionYear = productionYear;

        if (productionCountry == null || productionCountry.isEmpty() || productionCountry.isBlank()) {
            productionCountry = "ошибка";}
        this.productionCountry = productionCountry;

        if (color == null || color.isEmpty() || color.isBlank()) {
            color = "Белый";
        }
        this.color = color;

        if (maxSpeed <= 0 ) {
            maxSpeed = 180;
        }
        this.maxSpeed = maxSpeed;
    }

    public Transport(String brand, String model, int productionYear, String productionCountry, String color) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return
                "Марка " + brand  +
                        ", модель " + model  +
                        ", год производства " + productionYear +
                        ", страна производства " + productionCountry +
                        ", цвет " + color +
                        ", максимальная скорость " + maxSpeed
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return productionYear == transport.productionYear && maxSpeed == transport.maxSpeed && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(productionCountry, transport.productionCountry) && Objects.equals(color, transport.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, productionYear, productionCountry, color, maxSpeed);
    }
}