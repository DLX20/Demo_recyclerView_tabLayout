package com.example.hp.demo.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hp.demo.Data.Card;
import com.example.hp.demo.R;

import java.util.ArrayList;
import java.util.List;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder> {

    private List<Card> cardList = new ArrayList<>();
    Context mContext;

    public MyRecyclerViewAdapter(Context context) {
        mContext = context;
    }

    public void setData(List<Card> dataList) {
        cardList.clear();
        cardList.addAll(dataList);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_rec_item_layout, viewGroup, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder viewHolder, int i) {
        Card card = cardList.get(i);
        viewHolder.avator.setImageResource(card.getAvatorId());
        viewHolder.user.setText(card.getName());
        viewHolder.time.setText(card.getTime());
        viewHolder.content.setText(card.getContent());
    }

    @Override
    public int getItemCount() {
        return cardList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        View mItemView;
        ImageView avator;
        TextView user;
        TextView time;
        TextView content;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mItemView = itemView;
            avator = itemView.findViewById(R.id.iv_Avatar);
            user = itemView.findViewById(R.id.tv_user);
            time = itemView.findViewById(R.id.tv_time);
            content = itemView.findViewById(R.id.tv_content);
        }
    }
}
