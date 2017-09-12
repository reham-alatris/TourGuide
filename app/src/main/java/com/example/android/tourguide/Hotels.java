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
 * <p>
 * to handle interaction events.
 * Use the {@link Hotels#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Hotels extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    List_Adapter itemsAdapter;
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public Hotels() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Hotels.
     */
    // TODO: Rename and change types and number of parameters
    public static Hotels newInstance(String param1, String param2) {
        Hotels fragment = new Hotels();
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
        View view = inflater.inflate(R.layout.hotels, container, false);
        ArrayList<List_Item> item = new ArrayList<List_Item>();
        item.add(new List_Item(R.string.hotel1, getString(R.string.p1), getString(R.string.adrs1)));
        item.add(new List_Item(R.string.hotel2, getString(R.string.p2), getString(R.string.adrs2)));
        item.add(new List_Item(R.string.hotell3, getString(R.string.p3), getString(R.string.adrs3)));
        item.add(new List_Item(R.string.hotel4, getString(R.string.p4), getString(R.string.adrs4)));
        item.add(new List_Item(R.string.hotel5, getString(R.string.p5), getString(R.string.adrs5)));

        ListView listview = (ListView) view.findViewById(R.id.list);
        itemsAdapter = new List_Adapter(getContext(), item);
        listview.setAdapter(itemsAdapter);

        return view;
    }


}
