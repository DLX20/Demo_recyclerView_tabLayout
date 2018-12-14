package com.example.hp.demo.Activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hp.demo.Adapter.Rec_tab_Adapter;
import com.example.hp.demo.R;
import com.example.hp.demo.fragment.Rec_fragment;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {

    TextView title;
    ImageView back;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.avtivity_recycler);
        initViews();
    }


    private void initViews() {
        title = findViewById(R.id.tv_title);
        title.setText("社区");
        back = findViewById(R.id.iv_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        tabLayout = findViewById(R.id.tb_table);
        viewPager = findViewById(R.id.view_pager);
        List<String> titles = new ArrayList<>();
        List<Rec_fragment> rec_fragmentList = new ArrayList<>();

        titles.add("热门");
        titles.add("动态");
        titles.add("资讯");


        for (int i = 0; i < 3; i++) {
            Rec_fragment rec_fragment = new Rec_fragment();
            rec_fragmentList.add(rec_fragment);
        }

        Rec_tab_Adapter recTabAdapter = new Rec_tab_Adapter(getSupportFragmentManager(), rec_fragmentList, titles);
        viewPager.setAdapter(recTabAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
