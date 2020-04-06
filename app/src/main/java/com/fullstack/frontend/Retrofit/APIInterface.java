package com.fullstack.frontend.Retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIInterface {

    @GET("posts")
    Call<List<Post>> getPosts(@Query("userId") int userId);

}