package com.jikansoftware.picassojsonpractica3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);

        Picasso.with(this)
                .load("https://www.simplifiedcoding.net/wp-content/uploads/2015/10/advertise.png")
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.error)
                .resize(400, 400)
                .into(imageView);
    }
}
