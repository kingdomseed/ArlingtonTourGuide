package com.holtnet.arlingtontourguide;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FunFragment extends Fragment {

    private List<Location> locations;

    public FunFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_guide_listview, container, false);

        locations = new ArrayList<>();
        locations.add(new Location(getString(R.string.six_flags_title), getString(R.string.six_flags_overview), getString(R.string.six_flags_details), R.drawable.sixflags));
        locations.add(new Location(getString(R.string.freeplay_title), getString(R.string.freeplay_overview), getString(R.string.freeplay_details), R.drawable.freeplay));
        locations.add(new Location(getString(R.string.hurricane_title), getString(R.string.hurricane_overview), getString(R.string.hurricane_details), R.drawable.hurricane));
        locations.add(new Location(getString(R.string.cowboys_title), getString(R.string.cowboys_overview), getString(R.string.cowboys_details), R.drawable.cowboy));

        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.tourList);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }


}
