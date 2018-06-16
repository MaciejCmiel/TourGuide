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
public class MuzeumFragment extends Fragment {

    private LocationAdapter itemsAdapter;


    public MuzeumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.items_list, container, false);

        ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location("Muzeum Powstania Warszawskiego", "Grzybowska 79", R.drawable.powstania));
        locations.add(new Location("Muzeum Warszawy", "Rynek Starego Miasta", R.drawable.muzeum_warsaw));
        locations.add(new Location("Muzeum Etnograficzne", "Kredytowa 1", R.drawable.etnograficzne));
        locations.add(new Location("Muzeum Techniki i Przemysłu", "Pałac kultury i nauki", R.drawable.techniki_przemyslu));

        itemsAdapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);


        return rootView;
    }
}
