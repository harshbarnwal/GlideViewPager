package com.tech4use.glideviewpager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

public class MyViewPager extends PagerAdapter {

    private Context context;
    private String[] imageURLs;

    public MyViewPager(Context context, String[] imageURLs) {
        this.context = context;
        this.imageURLs = imageURLs;
    }

    @Override
    public int getCount() {
        return imageURLs.length;
    }

    // for instantiating items
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        // creating the adding the image in imageView
        ImageView imageView = new ImageView(context);
        Glide.with(context)
                .load(imageURLs[position])
                .error(R.drawable.error_image) // load this image in case of any error
                .placeholder(R.drawable.default_image) // load this image for all images before loading any image as a preview
                .into(imageView);
        // adding the images in the container to display images
        container.addView(imageView);
        Log.v("harsh", "image = " + imageView);
        return imageView;
    }

    // for destroying items to freeUp some memory
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    // making sure that correct image is being loaded
    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }
}
