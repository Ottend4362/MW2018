package com.ottda01.mw2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ca.mas.foundation.MAS;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //MAS.start(this);

    }

    public void loginClicked(View view) {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);

    }
}
