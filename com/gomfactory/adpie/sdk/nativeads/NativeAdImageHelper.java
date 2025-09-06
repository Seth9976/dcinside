package com.gomfactory.adpie.sdk.nativeads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.gomfactory.adpie.sdk.AdPieSDK;
import com.gomfactory.adpie.sdk.nativeads.util.DownloadImage;
import com.gomfactory.adpie.sdk.nativeads.util.GlideModuleV4;
import com.gomfactory.adpie.sdk.nativeads.util.ImageModuleEventListener;
import com.gomfactory.adpie.sdk.util.AdPieLog;
import java.util.HashMap;

public class NativeAdImageHelper {
    public interface ImageLoadEventListener {
        void onError();

        void onSuccess();
    }

    private static final int IMAGE_DOWNLOAD_ASYNCTASK = 0;
    private static final int IMAGE_DOWNLOAD_GLIDE_V4 = 1;
    public static final String TAG;
    private Context mContext;
    private int mImageDownloadMode;
    private ImageLoadEventListener mImageLoadEventListener;
    private int resourceErrorCnt;
    private int resourceLoadedCnt;
    private int resourceTotalCnt;

    static {
        NativeAdImageHelper.TAG = "NativeAdView";
    }

    public NativeAdImageHelper(Context context0) {
        this.mContext = context0;
        this.mImageDownloadMode = 1;
        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
            AdPieLog.d("NativeAdView", "ImageDownloadMode : " + 1);
        }
    }

    public boolean isResourceReady() {
        return this.resourceTotalCnt > 0 && this.resourceLoadedCnt == this.resourceTotalCnt;
    }

    public void load(HashMap hashMap0, ImageLoadEventListener nativeAdImageHelper$ImageLoadEventListener0) {
        this.mImageLoadEventListener = nativeAdImageHelper$ImageLoadEventListener0;
        this.resourceTotalCnt = 0;
        this.resourceLoadedCnt = 0;
        this.resourceErrorCnt = 0;
        if(hashMap0 != null) {
            try {
                for(Object object0: hashMap0.keySet()) {
                    if(((String)object0) == null) {
                        ImageLoadEventListener nativeAdImageHelper$ImageLoadEventListener1 = this.mImageLoadEventListener;
                        if(nativeAdImageHelper$ImageLoadEventListener1 != null) {
                            nativeAdImageHelper$ImageLoadEventListener1.onError();
                        }
                        return;
                    }
                    ImageView imageView0 = (ImageView)hashMap0.get(((String)object0));
                    if(imageView0 == null) {
                        ImageLoadEventListener nativeAdImageHelper$ImageLoadEventListener2 = this.mImageLoadEventListener;
                        if(nativeAdImageHelper$ImageLoadEventListener2 != null) {
                            nativeAdImageHelper$ImageLoadEventListener2.onError();
                        }
                        return;
                    }
                    this.loadImage(((String)object0), imageView0);
                }
            }
            catch(Exception exception0) {
                if(!AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                    return;
                }
                AdPieLog.e("NativeAdView", exception0);
            }
            finally {
                hashMap0.clear();
            }
            return;
        }
        if(nativeAdImageHelper$ImageLoadEventListener0 != null) {
            nativeAdImageHelper$ImageLoadEventListener0.onError();
        }
    }

    private void loadAsyncImage(ImageView imageView0, String s) {
        AdPieLog.d("NativeAdView", ":::loadImage:::AsyncTask load url : " + s);
        new DownloadImage(imageView0, 3000L, s, new ImageModuleEventListener() {
            @Override  // com.gomfactory.adpie.sdk.nativeads.util.ImageModuleEventListener
            public void onFailedToLoad(String s) {
                if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                    AdPieLog.d("NativeAdView", "AsyncTask onFailedToLoad : " + s);
                }
                NativeAdImageHelper.this.notifyError();
            }

            @Override  // com.gomfactory.adpie.sdk.nativeads.util.ImageModuleEventListener
            public void onLoaded(String s) {
                if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                    AdPieLog.d("NativeAdView", "AsyncTask onLoaded : " + s);
                }
                NativeAdImageHelper.this.notifySuccess();
            }
        }).execute();
    }

    private void loadImage(String s, ImageView imageView0) {
        try {
            ++this.resourceTotalCnt;
            AdPieLog.d("NativeAdView", ":::loadImage:::ImageView width : " + imageView0.getWidth() + ", height : " + imageView0.getHeight());
            if(imageView0.getVisibility() != 0) {
                AdPieLog.d("NativeAdView", String.format("%s", imageView0.getVisibility()) + ", ImageView.getVisibility() != View.VISIBLE");
                return;
            }
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                @Override
                public void run() {
                    try {
                        switch(NativeAdImageHelper.this.mImageDownloadMode) {
                            case 0: {
                                NativeAdImageHelper.this.loadAsyncImage(imageView0, s);
                                return;
                            }
                            case 1: {
                                AdPieLog.d("NativeAdView", ":::loadImage:::Glide (V4) load url : " + s);
                                try {
                                    com.gomfactory.adpie.sdk.nativeads.NativeAdImageHelper.1.1 nativeAdImageHelper$1$10 = new ImageModuleEventListener() {
                                        @Override  // com.gomfactory.adpie.sdk.nativeads.util.ImageModuleEventListener
                                        public void onFailedToLoad(String s) {
                                            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                                                AdPieLog.d("NativeAdView", "Glide V4 onFailedToLoad : " + s);
                                            }
                                            NativeAdImageHelper.this.loadAsyncImage(com.gomfactory.adpie.sdk.nativeads.NativeAdImageHelper.1.this.val$imageView, com.gomfactory.adpie.sdk.nativeads.NativeAdImageHelper.1.this.val$url);
                                        }

                                        @Override  // com.gomfactory.adpie.sdk.nativeads.util.ImageModuleEventListener
                                        public void onLoaded(String s) {
                                            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                                                AdPieLog.d("NativeAdView", "Glide V4 onLoaded : " + s);
                                            }
                                            NativeAdImageHelper.this.notifySuccess();
                                        }
                                    };
                                    new GlideModuleV4(NativeAdImageHelper.this.mContext, imageView0, nativeAdImageHelper$1$10).load(s, 3000L);
                                }
                                catch(NoClassDefFoundError unused_ex) {
                                    break;
                                }
                            }
                        }
                    }
                    catch(Exception exception0) {
                        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                            AdPieLog.e("NativeAdView", exception0);
                        }
                        NativeAdImageHelper.this.notifyError();
                    }
                }
            });
            return;
        }
        catch(Exception exception0) {
        }
        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
            AdPieLog.e("NativeAdView", exception0);
        }
        this.notifyError();
    }

    private void notifyError() {
        int v = this.resourceErrorCnt + 1;
        this.resourceErrorCnt = v;
        if(v == 1) {
            ImageLoadEventListener nativeAdImageHelper$ImageLoadEventListener0 = this.mImageLoadEventListener;
            if(nativeAdImageHelper$ImageLoadEventListener0 != null) {
                nativeAdImageHelper$ImageLoadEventListener0.onError();
            }
        }
    }

    private void notifySuccess() {
        ++this.resourceLoadedCnt;
        if(this.isResourceReady()) {
            ImageLoadEventListener nativeAdImageHelper$ImageLoadEventListener0 = this.mImageLoadEventListener;
            if(nativeAdImageHelper$ImageLoadEventListener0 != null) {
                nativeAdImageHelper$ImageLoadEventListener0.onSuccess();
            }
        }
    }
}

