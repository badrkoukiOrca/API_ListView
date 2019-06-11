package com.example.webservicemvvm.networkcalls;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.widget.ListView;

import com.example.webservicemvvm.model.User;
import com.example.webservicemvvm.viewmodel.UIController;

import java.util.List;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableObserver;

public class DataRetreive {

    public static List<User> users ;
    static Disposable disposable ;

    public static void executeHttpRequestWithRetrofit(Activity context, ListView listView){
        DataRetreive.disposable = APIStream.getFollowingList("JakeWharton").subscribeWith(new DisposableObserver<List<User>>() {
            @Override
            public void onNext(List<User> users) {
                DataRetreive.users = users ;
                UIController.updateUI(context,listView);
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
