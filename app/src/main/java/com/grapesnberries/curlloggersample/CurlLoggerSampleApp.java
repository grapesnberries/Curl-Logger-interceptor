package com.grapesnberries.curlloggersample;

import android.app.Application;

import com.google.gson.Gson;
import com.grapesnberries.curllogger.CurlLoggerInterceptor;
import com.grapesnberries.curlloggersample.network.GithubService;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by mohamedzakaria on 6/14/16.
 */
public class CurlLoggerSampleApp extends Application {

    private static GithubService githubService;

    @Override
    public void onCreate() {
        super.onCreate();

        OkHttpClient.Builder client = new OkHttpClient.Builder()
                // add our curl logger here
                .addInterceptor(new CurlLoggerInterceptor());
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .client(client.build())
                .build();

        githubService = retrofit.create(GithubService.class);
    }

    public static GithubService getGithubService() {
        return githubService;
    }
}
