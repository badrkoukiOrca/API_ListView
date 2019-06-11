package com.example.webservicemvvm.viewmodel;

import android.app.Activity;
import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.example.webservicemvvm.networkcalls.DataRetreive;
import com.example.webservicemvvm.utils.ListViewAdapter;

public class UIController {
    public static void updateUI(Activity context, ListView listView) {
        /*String[] MyValues = new String[DataRetreive.users.size()] ;
        for (int i = 0 ;i<DataRetreive.users.size();i++){
            MyValues[i] = DataRetreive.users.get(i).getLogin() ;
        }
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(context,
                android.R.layout.simple_list_item_1, android.R.id.text1, MyValues);*/
        ListAdapter adapter = new ListViewAdapter(context,DataRetreive.users);
        listView.setAdapter(adapter);
    }

}
