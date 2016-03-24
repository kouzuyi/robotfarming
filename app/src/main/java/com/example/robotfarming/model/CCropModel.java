package com.example.robotfarming.model;

import android.media.Image;

/**
 * Created by 瑞 on 3/23/2016.
 */
public class CCropModel {
    private int pictureId;
    private String pictureName;
    private Image picture;
    private int interval;
    private boolean notificationFlag;

    public CCropModel(int pictureId, String pictureName, Image picture, int interval, boolean notificationFlag) {
        this.pictureId = pictureId;
        this.pictureName = pictureName;
        this.picture = picture;
        this.interval = interval;
        this.notificationFlag = notificationFlag;
    }

    public int getPictureId() {
        return pictureId;
    }

    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }

    public String getPictureName() {
        return pictureName;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName;
    }

    public Image getPicture() {
        return picture;
    }

    public void setPicture(Image picture) {
        this.picture = picture;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public boolean isNotificationFlag() {
        return notificationFlag;
    }

    public void setNotificationFlag(boolean notificationFlag) {
        this.notificationFlag = notificationFlag;
    }
}
