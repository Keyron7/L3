package com.example.homework;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class EyesAdapter extends RecyclerView.Adapter<EyesAdapter.ViewHolder> {
    private List<Eyes>EyesList;
    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView eyesImage;
        TextView eyesName;
        public ViewHolder(View view){
            super(view);
            eyesImage =  view.findViewById(R.id.eyes_image);
            eyesName =  view.findViewById(R.id.eyes_name);
        }
    }
    public EyesAdapter(List<Eyes>eyesList){
        EyesList = eyesList;
    }
    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.eyes_item,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }
    public void onBindViewHolder(ViewHolder holder,int position){
        Eyes eyes = EyesList.get(position);
        holder.eyesImage.setImageResource(eyes.getImageId());
        holder.eyesName.setText(eyes.getName());
    }
    public int getItemCount(){
        return EyesList.size();
    }
}
