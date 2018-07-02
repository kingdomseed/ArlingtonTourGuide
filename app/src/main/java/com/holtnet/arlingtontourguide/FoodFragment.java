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
        locations.add(new Location("Fork in the Road", "$$ | American | Lunch, Dinner", "Located in an old shopping center off Fielder Rd, Fork in the Road is a rare gem. Come for the Crackeroni, stay for the incredible sandwiches!", R.drawable.forkintheroad));
        locations.add(new Location("Bethany Cafe", "$$ | Chinese | Lunch, Dinner", "Right off Cooper near UTA and Arlington High School is this gem. Incredible orange chicken and boba at a great price!!", R.drawable.bethany));
        locations.add(new Location("Istanbull Grill", "$$$ | Mediterranean | Lunch, Dinner ", "The incredibly atmospheric Instanbull Grill is off South Cooper Street near Sublett. Try the Turkish Coffee!!", R.drawable.istanbulgrill));
        locations.add(new Location("Old West Cafe", "$$ | American | Breakfast, Lunch", "An incredible pancake and breakfast house with a great brunch menu. Try the blueberry pancakes!!", R.drawable.oldwestcafe));

        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.tourList);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
