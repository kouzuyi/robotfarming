package com.example.robotfarming;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.robotfarming.model.CMoistureModel;

/**
 * Created by 瑞 on 3/22/2016.
 */
public class MoistureReportActivity extends AppCompatActivity {
    private CMoistureModel moistureModel;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moisturereportactivity);
    }

    public void BackButtonClick(View view)
    {
        startActivity(new Intent("com.litreily.ReportMainActivity"));
    }
}
