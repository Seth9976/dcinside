package com.gomfactory.adpie.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Animation;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.gomfactory.adpie.sdk.common.AdData;
import com.gomfactory.adpie.sdk.common.AdResponse;
import com.gomfactory.adpie.sdk.common.Constants;
import com.gomfactory.adpie.sdk.controller.AdController;
import com.gomfactory.adpie.sdk.event.AdEventListener;
import com.gomfactory.adpie.sdk.pref.Preference;
import com.gomfactory.adpie.sdk.ui.AdContentView.AdContentEventListener;
import com.gomfactory.adpie.sdk.ui.AdContentView;
import com.gomfactory.adpie.sdk.util.AdPieLog;
import com.gomfactory.adpie.sdk.util.AnimationUtil;
import com.gomfactory.adpie.sdk.util.DisplayUtil;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

public class AdView extends FrameLayout {
    public interface AdLandingListener {
        void onAdClicked(String arg1);
    }

    public interface AdListener {
        void onAdClicked();

        void onAdFailedToLoad(int arg1);

        void onAdLoaded();
    }

    static enum AdViewState {
        PAUSE,
        RESUME;

        boolean isPause() [...] // 潜在的解密器
    }

    class ReloadTask extends TimerTask {
        @Override
        public void run() {
            AdView adView0 = AdView.this;
            if(adView0 != null) {
                adView0.loadNextAd();
            }
        }
    }

    public static final String TAG = "AdView";
    private AdController mAdController;
    private AdEventListener mAdEventListener;
    private AdLandingListener mAdLandingListener;
    private AdListener mAdListener;
    private Thread mAdThread;
    private AdViewState mAdViewState;
    private int mAnimationType;
    private Context mContext;
    private final Handler mHandler;
    private HashMap mHashMap;
    private boolean mInRecyclerView;
    private boolean mIsAttachedToWindow;
    private boolean mIsAvailableNextAdRequest;
    private boolean mIsEnableAutoBgColor;
    private boolean mIsInForeground;
    private boolean mIsInitialized;
    private boolean mIsLoading;
    private boolean mIsScaleUp;
    private boolean mIsShowingAdContent;
    private boolean mIsSkipLandingUrl;
    private int mNetworkErrorIdx;
    private AdContentView mNextAdContentView;
    private AdContentView mPreAdContentView;
    private AdData mReadyAdData;
    private long mRefreshTime;
    private Timer mReloadTimer;
    private long mResponseInterval;
    private int mScaleOrientation;
    private BroadcastReceiver mScreenStateReceiver;
    private int mServerAdHeight;
    private int mServerAdWidth;
    private String mSlotId;
    private TargetingData mTargetingData;

    static {
    }

    public AdView(Context context0) {
        this(context0, null, 0);
    }

    public AdView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public AdView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mRefreshTime = 10000L;
        this.mReadyAdData = null;
        this.mContext = context0;
        this.parsingAttribute(attributeSet0);
        this.init();
    }

    private void addEventListener() {
        this.mAdEventListener = new AdEventListener() {
            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyAdClicked() {
                AdView.this.mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("AdView", AdView.this.mSlotId + ":::notifyAdClicked");
                        if(AdView.this.mAdListener != null) {
                            AdView.this.mAdListener.onAdClicked();
                        }
                    }
                });
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyAdDismissed() {
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyAdFailedToLoad(int v) {
                com.gomfactory.adpie.sdk.AdView.1.2 adView$1$20 = new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("AdView", AdView.this.mSlotId + ":::notifyAdFailedToLoad:::" + v);
                        AdView.this.mIsAvailableNextAdRequest = true;
                        if(v == 102) {
                            AdView.this.networkError();
                        }
                        else {
                            AdView.this.mNetworkErrorIdx = 0;
                            AdView.this.setRefreshTime(AdView.this.mResponseInterval);
                        }
                        if(v != 106) {
                            AdView.this.mIsLoading = false;
                        }
                        if(AdView.this.mAdListener != null) {
                            AdView.this.mAdListener.onAdFailedToLoad(v);
                        }
                    }
                };
                AdView.this.mHandler.post(adView$1$20);
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyAdLoaded(Object[] arr_object) {
                com.gomfactory.adpie.sdk.AdView.1.1 adView$1$10 = new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("AdView", AdView.this.mSlotId + ":::notifyAdLoaded");
                        AdView.this.mIsAvailableNextAdRequest = true;
                        AdView.this.mNetworkErrorIdx = 0;
                        AdView.this.setRefreshTime(AdView.this.mResponseInterval);
                        AdView.this.mIsLoading = false;
                        if(AdView.this.mAdListener != null) {
                            AdView.this.mAdListener.onAdLoaded();
                        }
                    }
                };
                AdView.this.mHandler.post(adView$1$10);
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyAdShown() {
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyVideoAdCompleted() {
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyVideoAdError() {
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyVideoAdPaused() {
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyVideoAdSkipped() {
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyVideoAdStarted() {
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyVideoAdStopped() {
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void receivedResponse(AdResponse adResponse0) {
                AdPieLog.d("AdView", AdView.this.mSlotId + ":::receivedResponse");
                if(adResponse0 != null) {
                    try {
                        int v = adResponse0.getResult();
                        AdView.this.mResponseInterval = adResponse0.getInterval();
                        Preference.putLong(AdView.this.mContext, "RESPONSE_INTERVAL_" + AdView.this.mSlotId, AdView.this.mResponseInterval);
                        if(v == 0) {
                            if(adResponse0.getCount() == 1) {
                                AdData adData0 = adResponse0.getAdData();
                                if(adData0 != null) {
                                    if(adData0.getIcType() == 11) {
                                        AdPieLog.d("AdView", AdView.this.mSlotId + " - isAttachedToWindow : " + AdView.this.mIsAttachedToWindow + ", isInForeground : " + AdView.this.mIsInForeground + ", CheckView : " + adData0.getCheckView());
                                        if(AdView.this.mIsAttachedToWindow && AdView.this.mIsInForeground || adData0.getCheckView() != 1) {
                                            AdView.this.mReadyAdData = null;
                                            AdView.this.showAdContent(adData0, true);
                                            return;
                                        }
                                        AdView.this.mReadyAdData = adData0;
                                        if(AdView.this.mAdEventListener != null) {
                                            AdView.this.mAdEventListener.notifyAdLoaded(new Object[0]);
                                            return;
                                        }
                                    }
                                    else {
                                        AdPieLog.i("AdView", "\'" + adData0.getIcType() + "\' inventory and contentType are not matched.");
                                        if(AdView.this.mAdEventListener != null) {
                                            AdView.this.mAdEventListener.notifyAdFailedToLoad(104);
                                            return;
                                        }
                                    }
                                }
                                else if(AdView.this.mAdEventListener != null) {
                                    AdView.this.mAdEventListener.notifyAdFailedToLoad(100);
                                    return;
                                }
                            }
                            else if(AdView.this.mAdEventListener != null) {
                                AdView.this.mAdEventListener.notifyAdFailedToLoad(100);
                                return;
                            }
                        }
                        else if(v == 204) {
                            if(AdView.this.mAdEventListener != null) {
                                AdView.this.mAdEventListener.notifyAdFailedToLoad(100);
                                return;
                            }
                        }
                        else if(AdView.this.mAdEventListener != null) {
                            AdView.this.mAdEventListener.notifyAdFailedToLoad(101);
                            return;
                        }
                        return;
                    }
                    catch(Exception exception0) {
                    }
                    if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                        AdPieLog.e("AdView", exception0);
                    }
                    if(AdView.this.mAdEventListener != null) {
                        AdView.this.mAdEventListener.notifyAdFailedToLoad(104);
                    }
                }
            }
        };
    }

    private void animateView() {
        if(this.mNextAdContentView != null) {
            com.gomfactory.adpie.sdk.AdView.6 adView$60 = new Animation.AnimationListener() {
                @Override  // android.view.animation.Animation$AnimationListener
                public void onAnimationEnd(Animation animation0) {
                    if(AdView.this.mPreAdContentView != null) {
                        AdView.this.mPreAdContentView.clearAnimation();
                        AdView adView0 = AdView.this;
                        if(adView0 == null) {
                            return;
                        }
                        adView0.post(new Runnable() {
                            @Override
                            public void run() {
                                try {
                                    if(AdView.this.mPreAdContentView != null) {
                                        AdView.this.mPreAdContentView.setVisibility(8);
                                        AdView.this.removeView(AdView.this.mPreAdContentView);
                                        AdView.this.mPreAdContentView.onDestroy();
                                        AdView.this.mPreAdContentView = null;
                                    }
                                }
                                catch(Exception unused_ex) {
                                }
                            }
                        });
                    }
                }

                @Override  // android.view.animation.Animation$AnimationListener
                public void onAnimationRepeat(Animation animation0) {
                }

                @Override  // android.view.animation.Animation$AnimationListener
                public void onAnimationStart(Animation animation0) {
                }
            };
            Animation animation0 = AnimationUtil.getShowAnimation(this.mAnimationType, this.mNextAdContentView);
            animation0.setAnimationListener(adView$60);
            this.mNextAdContentView.startAnimation(animation0);
        }
        AdContentView adContentView0 = this.mPreAdContentView;
        if(adContentView0 != null) {
            Animation animation1 = AnimationUtil.getHideAnimation(this.mAnimationType, adContentView0);
            this.mPreAdContentView.startAnimation(animation1);
        }
    }

    public void destroy() {
        AdPieLog.d("AdView", this.mSlotId + ":::destroy");
        this.release();
    }

    public String getSlotId() {
        return this.mSlotId;
    }

    private void init() {
        AdPieLog.d("AdView", this.mSlotId + ":::init");
        if(this.isInEditMode()) {
            return;
        }
        this.addEventListener();
        this.mAdController = new AdController(this.mContext, this.mAdEventListener);
        this.mIsInitialized = true;
        this.mNetworkErrorIdx = 0;
        this.mIsAvailableNextAdRequest = false;
        this.mIsShowingAdContent = false;
        this.mAdViewState = AdViewState.RESUME;
    }

    private boolean isDeviceInteractive() {
        try {
            return ((PowerManager)this.mContext.getSystemService("power")).isInteractive();
        }
        catch(Exception exception0) {
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.e("AdView", exception0);
            }
            return true;
        }
    }

    private void layoutScale(View view0, float f) {
        float f1;
        try {
            int v = this.mContext.getResources().getConfiguration().orientation;
            int v1 = this.mScaleOrientation;
            if(v1 == 1 && v != 1) {
                f1 = 1.0f;
            }
            else if(v1 != 2 || v == 2) {
                f1 = 0.0f;
            }
            else {
                f1 = 1.0f;
            }
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.d("AdView", "orientation : " + v + ", scale orientation : " + this.mScaleOrientation);
            }
            if(f1 == 1.0f) {
                f = 1.0f;
            }
            else if(Float.isInfinite(f) || Float.isNaN(f) || f <= 1.0f) {
                f = 1.0f;
            }
            else if(f > 2.0f) {
                f = 2.0f;
            }
            int v2 = (int)(((float)this.mServerAdWidth) * this.mContext.getResources().getDisplayMetrics().density * f);
            int v3 = (int)(((float)this.mServerAdHeight) * this.mContext.getResources().getDisplayMetrics().density * f);
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.d("AdView", "scale : " + f + ", width : " + v2 + ", height : " + v3);
            }
            if(f <= 1.0f) {
                AdPieLog.d("AdView", "It can\'t scale up AdView.");
                view0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                view0.setScaleX(1.0f);
                view0.setScaleY(1.0f);
                return;
            }
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
            frameLayout$LayoutParams0.width = v2;
            frameLayout$LayoutParams0.height = v3;
            frameLayout$LayoutParams0.gravity = 17;
            view0.setLayoutParams(frameLayout$LayoutParams0);
            view0.setScaleX(f);
            view0.setScaleY(f);
            return;
        }
        catch(Exception exception0) {
        }
        AdPieLog.e("AdView", exception0);
    }

    // 检测为 Lambda 实现
    public void load() [...]

    public void load(TargetingData targetingData0) {
        this.mTargetingData = targetingData0;
        this.load();
    }

    private void loadNextAd() {
        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
            AdPieLog.d("AdView", "Preparing to load next ads.");
        }
        com.gomfactory.adpie.sdk.AdView.4 adView$40 = () -> {
            try {
                if(AdView.this.mIsLoading) {
                    AdPieLog.d("AdView", "AdPie (" + AdView.this.mSlotId + ") is already loading an ad. Wait for previous load to finish.");
                    AdEventListener adEventListener0 = AdView.this.mAdEventListener;
                    if(adEventListener0 != null) {
                        adEventListener0.notifyAdFailedToLoad(106);
                        return;
                    }
                    return;
                }
                AdView.this.mIsLoading = true;
                Thread thread0 = AdView.this.mAdThread;
                if(thread0 != null) {
                    thread0.interrupt();
                    AdView.this.mAdThread = null;
                }
                Thread thread1 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            AdPieLog.d("AdView", AdView.this.mSlotId + ":::load");
                            if(!TextUtils.isEmpty(AdView.this.mSlotId)) {
                                long v = Preference.getLongValue(AdView.this.mContext, "RESPONSE_INTERVAL_" + AdView.this.mSlotId, 0L);
                                AdView.this.mResponseInterval = v;
                            }
                            if(!AdView.this.mIsInitialized) {
                                AdView.this.init();
                            }
                            AdView.this.mAdController.setSlotID(AdView.this.mSlotId);
                            AdView.this.mAdController.setTargetingData(AdView.this.mTargetingData);
                            AdView.this.mAdController.loadAd(AdView.this.mHashMap);
                            return;
                        }
                        catch(Exception exception0) {
                        }
                        AdPieLog.e("AdView", exception0);
                        if(AdView.this.mAdEventListener != null) {
                            AdView.this.mAdEventListener.notifyAdFailedToLoad(104);
                        }
                    }
                });
                AdView.this.mAdThread = thread1;
                thread1.start();
                return;
            }
            catch(Exception exception0) {
            }
            AdPieLog.e("AdView", exception0);
            AdEventListener adEventListener1 = AdView.this.mAdEventListener;
            if(adEventListener1 != null) {
                adEventListener1.notifyAdFailedToLoad(104);
            }
        };
        this.mHandler.post(adView$40);

        class com.gomfactory.adpie.sdk.AdView.4 implements Runnable {
            @Override
            public void run() {
                AdView.this.load();
            }
        }

    }

    private void networkError() {
        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
            AdPieLog.d("AdView", "networkError");
        }
        this.stopReloadTimer();
        if(this.mNetworkErrorIdx < 0 || this.mNetworkErrorIdx > Constants.NETWORK_INTERVAL.length - 1) {
            this.mNetworkErrorIdx = 0;
        }
        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
            AdPieLog.d("AdView", "NetworkErrorIdx : " + this.mNetworkErrorIdx);
        }
        int v = this.mNetworkErrorIdx;
        long v1 = (long)Constants.NETWORK_INTERVAL[v];
        this.mNetworkErrorIdx = v + 1;
        AdPieLog.d("AdView", "networkError setRefreshTime : " + v1);
        this.mRefreshTime = v1;
        this.startReloadTimer();
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AdPieLog.d("AdView", this.mSlotId + ":::onAttachedToWindow");
        this.mIsAttachedToWindow = true;
        this.registerBroadcastReceiver();
    }

    @Override  // android.view.View
    protected void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        AdPieLog.d("AdView", this.mSlotId + ":::onDetachedFromWindow");
        this.mIsAttachedToWindow = false;
        this.unregisterBroadcastReceiver();
        if(!this.mInRecyclerView) {
            this.release();
        }
        super.onDetachedFromWindow();
    }

    @Override  // android.widget.FrameLayout
    protected void onMeasure(int v, int v1) {
        if(this.mIsScaleUp) {
            try {
                int v2 = View.getDefaultSize(this.getSuggestedMinimumWidth(), v);
                int v3 = View.getDefaultSize(this.getSuggestedMinimumHeight(), v1);
                if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                    AdPieLog.d("AdView", "onMeasure - width : " + v2 + ", height : " + v3);
                }
                float f = ((float)this.mServerAdWidth) * this.mContext.getResources().getDisplayMetrics().density;
                float f1 = ((float)this.mServerAdHeight) * this.mContext.getResources().getDisplayMetrics().density;
                if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                    AdPieLog.d("AdView", "onMeasure - adWidthPx : " + f + ", adHeightPx : " + f1);
                }
                if(f > 0.0f && f1 > 0.0f) {
                    float f2 = ((float)v2) / f;
                    float f3 = ((float)v3) / f1;
                    float f4 = Math.min(f2, f3) != 0.0f || v3 != 0 ? Math.min(f2, f3) : f2;
                    if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                        AdPieLog.d("AdView", "onMeasure - widthRatio : " + f2 + ", heightRatio : " + f3 + ", ratio : " + f4);
                    }
                    if(!Float.isInfinite(f4) && !Float.isNaN(f4)) {
                        for(int v4 = 0; true; ++v4) {
                            if(v4 >= this.getChildCount()) {
                                break;
                            }
                            this.layoutScale(this.getChildAt(v4), f4);
                        }
                    }
                }
                goto label_25;
            }
            catch(Exception exception0) {
            }
            if(!AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                goto label_25;
            }
            AdPieLog.e("AdView", exception0);
        }
    label_25:
        super.onMeasure(v, v1);
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
    }

    @Override  // android.view.View
    protected void onWindowVisibilityChanged(int v) {
        if(this.mAdController == null) {
            return;
        }
        if(v == 0) {
            this.mIsInForeground = true;
            AdData adData0 = this.mReadyAdData;
            if(adData0 != null) {
                this.showAdContent(adData0, false);
                this.mReadyAdData = null;
                this.mNetworkErrorIdx = 0;
                this.setRefreshTime(this.mResponseInterval);
            }
            this.resume();
        }
        else {
            this.mIsInForeground = false;
            this.pause();
        }
        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
            AdPieLog.d("AdView", "AdView onWindowVisibilityChanged(" + v + "): " + (v == 0 ? "VISIBLE" : "INVISIBLE"));
        }
    }

    private void parsingAttribute(AttributeSet attributeSet0) {
        this.setBackgroundColor(0);
        if(this.isInEditMode()) {
            this.setBackgroundColor(Color.parseColor("#EAEAEA"));
            TextView textView0 = new TextView(this.mContext);
            textView0.setTextColor(Color.parseColor("#82D580"));
            textView0.setTextSize(20.0f);
            textView0.setText("AdPie Banner");
            textView0.setGravity(17);
            textView0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.addView(textView0);
            return;
        }
        if(attributeSet0 != null) {
            try {
                this.mSlotId = attributeSet0.getAttributeValue(null, "slotID");
            }
            catch(Exception exception0) {
                AdPieLog.e("AdView", exception0);
            }
        }
    }

    private void pause() {
        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
            AdPieLog.d("AdView", this.mSlotId + ":::pause");
        }
        this.mAdViewState = AdViewState.PAUSE;
        this.stopReloadTimer();
    }

    private void registerBroadcastReceiver() {
        try {
            this.mScreenStateReceiver = new BroadcastReceiver() {
                @Override  // android.content.BroadcastReceiver
                public void onReceive(Context context0, Intent intent0) {
                    if(intent0.getAction().equals("android.intent.action.SCREEN_OFF")) {
                        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                            AdPieLog.d("AdView", "Intent.ACTION_SCREEN_OFF : " + AdView.this.mIsInForeground);
                        }
                        if(AdView.this.mIsInForeground) {
                            AdView.this.pause();
                        }
                    }
                    else if(intent0.getAction().equals("android.intent.action.SCREEN_ON")) {
                        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                            AdPieLog.d("AdView", "Intent.ACTION_SCREEN_ON : " + AdView.this.mIsInForeground);
                        }
                        if(AdView.this.mIsInForeground) {
                            AdView.this.resume();
                        }
                    }
                    else if(intent0.getAction().equals("android.intent.action.USER_PRESENT")) {
                        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                            AdPieLog.d("AdView", "Intent.ACTION_USER_PRESENT : " + AdView.this.mIsInForeground);
                        }
                        if(AdView.this.mIsInForeground) {
                            AdView.this.resume();
                        }
                    }
                }
            };
            IntentFilter intentFilter0 = new IntentFilter();
            intentFilter0.addAction("android.intent.action.SCREEN_OFF");
            intentFilter0.addAction("android.intent.action.SCREEN_ON");
            intentFilter0.addAction("android.intent.action.USER_PRESENT");
            this.mContext.registerReceiver(this.mScreenStateReceiver, intentFilter0);
        }
        catch(Exception exception0) {
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.e("AdView", exception0);
            }
        }
    }

    private void release() {
        this.removeAllViews();
        this.pause();
        AdContentView adContentView0 = this.mPreAdContentView;
        if(adContentView0 != null) {
            adContentView0.onDestroy();
            this.mPreAdContentView = null;
        }
        AdContentView adContentView1 = this.mNextAdContentView;
        if(adContentView1 != null) {
            adContentView1.onDestroy();
            this.mNextAdContentView = null;
        }
        AdController adController0 = this.mAdController;
        if(adController0 != null) {
            adController0.destroy();
            this.mAdController = null;
        }
        this.removeEventListener();
        this.mIsInitialized = false;
        Thread thread0 = this.mAdThread;
        if(thread0 != null) {
            thread0.interrupt();
            this.mAdThread = null;
        }
        HashMap hashMap0 = this.mHashMap;
        if(hashMap0 != null) {
            hashMap0.clear();
            this.mHashMap = null;
        }
    }

    private void removeEventListener() {
        this.mAdEventListener = null;
    }

    // 去混淆评级： 低(20)
    private void resume() {
        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
            AdPieLog.d("AdView", this.mSlotId + ":::resume");
        }
    }

    public void setAdLandingListener(AdLandingListener adView$AdLandingListener0) {
        this.mAdLandingListener = adView$AdLandingListener0;
    }

    public void setAdListener(AdListener adView$AdListener0) {
        this.mAdListener = adView$AdListener0;
    }

    public void setAutoBgColor(boolean z) {
        this.mIsEnableAutoBgColor = z;
    }

    public void setExtraParameter(String s, String s1) {
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1) && s.equals("floorPrice")) {
            if(this.mHashMap == null) {
                this.mHashMap = new HashMap();
            }
            this.mHashMap.put("bidfloor", s1);
            this.mHashMap.put("bidfloorcur", "USD");
        }
    }

    public void setInRecyclerView(boolean z) {
        this.mInRecyclerView = z;
    }

    public void setLandingEnabled(boolean z) {
        this.mIsSkipLandingUrl = !z;
    }

    private void setRefreshTime(long v) {
        if(v > 0L && v < 10000L) {
            this.mRefreshTime = 10000L;
        }
        else if(v > 300000L) {
            this.mRefreshTime = 300000L;
        }
        else {
            this.mRefreshTime = v;
        }
        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
            AdPieLog.d("AdView", "setRefreshTime : " + v + " -> " + this.mRefreshTime);
        }
        this.stopReloadTimer();
        this.startReloadTimer();
    }

    public void setScaleUp(boolean z) {
        this.mIsScaleUp = z;
        this.mScaleOrientation = 1;
    }

    public void setScaleUp(boolean z, int v) {
        this.mIsScaleUp = z;
        this.mScaleOrientation = v;
    }

    public void setSlotId(String s) {
        this.mSlotId = s;
    }

    private void showAdContent(AdData adData0, boolean z) {
        AdPieLog.d("AdView", this.mSlotId + ":::showAdContent(" + z + ") - start");
        this.mServerAdWidth = adData0.getContentWidth();
        this.mServerAdHeight = adData0.getContentHeight();
        this.mAnimationType = adData0.getAnimationType();
        int v = adData0.getIcType();
        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
            AdPieLog.d("AdView", "mServerAdWidth : " + DisplayUtil.dpToPx(this.mContext, this.mServerAdWidth) + "(px), " + this.mServerAdWidth + "(dp), mServerAdHeight : " + DisplayUtil.dpToPx(this.mContext, this.mServerAdHeight) + "(px), " + this.mServerAdHeight + "(dp)");
        }
        if(AdPieSDK.getInstance().getNetworkConnectionType() == 0) {
            if(z) {
                AdEventListener adEventListener0 = this.mAdEventListener;
                if(adEventListener0 != null) {
                    adEventListener0.notifyAdFailedToLoad(103);
                }
            }
            return;
        }
        if(!this.mIsShowingAdContent) {
            this.mIsShowingAdContent = true;
            if(this.getContext() == null) {
                if(z) {
                    AdEventListener adEventListener1 = this.mAdEventListener;
                    if(adEventListener1 != null) {
                        adEventListener1.notifyAdFailedToLoad(107);
                    }
                }
                return;
            }
            AdContentView adContentView0 = new AdContentView(this.getContext(), new AdContentEventListener() {
                private boolean isViewLoaded;

                @Override  // com.gomfactory.adpie.sdk.ui.AdContentView$AdContentEventListener
                public void onViewClicked() {
                    AdPieLog.d("AdView", AdView.this.mSlotId + ":::onViewClicked");
                    if(AdView.this.mAdEventListener != null) {
                        AdView.this.mAdEventListener.notifyAdClicked();
                    }
                }

                @Override  // com.gomfactory.adpie.sdk.ui.AdContentView$AdContentEventListener
                public void onViewClicked(String s) {
                    AdPieLog.d("AdView", AdView.this.mSlotId + ":::onViewClicked");
                    if(AdView.this.mAdLandingListener != null) {
                        com.gomfactory.adpie.sdk.AdView.3.2 adView$3$20 = new Runnable() {
                            @Override
                            public void run() {
                                AdPieLog.d("AdView", AdView.this.mSlotId + ":::notifyAdClicked->" + s);
                                if(AdView.this.mAdLandingListener != null) {
                                    AdView.this.mAdLandingListener.onAdClicked(s);
                                }
                            }
                        };
                        AdView.this.mHandler.post(adView$3$20);
                    }
                }

                @Override  // com.gomfactory.adpie.sdk.ui.AdContentView$AdContentEventListener
                public void onViewLoadTimeout(AdContentView adContentView0) {
                    AdPieLog.d("AdView", AdView.this.mSlotId + ":::onViewLoadTimeout");
                    AdView.this.mIsShowingAdContent = false;
                    if(adContentView0 != null) {
                        try {
                            AdView.this.removeView(adContentView0);
                            adContentView0.onDestroy();
                        }
                        catch(Exception exception0) {
                            AdPieLog.e("AdView", exception0);
                        }
                    }
                    if(z && AdView.this.mAdEventListener != null) {
                        AdView.this.mAdEventListener.notifyAdFailedToLoad(107);
                    }
                }

                @Override  // com.gomfactory.adpie.sdk.ui.AdContentView$AdContentEventListener
                public void onViewLoaded(AdContentView adContentView0) {
                    AdPieLog.d("AdView", AdView.this.mSlotId + ":::onViewLoaded");
                    AdView.this.mIsShowingAdContent = false;
                    if(!this.isViewLoaded) {
                        this.isViewLoaded = true;
                        if(z && AdView.this.mAdEventListener != null) {
                            AdView.this.mAdEventListener.notifyAdLoaded(new Object[0]);
                        }
                        try {
                            if(AdView.this.mPreAdContentView != null) {
                                AdView.this.mPreAdContentView.setVisibility(8);
                                AdView.this.removeView(AdView.this.mPreAdContentView);
                                AdView.this.mPreAdContentView.onDestroy();
                                AdView.this.mPreAdContentView = null;
                            }
                            AdView.this.mPreAdContentView = AdView.this.mNextAdContentView;
                            AdView.this.mNextAdContentView = adContentView0;
                            if(v == 11) {
                                if(!AdView.this.mIsScaleUp && AdView.this.mIsEnableAutoBgColor) {
                                    if(AdView.this.mNextAdContentView != null) {
                                        AdView.this.mNextAdContentView.setVisibility(4);
                                    }
                                    com.gomfactory.adpie.sdk.AdView.3.1 adView$3$10 = new Runnable() {
                                        @Override
                                        public void run() {
                                            if(AdView.this.mNextAdContentView != null) {
                                                AdView.this.mNextAdContentView.drawBackgroundColor(com.gomfactory.adpie.sdk.AdView.3.this.val$isCallback);
                                                AdView.this.mNextAdContentView.setVisibility(0);
                                            }
                                            AdView.this.animateView();
                                        }
                                    };
                                    AdView.this.mHandler.postDelayed(adView$3$10, 350L);
                                    return;
                                }
                                if(AdView.this.mNextAdContentView != null) {
                                    AdView.this.mNextAdContentView.setVisibility(0);
                                }
                                AdView.this.animateView();
                                return;
                            }
                            if(AdView.this.mNextAdContentView != null) {
                                AdView.this.mNextAdContentView.setVisibility(0);
                            }
                            AdView.this.animateView();
                            return;
                        }
                        catch(Exception exception0) {
                        }
                        AdPieLog.e("AdView", exception0);
                    }
                }
            });
            adContentView0.setVisibility(8);
            this.addView(adContentView0);
            adContentView0.setSkipLandingUrl(this.mIsSkipLandingUrl);
            adContentView0.setAdData(adData0);
            adContentView0.showContent();
            AdPieLog.d("AdView", this.mSlotId + ":::showAdContent(" + z + ") - end");
            return;
        }
        AdPieLog.d("AdView", "Previous ad content is showing.");
        if(z) {
            AdEventListener adEventListener2 = this.mAdEventListener;
            if(adEventListener2 != null) {
                adEventListener2.notifyAdFailedToLoad(107);
            }
        }
    }

    private void startReloadTimer() {
        if(!this.mIsAvailableNextAdRequest) {
            return;
        }
        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
            AdPieLog.d("AdView", "startReloadTimer (mResponseInterval : " + this.mResponseInterval + ", mRefreshTime : " + this.mRefreshTime + ")");
        }
        if(this.mResponseInterval != 0L && this.mRefreshTime >= 10000L) {
            if(!this.mIsAttachedToWindow) {
                if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                    AdPieLog.d("AdView", "AdView not yet attached to window.");
                }
                return;
            }
            if(this.mReloadTimer == null) {
                this.mReloadTimer = new Timer();
            }
            ReloadTask adView$ReloadTask0 = new ReloadTask(this);
            this.mReloadTimer.schedule(adView$ReloadTask0, this.mRefreshTime);
            return;
        }
        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
            AdPieLog.d("AdView", "AdView refresh is disable.");
        }
    }

    private void stopReloadTimer() {
        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
            AdPieLog.d("AdView", "stopReloadTimer");
        }
        Timer timer0 = this.mReloadTimer;
        if(timer0 == null) {
            return;
        }
        timer0.cancel();
        this.mReloadTimer = null;
    }

    private void unregisterBroadcastReceiver() {
        try {
            this.mContext.unregisterReceiver(this.mScreenStateReceiver);
        }
        catch(Exception exception0) {
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.e("AdView", exception0);
            }
        }
    }
}

