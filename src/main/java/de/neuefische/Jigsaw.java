package de.neuefische;

public class Jigsaw implements CanMakeNoise{

    private String brand;

    private String color;

    public Jigsaw(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public void startJigsaw(){
        System.out.println("You start the Jigsaw");
    }

    @Override
    public void makeNoise() {
        System.out.println("Jigsaw Sound");
    }
}
