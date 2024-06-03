package de.neuefische;

public class Main {

    public static void main(String[] args) {

        CanMakeNoise violinSound = new Violin();
        Guitar guitar = new Guitar();
        Jigsaw jigsaw = new Jigsaw("Bosch", "Grün");


        CanMakeNoise[] objectsForSoundStudio = {violinSound, guitar, jigsaw};

        for (CanMakeNoise c:objectsForSoundStudio) {
            recordNoise(c);
        }
    }

    public static void recordNoise(CanMakeNoise something){
        something.makeNoise();
    }
}