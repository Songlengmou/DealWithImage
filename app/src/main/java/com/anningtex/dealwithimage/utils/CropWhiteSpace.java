package com.anningtex.dealwithimage.utils;

import android.content.Context;
import android.graphics.Bitmap;

import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;

/**
 * @author Song
 * 适用于 Glide3.0以上
 */
public class CropWhiteSpace extends BitmapTransformation {

    public CropWhiteSpace(Context context) {
        super(context);
    }

    public CropWhiteSpace(BitmapPool bitmapPool) {
        super(bitmapPool);
    }

    @Override
    public String getId() {
        //自定义的一个字符串，随意写一个都可以
        return "CropWhiteSpace";
    }

    @Override
    protected Bitmap transform(BitmapPool pool, Bitmap toTransform, int outWidth, int outHeight) {
        final Bitmap result = BitmapUtils.cropWhiteSpace(toTransform);
        return result;
    }
}