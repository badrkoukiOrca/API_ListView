package com.example.webservicemvvm.viewmodel;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.webservicemvvm.model.Coffe;
import com.example.webservicemvvm.model.User;
import com.example.webservicemvvm.utils.ExtractUsers;
import com.example.webservicemvvm.utils.GlobalActivity;
import com.example.webservicemvvm.utils.ListViewAdapter;
import com.example.webservicemvvm.views.DescriptionActivity;
import com.example.webservicemvvm.views.MainActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class UIController {



    public static void updateUI(Activity context, ListView listView, List<Object> list ) {
        ListAdapter adapter = new ListViewAdapter(context,list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = (String) listView.getItemAtPosition(position);
                Object object = ExtractUsers.getObjectByAttribute(list,item);
                GlobalActivity globalActivity = new GlobalActivity() ;
                //Intent myIntent = new Intent(MainActivity.context, DescriptionActivity.class);
                /*Vector<CharSequence> v = new Vector<CharSequence>() ;
                if(ExtractUsers.ObjectIsUser(object)){
                    User temp = (User) object ;
                    v.add(temp.getLogin()) ;
                    v.add(temp.getType()) ;
                    v.add(temp.getAvatar()) ;
                    v.add(temp.getSiteAdmin().toString()) ;
                }else{
                    Coffe coffe = (Coffe) object ;
                    v.add(coffe.getNom()) ;
                    v.add(coffe.getAdresse()) ;
                    v.add(coffe.getImage()) ;
                    v.add(coffe.getTel()) ;
                }*/
                //myIntent.putCharSequenceArrayListExtra("data",new ArrayList<>(v)) ;
                //MainActivity.context.startActivity(myIntent);
            }
        });
    }
}
