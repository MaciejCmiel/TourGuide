package com.example.macx.tourguide.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.macx.tourguide.Location;
import com.example.macx.tourguide.LocationAdapter;
import com.example.macx.tourguide.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 */
public class DrinkFragment extends Fragment {

    private LocationAdapter itemsAdapter;

    public DrinkFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.items_list, container, false);

        ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location(getString(R.string.name_faktoria_win), getString(R.string.localization_faktoria), R.drawable.wina));
        locations.add(new Location(getString(R.string.name_starbusck), getString(R.string.localization_starbucks), R.drawable.starbucks));
        locations.add(new Location(getString(R.string.name_costa), getString(R.string.localization_costa), R.drawable.costa));
        locations.add(new Location(getString(R.string.name_charlotte), getString(R.string.localization_charlotte), R.drawable.charlotte_wina));
        locations.add(new Location(getString(R.string.name_manekin) , getString(R.string.localization_manekin), R.drawable.manekin));

        itemsAdapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);


        return rootView;
    }

}
