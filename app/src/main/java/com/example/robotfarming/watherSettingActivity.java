package com.example.robotfarming;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.ToggleButton;

/**
 * Created by 瑞 on 3/22/2016.
 */
public class watherSettingActivity extends AppCompatActivity {

    ToggleButton toggle;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weathersettingativity);
        toggle = (ToggleButton) findViewById(R.id.toggleCFButton);
    }

    public void BackButtonClick(View view)
    {
        startActivity(new Intent("com.litreily.SettingMainActivity"));
    }
}
