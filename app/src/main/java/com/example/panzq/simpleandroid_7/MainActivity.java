package com.example.panzq.simpleandroid_7;

import android.graphics.drawable.ClipDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ClipDrawable drawable = (ClipDrawable) ((ImageView)findViewById(R.id.test_clip)).getDrawable();
        drawable.setLevel(4000);

    }
}
