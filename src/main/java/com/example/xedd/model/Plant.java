package com.example.xedd.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Plant {

    private long id;

    private String picturePath;

    private String title;

    private String description;

    private boolean isSeed;

    private boolean isEnt;

    private boolean isPlant;

    private boolean isFav;

    public Plant() {
    }

    public Plant(
            long id,
            String picturePath,
            String title,
            String description,
            boolean isSeed,
            boolean isEnt,
            boolean isPlant,
            boolean isFav) {
        this.id = id;
        this.picturePath = picturePath;
        this.title = title;
        this.description = description;
        this.isSeed = isSeed;
        this.isEnt = isEnt;
        this.isPlant = isPlant;
        this.isFav = isFav;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getPicturePath() { return picturePath; }
    public void setPicturePath(String picturePath) { this.picturePath = picturePath; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public boolean isSeed() { return isSeed; }
    public void setSeed(boolean seed) { isSeed = seed; }
    public boolean isEnt() { return isEnt; }
    public void setEnt(boolean ent) { isEnt = ent; }
    public boolean isPlant() { return isPlant; }
    public void setPlant(boolean plant) { isPlant = plant; }
    public boolean isFav() { return isFav; }
    public void setFav(boolean fav) { isFav = fav; }
}
