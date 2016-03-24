package com.example.robotfarming;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;

import com.example.robotfarming.model.CCropModel;


/**
 * Created by 瑞 on 3/21/2016.
 */
public class cameraSettingActivity extends AppCompatActivity {

    private CCropModel cCropModel;

    private Spinner spinner;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.camerasettingativity);
        spinner = (Spinner) findViewById(R.id.PictureInterValSpinner);
    }

    public void BackButtonClick(View view)
    {
        startActivity(new Intent("com.litreily.SettingMainActivity"));
    }

}
