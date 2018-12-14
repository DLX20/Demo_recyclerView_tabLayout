package com.example.hp.demo.Activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import com.example.hp.demo.Adapter.MyFragmentPagerAdapter;
import com.example.hp.demo.R;
import com.example.hp.demo.fragment.MyFragment;

public class ViewPagerActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        setTitle();
        initViews();
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Toast.makeText(ViewPagerActivity.this,"你选中了"+tab.getText()+"页面",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                Toast.makeText(ViewPagerActivity.this,"你选中了"+tab.getText()+"页面",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                Toast.makeText(ViewPagerActivity.this,"你选中了"+tab.getText()+"页面",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initViews() {
        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.vi_view_pager);
        List<String> titles = new ArrayList<>();
        List<MyFragment> fragments = new ArrayList<>();

        for (int i = 0; i <30 ; i++) {
            titles.add("第"+(i+1)+"个");
            MyFragment myFragment = new MyFragment();
            int[] imags={R.drawable.img1,R.drawable.img2,R.drawable.img5,R.drawable.img6};
            myFragment.setData(imags[i%4],"这是第"+(i+1)+"个Fragment");
            fragments.add(myFragment);
        }

        MyFragmentPagerAdapter myFragmentPagerAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager(),fragments,titles);
        viewPager.setAdapter(myFragmentPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }


    public void setTitle() {
        TextView titile = findViewById(R.id.tv_title);
        ImageView back = findViewById(R.id.iv_back);
        titile.setText("ViewPager Test");
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
