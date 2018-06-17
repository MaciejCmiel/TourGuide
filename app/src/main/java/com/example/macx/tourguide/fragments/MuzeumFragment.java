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

        locations.add(new Location(getString(R.string.muzeum_powstania), getString(R.string.grzybowska), R.drawable.powstania));
        locations.add(new Location(getString(R.string.muzeum_warszawy), getString(R.string.stare_miasto), R.drawable.muzeum_warsaw));
        locations.add(new Location(getString(R.string.etnograficzne), getString(R.string.kredytowa), R.drawable.etnograficzne));
        locations.add(new Location(getString(R.string.muzeum_t_i_p), getString(R.string.pkin), R.drawable.techniki_przemyslu));

        itemsAdapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);


        return rootView;
    }
}
