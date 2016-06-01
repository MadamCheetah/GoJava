package com.study.gojava.mod03.MusicInstrument;

public abstract class MusicInstrument {
    private String soundRange;
    private double price;

    public void tuning(){
    }

    public void sound() {
    }

    public String getSoundRange() {
        return soundRange;
    }

    public void setSoundRange(String soundRange) {
        this.soundRange = soundRange;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
