package com.example.arif.digitalmarketing.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.arif.digitalmarketing.R;


public class MainActivity extends AppCompatActivity
{
    ImageButton vVideoBtn, vInterViewBtn, vQZBtn, vTechBtn,vQuesAnsBtn,vStudyMBtn,vTrainCourseBtn,vOurServiceBtn,vContactUsBtn, vOurTeamBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initial();
        activityChange();
    }

    private void activityChange()
    {
        vVideoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, aVideoTutorial.class);
                startActivity(intent);
            }
        });

        vInterViewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, aInterView.class);
                startActivity(intent);
            }
        });
        vQZBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, aQZ.class);
                startActivity(intent);
            }
        });
        vTechBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, aTech.class);
            startActivity(intent);
        }
        });

        vQuesAnsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, aQuesAns.class);
                startActivity(intent);
            }
        });

        vStudyMBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, aStudyM.class);
                startActivity(intent);
            }
        });

        vTrainCourseBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, aTrainCourse.class);
            startActivity(intent);
        }
        });

        vOurServiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, aOurService.class);
                startActivity(intent);
            }
        });

        vContactUsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, aContactUs.class);
                startActivity(intent);
            }
        });
        vOurTeamBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, aOurTeam.class);
                startActivity(intent);
            }
        });
    }

    private void initial()
    {
        vVideoBtn = (ImageButton) findViewById(R.id.xVideoBtn);
        vInterViewBtn = (ImageButton) findViewById(R.id.xInterViewBtn);
        vQZBtn = (ImageButton) findViewById(R.id.xQZBtn);
        vTechBtn = (ImageButton) findViewById(R.id.xTechBtn);
        vQuesAnsBtn = (ImageButton) findViewById(R.id.xQuesAnsBtn);
        vStudyMBtn = (ImageButton) findViewById(R.id.xStudyMBtn);
        vTrainCourseBtn = (ImageButton) findViewById(R.id.xTrainCourseBtn);
        vOurServiceBtn = (ImageButton) findViewById(R.id.xOurServiceBtn);
        vContactUsBtn = (ImageButton) findViewById(R.id.xContactUsBtn);
        vOurTeamBtn = (ImageButton) findViewById(R.id.xOurTeamBtn);
    }
}
