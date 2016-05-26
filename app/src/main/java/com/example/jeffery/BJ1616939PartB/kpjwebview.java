package com.example.jeffery.BJ1616939PartB;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.webkit.WebView;

public class kpjwebview extends Kpj_hos{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kpjwebview);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        WebView web = (WebView)findViewById(R.id.kpjwebview);
        web.getSettings().setJavaScriptEnabled(true);
        web.loadUrl("http://www.kpjtawakkal.com/index.php");
    }

}
