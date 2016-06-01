package com.study.gojava.mod03.Flower;

import java.util.List;

public class Bouquet extends BunchOfFlowers {

    private String reasonFor;

    private List<Flower> bouquet;

    public String getReasonFor() {
        return reasonFor;
    }

    public void setReasonFor(String reasonFor) {
        this.reasonFor = reasonFor;
    }

    public List<Flower> getBouquet() {
        return bouquet;
    }

    public void setBouquet(List<Flower> bouquet) {
        this.bouquet = bouquet;
    }
}
