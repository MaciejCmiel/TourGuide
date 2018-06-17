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
public class TheatreFragment extends Fragment {

    private LocationAdapter itemsAdapter;

    public TheatreFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.items_list, container, false);

        ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location(getString(R.string.six_floor), getString(R.string.pkin), R.drawable.six_floor));
        locations.add(new Location(getString(R.string.ateneum_name), getString(R.string.localization_ateneum), R.drawable.ateneum));
        locations.add(new Location(getString(R.string.name_capitol), getString(R.string.localization_capitol), R.drawable.capitol));
        locations.add(new Location(getString(R.string.name_dramatic), getString(R.string.localization_dramatic), R.drawable.dramatyczny));

        itemsAdapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);


        return rootView;
    }

}
