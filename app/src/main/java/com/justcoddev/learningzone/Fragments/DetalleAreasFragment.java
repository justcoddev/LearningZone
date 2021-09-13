package com.justcoddev.learningzone.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.justcoddev.learningzone.Entidades.Areas;
import com.justcoddev.learningzone.R;

public class DetalleAreasFragment extends Fragment {
    TextView nameData;
    ImageView imageData;
    TextView descriptionData;
    TextView titleData;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.detalle_areas_fragment, container, false);
        nameData = view.findViewById(R.id.name_data_areas);
        imageData = view.findViewById(R.id.image_data_areas);
        descriptionData = view.findViewById(R.id.description_data_areas);
        titleData = view.findViewById(R.id.title_areas2);

        //Create object bundler for recibir xD
        Bundle objetoData_area = getArguments();
        Areas areas = null;
        //validate verificate exist
        if (objetoData_area!=null){
            areas = (Areas) objetoData_area.getSerializable("object");
            nameData.setText(areas.getName());
            imageData.setImageResource(areas.getImage_id());
           descriptionData.setText(areas.getDescription());
           titleData.setText(areas.getTitle_area());

        }

        return view;
    }


}
