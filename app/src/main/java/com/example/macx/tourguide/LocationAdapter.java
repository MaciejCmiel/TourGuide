package com.example.macx.tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {


    public LocationAdapter(@NonNull Activity context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

            holder = new ViewHolder();
            holder.imageView = convertView.findViewById(R.id.list_item_image);
            holder.name = convertView.findViewById(R.id.name_text);
            holder.address = convertView.findViewById(R.id.address_text);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Location currentLocation = getItem(position);

        holder.imageView.setImageResource(currentLocation.getImgResId());
        holder.name.setText(currentLocation.getLocationName());
        holder.address.setText(currentLocation.getAddress());

        return convertView;
    }

    static class ViewHolder {
        private TextView name;
        private TextView address;
        private ImageView imageView;
    }
}
