package com.holtnet.arlingtontourguide;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;

public class LocationAdapter extends ArrayAdapter {

    private int backgroundColorResourceID;

    public LocationAdapter(Context context, List<Location> locations, int backgroundColorResourceID) {
        super(context, R.layout.tour_item_layout, locations);
        this.backgroundColorResourceID = backgroundColorResourceID;
    }
}
