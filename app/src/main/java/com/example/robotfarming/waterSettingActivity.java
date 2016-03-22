package com.example.robotfarming;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;

/**
 * Created by 瑞 on 3/22/2016.
 */
public class waterSettingActivity extends AppCompatActivity {
    private Spinner Minspinner;
    private Spinner Maxspinner;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.watersettingativity);
        Minspinner = (Spinner) findViewById(R.id.MinSpinner);
        Maxspinner = (Spinner) findViewById(R.id.maxSpinner);
    }

    public void BackButtonClick(View view)
    {
        startActivity(new Intent("com.litreily.SettingMainActivity"));
    }
}
