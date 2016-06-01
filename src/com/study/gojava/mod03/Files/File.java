package com.study.gojava.mod03.Files;

public abstract class File {

    private String name;
    private String extension;

    public void editFile(){
    }

    public void deleteFile(){
    }

    public void changeName(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }
}
