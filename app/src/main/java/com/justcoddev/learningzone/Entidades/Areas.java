package com.justcoddev.learningzone.Entidades;

import java.io.Serializable;

public class Areas implements Serializable {
    private String name;
    private String description;
    private int image_id;
    private String title_area;

private boolean expanded;
    public Areas() {
    }

    public Areas(String name, String description, int image_id, String title_area) {
        this.name = name;
        this.description = description;
        this.image_id = image_id;
        this.title_area =title_area;
        this.expanded= false;
    }

    public String getName() {
        return name;
    }

    public String getTitle_area() {
        return title_area;
    }

    public void setTitle_area(String title_area) {
        this.title_area = title_area;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage_id() {
        return image_id;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

    @Override
    public String toString() {
        return "Areas{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", image_id=" + image_id +
                '}';
    }
}
