package classes;

public class GermanShepherd extends Dog{
    String nameOfInstructor;
    int yearsOfService;
    String[] items = new String[]{"Улика", "Корм", "Заложника", "Пропавший кошелек"};

    GermanShepherd() {
        nameOfInstructor = "undefined";
        yearsOfService = -1;
    }

    GermanShepherd(String name, String color, int size, int yearsOfService, String nameOfInstructor) {
        this.yearsOfService = yearsOfService;
        this.nameOfInstructor = nameOfInstructor;
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public void setNameOfInstructor(String nameOfInstructor) {
        this.nameOfInstructor = nameOfInstructor;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public String getNameOfInstructor() {
        return nameOfInstructor;
    }

    @Override
    public void search() {
        System.out.println("Собака отправилась на поиски и обнаружила:" + ((int) (Math.random() * 1000)) % 4);
    }

    @Override
    public void givePaw() {
        System.out.println(name + " подбегает к " + nameOfInstructor + " и лапу");
    }

    @Override
    public void AboutDog() {
        System.out.println(
                "\nПараметры собаки:" +
                        "\nИмя собаки:" + name +
                        "\nЦвет:" + color +
                        "\nРазмер:" + size +
                        "\nИнструктор собаки:" + nameOfInstructor +
                        "\nГоды службы:" + yearsOfService +
                        "\n__________________"
        );
    }
}

