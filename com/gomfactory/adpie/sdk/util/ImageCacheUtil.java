package com.gomfactory.adpie.sdk.util;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.collection.LruCache;
import com.gomfactory.adpie.sdk.AdPieSDK;

public class ImageCacheUtil {
    public static final String TAG = "ImageCacheUtil";
    private static ImageCacheUtil instance;
    private LruCache mLruCache;

    static {
    }

    private ImageCacheUtil() {
        long v = Runtime.getRuntime().maxMemory();
        int v1 = ((int)(v / 0x400L)) / 8;
        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
            Log.d("ImageCacheUtil", "max memory " + ((int)(v / 0x400L)) + " cache size " + v1);
        }
        this.mLruCache = new LruCache(v1) {
            @Override  // androidx.collection.LruCache
            protected int sizeOf(Object object0, Object object1) {
                return this.sizeOf(((String)object0), ((Bitmap)object1));
            }

            protected int sizeOf(String s, Bitmap bitmap0) {
                return bitmap0.getByteCount() / 0x400;
            }
        };
    }

    public void addBitmapToMemoryCache(String s, Bitmap bitmap0) {
        if(this.getBitmapFromMemCache(s) == null) {
            this.mLruCache.put(s, bitmap0);
        }
    }

    public Bitmap getBitmapFromMemCache(String s) {
        return (Bitmap)this.mLruCache.get(s);
    }

    public static ImageCacheUtil getInstance() {
        if(ImageCacheUtil.instance == null) {
            ImageCacheUtil.instance = new ImageCacheUtil();
        }
        return ImageCacheUtil.instance;
    }
}

