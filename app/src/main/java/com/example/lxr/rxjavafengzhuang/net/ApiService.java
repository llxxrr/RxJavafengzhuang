package com.example.lxr.rxjavafengzhuang.net;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

/**
 * Created by lxr on 2018/1/5.
 */

public interface ApiService {
    @GET()
    Observable<String> get(@Url String url);
    @GET()
    Observable<String> get(@Url String url, @QueryMap Map<String,String> map);
    @FormUrlEncoded
    @POST
    Observable<String> post(@Url String url, @FieldMap Map<String,String> map);
}
