package com.study.gojava.mod03.Files;

public class ImageFile extends File {
    private int pixelsPerHeight;
    private int pixelsPerWidth;
    private double displaySize;
    private double qualityOfImage;

    public int getPixelsPerHeight() {
        return pixelsPerHeight;
    }

    public void setPixelsPerHeight(int pixelsPerHeight) {
        this.pixelsPerHeight = pixelsPerHeight;
    }

    public int getPixelsPerWidth() {
        return pixelsPerWidth;
    }

    public void setPixelsPerWidth(int pixelsPerWidth) {
        this.pixelsPerWidth = pixelsPerWidth;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    private double pixelsPerInch(int pixelsPerHeight, int pixelsPerWidth, double displaySize){
        return qualityOfImage;
    }

}
