package com.holtnet.arlingtontourguide;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;

public class Location {

    private String locationName;
    private String locationPrice;
    private String locationDetails;
    private int locationImageResourceID;

    public Location(String locationName, String locationPrice, String locationDetails, int locationImageResourceID) {
        this.locationName = locationName;
        this.locationPrice = locationPrice;
        this.locationDetails = locationDetails;
        this.locationImageResourceID = locationImageResourceID;
    }

    public String getLocationName() {
        return locationName;
    }

    public String getLocationPrice() {
        return locationPrice;
    }

    public String getLocationDetails() {
        return locationDetails;
    }

    public int getLocationImageResourceID() {
        return locationImageResourceID;
    }
}
