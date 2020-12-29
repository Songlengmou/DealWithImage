package com.anningtex.dealwithimage.utils;

import android.graphics.Bitmap;

import androidx.annotation.NonNull;

import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;

import java.security.MessageDigest;

/**
 * @author Song
 * 适用于 Glide4.0以上
 * implementation 'com.github.bumptech.glide:glide:4.9.0'
 * annotationProcessor 'com.github.bumptech.glide:compiler:4.9.0'
 */
//public class CropWhiteSpace1 extends BitmapTransformation {
//    /**
//     * 自定义的一个ID字符串，随意写一个都可以
//     */
//    private static final String ID = "CropWhiteSpace";
//    private static final byte[] ID_BYTES = ID.getBytes(CHARSET);
//
//    @Override
//    public boolean equals(Object o) {
//        return o instanceof CenterCrop;
//    }
//
//    @Override
//    public int hashCode() {
//        return ID.hashCode();
//    }
//
//    @Override
//    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
//        messageDigest.update(ID_BYTES);
//    }
//
//    @Override
//    protected Bitmap transform(BitmapPool pool, Bitmap toTransform, int outWidth, int outHeight) {
//        final Bitmap result = BitmapUtils.cropWhiteSpace(toTransform);
//        return result;
//    }
//}