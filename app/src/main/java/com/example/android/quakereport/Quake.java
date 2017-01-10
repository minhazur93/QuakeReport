package com.example.android.quakereport;

public class Quake {

    public double magnitude;
    public String location;
    public long timeInMilliseconds;
    public String url;

    public Quake (double magnitude, String location, long timeInMilliseconds, String url){
        this.magnitude=magnitude;
        this.location=location;
        this.timeInMilliseconds=timeInMilliseconds;
        this.url=url;
    }

    public double getMagnitude(){
        return magnitude;
    }

    public String getLocation(){
        return location;
    }

    public long getTimeInMilliseconds(){
        return timeInMilliseconds;
    }

    public String getUrl(){
        return url;
    }








}
