package com.example.hp.demo.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.support.v7.widget.Toolbar;

import com.example.hp.demo.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button recycler = findViewById(R.id.bt_recycler);
        Button viewPager = findViewById(R.id.bt_view_pager);
        recycler.setOnClickListener(this);
        viewPager.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_recycler:
                Intent intent = new Intent(this, RecyclerActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_view_pager:
                Intent intent1 = new Intent(this, ViewPagerActivity.class);
                startActivity(intent1);
                break;
            default:
        }
    }
}
