package xyz.restofy.restofydemo;

/**
 * Created by Ruudi on 07/11/2015.
 */
public class Restaurant {

    private String name, description;
    private double latitude, longitude;
    private static int uniqueId = 100;

    public String getName() {
        return name;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public static int getUniqueId() {
        return uniqueId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Restaurant (String name, double latitude, double longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude= longitude;
        uniqueId++;

    }

}
