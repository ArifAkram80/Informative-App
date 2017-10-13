package com.example.arif.digitalmarketing.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.arif.digitalmarketing.R;


public class aInterView extends AppCompatActivity {

    ListView mylist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_inter_view);

        mylist = (ListView) findViewById(R.id.xInterListvw);

        final String[] InterHeadName = {"Digital Marketing","Search Engine Optimization",
        "Search Engine Marketing", "Social Media Optimization"};
        int[]  InterHeadPic =  {R.drawable.dmicn, R.drawable.seo, R.drawable.sem,R.drawable.socialicn};

        custom_list_class myadap = new custom_list_class(aInterView.this, InterHeadName,InterHeadPic);
        mylist.setAdapter(myadap);
    }
}
