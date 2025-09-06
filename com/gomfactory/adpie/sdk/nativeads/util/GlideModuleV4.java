package com.gomfactory.adpie.sdk.nativeads.util;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.bumptech.glide.c;
import com.bumptech.glide.load.a;
import com.bumptech.glide.load.engine.q;
import com.bumptech.glide.request.h;
import com.bumptech.glide.request.i;
import com.bumptech.glide.request.target.p;
import java.util.Locale;

public class GlideModuleV4 {
    public static final String TAG = "GlideModuleV4";
    private Context mContext;
    private Handler mHandler;
    private ImageModuleEventListener mImageModuleEventListener;
    private ImageView mImageView;
    private boolean mIsFinished;

    static {
    }

    public GlideModuleV4(Context context0, ImageView imageView0, ImageModuleEventListener imageModuleEventListener0) {
        this.mContext = context0;
        this.mImageView = imageView0;
        this.mImageModuleEventListener = imageModuleEventListener0;
    }

    public void load(String s, long v) {
        try {
            if(v > 0L) {
                Handler handler0 = new Handler(Looper.getMainLooper());
                this.mHandler = handler0;
                handler0.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(!GlideModuleV4.this.mIsFinished) {
                            GlideModuleV4.this.mIsFinished = true;
                            if(GlideModuleV4.this.mImageModuleEventListener != null) {
                                GlideModuleV4.this.mImageModuleEventListener.onFailedToLoad("Image loading time is delayed.");
                            }
                        }
                    }
                }, v);
            }
            c.F(this.mContext).N(s).s1(new h() {
                @Override  // com.bumptech.glide.request.h
                public boolean onLoadFailed(@Nullable q q0, Object object0, p p0, boolean z) {
                    if(!GlideModuleV4.this.mIsFinished) {
                        GlideModuleV4.this.mIsFinished = true;
                        if(GlideModuleV4.this.mImageModuleEventListener != null) {
                            GlideModuleV4.this.mImageModuleEventListener.onFailedToLoad(String.format(Locale.ROOT, ":::loadImage:::Glide onLoadFailed(%s, %s, %s, %s)", q0, object0, p0, Boolean.valueOf(z)));
                        }
                    }
                    return false;
                }

                @Override  // com.bumptech.glide.request.h
                public boolean onResourceReady(Object object0, Object object1, p p0, a a0, boolean z) {
                    if(!GlideModuleV4.this.mIsFinished) {
                        GlideModuleV4.this.mIsFinished = true;
                        if(GlideModuleV4.this.mImageModuleEventListener != null) {
                            GlideModuleV4.this.mImageModuleEventListener.onLoaded(String.format(Locale.ROOT, ":::loadImage:::Glide onResourceReady(%s, %s, %s, %s, %s)", object0, object1, p0, a0, Boolean.valueOf(z)));
                        }
                    }
                    return false;
                }
            }).V0(new i().v0(1200)).q1(this.mImageView);
        }
        catch(Throwable throwable0) {
            ImageModuleEventListener imageModuleEventListener0 = this.mImageModuleEventListener;
            if(imageModuleEventListener0 != null) {
                imageModuleEventListener0.onFailedToLoad("exception : " + throwable0.getMessage());
            }
        }
    }
}

