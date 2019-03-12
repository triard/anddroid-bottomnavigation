package com.triard.asus.bottomnavigationexample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class HomeListAdapter extends ArrayAdapter<Home1> {
    List<Home1> homeList;

    Context context;

    int resource;

    public HomeListAdapter(Context context, int resource, List<Home1> homeList) {
        super(context, resource, homeList);
        this.context = context;
        this.resource = resource;
        this.homeList = homeList;
    }

    //this will return the ListView Item as a View
    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //Get the view of the xml for our list item
        //
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        //getting the view
        //njupuk xml
        View view = layoutInflater.inflate(resource, null, false);

        //getting the view elements of the list from the view
        ImageView imageView = view.findViewById(R.id.image);
        TextView title = view.findViewById(R.id.textTitle);
        TextView desc = view.findViewById(R.id.textDescription);

        //getting the specified position
        Home1 home1 = homeList.get(position);

        //adding values to the list item
        imageView.setImageDrawable(context.getResources().getDrawable(home1.getImage()));
        title.setText(home1.getTitle());
        desc.setText(home1.getDesc());

        return view;
    }
}