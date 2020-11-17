package com.example.whatsappclone.menu;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.whatsappclone.R;
import com.example.whatsappclone.adapter.ChatListAdapter;
import com.example.whatsappclone.model.Chatlist;

import java.util.ArrayList;
import java.util.List;

public class ChatFragment extends Fragment {

    public ChatFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_chat, container, false);
        List<Chatlist> list = new ArrayList<>();
        RecyclerView  recyclerView = view.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        list.add(new Chatlist("11","FaZe Rug","Hello friend","17/11/2020","https://pbs.twimg.com/profile_images/1289246810553245696/_FoKWUVJ_400x400.jpg"));
        list.add(new Chatlist("22","Mr.Beast","Hi","17/11/2020","https://influencermatchmaker.co.uk/sites/default/files/2019-12/mrbeast.JPG"));
        list.add(new Chatlist("33","frenchie fries","Hey","17/11/2020","https://yt3.ggpht.com/a/AATXAJzpGZvz0g0qJaBNkQeIMK-OSQW1xsEX60L7viM0=s900-c-k-c0x00ffffff-no-rj"));
        list.add(new Chatlist("44","ZHC","Whatsup dude","17/11/2020","https://bookingagentinfo.com/wp-content/uploads/2020/04/Zach-ZHC-Hsieh-Contact-Information.jpg"));

        recyclerView.setAdapter(new ChatListAdapter(list,getContext()));


        return view;
    }

}
