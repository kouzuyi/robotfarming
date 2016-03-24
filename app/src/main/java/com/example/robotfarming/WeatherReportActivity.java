package com.example.robotfarming;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.robotfarming.model.CWeatherModel;

/**
 * Created by 瑞 on 3/22/2016.
 */
public class WeatherReportActivity extends AppCompatActivity {
    private CWeatherModel cWeatherModel;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weatherreportactivity);
    }

    public void BackButtonClick(View view)
    {
        startActivity(new Intent("com.litreily.ReportMainActivity"));
    }
}
