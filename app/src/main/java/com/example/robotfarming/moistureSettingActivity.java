package com.example.robotfarming;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;

import com.example.robotfarming.model.CMoistureModel;

/**
 * Created by 瑞 on 3/22/2016.
 */
public class moistureSettingActivity extends AppCompatActivity {
    private CMoistureModel moistureModel;
    private Spinner Minhumidityspinner;
    private Spinner Maxhumidityspinner;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moisturesettingativity);
        Minhumidityspinner = (Spinner) findViewById(R.id.minHumiditySpinner);
        Maxhumidityspinner = (Spinner) findViewById(R.id.maxHumiditySpinner);
    }

    public void BackButtonClick(View view)
    {
        startActivity(new Intent("com.litreily.SettingMainActivity"));
    }
}
