package com.example.jeffery.BJ1616939PartB;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.webkit.WebView;

public class sunwebview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunwebview);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        WebView sunwb = (WebView)findViewById(R.id.sunwebview);
        sunwb.getSettings().setJavaScriptEnabled(true);
        sunwb.loadUrl("http://sunwaymedical.com/");
    }

}
