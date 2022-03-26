package com.xwaydesigns.hms;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;

public class PatientProfile extends AppCompatActivity {
    /*SwipeRefreshLayout swipeRefresh;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patient_profile);
      /*  swipeRefresh = findViewById(R.id.swipeRefresh);*/
      /*  SwipeRefreshLayout.OnRefreshListener(new SwipeRefreshLayout.OnRefreshListener(){

            public void onRefresh(){
                shuffle();
                swipeRefresh.setRefreshing(false);
            }

        });*/
    }
}