package main;
import java.util.Scanner;

public class Car {
    // DO NOT CALL NON-INSTANTIATED OBJECTS!
    // Otherwise, Null pointer exception will be raised at RUNTIME!

    private String type;

    Car()
    {
        type = "a";
    }

    public void printCar()
    {
        System.out.println(type);
    }

    public void modifyCar(String newType)
    {
        this.type = newType;
    }
}

