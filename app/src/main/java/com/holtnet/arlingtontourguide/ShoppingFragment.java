package com.holtnet.arlingtontourguide;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ShoppingFragment extends Fragment {

    private List<Location> locations;

    public ShoppingFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_guide_listview, container, false);

        locations = new ArrayList<>();
        locations.add(new Location(getString(R.string.highlands_title), getString(R.string.highlands_overview), getString(R.string.highlands_details), R.drawable.highlands));
        locations.add(new Location(getString(R.string.parksmall_title), getString(R.string.parksmall_overview), getString(R.string.parksmall_details), R.drawable.parksmall));

        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.tourList);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
