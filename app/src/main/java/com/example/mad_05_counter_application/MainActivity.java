package com.example.mad_05_counter_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Handler myhandler=new Handler();
    int t;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.counter);
    }
    public void startcounter(View v)
    {
        i=0;
        myhandler.postDelayed(Threadcount, 1000);

    }

    public void stopcounter(View v)
    {
        myhandler.removeCallbacks(Threadcount);
    }
    public Runnable Threadcount=new Runnable()
    {

        @Override
        public void run() {
            tv.setText(""+i);
            i++;
            myhandler.postDelayed(Threadcount,1000);

        }
    };


}