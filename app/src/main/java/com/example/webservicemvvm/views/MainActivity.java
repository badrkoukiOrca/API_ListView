package com.example.webservicemvvm.views;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import com.example.webservicemvvm.R;
import com.example.webservicemvvm.networkcalls.DataRetreive;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    ListView list ;
    public static Context context ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.listView) ;
        Timer timer = new Timer();
        timer.schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                DataRetreive.GetCoffeList(MainActivity.this,list);
            }
        }, 0, 2000);
    }

    public void MoveToNext(){
        startActivity(new Intent(getApplicationContext(),DescriptionActivity.class));
    }
}