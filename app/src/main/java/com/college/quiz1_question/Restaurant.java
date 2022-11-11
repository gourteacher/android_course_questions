package com.college.quiz1_question;

public class Restaurant {

    private String name;
    private String description;

    public Restaurant(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Restaurant() {
        this(null, null);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
