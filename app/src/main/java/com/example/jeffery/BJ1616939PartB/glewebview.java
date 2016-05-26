package com.example.jeffery.BJ1616939PartB;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.webkit.WebView;

public class glewebview extends gle_hos {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glewebview);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        WebView wb = (WebView)findViewById(R.id.glewebview);
        wb.getSettings().setJavaScriptEnabled(true);
        wb.loadUrl("http://gleneagleskl.com.my/");
    }

}
