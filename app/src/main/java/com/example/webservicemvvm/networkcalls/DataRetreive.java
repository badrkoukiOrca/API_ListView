package com.example.webservicemvvm.networkcalls;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.widget.ListView;

import com.example.webservicemvvm.model.Coffe;
import com.example.webservicemvvm.model.User;
import com.example.webservicemvvm.viewmodel.UIController;

import java.util.ArrayList;
import java.util.List;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableObserver;

public class DataRetreive {
    static Disposable disposable ;

    public static void getUserList(Activity context, ListView listView){
        DataRetreive.disposable = APIStream.getFollowingList("JakeWharton").subscribeWith(new DisposableObserver<List<User>>() {
            @Override
            public void onNext(List<User> users) {
                UIController.updateUI(context,listView,new ArrayList<Object>(users));
            }
            @Override
            public void onError(Throwable e) {
                Log.e("Error",e.getMessage()) ;
            }
            @Override
            public void onComplete() { }
        });
    }

    public static void GetCoffeList(Activity context, ListView listView){
        DataRetreive.disposable = APIStream.getCoffeList().subscribeWith(new DisposableObserver<List<Coffe>>() {
            @Override
            public void onNext(List<Coffe> coffes) {
                UIController.updateUI(context,listView,new ArrayList<Object>(coffes));
            }
            @Override
            public void onError(Throwable e) {
                Log.e("Error",e.getMessage()) ;
            }
            @Override
            public void onComplete() { }
        });
    }

}
