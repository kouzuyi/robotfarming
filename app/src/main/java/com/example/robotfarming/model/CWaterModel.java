package com.example.robotfarming.model;

/**
 * Created by 瑞 on 3/23/2016.
 */
public class CWaterModel {
    private int level;
    private int consumptionSpeed;
    private int dispensation;
    private int minLevel;
    private int maxLevel;
    private boolean notificationFlag;

    public CWaterModel(int level, int consumptionSpeed, int dispensation, int minLevel, int maxLevel, boolean notificationFlag) {
        this.level = level;
        this.consumptionSpeed = consumptionSpeed;
        this.dispensation = dispensation;
        this.minLevel = minLevel;
        this.maxLevel = maxLevel;
        this.notificationFlag = notificationFlag;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getConsumptionSpeed() {
        return consumptionSpeed;
    }

    public void setConsumptionSpeed(int consumptionSpeed) {
        this.consumptionSpeed = consumptionSpeed;
    }

    public int getDispensation() {
        return dispensation;
    }

    public void setDispensation(int dispensation) {
        this.dispensation = dispensation;
    }

    public int getMinLevel() {
        return minLevel;
    }

    public void setMinLevel(int minLevel) {
        this.minLevel = minLevel;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(int maxLevel) {
        this.maxLevel = maxLevel;
    }

    public boolean isNotificationFlag() {
        return notificationFlag;
    }

    public void setNotificationFlag(boolean notificationFlag) {
        this.notificationFlag = notificationFlag;
    }
}
