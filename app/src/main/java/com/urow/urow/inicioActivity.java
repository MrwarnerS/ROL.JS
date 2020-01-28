package com.urow.urow;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class inicioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }

    public void vistaRegistro(View view){

        Intent vReg =  new Intent(this, RegistroActivity.class);
        startActivity(vReg);

    }
}
