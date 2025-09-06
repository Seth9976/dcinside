package com.gomfactory.adpie.sdk;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import com.gomfactory.adpie.sdk.common.AdData;
import com.gomfactory.adpie.sdk.common.AdResponse;
import com.gomfactory.adpie.sdk.controller.AdController;
import com.gomfactory.adpie.sdk.event.AdEventListener;
import com.gomfactory.adpie.sdk.util.AdPieLog;
import com.gomfactory.adpie.sdk.videoads.FinishState;
import com.gomfactory.adpie.sdk.videoads.VideoAdPlaybackListener;
import com.gomfactory.adpie.sdk.videoads.VideoAdView;

public class PrerollVideoAd {
    public interface AdListener {
        void onAdClicked();

        void onAdFailedToLoad(int arg1);

        void onAdLoaded();
    }

    static enum VideoState {
        NOT_READY,
        READY;

        boolean isReady() [...] // 潜在的解密器
    }

    public static final String TAG = "PrerollVideoAd";
    private AdData adData;
    private boolean initialized;
    private AdController mAdController;
    private AdEventListener mAdEventListener;
    private AdListener mAdListener;
    private Thread mAdThread;
    private Context mContext;
    private final Handler mHandler;
    private boolean mIsLoading;
    private String mSlotId;
    private TargetingData mTargetingData;
    private VideoAdPlaybackListener mVideoAdPlaybackListener;
    private VideoAdView mVideoAdView;
    private VideoState mVideoState;

    static {
    }

    public PrerollVideoAd(Context context0, String s, VideoAdView videoAdView0) {
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mContext = context0;
        this.mVideoAdView = videoAdView0;
        this.mAdListener = null;
        this.mVideoAdPlaybackListener = null;
        this.mSlotId = s;
        this.mVideoState = VideoState.NOT_READY;
        this.init();
    }

    private void addEventListener() {
        this.mAdEventListener = new AdEventListener() {
            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyAdClicked() {
                PrerollVideoAd.this.mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("PrerollVideoAd", PrerollVideoAd.this.mSlotId + ":::notifyAdClicked");
                        if(PrerollVideoAd.this.mAdListener != null) {
                            PrerollVideoAd.this.mAdListener.onAdClicked();
                        }
                    }
                });
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyAdDismissed() {
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyAdFailedToLoad(int v) {
                com.gomfactory.adpie.sdk.PrerollVideoAd.1.2 prerollVideoAd$1$20 = new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("PrerollVideoAd", PrerollVideoAd.this.mSlotId + ":::notifyAdFailedToLoad:::" + v);
                        PrerollVideoAd.this.mVideoState = VideoState.NOT_READY;
                        PrerollVideoAd.this.adData = null;
                        if(v != 106) {
                            PrerollVideoAd.this.mIsLoading = false;
                        }
                        if(PrerollVideoAd.this.mAdListener != null) {
                            PrerollVideoAd.this.mAdListener.onAdFailedToLoad(v);
                        }
                    }
                };
                PrerollVideoAd.this.mHandler.post(prerollVideoAd$1$20);
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyAdLoaded(Object[] arr_object) {
                com.gomfactory.adpie.sdk.PrerollVideoAd.1.1 prerollVideoAd$1$10 = new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("PrerollVideoAd", PrerollVideoAd.this.mSlotId + ":::notifyAdLoaded");
                        PrerollVideoAd.this.mIsLoading = false;
                        if(PrerollVideoAd.this.mAdListener != null) {
                            PrerollVideoAd.this.mAdListener.onAdLoaded();
                        }
                    }
                };
                PrerollVideoAd.this.mHandler.post(prerollVideoAd$1$10);
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyAdShown() {
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyVideoAdCompleted() {
                com.gomfactory.adpie.sdk.PrerollVideoAd.1.7 prerollVideoAd$1$70 = new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("PrerollVideoAd", PrerollVideoAd.this.mSlotId + ":::notifyVideoAdCompleted");
                        if(PrerollVideoAd.this.mVideoAdPlaybackListener != null) {
                            PrerollVideoAd.this.mVideoAdPlaybackListener.onVideoFinished(FinishState.COMPLETED);
                        }
                    }
                };
                PrerollVideoAd.this.mHandler.post(prerollVideoAd$1$70);
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyVideoAdError() {
                com.gomfactory.adpie.sdk.PrerollVideoAd.1.6 prerollVideoAd$1$60 = new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("PrerollVideoAd", PrerollVideoAd.this.mSlotId + ":::notifyVideoAdError");
                        if(PrerollVideoAd.this.mVideoAdPlaybackListener != null) {
                            PrerollVideoAd.this.mVideoAdPlaybackListener.onVideoFinished(FinishState.ERROR);
                        }
                    }
                };
                PrerollVideoAd.this.mHandler.post(prerollVideoAd$1$60);
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyVideoAdPaused() {
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyVideoAdSkipped() {
                com.gomfactory.adpie.sdk.PrerollVideoAd.1.5 prerollVideoAd$1$50 = new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("PrerollVideoAd", PrerollVideoAd.this.mSlotId + ":::notifyVideoAdSkipped");
                        if(PrerollVideoAd.this.mVideoAdPlaybackListener != null) {
                            PrerollVideoAd.this.mVideoAdPlaybackListener.onVideoFinished(FinishState.SKIPPED);
                        }
                    }
                };
                PrerollVideoAd.this.mHandler.post(prerollVideoAd$1$50);
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyVideoAdStarted() {
                com.gomfactory.adpie.sdk.PrerollVideoAd.1.4 prerollVideoAd$1$40 = new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("PrerollVideoAd", PrerollVideoAd.this.mSlotId + ":::notifyVideoAdStarted");
                        if(PrerollVideoAd.this.mVideoAdPlaybackListener != null) {
                            PrerollVideoAd.this.mVideoAdPlaybackListener.onVideoAdStarted();
                        }
                    }
                };
                PrerollVideoAd.this.mHandler.post(prerollVideoAd$1$40);
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyVideoAdStopped() {
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void receivedResponse(AdResponse adResponse0) {
                AdPieLog.d("PrerollVideoAd", PrerollVideoAd.this.mSlotId + ":::receivedResponse");
                if(adResponse0 != null) {
                    try {
                        int v = adResponse0.getResult();
                        if(v == 0) {
                            if(adResponse0.getCount() == 1) {
                                PrerollVideoAd.this.adData = adResponse0.getAdData();
                                if(PrerollVideoAd.this.adData != null) {
                                    if(PrerollVideoAd.this.adData.getIcType() == 42) {
                                        PrerollVideoAd.this.preloadResource();
                                        return;
                                    }
                                    AdPieLog.i("PrerollVideoAd", "\'" + PrerollVideoAd.this.adData.getIcType() + "\' inventory and contentType are not matched.");
                                    if(PrerollVideoAd.this.mAdEventListener != null) {
                                        PrerollVideoAd.this.mAdEventListener.notifyAdFailedToLoad(108);
                                        return;
                                    }
                                }
                                else if(PrerollVideoAd.this.mAdEventListener != null) {
                                    PrerollVideoAd.this.mAdEventListener.notifyAdFailedToLoad(100);
                                    return;
                                }
                            }
                            else if(PrerollVideoAd.this.mAdEventListener != null) {
                                PrerollVideoAd.this.mAdEventListener.notifyAdFailedToLoad(100);
                                return;
                            }
                        }
                        else if(v == 204) {
                            if(PrerollVideoAd.this.mAdEventListener != null) {
                                PrerollVideoAd.this.mAdEventListener.notifyAdFailedToLoad(100);
                                return;
                            }
                        }
                        else if(PrerollVideoAd.this.mAdEventListener != null) {
                            PrerollVideoAd.this.mAdEventListener.notifyAdFailedToLoad(101);
                            return;
                        }
                        return;
                    }
                    catch(Exception exception0) {
                    }
                    if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                        AdPieLog.e("PrerollVideoAd", exception0);
                    }
                    if(PrerollVideoAd.this.mAdEventListener != null) {
                        PrerollVideoAd.this.mAdEventListener.notifyAdFailedToLoad(104);
                    }
                }
            }
        };
    }

    public void destroy() {
        AdPieLog.d("PrerollVideoAd", this.mSlotId + ":::destroy");
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
    }

    public AdListener getAdListener() {
        return this.mAdListener;
    }

    public VideoAdPlaybackListener getVideoAdPlaybackListener() {
        return this.mVideoAdPlaybackListener;
    }

    private void init() {
        AdPieLog.d("PrerollVideoAd", this.mSlotId + ":::init");
        this.addEventListener();
        this.mAdController = new AdController(this.mContext, this.mAdEventListener);
        this.initialized = true;
    }

    // 去混淆评级： 低(20)
    public boolean isLoaded() {
        return false;
    }

    public boolean isPlaying() {
        return this.mVideoAdView == null ? false : this.mVideoAdView.isPlaying();
    }

    public void load() {
        try {
            if(this.mIsLoading) {
                AdPieLog.d("PrerollVideoAd", "AdPie (" + this.mSlotId + ") is already loading an ad. Wait for previous load to finish.");
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
                        AdPieLog.d("PrerollVideoAd", PrerollVideoAd.this.mSlotId + ":::load");
                        PrerollVideoAd.this.mVideoState = VideoState.NOT_READY;
                        PrerollVideoAd.this.adData = null;
                        if(!PrerollVideoAd.this.initialized) {
                            PrerollVideoAd.this.init();
                        }
                        PrerollVideoAd.this.mAdController.setSlotID(PrerollVideoAd.this.mSlotId);
                        PrerollVideoAd.this.mAdController.setTargetingData(PrerollVideoAd.this.mTargetingData);
                        PrerollVideoAd.this.mAdController.loadAd();
                        return;
                    }
                    catch(Exception exception0) {
                    }
                    AdPieLog.e("PrerollVideoAd", exception0);
                    if(PrerollVideoAd.this.mAdEventListener != null) {
                        PrerollVideoAd.this.mAdEventListener.notifyAdFailedToLoad(104);
                    }
                }
            });
            this.mAdThread = thread1;
            thread1.start();
            return;
        }
        catch(Exception exception0) {
        }
        AdPieLog.e("PrerollVideoAd", exception0);
        AdEventListener adEventListener1 = this.mAdEventListener;
        if(adEventListener1 != null) {
            adEventListener1.notifyAdFailedToLoad(104);
        }
    }

    public void load(TargetingData targetingData0) {
        this.mTargetingData = targetingData0;
        this.load();
    }

    private void preloadResource() {
        this.mVideoState = VideoState.READY;
        AdEventListener adEventListener0 = this.mAdEventListener;
        if(adEventListener0 != null) {
            adEventListener0.notifyAdLoaded(new Object[0]);
        }
    }

    private void removeEventListener() {
        this.mAdEventListener = null;
    }

    public void setAdListener(AdListener prerollVideoAd$AdListener0) {
        this.mAdListener = prerollVideoAd$AdListener0;
    }

    public void setVideoAdPlaybackListener(VideoAdPlaybackListener videoAdPlaybackListener0) {
        this.mVideoAdPlaybackListener = videoAdPlaybackListener0;
    }

    public boolean show() {
        AdPieLog.d("PrerollVideoAd", this.mSlotId + ":::show:::" + AdPieSDK.getInstance().getNetworkConnectionType() + "," + Build.VERSION.SDK_INT);
        try {
            if(AdPieSDK.getInstance().getNetworkConnectionType() == 0) {
                AdPieLog.i("PrerollVideoAd", this.mSlotId + ":::show:::Check your internet connection.");
            }
            else if(this.adData == null) {
                AdPieLog.i("PrerollVideoAd", this.mSlotId + ":::show:::Ads data cannot be null.");
            }
            else {
                AdPieLog.i("PrerollVideoAd", this.mSlotId + ":::show:::VideoState is not ready.");
            }
        }
        catch(Exception exception0) {
            AdPieLog.e("PrerollVideoAd", exception0);
        }
        AdEventListener adEventListener0 = this.mAdEventListener;
        if(adEventListener0 != null) {
            adEventListener0.notifyVideoAdError();
        }
        return false;
    }
}

