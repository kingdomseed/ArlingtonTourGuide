package com.holtnet.arlingtontourguide;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CultureFragment extends Fragment {

    private List<Location> locations;

    public CultureFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_guide_listview, container, false);

        locations = new ArrayList<>();
        locations.add(new Location(getString(R.string.fine_art_title), getString(R.string.fine_art_overview), getString(R.string.fine_art_details), R.drawable.museum));
        locations.add(new Location(getString(R.string.music_title), getString(R.string.music_overview), getString(R.string.music_details), R.drawable.music));

        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.tourList);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
