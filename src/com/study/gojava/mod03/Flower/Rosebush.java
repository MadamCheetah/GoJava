package com.study.gojava.mod03.Flower;

import java.util.List;

public class Rosebush extends BunchOfFlowers{

    boolean inBlossom;

   private List<Rose> rosebush;

    public boolean isInBlossom() {
        return inBlossom;
    }

    public void setInBlossom(boolean inBlossom) {
        this.inBlossom = inBlossom;
    }

    public List<Rose> getRosebush() {
        return rosebush;
    }

    public void setRosebush(List<Rose> rosebush) {
        this.rosebush = rosebush;
    }
}
