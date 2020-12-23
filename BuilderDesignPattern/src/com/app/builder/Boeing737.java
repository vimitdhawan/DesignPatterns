package com.app.builder;

public class Boeing737 implements Aircraft{

    private String name;
    private String cockpit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCockpit() {
        return cockpit;
    }

    public void setCockpit(String cockpit) {
        this.cockpit = cockpit;
    }

    @Override
    public String toString() {
        return "Boeing737{" +
                "name='" + name + '\'' +
                ", cockpit='" + cockpit + '\'' +
                '}';
    }
}
