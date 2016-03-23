package com.example.robotfarming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by 瑞 on 3/21/2016.
 */
public class ReportMainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reportativity_main);
    }


    public void CropsReportButtonClick(View view)
    {
        startActivity(new Intent("com.litreily.CropsReportActivity"));
    }

    public void MoistureReportButtonClick(View view)
    {
        startActivity(new Intent("com.litreily.MoistureReportActivity"));
    }

    public void WeatherReportButtonClick(View view)
    {
        startActivity(new Intent("com.litreily.WeatherReportActivity"));
    }

    public void WaterReportButtonClick(View view)
    {
        startActivity(new Intent("com.litreily.WaterReportActivity"));
    }

    public void BackButtonClick(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

}
