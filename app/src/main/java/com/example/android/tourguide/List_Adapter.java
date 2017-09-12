package com.example.android.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by reham moamed on 18/05/2017.
 */

public class List_Adapter extends ArrayAdapter<List_Item> {


    public List_Adapter(Context context, ArrayList<List_Item> list) {
        super(context, 0, list);
    }

    @NonNull
    @Override

    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

       List_Item item= getItem(position);


        TextView name = (TextView) listItemView.findViewById(R.id.name);
        name.setText(item.getName());

        TextView phone = (TextView) listItemView.findViewById(R.id.phone);
        phone.setText((item.getPhone()) );

        TextView address =(TextView)listItemView.findViewById(R.id.address);
        address.setText((item.getLocation()));


        ImageView image = (ImageView) listItemView.findViewById(R.id.image);
        image.setImageResource(item.getImage());


        return listItemView;
    }
}
