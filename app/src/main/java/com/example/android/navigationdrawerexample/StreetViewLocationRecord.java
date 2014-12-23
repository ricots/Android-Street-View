package com.example.android.navigationdrawerexample;

import com.orm.SugarRecord;

public class StreetViewLocationRecord extends SugarRecord<StreetViewLocationRecord> {

    private double tilt;
    private double bearing;
    private double latitude;
    private double longitude;

    public StreetViewLocationRecord() {
    }

    public double getLatitude() {
        return latitude;
    }

    public StreetViewLocationRecord setLatitude(double latitude) {
        this.latitude = latitude;
        return this;
    }

    public double getLongitude() {
        return longitude;
    }

    public StreetViewLocationRecord setLongitude(double longitude) {
        this.longitude = longitude;
        return this;
    }

    public double getTilt() {
        return tilt;
    }

    public StreetViewLocationRecord setTilt(double tilt) {
        this.tilt = tilt;
        return this;
    }

    public double getBearing() {
        return bearing;
    }

    public StreetViewLocationRecord setBearing(double bearing) {
        this.bearing = bearing;
        return this;
    }
}