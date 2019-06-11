package com.example.webservicemvvm.networkcalls;

import com.example.webservicemvvm.model.Coffe;
import com.example.webservicemvvm.model.User;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class APIStream {
    public static Observable<List<User>> getFollowingList(String username){
        APICall apiCall = APICall.retrofit.create(APICall.class) ;
        return apiCall.getFollowingList(username)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .timeout(20, TimeUnit.SECONDS) ;
    }

    public static Observable<List<Coffe>> getCoffeList(){
        APICall apiCall = APICall.retrofit2.create(APICall.class) ;
        return  apiCall.getCoffeList()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .timeout(20,TimeUnit.SECONDS) ;
    }
}
