package com.example.macx.tourguide;

public class Location {

    private String locationName;
    private String address;
    private int imgResId;


    public Location(String name, String address, int imgResId) {
        this.locationName = name;
        this.address = address;
        this.imgResId = imgResId;
    }

    public String getLocationName() {
        return locationName;
    }

    public String getAddress() {
        return address;
    }

    public int getImgResId() {
        return imgResId;
    }
}
