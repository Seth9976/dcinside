package com.davemorrissey.labs.subscaleview.decoder;

import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import j..util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileFilter;
import java.io.InputStream;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.regex.Pattern;
import jeb.synthetic.TWR;

public class SkiaPooledImageRegionDecoder implements ImageRegionDecoder {
    static class DecoderPool {
        private final Semaphore available;
        private final Map decoders;

        private DecoderPool() {
            this.available = new Semaphore(0, true);
            this.decoders = new ConcurrentHashMap();
        }

        DecoderPool(com.davemorrissey.labs.subscaleview.decoder.SkiaPooledImageRegionDecoder.1 skiaPooledImageRegionDecoder$10) {
        }

        private BitmapRegionDecoder acquire() {
            this.available.acquireUninterruptibly();
            return this.getNextAvailable();
        }

        private void add(BitmapRegionDecoder bitmapRegionDecoder0) {
            synchronized(this) {
                this.decoders.put(bitmapRegionDecoder0, Boolean.FALSE);
                this.available.release();
            }
        }

        private BitmapRegionDecoder getNextAvailable() {
            synchronized(this) {
                for(Object object0: this.decoders.entrySet()) {
                    Map.Entry map$Entry0 = (Map.Entry)object0;
                    if(!((Boolean)map$Entry0.getValue()).booleanValue()) {
                        map$Entry0.setValue(Boolean.TRUE);
                        return (BitmapRegionDecoder)map$Entry0.getKey();
                    }
                    if(false) {
                        break;
                    }
                }
                return null;
            }
        }

        private boolean isEmpty() {
            synchronized(this) {
            }
            return this.decoders.isEmpty();
        }

        private boolean markAsUnused(BitmapRegionDecoder bitmapRegionDecoder0) {
            synchronized(this) {
                for(Object object0: this.decoders.entrySet()) {
                    Map.Entry map$Entry0 = (Map.Entry)object0;
                    if(bitmapRegionDecoder0 == map$Entry0.getKey()) {
                        if(((Boolean)map$Entry0.getValue()).booleanValue()) {
                            map$Entry0.setValue(Boolean.FALSE);
                            return true;
                        }
                        return false;
                    }
                    if(false) {
                        break;
                    }
                }
                return false;
            }
        }

        private void recycle() {
            synchronized(this) {
                while(!this.decoders.isEmpty()) {
                    BitmapRegionDecoder bitmapRegionDecoder0 = this.acquire();
                    bitmapRegionDecoder0.recycle();
                    this.decoders.remove(bitmapRegionDecoder0);
                }
            }
        }

        private void release(BitmapRegionDecoder bitmapRegionDecoder0) {
            if(this.markAsUnused(bitmapRegionDecoder0)) {
                this.available.release();
            }
        }

        private int size() {
            synchronized(this) {
            }
            return this.decoders.size();
        }
    }

    private static final String ASSET_PREFIX = "file:///android_asset/";
    private static final String FILE_PREFIX = "file://";
    private static final String RESOURCE_PREFIX = "android.resource://";
    private static final String TAG = "SkiaPooledImageRegionDecoder";
    private final Bitmap.Config bitmapConfig;
    private Context context;
    private static boolean debug = false;
    private final ReadWriteLock decoderLock;
    private DecoderPool decoderPool;
    private long fileLength;
    private final Point imageDimensions;
    private final AtomicBoolean lazyInited;
    private Uri uri;

    static {
    }

    @Keep
    public SkiaPooledImageRegionDecoder() {
        this(null);
    }

    public SkiaPooledImageRegionDecoder(@Nullable Bitmap.Config bitmap$Config0) {
        this.decoderPool = new DecoderPool(null);
        this.decoderLock = new ReentrantReadWriteLock(true);
        this.fileLength = 0x7FFFFFFFFFFFFFFFL;
        this.imageDimensions = new Point(0, 0);
        this.lazyInited = new AtomicBoolean(false);
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

    protected boolean allowAdditionalDecoder(int v, long v1) {
        if(v >= 4) {
            this.debug("No additional decoders allowed, reached hard limit (4)");
            return false;
        }
        long v2 = ((long)v) * v1;
        if(v2 > 0x1400000L) {
            this.debug("No additional encoders allowed, reached hard memory limit (20Mb)");
            return false;
        }
        if(this.isLowMemory()) {
            this.debug("No additional encoders allowed, memory is low");
            return false;
        }
        this.debug("Additional decoder allowed, current count is " + v + ", estimated native memory " + v2 / 0x100000L + "Mb");
        return true;
    }

    private void debug(String s) {
        if(SkiaPooledImageRegionDecoder.debug) {
            Log.d("SkiaPooledImageRegionDecoder", s);
        }
    }

    @Override  // com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder
    @NonNull
    public Bitmap decodeRegion(@NonNull Rect rect0, int v) {
        Bitmap bitmap0;
        this.debug("Decode region " + rect0 + " on thread " + "jeb-dexdec-sb-st-4904");
        if(rect0.width() < this.imageDimensions.x || rect0.height() < this.imageDimensions.y) {
            this.lazyInit();
        }
        this.decoderLock.readLock().lock();
        try {
            DecoderPool skiaPooledImageRegionDecoder$DecoderPool0 = this.decoderPool;
            if(skiaPooledImageRegionDecoder$DecoderPool0 != null) {
                BitmapRegionDecoder bitmapRegionDecoder0 = skiaPooledImageRegionDecoder$DecoderPool0.acquire();
                if(bitmapRegionDecoder0 != null) {
                    try {
                        if(!bitmapRegionDecoder0.isRecycled()) {
                            BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
                            bitmapFactory$Options0.inSampleSize = v;
                            bitmapFactory$Options0.inPreferredConfig = this.bitmapConfig;
                            bitmap0 = bitmapRegionDecoder0.decodeRegion(rect0, bitmapFactory$Options0);
                            if(bitmap0 == null) {
                                throw new RuntimeException("Skia image decoder returned null bitmap - image format may not be supported");
                            }
                            goto label_20;
                        }
                        goto label_25;
                    }
                    catch(Throwable throwable0) {
                        this.decoderPool.release(bitmapRegionDecoder0);
                        throw throwable0;
                    }
                label_20:
                    this.decoderPool.release(bitmapRegionDecoder0);
                    return bitmap0;
                }
            label_25:
                if(bitmapRegionDecoder0 != null) {
                    this.decoderPool.release(bitmapRegionDecoder0);
                }
            }
        }
        finally {
            this.decoderLock.readLock().unlock();
        }
        throw new IllegalStateException("Cannot decode region after decoder has been recycled");
    }

    private int getNumCoresOldPhones() {
        class CpuFilter implements FileFilter {
            @Override
            public boolean accept(File file0) {
                return Pattern.matches("cpu[0-9]+", file0.getName());
            }
        }

        try {
            return new File("/sys/devices/system/cpu/").listFiles(new CpuFilter(this)).length;
        }
        catch(Exception unused_ex) {
            return 1;
        }
    }

    private int getNumberOfCores() [...] // 潜在的解密器

    @Override  // com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder
    @NonNull
    public Point init(Context context0, @NonNull Uri uri0) throws Exception {
        this.context = context0;
        this.uri = uri0;
        this.initialiseDecoder();
        return this.imageDimensions;
    }

    private void initialiseDecoder() throws Exception {
        BitmapRegionDecoder bitmapRegionDecoder2;
        InputStream inputStream0;
        String s2;
        BitmapRegionDecoder bitmapRegionDecoder0;
        String s = this.uri.toString();
        long v = 0x7FFFFFFFFFFFFFFFL;
        if(s.startsWith("android.resource://")) {
            String s1 = this.uri.getAuthority();
            Resources resources0 = "com.dcinside.app.android".equals(s1) ? this.context.getResources() : this.context.getPackageManager().getResourcesForApplication(s1);
            int v1 = 0;
            List list0 = this.uri.getPathSegments();
            int v2 = list0.size();
            if(v2 == 2 && ((String)list0.get(0)).equals("drawable")) {
                v1 = resources0.getIdentifier(((String)list0.get(1)), "drawable", s1);
            }
            else if(v2 == 1 && TextUtils.isDigitsOnly(((CharSequence)list0.get(0)))) {
                try {
                    v1 = Integer.parseInt(((String)list0.get(0)));
                }
                catch(NumberFormatException unused_ex) {
                }
            }
            try {
                v = this.context.getResources().openRawResourceFd(v1).getLength();
            }
            catch(Exception unused_ex) {
            }
            bitmapRegionDecoder0 = BitmapRegionDecoder.newInstance(this.context.getResources().openRawResource(v1), false);
        }
        else if(s.startsWith("file:///android_asset/")) {
            try {
                s2 = s.substring(22);
                v = this.context.getAssets().openFd(s2).getLength();
            }
            catch(Exception unused_ex) {
            }
            bitmapRegionDecoder0 = BitmapRegionDecoder.newInstance(this.context.getAssets().open(s2, 1), false);
        }
        else if(s.startsWith("file://")) {
            BitmapRegionDecoder bitmapRegionDecoder1 = BitmapRegionDecoder.newInstance(s.substring(7), false);
            try {
                File file0 = new File(s);
                if(file0.exists()) {
                    v = file0.length();
                }
            label_26:
                bitmapRegionDecoder0 = bitmapRegionDecoder1;
            }
            catch(Exception unused_ex) {
                goto label_26;
            }
        }
        else {
            try {
                inputStream0 = null;
                ContentResolver contentResolver0 = this.context.getContentResolver();
                inputStream0 = contentResolver0.openInputStream(this.uri);
                bitmapRegionDecoder2 = BitmapRegionDecoder.newInstance(inputStream0, false);
                try {
                    AssetFileDescriptor assetFileDescriptor0 = contentResolver0.openAssetFileDescriptor(this.uri, "r");
                    if(assetFileDescriptor0 != null) {
                        v = assetFileDescriptor0.getLength();
                    }
                }
                catch(Exception unused_ex) {
                }
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(inputStream0, throwable0);
                throw throwable0;
            }
            if(inputStream0 != null) {
                try {
                    inputStream0.close();
                }
                catch(Exception unused_ex) {
                }
            }
            bitmapRegionDecoder0 = bitmapRegionDecoder2;
        }
        this.fileLength = v;
        int v3 = bitmapRegionDecoder0.getWidth();
        int v4 = bitmapRegionDecoder0.getHeight();
        this.imageDimensions.set(v3, v4);
        this.decoderLock.writeLock().lock();
        try {
            DecoderPool skiaPooledImageRegionDecoder$DecoderPool0 = this.decoderPool;
            if(skiaPooledImageRegionDecoder$DecoderPool0 != null) {
                skiaPooledImageRegionDecoder$DecoderPool0.add(bitmapRegionDecoder0);
            }
        }
        finally {
            this.decoderLock.writeLock().unlock();
        }
    }

    private boolean isLowMemory() {
        ActivityManager activityManager0 = (ActivityManager)this.context.getSystemService("activity");
        if(activityManager0 != null) {
            ActivityManager.MemoryInfo activityManager$MemoryInfo0 = new ActivityManager.MemoryInfo();
            activityManager0.getMemoryInfo(activityManager$MemoryInfo0);
            return activityManager$MemoryInfo0.lowMemory;
        }
        return true;
    }

    @Override  // com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder
    public boolean isReady() {
        synchronized(this) {
        }
        return this.decoderPool != null && !this.decoderPool.isEmpty();
    }

    private void lazyInit() {
        if(this.lazyInited.compareAndSet(false, true) && this.fileLength < 0x7FFFFFFFFFFFFFFFL) {
            this.debug("Starting lazy init of additional decoders");
            new Thread() {
                @Override
                public void run() {
                    while(SkiaPooledImageRegionDecoder.this.decoderPool != null && SkiaPooledImageRegionDecoder.this.allowAdditionalDecoder(SkiaPooledImageRegionDecoder.this.decoderPool.size(), SkiaPooledImageRegionDecoder.this.fileLength)) {
                        try {
                            if(SkiaPooledImageRegionDecoder.this.decoderPool == null) {
                                continue;
                            }
                            SkiaPooledImageRegionDecoder.this.debug("Starting decoder");
                            SkiaPooledImageRegionDecoder.this.initialiseDecoder();
                            SkiaPooledImageRegionDecoder.this.debug("Started decoder, took " + 0L + "ms");
                        }
                        catch(Exception exception0) {
                            SkiaPooledImageRegionDecoder.this.debug("Failed to start decoder: " + exception0.getMessage());
                        }
                    }
                }
            }.start();
        }
    }

    @Override  // com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder
    public void recycle() {
        synchronized(this) {
            this.decoderLock.writeLock().lock();
            try {
                DecoderPool skiaPooledImageRegionDecoder$DecoderPool0 = this.decoderPool;
                if(skiaPooledImageRegionDecoder$DecoderPool0 != null) {
                    skiaPooledImageRegionDecoder$DecoderPool0.recycle();
                    this.decoderPool = null;
                    this.context = null;
                    this.uri = null;
                }
            }
            finally {
                this.decoderLock.writeLock().unlock();
            }
        }
    }

    @Keep
    public static void setDebug(boolean z) {
        SkiaPooledImageRegionDecoder.debug = z;
    }
}

