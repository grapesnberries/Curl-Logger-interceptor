package com.grapesnberries.curlloggersample.network;

import com.grapesnberries.curlloggersample.model.GithubUser;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by mohamedzakaria on 6/14/16.
 */
public interface GithubService {
    @GET("/users")
    Call<List<GithubUser>> getUsers();
}
