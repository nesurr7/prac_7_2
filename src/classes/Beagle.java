package classes;

public class Beagle extends Dog {
    private String speed;
    private boolean hungry;

    Beagle() {
        speed = "undefined";
        hungry = false;
    }

    Beagle(String name, String color, int size, String speed, boolean hungry) {
        this.hungry = hungry;
        this.speed = speed;
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }


    public String getSpeed() {
        return speed;
    }

    public boolean getHungry() {
        return hungry;
    }

    @Override
    public void search() {
        if (hungry) {
            System.out.println("Вы дали приказ " + name + " и ей удалось найти добычу");
        } else {
            System.out.println(name + " не удалось найти зайца , поскольку она не голодна");
        }
    }

    @Override
    public void givePaw() {
        System.out.println(name + " не дает вам лапу");
    }

    @Override
    public void AboutDog() {
        System.out.println(
                "\nПараметры собаки:" +
                        "\nИмя собаки:" + name +
                        "\nЦвет:" + color +
                        "\nРазмер:" + size +
                        "\nСкорость:" + speed +
                        "\nГолодна:" + hungry +
                        "\n__________________"
        );
    }
}
