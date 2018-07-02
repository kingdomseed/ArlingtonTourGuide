package com.holtnet.arlingtontourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class LocationAdapter extends ArrayAdapter {

    public LocationAdapter(Context context, List<Location> locations) {
        super(context, R.layout.tour_item_layout, locations);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;


        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.tour_item_layout, parent, false);
        }

        Location currentLocaiton = (Location) getItem(position);

        ImageView imageView = listItemView.findViewById(R.id.locationImage);
        imageView.setImageResource(currentLocaiton.getLocationImageResourceID());

        TextView nameTextview = listItemView.findViewById(R.id.nameText);
        nameTextview.setText(currentLocaiton.getLocationName());

        TextView overviewTextview = listItemView.findViewById(R.id.overviewText);
        overviewTextview.setText(currentLocaiton.getLocationOverview());

        TextView detailsTextview = listItemView.findViewById(R.id.detailsText);
        detailsTextview.setText(currentLocaiton.getLocationDetails());

        return listItemView;
    }
}
