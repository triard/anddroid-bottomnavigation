package com.triard.asus.bottomnavigationexample;
import android.support.annotation.Nullable;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.List;

public class home extends Fragment {
    List<Home1> homeList;

    ListView listView;

    public home() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        homeList = new ArrayList<>();
        listView = (ListView) view.findViewById(R.id.listView1);

        homeList.add(new Home1(R.drawable.ic_launcher_background, "Scoot Mark", "It's a nice movie!"));
        homeList.add(new Home1(R.drawable.ic_dashboard_black_24dp, "Sam Dense", "I think she just acting like a catfisher. we should be aware of him"));

        HomeListAdapter adapter = new HomeListAdapter(getActivity(), R.layout.activity_list_layout, homeList);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int image =  homeList.get(position).image;
                String title =  homeList.get(position).title;
                System.out.println(image);
                Intent myIntent = new Intent(view.getContext(), DetailActivity.class);
                myIntent.putExtra("image", image);
                myIntent.putExtra("title", title);
                myIntent.putExtra("desc", homeList.get(position).desc);
                startActivityForResult(myIntent, 0);
            }
        });

        return view;
    }
}