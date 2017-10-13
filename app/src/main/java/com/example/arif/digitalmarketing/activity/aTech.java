package com.example.arif.digitalmarketing.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.arif.digitalmarketing.R;

public class aTech extends AppCompatActivity
{
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_tech);

        listView = (ListView) findViewById(R.id.xTech_LV);
        final String[] TechHeadName = {"Digital Marketing","Search Engine Optimization",
                "Search Engine Marketing", "Social Media Optimization"};
        int[]  TechHeadPic =  {R.drawable.dmicn, R.drawable.seo, R.drawable.sem,R.drawable.socialicn};

        custom_list_class myadap = new custom_list_class(aTech.this, TechHeadName,TechHeadPic);
        listView.setAdapter(myadap);
    }
}
