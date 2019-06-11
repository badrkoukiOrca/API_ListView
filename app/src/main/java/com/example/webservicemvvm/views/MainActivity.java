package com.example.webservicemvvm.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.provider.Contacts;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.webservicemvvm.R;
import com.example.webservicemvvm.model.User;
import com.example.webservicemvvm.networkcalls.APIStream;
import com.example.webservicemvvm.networkcalls.DataRetreive;
import com.example.webservicemvvm.viewmodel.UIController;

import java.util.List;

import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableObserver;

public class MainActivity extends AppCompatActivity {

    ListView list ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.listView) ;
        DataRetreive.executeHttpRequestWithRetrofit(this,list) ;
    }
}
