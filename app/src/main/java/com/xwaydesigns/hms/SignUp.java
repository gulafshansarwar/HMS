package com.xwaydesigns.hms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {
     TextView tvSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
        tvSignIn=findViewById(R.id.tvSignIn);
        tvSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SignUp.this, SignIn.class);
                startActivity(intent);
            }
        });
    }
//       public void tvSignIn(View view) {
//          Intent intent=new Intent(SignUp.this, SignIn.class);
//          startActivity(intent);
//       }
}