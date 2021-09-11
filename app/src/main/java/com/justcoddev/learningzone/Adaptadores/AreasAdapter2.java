package com.justcoddev.learningzone.Adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.justcoddev.learningzone.Entidades.Areas;
import com.justcoddev.learningzone.R;

import java.util.List;

public class AreasAdapter2 extends RecyclerView.Adapter<AreasAdapter2.ItemVH> {
    LayoutInflater inflater;
    private static final String TAG="AreasAdapter2";

    List<Areas> modelList;

    public AreasAdapter2(List<Areas> modelList) {
        this.modelList = modelList;
    }



    @Override
    public AreasAdapter2.ItemVH onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.all_areas , parent,false);
        return new ItemVH(view);
    }

    @Override
    public void onBindViewHolder(AreasAdapter2.ItemVH holder, int position) {
        Areas model = modelList.get(position);
        holder.names.setText(model.getName());
        holder.description.setText(model.getDescription());
        holder.image.setImageResource(model.getImage_id());
       // Boolean isExpanded = modelList.get(position).isExpanded();
       // holder.expandableLayout.setVisibility(isExpanded ? View.VISIBLE:View.GONE);

    }

    @Override
    public int getItemCount() {
        return 0;
    }

     class ItemVH extends RecyclerView.ViewHolder {
    private static final String TAG= "Item";
         TextView names, description;
         ImageView image;
       //  RelativeLayout titleView;
     //   ConstraintLayout expandableLayout;

        public ItemVH(View itemView) {
            super(itemView);

            names = itemView.findViewById(R.id.title_area) ;
            description = itemView.findViewById(R.id.description_area) ;
            image =  itemView.findViewById(R.id.image_area) ;
            /*expandableLayout = itemView.findViewById(R.id.expandable_layout);
            titleView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Areas model = modelList.get(getAdapterPosition());
                    model.setExpanded(!model.isExpanded());
                    notifyItemChanged(getAdapterPosition());
                }
            });
*/
        }
    }
}
