package com.triard.asus.bottomnavigationexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int passedImage = getIntent().getExtras().getInt( "image");
        String passedTitle = getIntent().getExtras().getString("title");
        String passedDesc = getIntent().getExtras().getString("desc");

        ImageView iv = (ImageView) findViewById(R.id.imagesDetail);
        TextView tv = (TextView) findViewById(R.id.TitledDetail);
        TextView tdesc = (TextView)  findViewById(R.id.DecsDetail);

        iv.setImageDrawable(getResources().getDrawable(passedImage));
        tv.setText(passedTitle);
        tdesc.setText(passedDesc);

    }
}
