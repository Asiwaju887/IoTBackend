package com.example.sensor.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Data {
    @Id
    private int id;
    private int temp;
    private int light;
    private int sound;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getLight() {
        return light;
    }

    public void setLight(int light) {
        this.light = light;
    }

    public int getSound() {
        return sound;
    }

    public void setSound(int sound) {
        this.sound = sound;
    }
    
}
