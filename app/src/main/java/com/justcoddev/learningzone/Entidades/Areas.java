package com.justcoddev.learningzone.Entidades;

public class Areas {
    private String name;
    private String description;
    private int image_id;
private boolean expanded;
    public Areas() {
    }

    public Areas(String name, String description, int image_id) {
        this.name = name;
        this.description = description;
        this.image_id = image_id;
        this.expanded= false;
    }

    public String getName() {
        return name;
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
