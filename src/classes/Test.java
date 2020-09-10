package classes;

public class Test {

    public static void main(String[] args) {
        HuntDog dog1= new HuntDog("Снежок","Белый",
                20,"Быстрый",true);
        dog1.search();
        dog1.bark();
        dog1.givePaw();
        dog1.AboutDog();
        PoliceDog dog2 = new PoliceDog("К2","Черно-коричневый",
                22,3,"Bob");
        dog2.search();
        dog2.bark();
        dog2.givePaw();
        dog2.AboutDog();
    }
}
