package com.example.robotfarming.model;

/**
 * Created by 瑞 on 3/23/2016.
 */
public class CMoistureModel {
    private int currentMoisture;
    private int minHumidity;
    private int maxHumidity;
    private String condition;

    public CMoistureModel(int currentMoisture, int minHumidity, int maxHumidity, String condition) {
        this.currentMoisture = currentMoisture;
        this.minHumidity = minHumidity;
        this.maxHumidity = maxHumidity;
        this.condition = condition;
    }

    public int getCurrentMoisture() {
        return currentMoisture;
    }

    public int getMinHumidity() {
        return minHumidity;
    }

    public int getMaxHumidity() {
        return maxHumidity;
    }

    public String getCondition() {
        return condition;
    }

    public void setCurrentMoisture(int currentMoisture) {
        this.currentMoisture = currentMoisture;
    }

    public void setMinHumidity(int minHumidity) {
        this.minHumidity = minHumidity;
    }

    public void setMaxHumidity(int maxHumidity) {
        this.maxHumidity = maxHumidity;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

}
