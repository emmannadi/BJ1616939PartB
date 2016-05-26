package com.example.jeffery.BJ1616939PartB;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.webkit.WebView;

public class prinwebview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prinwebview);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        WebView prinwb = (WebView)findViewById(R.id.prinwebview);
        prinwb.getSettings().setJavaScriptEnabled(true);
        prinwb.loadUrl("http://www.princecourt.com/");
    }

}
