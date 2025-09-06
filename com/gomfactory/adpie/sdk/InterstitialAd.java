package com.gomfactory.adpie.sdk;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.gomfactory.adpie.sdk.common.AdData;
import com.gomfactory.adpie.sdk.common.AdResponse;
import com.gomfactory.adpie.sdk.controller.AdController;
import com.gomfactory.adpie.sdk.event.AdEventListener;
import com.gomfactory.adpie.sdk.ui.webview.AdWebView.WebViewEventListener;
import com.gomfactory.adpie.sdk.ui.webview.AdWebView;
import com.gomfactory.adpie.sdk.util.AdPieLog;
import com.gomfactory.adpie.sdk.videoads.FinishState;
import com.gomfactory.adpie.sdk.videoads.VideoAdPlaybackListener;
import java.util.HashMap;

public class InterstitialAd {
    public interface InterstitialAdListener {
        void onAdClicked();

        void onAdDismissed();

        void onAdFailedToLoad(int arg1);

        void onAdLoaded();

        void onAdShown();
    }

    static enum InterstitialState {
        NOT_READY,
        READY,
        SHOW;

        boolean isReady() [...] // 潜在的解密器
    }

    public static final String TAG = "InterstitialAd";
    private AdData adData;
    private boolean initialized;
    private AdController mAdController;
    private AdEventListener mAdEventListener;
    private Thread mAdThread;
    private AdWebView mAdWebView;
    private Context mContext;
    private final Handler mHandler;
    private HashMap mHashMap;
    private InterstitialAdListener mInterstitialAdListener;
    private InterstitialState mInterstitialState;
    private boolean mIsLoading;
    private String mSlotId;
    private TargetingData mTargetingData;
    private VideoAdPlaybackListener mVideoAdPlaybackListener;

    static {
    }

    public InterstitialAd(Context context0, String s) {
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mContext = context0;
        this.mInterstitialAdListener = null;
        this.mVideoAdPlaybackListener = null;
        this.mSlotId = s;
        this.mInterstitialState = InterstitialState.NOT_READY;
        this.init();
    }

    private void addEventListener() {
        this.mAdEventListener = new AdEventListener() {
            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyAdClicked() {
                InterstitialAd.this.mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("InterstitialAd", InterstitialAd.this.mSlotId + ":::notifyAdClicked");
                        if(InterstitialAd.this.mInterstitialAdListener != null) {
                            InterstitialAd.this.mInterstitialAdListener.onAdClicked();
                        }
                    }
                });
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyAdDismissed() {
                com.gomfactory.adpie.sdk.InterstitialAd.1.4 interstitialAd$1$40 = new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("InterstitialAd", InterstitialAd.this.mSlotId + ":::notifyAdDismissed");
                        InterstitialAd.this.mInterstitialState = InterstitialState.NOT_READY;
                        if(InterstitialAd.this.mInterstitialAdListener != null) {
                            InterstitialAd.this.mInterstitialAdListener.onAdDismissed();
                        }
                    }
                };
                InterstitialAd.this.mHandler.post(interstitialAd$1$40);
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyAdFailedToLoad(int v) {
                com.gomfactory.adpie.sdk.InterstitialAd.1.2 interstitialAd$1$20 = new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("InterstitialAd", InterstitialAd.this.mSlotId + ":::notifyAdFailedToLoad:::" + v);
                        InterstitialAd.this.mInterstitialState = InterstitialState.NOT_READY;
                        InterstitialAd.this.adData = null;
                        if(v != 106) {
                            InterstitialAd.this.mIsLoading = false;
                        }
                        if(InterstitialAd.this.mInterstitialAdListener != null) {
                            InterstitialAd.this.mInterstitialAdListener.onAdFailedToLoad(v);
                        }
                    }
                };
                InterstitialAd.this.mHandler.post(interstitialAd$1$20);
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyAdLoaded(Object[] arr_object) {
                com.gomfactory.adpie.sdk.InterstitialAd.1.1 interstitialAd$1$10 = new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("InterstitialAd", InterstitialAd.this.mSlotId + ":::notifyAdLoaded");
                        InterstitialAd.this.mIsLoading = false;
                        if(InterstitialAd.this.mInterstitialAdListener != null) {
                            InterstitialAd.this.mInterstitialAdListener.onAdLoaded();
                        }
                    }
                };
                InterstitialAd.this.mHandler.post(interstitialAd$1$10);
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyAdShown() {
                com.gomfactory.adpie.sdk.InterstitialAd.1.3 interstitialAd$1$30 = new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("InterstitialAd", InterstitialAd.this.mSlotId + ":::notifyAdShown");
                        InterstitialAd.this.mInterstitialState = InterstitialState.SHOW;
                        if(InterstitialAd.this.mInterstitialAdListener != null) {
                            InterstitialAd.this.mInterstitialAdListener.onAdShown();
                        }
                    }
                };
                InterstitialAd.this.mHandler.post(interstitialAd$1$30);
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyVideoAdCompleted() {
                com.gomfactory.adpie.sdk.InterstitialAd.1.9 interstitialAd$1$90 = new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("InterstitialAd", InterstitialAd.this.mSlotId + ":::notifyVideoAdCompleted");
                        if(InterstitialAd.this.mVideoAdPlaybackListener != null) {
                            InterstitialAd.this.mVideoAdPlaybackListener.onVideoFinished(FinishState.COMPLETED);
                        }
                    }
                };
                InterstitialAd.this.mHandler.post(interstitialAd$1$90);
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyVideoAdError() {
                com.gomfactory.adpie.sdk.InterstitialAd.1.8 interstitialAd$1$80 = new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("InterstitialAd", InterstitialAd.this.mSlotId + ":::notifyVideoAdError");
                        if(InterstitialAd.this.mVideoAdPlaybackListener != null) {
                            InterstitialAd.this.mVideoAdPlaybackListener.onVideoFinished(FinishState.ERROR);
                        }
                    }
                };
                InterstitialAd.this.mHandler.post(interstitialAd$1$80);
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyVideoAdPaused() {
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyVideoAdSkipped() {
                com.gomfactory.adpie.sdk.InterstitialAd.1.7 interstitialAd$1$70 = new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("InterstitialAd", InterstitialAd.this.mSlotId + ":::notifyVideoAdSkipped");
                        if(InterstitialAd.this.mVideoAdPlaybackListener != null) {
                            InterstitialAd.this.mVideoAdPlaybackListener.onVideoFinished(FinishState.SKIPPED);
                        }
                    }
                };
                InterstitialAd.this.mHandler.post(interstitialAd$1$70);
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyVideoAdStarted() {
                com.gomfactory.adpie.sdk.InterstitialAd.1.6 interstitialAd$1$60 = new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("InterstitialAd", InterstitialAd.this.mSlotId + ":::notifyVideoAdStarted");
                        if(InterstitialAd.this.mVideoAdPlaybackListener != null) {
                            InterstitialAd.this.mVideoAdPlaybackListener.onVideoAdStarted();
                        }
                    }
                };
                InterstitialAd.this.mHandler.post(interstitialAd$1$60);
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyVideoAdStopped() {
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void receivedResponse(AdResponse adResponse0) {
                AdPieLog.d("InterstitialAd", InterstitialAd.this.mSlotId + ":::receivedResponse");
                if(adResponse0 != null) {
                    try {
                        int v = adResponse0.getResult();
                        if(v == 0) {
                            if(adResponse0.getCount() == 1) {
                                InterstitialAd.this.adData = adResponse0.getAdData();
                                if(InterstitialAd.this.adData != null) {
                                    switch(InterstitialAd.this.adData.getIcType()) {
                                        case 21: {
                                            String s = InterstitialAd.this.adData.getAdmImageTag();
                                            if(!TextUtils.isEmpty(s)) {
                                                InterstitialAd.this.preloadHtml(s);
                                                return;
                                            }
                                            InterstitialAd.this.preloadHtml("");
                                            return;
                                        }
                                        case 22: {
                                            InterstitialAd.this.preloadResource();
                                            return;
                                        }
                                    }
                                    AdPieLog.i("InterstitialAd", "\'" + InterstitialAd.this.adData.getIcType() + "\' inventory and contentType are not matched.");
                                    if(InterstitialAd.this.mAdEventListener != null) {
                                        InterstitialAd.this.mAdEventListener.notifyAdFailedToLoad(108);
                                        return;
                                    }
                                }
                                else if(InterstitialAd.this.mAdEventListener != null) {
                                    InterstitialAd.this.mAdEventListener.notifyAdFailedToLoad(100);
                                    return;
                                }
                            }
                            else if(InterstitialAd.this.mAdEventListener != null) {
                                InterstitialAd.this.mAdEventListener.notifyAdFailedToLoad(100);
                                return;
                            }
                        }
                        else if(v == 204) {
                            if(InterstitialAd.this.mAdEventListener != null) {
                                InterstitialAd.this.mAdEventListener.notifyAdFailedToLoad(100);
                                return;
                            }
                        }
                        else if(InterstitialAd.this.mAdEventListener != null) {
                            InterstitialAd.this.mAdEventListener.notifyAdFailedToLoad(101);
                            return;
                        }
                        return;
                    }
                    catch(Exception exception0) {
                    }
                    if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                        AdPieLog.e("InterstitialAd", exception0);
                    }
                    if(InterstitialAd.this.mAdEventListener != null) {
                        InterstitialAd.this.mAdEventListener.notifyAdFailedToLoad(104);
                    }
                }
            }
        };
    }

    public void destroy() {
        AdPieLog.d("InterstitialAd", this.mSlotId + ":::destroy");
        AdController adController0 = this.mAdController;
        if(adController0 != null) {
            adController0.destroy();
            this.mAdController = null;
        }
        this.removeEventListener();
        Thread thread0 = this.mAdThread;
        if(thread0 != null) {
            thread0.interrupt();
            this.mAdThread = null;
        }
        AdWebView adWebView0 = this.mAdWebView;
        if(adWebView0 != null) {
            adWebView0.setWebViewEventListener(null);
            this.mAdWebView.destroy();
            this.mAdWebView = null;
        }
        HashMap hashMap0 = this.mHashMap;
        if(hashMap0 != null) {
            hashMap0.clear();
            this.mHashMap = null;
        }
    }

    public InterstitialAdListener getAdListener() {
        return this.mInterstitialAdListener;
    }

    private void init() {
        AdPieLog.d("InterstitialAd", this.mSlotId + ":::init");
        try {
            Class.forName("androidx.localbroadcastmanager.content.LocalBroadcastManager");
        }
        catch(ClassNotFoundException classNotFoundException0) {
            AdPieLog.e("InterstitialAd", classNotFoundException0);
            return;
        }
        this.addEventListener();
        this.mAdController = new AdController(this.mContext, this.mAdEventListener);
        this.initialized = true;
    }

    // 去混淆评级： 低(20)
    public boolean isLoaded() {
        return false;
    }

    public void load() {
        try {
            if(this.mIsLoading) {
                AdPieLog.d("InterstitialAd", "AdPie (" + this.mSlotId + ") is already loading an ad. Wait for previous load to finish.");
                AdEventListener adEventListener0 = this.mAdEventListener;
                if(adEventListener0 != null) {
                    adEventListener0.notifyAdFailedToLoad(106);
                    return;
                }
                return;
            }
            this.mIsLoading = true;
            Thread thread0 = this.mAdThread;
            if(thread0 != null) {
                thread0.interrupt();
                this.mAdThread = null;
            }
            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        AdPieLog.d("InterstitialAd", InterstitialAd.this.mSlotId + ":::load");
                        InterstitialAd.this.mInterstitialState = InterstitialState.NOT_READY;
                        InterstitialAd.this.adData = null;
                        if(!InterstitialAd.this.initialized) {
                            InterstitialAd.this.init();
                        }
                        InterstitialAd.this.mAdController.setSlotID(InterstitialAd.this.mSlotId);
                        InterstitialAd.this.mAdController.setTargetingData(InterstitialAd.this.mTargetingData);
                        InterstitialAd.this.mAdController.loadAd(InterstitialAd.this.mHashMap);
                        return;
                    }
                    catch(Exception exception0) {
                    }
                    AdPieLog.e("InterstitialAd", exception0);
                    if(InterstitialAd.this.mAdEventListener != null) {
                        InterstitialAd.this.mAdEventListener.notifyAdFailedToLoad(104);
                    }
                }
            });
            this.mAdThread = thread1;
            thread1.start();
            return;
        }
        catch(Exception exception0) {
        }
        AdPieLog.e("InterstitialAd", exception0);
        AdEventListener adEventListener1 = this.mAdEventListener;
        if(adEventListener1 != null) {
            adEventListener1.notifyAdFailedToLoad(104);
        }
    }

    public void load(TargetingData targetingData0) {
        this.mTargetingData = targetingData0;
        this.load();
    }

    private void preloadHtml(String s) {
        if(TextUtils.isEmpty(s)) {
            this.mInterstitialState = InterstitialState.READY;
            AdEventListener adEventListener0 = this.mAdEventListener;
            if(adEventListener0 != null) {
                adEventListener0.notifyAdLoaded(new Object[0]);
            }
            return;
        }
        AdPieLog.d("InterstitialAd", this.mSlotId + ":::preloadHtml - " + s);
        AdWebView adWebView0 = this.mAdWebView;
        if(adWebView0 != null) {
            adWebView0.setWebViewEventListener(null);
            this.mAdWebView.destroy();
            this.mAdWebView = null;
        }
        AdWebView adWebView1 = new AdWebView(this.mContext);
        this.mAdWebView = adWebView1;
        adWebView1.setWebViewEventListener(new WebViewEventListener() {
            @Override  // com.gomfactory.adpie.sdk.ui.webview.AdWebView$WebViewEventListener
            public void onPageDelayed() {
                InterstitialAd.this.mInterstitialState = InterstitialState.NOT_READY;
                InterstitialAd.this.adData = null;
                if(InterstitialAd.this.mAdWebView != null) {
                    InterstitialAd.this.mAdWebView.setWebViewEventListener(null);
                    InterstitialAd.this.mAdWebView.destroy();
                    InterstitialAd.this.mAdWebView = null;
                }
                if(InterstitialAd.this.mAdEventListener != null) {
                    InterstitialAd.this.mAdEventListener.notifyAdFailedToLoad(107);
                }
            }

            @Override  // com.gomfactory.adpie.sdk.ui.webview.AdWebView$WebViewEventListener
            public void onPageFinished() {
                InterstitialAd.this.mInterstitialState = InterstitialState.READY;
                if(InterstitialAd.this.mAdEventListener != null) {
                    InterstitialAd.this.mAdEventListener.notifyAdLoaded(new Object[0]);
                }
            }

            @Override  // com.gomfactory.adpie.sdk.ui.webview.AdWebView$WebViewEventListener
            public void onUserClick(String s) {
            }
        });
        AdPieLog.d("InterstitialAd", this.mSlotId + ":::AdWebView-loadData");
        this.mAdWebView.loadData(s, 0L);
    }

    private void preloadResource() {
        this.mInterstitialState = InterstitialState.READY;
        AdEventListener adEventListener0 = this.mAdEventListener;
        if(adEventListener0 != null) {
            adEventListener0.notifyAdLoaded(new Object[0]);
        }
    }

    private void removeEventListener() {
        this.mAdEventListener = null;
    }

    public void setAdListener(InterstitialAdListener interstitialAd$InterstitialAdListener0) {
        this.mInterstitialAdListener = interstitialAd$InterstitialAdListener0;
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

    public boolean show() {
        AdPieLog.d("InterstitialAd", this.mSlotId + ":::show:::" + AdPieSDK.getInstance().getNetworkConnectionType() + "," + Build.VERSION.SDK_INT);
        try {
            if(AdPieSDK.getInstance().getNetworkConnectionType() != 0) {
                AdPieLog.i("InterstitialAd", this.mSlotId + ":::show:::InterstitialState is not ready.");
                return false;
            }
            AdPieLog.i("InterstitialAd", this.mSlotId + ":::show:::Check your internet connection.");
            return false;
        }
        catch(Exception exception0) {
        }
        AdPieLog.e("InterstitialAd", exception0);
        return false;
    }
}

