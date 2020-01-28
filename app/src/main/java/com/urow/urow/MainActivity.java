package com.urow.urow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressbar;
    Handler h = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    protected void Splash(ProgressBar pginicio){



    }
    public void vistaInicio(View view){

        Intent vReg =  new Intent(this, inicioActivity.class);
        startActivity(vReg);

    }
}
