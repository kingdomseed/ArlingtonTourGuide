package com.holtnet.arlingtontourguide;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FoodFragment extends Fragment {

    private List<Location> locations;

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_guide_listview, container, false);

        locations = new ArrayList<>();
        locations.add(new Location(getString(R.string.fork_title), getString(R.string.fork_overview), getString(R.string.fork_details), R.drawable.forkintheroad));
        locations.add(new Location(getString(R.string.bethany_title), getString(R.string.bethany_overview), getString(R.string.bethany_details), R.drawable.bethany));
        locations.add(new Location(getString(R.string.istanbull_title), getString(R.string.instabull_overview), getString(R.string.instabull_details), R.drawable.istanbulgrill));
        locations.add(new Location(getString(R.string.old_west_title), getString(R.string.old_west_overview), getString(R.string.old_west_details), R.drawable.oldwestcafe));

        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.tourList);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
