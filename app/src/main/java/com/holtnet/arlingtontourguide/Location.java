package com.holtnet.arlingtontourguide;

public class Location {

    private String locationName;
    private String locationOverview;
    private String locationDetails;
    private int locationImageResourceID;

    public Location(String locationName, String locationOverview, String locationDetails, int locationImageResourceID) {
        this.locationName = locationName;
        this.locationOverview = locationOverview;
        this.locationDetails = locationDetails;
        this.locationImageResourceID = locationImageResourceID;
    }

    public String getLocationName() {
        return locationName;
    }

    public String getLocationOverview() {
        return locationOverview;
    }

    public String getLocationDetails() {
        return locationDetails;
    }

    public int getLocationImageResourceID() {
        return locationImageResourceID;
    }
}
