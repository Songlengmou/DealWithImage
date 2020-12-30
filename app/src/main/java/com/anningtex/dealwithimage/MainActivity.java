package com.anningtex.dealwithimage;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.anningtex.dealwithimage.test.act.TestActivity;
import com.anningtex.dealwithimage.utils.CropWhiteSpace;
import com.bumptech.glide.Glide;

/**
 * @author Song
 * desc:图片处理，去除原图中多余白边 与 测试数据
 */
public class MainActivity extends AppCompatActivity {
    private ImageView mIvCs;
    private Button mBtnTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mIvCs = findViewById(R.id.iv_cs);
        mBtnTest = findViewById(R.id.btn_test);

        Glide.with(this).load("https://www.africatex.com:706/medium/20191105/89d37d1803751aee9d454cdbdcc0dac6.jpg")
                .bitmapTransform(new CropWhiteSpace(this))
                .into(mIvCs);

//        //4.0以上调用
//        Glide.with(this).load("https://www.africatex.com:706/medium/20191105/89d37d1803751aee9d454cdbdcc0dac6.jpg")
//                .transform(new CropWhiteSpace1())
//                .into(mIvCs);

        mBtnTest.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, TestActivity.class)));
    }
}