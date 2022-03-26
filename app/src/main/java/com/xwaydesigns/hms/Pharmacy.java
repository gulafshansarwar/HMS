package com.xwaydesigns.hms;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pharmacy extends AppCompatActivity {
     CardView pharmacyProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pharmacy);
        pharmacyProfile = findViewById(R.id.pharmacyProfile);
        pharmacyProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Pharmacy.this, PharmacyProfile.class);
                startActivity(intent);
            }
        });
    }
}