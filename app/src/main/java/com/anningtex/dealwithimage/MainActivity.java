package com.anningtex.dealwithimage;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.anningtex.dealwithimage.utils.CropWhiteSpace;
import com.bumptech.glide.Glide;

/**
 * @author Song
 * desc:图片处理，去除原图中多余白边
 */
public class MainActivity extends AppCompatActivity {
    private ImageView mIvCs, mIvCs1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mIvCs = findViewById(R.id.iv_cs);
        mIvCs1 = findViewById(R.id.iv_cs1);

        Glide.with(this).load("https://www.africatex.com:706/medium/20191105/89d37d1803751aee9d454cdbdcc0dac6.jpg")
                .bitmapTransform(new CropWhiteSpace(this))
                .into(mIvCs);

        Glide.with(this).load("https://www.africatex.com:706/medium/20191105/03b61002a792dc3bfbf1c613def83f79.jpg")
                .bitmapTransform(new CropWhiteSpace(this))
                .into(mIvCs1);

//        //4.0以上调用
//        Glide.with(this).load("https://www.africatex.com:706/medium/20191105/89d37d1803751aee9d454cdbdcc0dac6.jpg")
//                .transform(new CropWhiteSpace1())
//                .into(mIvCs);
    }
}