package de.neuefische;

public class Guitar implements CanMakeNoise{

    @Override
    public void makeNoise(){
        System.out.println("Guitar Sounds");
    }
}
