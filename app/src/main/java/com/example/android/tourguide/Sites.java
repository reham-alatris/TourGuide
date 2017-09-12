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
 * Use the {@link Sites#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Sites extends Fragment {
    List_Adapter itemsAdapter ;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public Sites() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Sites.
     */
    // TODO: Rename and change types and number of parameters
    public static Sites newInstance(String param1, String param2) {
        Sites fragment = new Sites();
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
        View view = inflater.inflate(R.layout.sites, container, false);
        ArrayList<List_Item> item = new ArrayList<List_Item>();
        item.add(new List_Item(R.string.s1,R.drawable.rsz_6library));
        item.add(new List_Item(R.string.s2,R.drawable.rsz_qutbai));
        item.add(new List_Item(R.string.s3,R.drawable.rsz_1garden));
        item.add(new List_Item(R.string.s4,R.drawable.mosque));
        item.add(new List_Item(R.string.s5,R.drawable.rsz_stanely));
        ListView listview = (ListView) view.findViewById(R.id.list);
        itemsAdapter = new List_Adapter(getContext(), item);
        listview.setAdapter(itemsAdapter);
        return view;
    }
}