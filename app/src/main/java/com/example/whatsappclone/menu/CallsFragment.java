package com.example.whatsappclone.menu;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.whatsappclone.R;
import com.example.whatsappclone.adapter.CallListAdapter;
import com.example.whatsappclone.model.CallList;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class CallsFragment extends Fragment {

    public CallsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_calls, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        List<CallList> lists = new ArrayList<>();

        lists.add(new CallList("001","FaZe Rug","17/11/2020 , 08:30 am","https://pbs.twimg.com/profile_images/1289246810553245696/_FoKWUVJ_400x400.jpg","incoming"));
        lists.add(new CallList("002","Mr.Beast","17/11/2020 , 10:54 am","https://influencermatchmaker.co.uk/sites/default/files/2019-12/mrbeast.JPG","missed"));
        lists.add(new CallList("003","FaZe Rug","17/11/2020 , 8:40 pm","https://pbs.twimg.com/profile_images/1289246810553245696/_FoKWUVJ_400x400.jpg","outgoing"));

        recyclerView.setAdapter(new CallListAdapter(lists,getContext()));
        return view;
    }
}