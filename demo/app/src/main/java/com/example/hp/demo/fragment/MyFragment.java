package com.example.hp.demo.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hp.demo.R;

public class MyFragment extends Fragment {
    View mView;
    ImageView imageView;
    TextView textView;
    int imgId;
    String textString;

    public void setData(int imgId,String textString){
        this.imgId = imgId;
        this.textString = textString;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment,container,false);
        imageView = mView.findViewById(R.id.iv_image);
        textView = mView.findViewById(R.id.text);

        imageView.setImageResource(imgId);
        textView.setText(textString);
        return  mView;
    }
}
