package main;
import model.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.printCar();
        main2();

        dbHelper db = new dbHelper();
        addUser add = new addUser();

        db.requestSender(add, "ok");
    }

    public static void main2()
    {
        System.out.println("main2");
    }
}