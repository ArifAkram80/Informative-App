package com.example.arif.digitalmarketing.activity;

import android.app.Activity;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.arif.digitalmarketing.R;

public class aVideoTutorial extends Activity
{
    private WebView wv1;
    private ProgressBar pb;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_video_tutorial);
        pb = (ProgressBar) findViewById(R.id.progressBar);
        wv1=(WebView)findViewById(R.id.you_tubeV);

        wv1.setWebViewClient(new MyBrowser());
        Toast.makeText(aVideoTutorial.this, "Clicked", Toast.LENGTH_SHORT).show();
        String url = "https://www.youtube.com/playlist?list=PL6gx4Cwl9DGBsvRxJJOzG4r4k_zLKrnxl";
        wv1.getSettings().setLoadsImagesAutomatically(true);
        wv1.getSettings().setJavaScriptEnabled(true);
        wv1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv1.loadUrl(url);

        wv1.setWebChromeClient(new WebChromeClient()
        {
            public void onProgressChanged(WebView view, int progress)
            {
                pb.setProgress(progress);
                if (progress == 100) {
                    pb.setVisibility(View.GONE);

                } else {
                    pb.setVisibility(View.VISIBLE);

                }
            }
        });
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
