package com.anningtex.dealwithimage;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

/**
 * @author Song
 * desc:利用布局来弥补空白边缘
 */
public class TestElseActivity extends AppCompatActivity {
    private ImageView mImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_else);
        initView();
    }

    private void initView() {
        mImage = findViewById(R.id.image);
        Glide.with(this)
                .load("http://rafiki.top:7751/images/FlowerFinished/9175100473487a4a72a8a97965fcd7f3.jpg")
                .into(mImage);
    }
}