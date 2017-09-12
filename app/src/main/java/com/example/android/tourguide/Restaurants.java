package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link Restaurants#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Restaurants extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    List_Adapter itemsAdapter;
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Restaurants() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Restaurants.
     */
    // TODO: Rename and change types and number of parameters
    public static Restaurants newInstance(String param1, String param2) {
        Restaurants fragment = new Restaurants();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_restaurants, container, false);
        ListView listview = (ListView) view.findViewById(R.id.list);
        ArrayList<List_Item> item = new ArrayList<List_Item>();
        item.add(new List_Item(R.string.r1, getString(R.string.r1p), getString(R.string.r1adrs)));
        item.add(new List_Item(R.string.r2, getString(R.string.r2p), getString(R.string.r2adrs)));
        item.add(new List_Item(R.string.r3, getString(R.string.r3p), getString(R.string.r3adrs)));
        item.add(new List_Item(R.string.r4, getString(R.string.r4p), getString(R.string.r4adrs)));
        item.add(new List_Item(R.string.r5, getString(R.string.r5p), getString(R.string.r5adrs)));

        itemsAdapter = new List_Adapter(getContext(), item);
        listview.setAdapter(itemsAdapter);

        return view;

    }


}
