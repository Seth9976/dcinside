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
import com.gomfactory.adpie.sdk.util.AdPieLog;
import com.gomfactory.adpie.sdk.videoads.FinishState;
import java.util.HashMap;

public class RewardedVideoAd {
    public interface RewardedVideoAdListener {
        void onRewardedVideoClicked();

        void onRewardedVideoFailedToLoad(int arg1);

        void onRewardedVideoFinished(FinishState arg1);

        void onRewardedVideoLoaded();

        void onRewardedVideoStarted();
    }

    static enum RewardedVideoState {
        NOT_READY,
        READY,
        SHOW;

        boolean isReady() [...] // 潜在的解密器
    }

    public static final String TAG = "RewardedVideoAd";
    private AdData adData;
    private boolean initialized;
    private AdController mAdController;
    private AdEventListener mAdEventListener;
    private Thread mAdThread;
    private Context mContext;
    private FinishState mFinishState;
    private final Handler mHandler;
    private HashMap mHashMap;
    private boolean mIsLoading;
    private RewardedVideoAdListener mRewardedVideoAdListener;
    private RewardedVideoState mRewardedVideoState;
    private String mSlotId;
    private String mSsvCustomData;
    private String mSsvUserId;
    private TargetingData mTargetingData;

    static {
    }

    public RewardedVideoAd(Context context0, String s) {
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mContext = context0;
        this.mRewardedVideoAdListener = null;
        this.mSlotId = s;
        this.mRewardedVideoState = RewardedVideoState.NOT_READY;
        this.init();
    }

    private void addEventListener() {
        this.mAdEventListener = new AdEventListener() {
            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyAdClicked() {
                RewardedVideoAd.this.mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("RewardedVideoAd", RewardedVideoAd.this.mSlotId + ":::notifyAdClicked");
                        if(RewardedVideoAd.this.mRewardedVideoAdListener != null) {
                            RewardedVideoAd.this.mRewardedVideoAdListener.onRewardedVideoClicked();
                        }
                    }
                });
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyAdDismissed() {
                com.gomfactory.adpie.sdk.RewardedVideoAd.1.4 rewardedVideoAd$1$40 = new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("RewardedVideoAd", RewardedVideoAd.this.mSlotId + ":::notifyAdDismissed - " + RewardedVideoAd.this.mFinishState);
                        RewardedVideoAd.this.mRewardedVideoState = RewardedVideoState.NOT_READY;
                        if(RewardedVideoAd.this.mRewardedVideoAdListener != null) {
                            RewardedVideoAd.this.mRewardedVideoAdListener.onRewardedVideoFinished(RewardedVideoAd.this.mFinishState);
                        }
                    }
                };
                RewardedVideoAd.this.mHandler.post(rewardedVideoAd$1$40);
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyAdFailedToLoad(int v) {
                com.gomfactory.adpie.sdk.RewardedVideoAd.1.2 rewardedVideoAd$1$20 = new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("RewardedVideoAd", RewardedVideoAd.this.mSlotId + ":::notifyAdFailedToLoad:::" + v);
                        RewardedVideoAd.this.mRewardedVideoState = RewardedVideoState.NOT_READY;
                        RewardedVideoAd.this.adData = null;
                        if(v != 106) {
                            RewardedVideoAd.this.mIsLoading = false;
                        }
                        if(RewardedVideoAd.this.mRewardedVideoAdListener != null) {
                            RewardedVideoAd.this.mRewardedVideoAdListener.onRewardedVideoFailedToLoad(v);
                        }
                    }
                };
                RewardedVideoAd.this.mHandler.post(rewardedVideoAd$1$20);
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyAdLoaded(Object[] arr_object) {
                com.gomfactory.adpie.sdk.RewardedVideoAd.1.1 rewardedVideoAd$1$10 = new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("RewardedVideoAd", RewardedVideoAd.this.mSlotId + ":::notifyAdLoaded");
                        RewardedVideoAd.this.mIsLoading = false;
                        if(RewardedVideoAd.this.mRewardedVideoAdListener != null) {
                            RewardedVideoAd.this.mRewardedVideoAdListener.onRewardedVideoLoaded();
                        }
                    }
                };
                RewardedVideoAd.this.mHandler.post(rewardedVideoAd$1$10);
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyAdShown() {
                com.gomfactory.adpie.sdk.RewardedVideoAd.1.3 rewardedVideoAd$1$30 = new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("RewardedVideoAd", RewardedVideoAd.this.mSlotId + ":::notifyAdShown");
                        RewardedVideoAd.this.mRewardedVideoState = RewardedVideoState.SHOW;
                    }
                };
                RewardedVideoAd.this.mHandler.post(rewardedVideoAd$1$30);
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyVideoAdCompleted() {
                com.gomfactory.adpie.sdk.RewardedVideoAd.1.9 rewardedVideoAd$1$90 = new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("RewardedVideoAd", RewardedVideoAd.this.mSlotId + ":::notifyVideoAdCompleted");
                        RewardedVideoAd.this.mFinishState = FinishState.COMPLETED;
                    }
                };
                RewardedVideoAd.this.mHandler.post(rewardedVideoAd$1$90);
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyVideoAdError() {
                com.gomfactory.adpie.sdk.RewardedVideoAd.1.8 rewardedVideoAd$1$80 = new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("RewardedVideoAd", RewardedVideoAd.this.mSlotId + ":::notifyVideoAdError");
                        RewardedVideoAd.this.mFinishState = FinishState.ERROR;
                    }
                };
                RewardedVideoAd.this.mHandler.post(rewardedVideoAd$1$80);
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyVideoAdPaused() {
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyVideoAdSkipped() {
                com.gomfactory.adpie.sdk.RewardedVideoAd.1.7 rewardedVideoAd$1$70 = new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("RewardedVideoAd", RewardedVideoAd.this.mSlotId + ":::notifyVideoAdSkipped");
                        RewardedVideoAd.this.mFinishState = FinishState.SKIPPED;
                    }
                };
                RewardedVideoAd.this.mHandler.post(rewardedVideoAd$1$70);
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyVideoAdStarted() {
                com.gomfactory.adpie.sdk.RewardedVideoAd.1.6 rewardedVideoAd$1$60 = new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("RewardedVideoAd", RewardedVideoAd.this.mSlotId + ":::notifyVideoAdStarted");
                        if(RewardedVideoAd.this.mRewardedVideoAdListener != null) {
                            RewardedVideoAd.this.mRewardedVideoAdListener.onRewardedVideoStarted();
                        }
                    }
                };
                RewardedVideoAd.this.mHandler.post(rewardedVideoAd$1$60);
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyVideoAdStopped() {
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void receivedResponse(AdResponse adResponse0) {
                AdPieLog.d("RewardedVideoAd", RewardedVideoAd.this.mSlotId + ":::receivedResponse");
                if(adResponse0 != null) {
                    try {
                        int v = adResponse0.getResult();
                        if(v == 0) {
                            if(adResponse0.getCount() == 1) {
                                RewardedVideoAd.this.adData = adResponse0.getAdData();
                                if(RewardedVideoAd.this.adData != null) {
                                    if(RewardedVideoAd.this.adData.getIcType() == 52) {
                                        RewardedVideoAd.this.preloadResource();
                                        return;
                                    }
                                    AdPieLog.i("RewardedVideoAd", "\'" + RewardedVideoAd.this.adData.getIcType() + "\' inventory and contentType are not matched.");
                                    if(RewardedVideoAd.this.mAdEventListener != null) {
                                        RewardedVideoAd.this.mAdEventListener.notifyAdFailedToLoad(108);
                                        return;
                                    }
                                }
                                else if(RewardedVideoAd.this.mAdEventListener != null) {
                                    RewardedVideoAd.this.mAdEventListener.notifyAdFailedToLoad(100);
                                    return;
                                }
                            }
                            else if(RewardedVideoAd.this.mAdEventListener != null) {
                                RewardedVideoAd.this.mAdEventListener.notifyAdFailedToLoad(100);
                                return;
                            }
                        }
                        else if(v == 204) {
                            if(RewardedVideoAd.this.mAdEventListener != null) {
                                RewardedVideoAd.this.mAdEventListener.notifyAdFailedToLoad(100);
                                return;
                            }
                        }
                        else if(RewardedVideoAd.this.mAdEventListener != null) {
                            RewardedVideoAd.this.mAdEventListener.notifyAdFailedToLoad(101);
                            return;
                        }
                        return;
                    }
                    catch(Exception exception0) {
                    }
                    if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                        AdPieLog.e("RewardedVideoAd", exception0);
                    }
                    if(RewardedVideoAd.this.mAdEventListener != null) {
                        RewardedVideoAd.this.mAdEventListener.notifyAdFailedToLoad(104);
                    }
                }
            }
        };
    }

    public void destroy() {
        AdPieLog.d("RewardedVideoAd", this.mSlotId + ":::destroy");
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
        HashMap hashMap0 = this.mHashMap;
        if(hashMap0 != null) {
            hashMap0.clear();
            this.mHashMap = null;
        }
    }

    public RewardedVideoAdListener getAdListener() {
        return this.mRewardedVideoAdListener;
    }

    private void init() {
        AdPieLog.d("RewardedVideoAd", this.mSlotId + ":::init");
        try {
            Class.forName("androidx.localbroadcastmanager.content.LocalBroadcastManager");
        }
        catch(ClassNotFoundException classNotFoundException0) {
            AdPieLog.e("RewardedVideoAd", classNotFoundException0);
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
                AdPieLog.d("RewardedVideoAd", "AdPie (" + this.mSlotId + ") is already loading an ad. Wait for previous load to finish.");
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
                        AdPieLog.d("RewardedVideoAd", RewardedVideoAd.this.mSlotId + ":::load");
                        RewardedVideoAd.this.mRewardedVideoState = RewardedVideoState.NOT_READY;
                        RewardedVideoAd.this.mFinishState = FinishState.UNKNOWN;
                        RewardedVideoAd.this.adData = null;
                        if(!RewardedVideoAd.this.initialized) {
                            RewardedVideoAd.this.init();
                        }
                        RewardedVideoAd.this.mAdController.setSlotID(RewardedVideoAd.this.mSlotId);
                        RewardedVideoAd.this.mAdController.setTargetingData(RewardedVideoAd.this.mTargetingData);
                        RewardedVideoAd.this.mAdController.loadAd(RewardedVideoAd.this.mHashMap);
                        return;
                    }
                    catch(Exception exception0) {
                    }
                    AdPieLog.e("RewardedVideoAd", exception0);
                    if(RewardedVideoAd.this.mAdEventListener != null) {
                        RewardedVideoAd.this.mAdEventListener.notifyAdFailedToLoad(104);
                    }
                }
            });
            this.mAdThread = thread1;
            thread1.start();
            return;
        }
        catch(Exception exception0) {
        }
        AdPieLog.e("RewardedVideoAd", exception0);
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
        this.mRewardedVideoState = RewardedVideoState.READY;
        AdEventListener adEventListener0 = this.mAdEventListener;
        if(adEventListener0 != null) {
            adEventListener0.notifyAdLoaded(new Object[0]);
        }
    }

    private void removeEventListener() {
        this.mAdEventListener = null;
    }

    public void setAdListener(RewardedVideoAdListener rewardedVideoAd$RewardedVideoAdListener0) {
        this.mRewardedVideoAdListener = rewardedVideoAd$RewardedVideoAdListener0;
    }

    public void setCustomDataForSSV(String s) {
        this.mSsvCustomData = s;
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

    public void setUserIdForSSV(String s) {
        this.mSsvUserId = s;
    }

    public boolean show() {
        AdPieLog.d("RewardedVideoAd", this.mSlotId + ":::show:::" + AdPieSDK.getInstance().getNetworkConnectionType() + "," + Build.VERSION.SDK_INT);
        try {
            if(AdPieSDK.getInstance().getNetworkConnectionType() != 0) {
                AdPieLog.i("RewardedVideoAd", this.mSlotId + ":::show:::RewardedVideoState is not ready.");
                return false;
            }
            AdPieLog.i("RewardedVideoAd", this.mSlotId + ":::show:::Check your internet connection.");
            return false;
        }
        catch(Exception exception0) {
        }
        AdPieLog.e("RewardedVideoAd", exception0);
        return false;
    }
}

