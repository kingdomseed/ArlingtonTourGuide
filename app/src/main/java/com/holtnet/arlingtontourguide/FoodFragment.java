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
        locations.add(new Location("Sydney", "$$$", "Duh!", R.drawable.forkinroad));
        locations.add(new Location("Sydney", "$$$", "Duh!", R.drawable.forkinroad));
        locations.add(new Location("Sydney", "$$$", "Duh!", R.drawable.forkinroad));
        locations.add(new Location("Sydney", "$$$", "Duh!", R.drawable.forkinroad));
        locations.add(new Location("Sydney", "$$$", "Duh!", R.drawable.forkinroad));
        locations.add(new Location("Sydney", "$$$", "Duh!", R.drawable.forkinroad));
        locations.add(new Location("Sydney", "$$$", "Duh!", R.drawable.forkinroad));


        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.tourList);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
