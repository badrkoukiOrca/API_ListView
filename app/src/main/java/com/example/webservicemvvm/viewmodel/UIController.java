package com.example.webservicemvvm.viewmodel;

import android.app.Activity;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.example.webservicemvvm.utils.ListViewAdapter;
import java.util.List;

public class UIController {
    public static void updateUI(Activity context, ListView listView, List<Object> list ) {
        ListAdapter adapter = new ListViewAdapter(context,list);
        listView.setAdapter(adapter);
    }
}
