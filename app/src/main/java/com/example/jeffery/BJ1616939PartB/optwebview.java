package com.example.jeffery.BJ1616939PartB;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.webkit.WebView;

public class optwebview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_optwebview);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        WebView opwb = (WebView)findViewById(R.id.optwebview);
        opwb.getSettings().setJavaScriptEnabled(true);
        opwb.loadUrl("http://www.optimax2u.com/index.php");
    }

}
