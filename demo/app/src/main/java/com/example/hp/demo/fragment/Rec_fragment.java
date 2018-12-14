package com.example.hp.demo.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hp.demo.Adapter.MyRecyclerViewAdapter;
import com.example.hp.demo.Data.Card;
import com.example.hp.demo.R;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Rec_fragment extends Fragment {

    RecyclerView recyclerView;
    View mView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.recycler_view_layout, container, false);
        recyclerView = mView.findViewById(R.id.rec_layout);
        if (recyclerView != null) {
            ViewGroup parentViewGroup = (ViewGroup) mView;
            if (parentViewGroup != null) {
                parentViewGroup.removeView(recyclerView);
            }
        }
        return recyclerView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        MyRecyclerViewAdapter adapter = new MyRecyclerViewAdapter(recyclerView.getContext());
        adapter.setData(creatData());
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(adapter);
    }

    private List<Card> creatData() {

        List<Card> cards = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Card card = new Card();
            if (i % 4 == 0) {
                card.setAvatorId(R.drawable.ic_avatar);
                card.setName("Ivy");
                card.setContent("哒哒哒哒哒哒多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多多");
            } else if (i % 4 == 1) {
                card.setAvatorId(R.drawable.ic_avatar);
                card.setName("DLX");
                card.setContent("么么么么么么么木木木木木木木木木木木木木木木木木木木木木木木木木木木木木木木木木木木木木木木木木木木木木木木木木木木木木木");
            } else if (i % 4 == 2) {
                card.setAvatorId(R.drawable.nav_icon);
                card.setName("XXL");
                card.setContent("啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊");
            } else {
                card.setAvatorId(R.drawable.ic_avatar);
                card.setName("LXX");
                card.setContent("你好，android");
            }
            card.setTime("发布于" + new Date().toString().substring(0, 19));
            cards.add(card);
        }
        return cards;
    }


}
