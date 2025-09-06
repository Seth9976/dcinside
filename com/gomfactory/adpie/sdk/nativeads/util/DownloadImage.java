package com.gomfactory.adpie.sdk.nativeads.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.gomfactory.adpie.sdk.AdPieSDK;
import com.gomfactory.adpie.sdk.util.AdPieLog;
import com.gomfactory.adpie.sdk.util.AsyncTaskUtil;
import com.gomfactory.adpie.sdk.util.MemUtil;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.URL;

public class DownloadImage {
    public static final String TAG = "DownloadImage";
    private Bitmap mBitmap;
    private Handler mHandler;
    private ImageModuleEventListener mImageModuleEventListener;
    private ImageView mImageView;
    private boolean mIsFinished;
    private long mTimeout;
    private String mUrl;

    static {
    }

    public DownloadImage(ImageView imageView0, long v, String s, ImageModuleEventListener imageModuleEventListener0) {
        this.mImageView = imageView0;
        this.mImageModuleEventListener = imageModuleEventListener0;
        this.mTimeout = v;
        this.mUrl = s;
    }

    public void execute() {
        new AsyncTaskUtil() {
            @Override  // com.gomfactory.adpie.sdk.util.AsyncTaskUtil
            public void doInBackground() {
                if(DownloadImage.this.mTimeout > 0L) {
                    Handler handler0 = new Handler(Looper.getMainLooper());
                    DownloadImage.this.mHandler = handler0;
                    DownloadImage.this.mHandler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            if(!DownloadImage.this.mIsFinished) {
                                DownloadImage.this.mIsFinished = true;
                                if(DownloadImage.this.mImageModuleEventListener != null) {
                                    DownloadImage.this.mImageModuleEventListener.onFailedToLoad("Image loading time is delayed.");
                                }
                            }
                        }
                    }, DownloadImage.this.mTimeout);
                }
                try {
                    if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                        AdPieLog.d("DownloadImage", "free memory : " + 0.0f + "(MB), total memory : " + 8192.0f + "(MB)");
                    }
                    URL uRL0 = new URL(DownloadImage.this.mUrl);
                    BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
                    bitmapFactory$Options0.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(FirebasePerfUrlConnection.openStream(uRL0), null, bitmapFactory$Options0);
                    if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                        AdPieLog.d("DownloadImage", "options.outWidth : " + bitmapFactory$Options0.outWidth + ", options.outHeight : " + bitmapFactory$Options0.outHeight);
                    }
                    bitmapFactory$Options0.inSampleSize = bitmapFactory$Options0.outWidth > 1000 ? 2 : 1;
                    if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                        AdPieLog.d("DownloadImage", "inSampleSize : " + bitmapFactory$Options0.inSampleSize);
                    }
                    bitmapFactory$Options0.inJustDecodeBounds = false;
                    Bitmap bitmap0 = BitmapFactory.decodeStream(FirebasePerfUrlConnection.openStream(uRL0), null, bitmapFactory$Options0);
                    DownloadImage.this.mBitmap = bitmap0;
                    if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                        AdPieLog.d("DownloadImage", "#free memory : " + 0.0f + "(MB), total memory : " + 8192.0f + "(MB)");
                        return;
                    }
                    return;
                }
                catch(OutOfMemoryError outOfMemoryError0) {
                }
                catch(Exception exception0) {
                    goto label_33;
                }
                if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                    AdPieLog.d("DownloadImage", "[oom] free memory : " + 0.0f + "(MB), total memory : " + 8192.0f + "(MB)");
                    AdPieLog.e("DownloadImage", new Exception(outOfMemoryError0));
                    MemUtil.printMemoryLog();
                }
                MemUtil.setMemoryError(true);
                return;
            label_33:
                if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                    AdPieLog.e("DownloadImage", exception0);
                }
            }

            @Override  // com.gomfactory.adpie.sdk.util.AsyncTaskUtil
            public void doInUiThread() {
                if(!DownloadImage.this.mIsFinished) {
                    DownloadImage.this.mIsFinished = true;
                    try {
                        if(DownloadImage.this.mBitmap != null) {
                            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                                AdPieLog.d("DownloadImage", "Bitmap size : " + DownloadImage.this.mBitmap.getByteCount() + ", url : " + DownloadImage.this.mUrl);
                            }
                            if(DownloadImage.this.mBitmap.getByteCount() > 0x500000) {
                                if(DownloadImage.this.mImageModuleEventListener != null) {
                                    DownloadImage.this.mImageModuleEventListener.onFailedToLoad("Bitmap size exceeded 5 MB.");
                                }
                                return;
                            }
                            DownloadImage.this.mImageView.setImageBitmap(DownloadImage.this.mBitmap);
                            if(DownloadImage.this.mImageModuleEventListener != null) {
                                DownloadImage.this.mImageModuleEventListener.onLoaded("");
                                return;
                            }
                        }
                        else if(DownloadImage.this.mImageModuleEventListener != null) {
                            DownloadImage.this.mImageModuleEventListener.onFailedToLoad("");
                            return;
                        }
                        return;
                    }
                    catch(Exception exception0) {
                    }
                    if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                        AdPieLog.e("DownloadImage", exception0);
                    }
                    if(DownloadImage.this.mImageModuleEventListener != null) {
                        DownloadImage.this.mImageModuleEventListener.onFailedToLoad("");
                    }
                }
            }
        }.execute();
    }
}

