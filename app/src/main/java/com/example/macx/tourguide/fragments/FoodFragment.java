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
public class FoodFragment extends Fragment {

    private LocationAdapter itemsAdapter;

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.items_list, container, false);

        ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location(getString(R.string.name_krowarzywa), getString(R.string.localization_krowarzywa), R.drawable.krowarzywa));
        locations.add(new Location(getString(R.string.name_manekin), getString(R.string.localization_manekin), R.drawable.manekin));
        locations.add(new Location(getString(R.string.name_zapiecek), getString(R.string.localization_zapiecek), R.drawable.zapiecek));
        locations.add(new Location(getString(R.string.name_sushi), getString(R.string.localization_sushi), R.drawable.sushi_maestro));

        itemsAdapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);


        return rootView;
    }

}
