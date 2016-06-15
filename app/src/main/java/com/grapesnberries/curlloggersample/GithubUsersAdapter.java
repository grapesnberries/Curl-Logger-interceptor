package com.grapesnberries.curlloggersample;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.grapesnberries.curlloggersample.model.GithubUser;

import java.util.ArrayList;

/**
 * Created by mohamedzakaria on 6/14/16.
 */
public class GithubUsersAdapter extends ArrayAdapter<GithubUser> {
    private Activity activity;
    private ArrayList<GithubUser> users;
    private static LayoutInflater inflater = null;

    public GithubUsersAdapter(Activity activity, int textViewResourceId, ArrayList<GithubUser> users) {
        super(activity, textViewResourceId, users);
        this.activity = activity;
        this.users = users;

        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public int getCount() {
        return users.size();
    }

    public GithubUser getItem(GithubUser position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }

    public static class ViewHolder {
        public TextView display_name;

    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View vi = convertView;
        final ViewHolder holder;
        try {
            if (convertView == null) {
                vi = inflater.inflate(android.R.layout.simple_list_item_1, null);
                holder = new ViewHolder();

                holder.display_name = (TextView) vi.findViewById(android.R.id.text1);


                vi.setTag(holder);
            } else {
                holder = (ViewHolder) vi.getTag();
            }


            holder.display_name.setText(users.get(position).getName());


        } catch (Exception e) {


        }
        return vi;
    }
}
