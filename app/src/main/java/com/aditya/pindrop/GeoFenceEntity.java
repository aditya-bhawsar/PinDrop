package com.aditya.pindrop;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "geofence")
public class GeoFenceEntity {

    private Double lat,longt;
    @PrimaryKey(autoGenerate = true)
    private String id;
    private String name;

    public Double getLat() { return lat; }
    public void setLat(Double lat) { this.lat = lat; }
    public Double getLongt() { return longt; }
    public void setLongt(Double longt) { this.longt = longt; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
}