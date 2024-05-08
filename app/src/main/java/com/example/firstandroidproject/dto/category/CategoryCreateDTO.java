package com.example.firstandroidproject.dto.category;

import java.io.File;

public class CategoryCreateDTO {
    private String name;
    private String description;
    private File image;
    public String getName() {
        return name;
    }

    public File getImage() {
        return image;
    }

    public void setImage(File image) {
        this.image = image;
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
}