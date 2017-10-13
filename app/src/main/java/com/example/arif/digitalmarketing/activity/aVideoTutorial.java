package com.example.arif.digitalmarketing.activity;

import android.app.Activity;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

import com.example.arif.digitalmarketing.R;

public class aVideoTutorial extends Activity
{
    private WebView wv1;;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_video_tutorial);
        wv1=(WebView)findViewById(R.id.you_tubeV);
        wv1.setWebViewClient(new MyBrowser());
        //Toast.makeText(aVideoTutorial.this, "Clicked", Toast.LENGTH_SHORT).show();
        String url = "https://github.com/RabelAK47/UVA-Solutions/blob/master/10340%20-%20All%20in%20All.cpp";
        wv1.getSettings().setLoadsImagesAutomatically(true);
        wv1.getSettings().setJavaScriptEnabled(true);
        wv1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv1.loadUrl(url);
    }

    private class MyBrowser extends WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}

