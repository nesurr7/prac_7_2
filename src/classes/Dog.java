package classes;

public abstract class Dog {
    protected String name;
    protected String color;
    protected int size;

    Dog() {
        name = "undefined";
        color = "undefined";
        size = -1;
    }

    Dog(String name, String color, int size) {
        this.color = color;
        this.name = name;
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public void bark() {
        System.out.println("Aww");
    }

    public abstract void search();

    public abstract void givePaw();

    public abstract void AboutDog();
}
