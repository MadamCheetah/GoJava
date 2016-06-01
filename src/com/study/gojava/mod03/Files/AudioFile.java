package com.study.gojava.mod03.Files;

public class AudioFile extends File {
    private String volume;

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public void turnUpTheSound(){
        System.out.println("Let's get loud!");
    }

    public void turnDownTheSound(){
        System.out.println("Hush!");
    }

}
