package de.neuefische;

public class Violin extends MusicInstrument implements CanMakeNoise {


    @Override
    public void makeNoise() {
        System.out.println("Violin Sound");
    }

    public void makeNoise(String text){
        System.out.println("Violin sounds: " + text);
    }
}
