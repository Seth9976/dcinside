package com.davemorrissey.labs.subscaleview.decoder;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SkiaImageRegionDecoder implements ImageRegionDecoder {
    private static final String ASSET_PREFIX = "file:///android_asset/";
    private static final String FILE_PREFIX = "file://";
    private static final String RESOURCE_PREFIX = "android.resource://";
    private final Bitmap.Config bitmapConfig;
    private BitmapRegionDecoder decoder;
    private final ReadWriteLock decoderLock;

    @Keep
    public SkiaImageRegionDecoder() {
        this(null);
    }

    public SkiaImageRegionDecoder(@Nullable Bitmap.Config bitmap$Config0) {
        this.decoderLock = new ReentrantReadWriteLock(true);
        Bitmap.Config bitmap$Config1 = SubsamplingScaleImageView.getPreferredBitmapConfig();
        if(bitmap$Config0 != null) {
            this.bitmapConfig = bitmap$Config0;
            return;
        }
        if(bitmap$Config1 != null) {
            this.bitmapConfig = bitmap$Config1;
            return;
        }
        this.bitmapConfig = Bitmap.Config.RGB_565;
    }

    @Override  // com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder
    @NonNull
    public Bitmap decodeRegion(@NonNull Rect rect0, int v) {
        this.getDecodeLock().lock();
        try {
            if(this.decoder != null && !this.decoder.isRecycled()) {
                BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
                bitmapFactory$Options0.inSampleSize = v;
                bitmapFactory$Options0.inPreferredConfig = this.bitmapConfig;
                Bitmap bitmap0 = this.decoder.decodeRegion(rect0, bitmapFactory$Options0);
                if(bitmap0 == null) {
                    throw new RuntimeException("Skia image decoder returned null bitmap - image format may not be supported");
                }
                return bitmap0;
            }
        }
        finally {
            this.getDecodeLock().unlock();
        }
        throw new IllegalStateException("Cannot decode region after decoder has been recycled");
    }

    private Lock getDecodeLock() {
        return this.decoderLock.readLock();
    }

    @Override  // com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder
    @NonNull
    public Point init(Context context0, @NonNull Uri uri0) throws Exception {
        String s = uri0.toString();
        if(s.startsWith("android.resource://")) {
            String s1 = uri0.getAuthority();
            Resources resources0 = "com.dcinside.app.android".equals(s1) ? context0.getResources() : context0.getPackageManager().getResourcesForApplication(s1);
            int v = 0;
            List list0 = uri0.getPathSegments();
            int v1 = list0.size();
            if(v1 == 2 && ((String)list0.get(0)).equals("drawable")) {
                v = resources0.getIdentifier(((String)list0.get(1)), "drawable", s1);
            }
            else if(v1 == 1 && TextUtils.isDigitsOnly(((CharSequence)list0.get(0)))) {
                try {
                    v = Integer.parseInt(((String)list0.get(0)));
                }
                catch(NumberFormatException unused_ex) {
                }
            }
            this.decoder = BitmapRegionDecoder.newInstance(context0.getResources().openRawResource(v), false);
            return new Point(this.decoder.getWidth(), this.decoder.getHeight());
        }
        if(s.startsWith("file:///android_asset/")) {
            this.decoder = BitmapRegionDecoder.newInstance(context0.getAssets().open(s.substring(22), 1), false);
            return new Point(this.decoder.getWidth(), this.decoder.getHeight());
        }
        if(s.startsWith("file://")) {
            this.decoder = BitmapRegionDecoder.newInstance(s.substring(7), false);
            return new Point(this.decoder.getWidth(), this.decoder.getHeight());
        }
        try(InputStream inputStream0 = context0.getContentResolver().openInputStream(uri0)) {
            this.decoder = BitmapRegionDecoder.newInstance(inputStream0, false);
            return new Point(this.decoder.getWidth(), this.decoder.getHeight());
        }
    }

    @Override  // com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder
    public boolean isReady() {
        synchronized(this) {
            return this.decoder != null && !this.decoder.isRecycled();
        }
    }

    @Override  // com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder
    public void recycle() {
        synchronized(this) {
            this.decoderLock.writeLock().lock();
            try {
                this.decoder.recycle();
                this.decoder = null;
            }
            catch(Throwable throwable0) {
                this.decoderLock.writeLock().unlock();
                throw throwable0;
            }
            this.decoderLock.writeLock().unlock();
        }
    }
}

