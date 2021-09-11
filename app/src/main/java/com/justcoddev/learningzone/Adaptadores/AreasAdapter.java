package com.justcoddev.learningzone.Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.justcoddev.learningzone.Entidades.Areas;
import com.justcoddev.learningzone.R;

import java.util.ArrayList;

public class AreasAdapter extends RecyclerView.Adapter<AreasAdapter.ViewHolder> implements View.OnClickListener {
    LayoutInflater inflater;
    ArrayList<Areas> model;

    //Listener
    private View. OnClickListener listener;

    public AreasAdapter(Context context,ArrayList<Areas> model){
        this.inflater = LayoutInflater.from(context);
        this.model = model;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.all_areas , parent,false);
        view.setOnClickListener(this);
        return new ViewHolder(view);
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener= listener;

    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String name = model.get(position).getName();
        String description = model.get(position).getDescription();
        int image = model.get(position).getImage_id();
        holder.names.setText(name);
        holder.description.setText(description);
        holder.image.setImageResource(image);



    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    @Override
    public void onClick(View view) {
        if (listener!=null){
            listener.onClick(view);
        }

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView names, description;
        ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            names = itemView.findViewById(R.id.title_area) ;
            description = itemView.findViewById(R.id.description_area) ;
            image =  itemView.findViewById(R.id.image_area) ;
        }
    }
}
