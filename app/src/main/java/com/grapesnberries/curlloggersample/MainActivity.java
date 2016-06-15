package com.grapesnberries.curlloggersample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.grapesnberries.curlloggersample.model.GithubUser;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ArrayAdapter adapter;

    @BindView(R.id.listView)
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        CurlLoggerSampleApp.getGithubService().getUsers().enqueue(new Callback<List<GithubUser>>() {
            @Override
            public void onResponse(Call<List<GithubUser>> call, Response<List<GithubUser>> response) {
                adapter = new GithubUsersAdapter(MainActivity.this, android.R.layout.simple_list_item_1, new ArrayList<GithubUser>(response.body()));

                listView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<GithubUser>> call, Throwable t) {

            }
        });
    }
}
