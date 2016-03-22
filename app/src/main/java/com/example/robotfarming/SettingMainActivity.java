package com.example.robotfarming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by 瑞 on 3/21/2016.
 */
public class SettingMainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settingativity_main);
    }


    public void CameraButtonClick(View view)
    {
        startActivity(new Intent("com.litreily.cameraSettingActivity"));
    }

    public void WaterButtonClick(View view)
    {
        startActivity(new Intent("com.litreily.waterSettingActivity"));
    }

    public void WeatherButtonClick(View view)
    {
        startActivity(new Intent("com.litreily.watherSettingActivity"));
    }

    public void BackButtonClick(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}
