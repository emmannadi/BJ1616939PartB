package com.example.jeffery.BJ1616939PartB;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.webkit.WebView;

public class pantaiwebview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantaiwebview);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        WebView pantaiwb = (WebView)findViewById(R.id.pantaiwebview);
        pantaiwb.getSettings().setJavaScriptEnabled(true);
        pantaiwb.loadUrl("https://www.pantai.com.my/");
    }

}
