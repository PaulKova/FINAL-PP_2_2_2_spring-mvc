package web.models;

public class Car {

    private int ID;
    private String model;
    private String color;

    public Car(int ID, String model, String color) {
        this.ID = ID;
        this.model = model;
        this.color = color;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "ID=" + ID +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}