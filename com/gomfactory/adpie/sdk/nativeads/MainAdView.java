package com.gomfactory.adpie.sdk.nativeads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.TextView;
import com.gomfactory.adpie.sdk.AdPieSDK;
import com.gomfactory.adpie.sdk.event.AdEventListener;
import com.gomfactory.adpie.sdk.util.AdPieLog;
import com.gomfactory.adpie.sdk.videoads.VideoAdData;

public class MainAdView extends FrameLayout {
    private static final int IMAGE_VIEW_MODE = 0;
    public static final String TAG = "MainAdView";
    private static final int VIDEO_VIEW_MODE = 1;
    private Context mContext;
    private ImageView mImageView;
    private VideoAdData mVideoAdData;
    private MainAdVideoView mVideoView;
    private int mViewMode;
    private int spaceHeight;
    private int spaceWidth;

    static {
    }

    public MainAdView(Context context0) {
        super(context0);
        this.spaceWidth = 0;
        this.spaceHeight = 0;
        this.mViewMode = 0;
        this.mContext = context0;
        this.parsingAttribute(null);
    }

    public MainAdView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.spaceWidth = 0;
        this.spaceHeight = 0;
        this.mViewMode = 0;
        this.mContext = context0;
        this.parsingAttribute(attributeSet0);
    }

    public MainAdView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.spaceWidth = 0;
        this.spaceHeight = 0;
        this.mViewMode = 0;
        this.mContext = context0;
        this.parsingAttribute(attributeSet0);
    }

    @TargetApi(21)
    public MainAdView(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.spaceWidth = 0;
        this.spaceHeight = 0;
        this.mViewMode = 0;
        this.mContext = context0;
        this.parsingAttribute(attributeSet0);
    }

    public ImageView getImageView() {
        return this.mImageView;
    }

    public void init(int v, int v1) {
        try {
            this.mViewMode = 0;
            this.spaceWidth = v;
            this.spaceHeight = v1;
            this.privateLog("space width : " + this.spaceWidth + ", space height : " + this.spaceHeight);
            this.privateLog("layout width : " + this.getLayoutParams().width + ", layout height : " + this.getLayoutParams().height);
            MainAdVideoView mainAdVideoView0 = this.mVideoView;
            if(mainAdVideoView0 != null) {
                mainAdVideoView0.setVisibility(8);
            }
            ImageView imageView0 = this.mImageView;
            if(imageView0 != null) {
                imageView0.setVisibility(0);
                return;
            }
            return;
        }
        catch(Exception exception0) {
        }
        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
            AdPieLog.e("MainAdView", exception0);
        }
    }

    public void init(int v, int v1, VideoAdData videoAdData0, AdEventListener adEventListener0) {
        try {
            this.mViewMode = 1;
            if(this.mVideoAdData != videoAdData0) {
                this.mVideoView.setVideoAdData(videoAdData0, adEventListener0);
            }
            this.mVideoAdData = videoAdData0;
            if(v <= 0 || v1 <= 0) {
                this.spaceWidth = 16;
                this.spaceHeight = 9;
            }
            else {
                this.spaceWidth = v;
                this.spaceHeight = v1;
            }
            this.privateLog("space width : " + this.spaceWidth + ", space height : " + this.spaceHeight);
            this.privateLog("layout width : " + this.getLayoutParams().width + ", layout height : " + this.getLayoutParams().height);
            ImageView imageView0 = this.mImageView;
            if(imageView0 != null) {
                imageView0.setVisibility(8);
            }
            MainAdVideoView mainAdVideoView0 = this.mVideoView;
            if(mainAdVideoView0 != null) {
                mainAdVideoView0.setVisibility(0);
                return;
            }
            return;
        }
        catch(Exception exception0) {
        }
        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
            AdPieLog.e("MainAdView", exception0);
        }
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AdPieLog.d("MainAdView", "onAttachedToWindow");
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AdPieLog.d("MainAdView", "onDetachedFromWindow");
    }

    @Override  // android.widget.FrameLayout
    protected void onMeasure(int v, int v1) {
        int v4;
        int v3;
        int v2 = this.mViewMode;
        if(v2 == 0) {
            ImageView imageView0 = this.mImageView;
            if(imageView0 == null) {
                v4 = 0;
                v3 = 0;
            }
            else {
                Drawable drawable0 = imageView0.getDrawable();
                if(drawable0 == null) {
                    v4 = 0;
                    v3 = 0;
                }
                else {
                    v3 = drawable0.getIntrinsicWidth();
                    v4 = drawable0.getIntrinsicHeight();
                }
                if(v3 > 0 && v4 > 0) {
                    this.spaceWidth = v3;
                    this.spaceHeight = v4;
                }
            }
        }
        else if(v2 == 1) {
            MainAdVideoView mainAdVideoView0 = this.mVideoView;
            if(mainAdVideoView0 == null) {
                v4 = 0;
                v3 = 0;
            }
            else {
                v3 = mainAdVideoView0.getVideoWidth();
                v4 = this.mVideoView.getVideoHeight();
                if(v3 > 0 && v4 > 0) {
                    this.spaceWidth = v3;
                    this.spaceHeight = v4;
                }
            }
        }
        else {
            v4 = 0;
            v3 = 0;
        }
        this.privateLog("contentWidth : " + v3 + ", contentHeight : " + v4);
        int v5 = View.getDefaultSize(this.getSuggestedMinimumWidth(), v);
        int v6 = View.getDefaultSize(this.getSuggestedMinimumHeight(), v1);
        this.privateLog("Default Size - width : " + v5 + ", height : " + v6 + ", spaceWidth : " + this.spaceWidth + ", spaceHeight : " + this.spaceHeight);
        int v7 = this.spaceWidth;
        if(v7 > 0) {
            int v8 = this.spaceHeight;
            if(v8 > 0) {
                double f = ((double)v5) / ((double)v7);
                double f1 = ((double)v6) / ((double)v8);
                if(v5 != 0 || v6 != 0) {
                    if(v6 == 0) {
                        v4 = (int)(f * ((double)v8));
                        v3 = v5;
                    }
                    else if(v5 == 0) {
                        v3 = (int)(f1 * ((double)v7));
                        v4 = v6;
                    }
                    else {
                        v4 = (int)(((double)v8) * f);
                        if(v4 > v6) {
                            int v9 = (int)(((double)v7) * f1);
                            if(v9 > v5) {
                                double f2 = f * f1;
                                v3 = (int)(((double)v7) * f2);
                                v4 = (int)(f2 * ((double)v8));
                            }
                            else {
                                v3 = v9;
                                v4 = v6;
                            }
                        }
                        else {
                            v3 = v5;
                        }
                    }
                }
                else if(v3 <= 0 || v4 <= 0) {
                    v3 = v5;
                    v4 = v6;
                }
            }
            else {
                v3 = v5;
                v4 = v6;
            }
        }
        else {
            v3 = v5;
            v4 = v6;
        }
        this.privateLog("NativeMainView - width : " + v3 + ", height : " + v4);
        switch(this.mViewMode) {
            case 0: {
                if(this.mImageView != null) {
                    FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(v3, v4);
                    frameLayout$LayoutParams0.gravity = 17;
                    this.mImageView.setLayoutParams(frameLayout$LayoutParams0);
                }
                if(this.mVideoView != null) {
                    FrameLayout.LayoutParams frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(0, 0);
                    this.mVideoView.setLayoutParams(frameLayout$LayoutParams1);
                }
                break;
            }
            case 1: {
                if(this.mImageView != null) {
                    FrameLayout.LayoutParams frameLayout$LayoutParams2 = new FrameLayout.LayoutParams(0, 0);
                    this.mImageView.setLayoutParams(frameLayout$LayoutParams2);
                }
                if(this.mVideoView != null) {
                    FrameLayout.LayoutParams frameLayout$LayoutParams3 = new FrameLayout.LayoutParams(v3, v4);
                    frameLayout$LayoutParams3.gravity = 17;
                    this.mVideoView.setLayoutParams(frameLayout$LayoutParams3);
                }
            }
        }
        super.onMeasure(v, v1);
    }

    private void parsingAttribute(AttributeSet attributeSet0) {
        this.setBackgroundColor(0);
        this.mViewMode = 0;
        if(this.isInEditMode()) {
            this.setBackgroundColor(Color.parseColor("#EAEAEA"));
            TextView textView0 = new TextView(this.mContext);
            textView0.setTextColor(Color.parseColor("#82D580"));
            textView0.setTextSize(20.0f);
            textView0.setText("AdPie NativeMainView");
            textView0.setGravity(17);
            textView0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.addView(textView0);
            return;
        }
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-2, -2);
        frameLayout$LayoutParams0.gravity = 17;
        ImageView imageView0 = new ImageView(this.mContext);
        this.mImageView = imageView0;
        imageView0.setLayoutParams(frameLayout$LayoutParams0);
        this.addView(this.mImageView);
        this.mImageView.setAdjustViewBounds(true);
        this.mImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        MainAdVideoView mainAdVideoView0 = new MainAdVideoView(this.mContext);
        this.mVideoView = mainAdVideoView0;
        frameLayout$LayoutParams0.width = 100;
        frameLayout$LayoutParams0.height = 100;
        mainAdVideoView0.setLayoutParams(frameLayout$LayoutParams0);
        this.addView(this.mVideoView);
    }

    private void privateLog(String s) {
        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
            AdPieLog.d("MainAdView", (this.mViewMode == 0 ? "[IMAGE] " : "[VIDEO] ") + s);
        }
    }
}

