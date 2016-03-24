package com.example.robotfarming;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.robotfarming.model.CWaterModel;

/**
 * Created by 瑞 on 3/23/2016.
 */
public class WaterReportActivity extends AppCompatActivity {
    private CWaterModel cWaterModel;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.waterreportactivity);
    }

    public void BackButtonClick(View view)
    {
        startActivity(new Intent("com.litreily.ReportMainActivity"));
    }
}
