package com.grapesnberries.curlloggersample.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by mohamedzakaria on 6/14/16.
 */
public class GithubUser {
    @SerializedName("login")
    String name;

    public String getName() {
        return name;
    }
}
