package org.tnsif.acc.c2tc.interview_questions.interfacedemo;

interface Player { 
    void play(); 
}

class AudioPlayer implements Player {
    @Override
    public void play() { 
        System.out.println("Playing audio track..."); 
    }
}

public class InterfaceReferenceDemo {
    public static void main(String[] args) {
        // Interface reference holding an implementation object
        Player myPlayer = new AudioPlayer(); 
        myPlayer.play();
    }
}