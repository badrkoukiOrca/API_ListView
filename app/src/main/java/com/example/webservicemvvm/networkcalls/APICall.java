package com.example.webservicemvvm.networkcalls;

import com.example.webservicemvvm.model.User;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface APICall {

    @GET("users/{username}/following")
    Observable<List<User>> getFollowingList(@Path("username") String username) ;

    public static final Retrofit retrofit = new Retrofit.Builder().baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create()).build() ;
}
