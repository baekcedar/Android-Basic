package com.baekcedar.android.basiclist;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by HM on 2016-09-28.
 */
public class RecyclerAnimationAdapter extends RecyclerView.Adapter<RecyclerAnimationAdapter.ViewHolder>{

    ArrayList<RecyclerData> datas;
    int itemLayout;
    Context context;

    // 생성자
    public RecyclerAnimationAdapter(ArrayList<RecyclerData> datas, int itemLayout, Context context){
        this.datas = datas;
        this.itemLayout = itemLayout;
        this.context = context;
    }


    // view 를 만들어서 홀더에 저장하는 역할
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(itemLayout, parent, false);

        return new ViewHolder(view);
    }

    // listView getView 를 대체하는 함수
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        RecyclerData data = datas.get(position);

        holder.img.setBackgroundResource(data.image);

        holder.recyclerRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override

            // 레이아웃 클릭시 디테일 액티비티로 넘어가기
            public void onClick(View view) { //클릭시
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("position", position);
                //intent.putExtra("OBJECT",data);
                context.startActivity(intent);
            }
        });

        //클릭 리스너 달기
        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //클릭시
                Toast.makeText(context," 이미지가 클릭 됨!", Toast.LENGTH_SHORT).show();

            }
        });
        holder.textTitle.setText(data.title);
        holder.textName.setText(data.name);
        holder.itemView.setTag(data);

        setAnimation(holder.img, position);
    }
    int lastPosision = -1;
    public void setAnimation(View view,int position){
        if(position > lastPosision) {
            Animation ani = AnimationUtils.loadAnimation(context, android.R.anim.fade_in);
            view.startAnimation(ani);
            lastPosision = position;
        }
    }
    @Override
    public int getItemCount() {
        return datas.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView textTitle;
        TextView textName;
        RelativeLayout recyclerRelativeLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            recyclerRelativeLayout  = (RelativeLayout) itemView.findViewById(R.id.recyclerRelativeLayout);
            img = (ImageView) itemView.findViewById(R.id.img);
            textTitle = (TextView) itemView.findViewById(R.id.textTitle);
            textName = (TextView) itemView.findViewById(R.id.textName);
        }
    }
}
