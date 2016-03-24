package com.example.robotfarming.model;

import java.util.Date;

/**
 * Created by 瑞 on 3/23/2016.
 */
public class CWeatherModel {
    private String location;
    private Date date;
    private String condition;
    private int temperature;
    private int humidity;
    private int windSpeed;
    private char measurement;
    private boolean notificationFlag;

    public CWeatherModel(String location, Date date, String condition, int temperature, int humidity, int windSpeed, char measurement, boolean notificationFlag) {
        this.location = location;
        this.date = date;
        this.condition = condition;
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.measurement = measurement;
        this.notificationFlag = notificationFlag;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    public char getMeasurement() {
        return measurement;
    }

    public void setMeasurement(char measurement) {
        this.measurement = measurement;
    }

    public boolean isNotificationFlag() {
        return notificationFlag;
    }

    public void setNotificationFlag(boolean notificationFlag) {
        this.notificationFlag = notificationFlag;
    }
}
