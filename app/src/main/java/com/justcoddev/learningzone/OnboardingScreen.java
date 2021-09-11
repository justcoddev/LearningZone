package com.justcoddev.learningzone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class OnboardingScreen extends AppCompatActivity {
    LinearLayout dotsLayout;
    SliderAdapter adapter;
    List<Data> data;
    Button getStarted;
    TextView skip;
    ViewPager2 viewPager2;
    ImageView[] dots; //check

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      /*
       Eliminaremos la barra de estado de la parte superior de la aplicacion
        y se la reemplazaremos por otra
            */

        setContentView(R.layout.activity_onboarding);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Views components
        dotsLayout = findViewById(R.id.dots_layout);
        getStarted = findViewById(R.id.start_btn);
        skip = findViewById(R.id.txt_skip);
        viewPager2 = findViewById(R.id.viewpager2);



        getStarted.setOnClickListener((View v) -> {
            Toast.makeText(OnboardingScreen.this, "Bienvenido", Toast.LENGTH_SHORT).show();
            showActivity2();

        });
        skip.setOnClickListener((View v) -> {
            Toast.makeText(OnboardingScreen.this, "Bienvenido", Toast.LENGTH_SHORT).show();
            showActivity2();

        });

//Adding data to list
        data = new ArrayList<>();
        data.add(new Data("Manage Goals", getResources().getString(R.string.string_one), R.drawable.ut01));
        data.add(new Data("Set a Schedule", getResources().getString(R.string.string_two), R.drawable.ut02));
        data.add(new Data("Do the list for easily", getResources().getString(R.string.string_three), R.drawable.ut03));

        //montaje adapter
        adapter = new SliderAdapter(data);
        viewPager2.setAdapter(adapter);

        //Creating dots

        dots = new ImageView[3];
        createDots();
        selectedDots(0);


        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);

                selectedDots(position);
                if (position==0){
                    skip.setVisibility(View.VISIBLE);
                }else{
                    skip.setVisibility(View.INVISIBLE);
                }

                if (position == 2) {
                    getStarted.setVisibility(View.VISIBLE);
                    getStarted.setEnabled(true);
                }else{
                    getStarted.setVisibility(View.INVISIBLE);
                    getStarted.setEnabled(false);
                }
            }
        });
    }

    private void selectedDots(int position) {
        for (int i=0; i<dots.length; i++){
            if (i==position){
                dots[i].setImageDrawable(ContextCompat.getDrawable(this,R.drawable.selected_dot));
            }else
                {
                    dots[i].setImageDrawable(ContextCompat.getDrawable(this,R.drawable.selected_dot));
            }
        }
    }

    private void createDots() {
        for (int i = 0; i < dots.length; i++) {
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            params.setMargins(6,0,6,0);

            dots[i] = new ImageView(this);
            dots[i].setImageDrawable(ContextCompat.getDrawable(this,R.drawable.unselected_dot));
            dots[i].setLayoutParams(params);
            dotsLayout.addView(dots[i]);
        }
    }

    //ir a actividad 2
    public void showActivity2(){
        Intent miIntent = new Intent(this, Menu.class);
        startActivity(miIntent);

    }

}