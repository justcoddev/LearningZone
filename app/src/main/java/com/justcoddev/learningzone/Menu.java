package com.justcoddev.learningzone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.Toast;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

public class Menu extends AppCompatActivity {
    //variables
    MeowBottomNavigation bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        /*bottomNavigation = findViewById(R.id.bottom_navigation);

        //items
        bottomNavigation.add(new MeowBottomNavigation.Model(1,R.drawable.ic_home2));
        bottomNavigation.add(new MeowBottomNavigation.Model(2,R.drawable.ic_bookmarks));
        bottomNavigation.add(new MeowBottomNavigation.Model(3,R.drawable.ic_profile));


        bottomNavigation.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {
                //initializer fragment
                Fragment fragment=null;
                switch (item.getId()){
                    case 1:
                        fragment = new HomeFragment();

                        break;
                    case 2:
                        fragment = new BookmarksFragment();
                        break;
                    case 3:
                        fragment = new ProfileFragment();
                        break;
                }
                loadFragment(fragment);

            }
        });

        bottomNavigation.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {
                Toast.makeText(getApplicationContext(),item.getId()
                        ,Toast.LENGTH_SHORT).show();

            }
        });
        bottomNavigation.setOnReselectListener(new MeowBottomNavigation.ReselectListener() {
            @Override
            public void onReselectItem(MeowBottomNavigation.Model item) {
                Toast.makeText(getApplicationContext(),item.getId()
                ,Toast.LENGTH_SHORT).show();

            }
        });


    }

    private void loadFragment(Fragment fragment) {
        //replace fragment
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_layout,fragment)
                .commit();

         */
    }
}