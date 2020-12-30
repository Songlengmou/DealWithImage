package com.anningtex.dealwithimage.test.other;

import android.view.View;

import com.anningtex.dealwithimage.test.manger.GalleryLayoutManager;

/**
 * @author Administrator
 */
public class ScaleTransformer implements GalleryLayoutManager.ItemTransformer {

    @Override
    public void transformItem(GalleryLayoutManager layoutManager, View item, float fraction) {
        item.setPivotX(item.getWidth() / 2.f);
        item.setPivotY(item.getHeight() / 2.f);

        float scale = 1 - 0.2f * Math.abs(fraction);
        item.setScaleX(scale);
        item.setScaleY(scale);
    }
}
