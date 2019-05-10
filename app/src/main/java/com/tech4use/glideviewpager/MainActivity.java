package com.tech4use.glideviewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    // storing the imageURLs
    String[] imageurls = new String[]{
            "https://images.pexels.com/photos/752615/pexels-photo-752615.jpeg?auto=compress&amp;cs=tinysrgb&amp;dpr=1&amp;w=500",
            "https://www.tech4use.com/wp-content/uploads/2018/03/Kawasaki-Ninja-H2R.jpg",
            "https://images.pexels.com/photos/1413412/pexels-photo-1413412.jpeg?auto=compress&amp;cs=tinysrgb&amp;h=750&amp;w=1260",
            "https://images.pexels.com/photos/257840/pexels-photo-257840.jpeg?auto=compress&amp;cs=tinysrgb&amp;h=650&amp;w=940%20940w",
            "https://images.pexels.com/photos/1236701/pexels-photo-1236701.jpeg",
            "https://images.unsplash.com/photo-1488584433697-7ccc1148d30c?ixlib=rb-1.2.1&amp;auto=format&amp;fit=crop&amp;w=334&amp;q=80%20334w",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // loading the images
        viewPager = findViewById(R.id.viewPager);
        MyViewPager myViewPager = new MyViewPager(this, imageurls);
        viewPager.setAdapter(myViewPager);
    }
}
