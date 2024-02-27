package main;
import java.util.Scanner;

public class Car {
    // DO NOT CALL NON-INSTANTIATED OBJECTS!
    // Otherwise, Null pointer exception will be raised at RUNTIME!

    String type;

    Car()
    {
        String type = "a";
    }

    void printCar()
    {
        System.out.println(type);
    }
}

