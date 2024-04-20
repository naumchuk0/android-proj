package com.example.firstandroidproject.dto.category;

import android.graphics.drawable.Icon;

import java.io.File;

public class CategoryItemDTO {
    private int id;
    private String name;
    private String description;
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
