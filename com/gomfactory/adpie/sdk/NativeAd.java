package com.gomfactory.adpie.sdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.gomfactory.adpie.sdk.common.AdData;
import com.gomfactory.adpie.sdk.common.AdResponse;
import com.gomfactory.adpie.sdk.controller.AdController;
import com.gomfactory.adpie.sdk.event.AdEventListener;
import com.gomfactory.adpie.sdk.nativeads.MainAdView;
import com.gomfactory.adpie.sdk.nativeads.NativeAdData;
import com.gomfactory.adpie.sdk.nativeads.NativeAdView.ResourceLoadEventListener;
import com.gomfactory.adpie.sdk.nativeads.NativeAdView;
import com.gomfactory.adpie.sdk.nativeads.NativeAdViewBinder;
import com.gomfactory.adpie.sdk.util.AdPieLog;
import com.gomfactory.adpie.sdk.util.MemUtil;
import com.gomfactory.adpie.sdk.videoads.FinishState;
import com.gomfactory.adpie.sdk.videoads.VideoAdPlaybackListener;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;

public class NativeAd {
    public interface AdListener {
        void onAdClicked();

        void onAdFailedToLoad(int arg1);

        void onAdLoaded(NativeAdView arg1);

        void onAdShown();
    }

    public static enum NativeAsset {
        TITLE_ASSET(1),
        ICON_IMAGE_ASSET(2),
        MAIN_IMAGE_ASSET(3),
        DESCRIPTION_ASSET(4),
        RATING_ASSET(5),
        CTA_ASSET(6);

        private final int mAssetName;

        private NativeAsset(int v1) {
            this.mAssetName = v1;
        }

        @Override
        public String toString() {
            return String.valueOf(this.mAssetName);
        }
    }

    public static final String TAG = "NativeAd";
    private AdController mAdController;
    private AdEventListener mAdEventListener;
    private AdListener mAdListener;
    private Thread mAdThread;
    private Context mContext;
    private final Handler mHandler;
    private HashMap mHashMap;
    private boolean mIsLoading;
    private boolean mIsSkipDownload;
    private NativeAdViewBinder mNativeAdViewBinder;
    private String mSlotId;
    private TargetingData mTargetingData;
    private VideoAdPlaybackListener mVideoAdPlaybackListener;

    static {
    }

    public NativeAd(Context context0, NativeAdViewBinder nativeAdViewBinder0) {
        this.mHandler = new Handler(Looper.getMainLooper());
        this.init(context0, nativeAdViewBinder0);
    }

    public NativeAd(Context context0, String s, NativeAdViewBinder nativeAdViewBinder0) {
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mAdEventListener = null;
        this.mVideoAdPlaybackListener = null;
        this.mSlotId = s;
        this.init(context0, nativeAdViewBinder0);
    }

    private void addEventListener() {
        this.mAdEventListener = new AdEventListener() {
            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyAdClicked() {
                NativeAd.this.mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("NativeAd", NativeAd.this.mSlotId + ":::notifyAdClicked");
                        if(NativeAd.this.mAdListener != null) {
                            NativeAd.this.mAdListener.onAdClicked();
                        }
                    }
                });
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyAdDismissed() {
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyAdFailedToLoad(int v) {
                com.gomfactory.adpie.sdk.NativeAd.1.3 nativeAd$1$30 = new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("NativeAd", NativeAd.this.mSlotId + ":::notifyAdFailedToLoad:::" + v);
                        if(v != 106) {
                            NativeAd.this.mIsLoading = false;
                        }
                        if(NativeAd.this.mAdListener != null) {
                            NativeAd.this.mAdListener.onAdFailedToLoad(v);
                        }
                    }
                };
                NativeAd.this.mHandler.post(nativeAd$1$30);
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyAdLoaded(Object[] arr_object) {
                com.gomfactory.adpie.sdk.NativeAd.1.2 nativeAd$1$20 = new Runnable() {
                    @Override
                    public void run() {
                        if(arr_object[0] instanceof NativeAdView) {
                            AdPieLog.d("NativeAd", NativeAd.this.mSlotId + ":::notifyAdLoaded");
                            NativeAdView nativeAdView0 = (NativeAdView)arr_object[0];
                            NativeAd.this.mIsLoading = false;
                            if(NativeAd.this.mAdListener != null) {
                                NativeAd.this.mAdListener.onAdLoaded(nativeAdView0);
                            }
                        }
                        else {
                            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                                AdPieLog.d("NativeAd", NativeAd.this.mSlotId + ":::param is not NativeAdView");
                            }
                            if(NativeAd.this.mAdEventListener != null) {
                                NativeAd.this.mAdEventListener.notifyAdFailedToLoad(104);
                            }
                        }
                    }
                };
                NativeAd.this.mHandler.post(nativeAd$1$20);
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyAdShown() {
                com.gomfactory.adpie.sdk.NativeAd.1.5 nativeAd$1$50 = new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("NativeAd", NativeAd.this.mSlotId + ":::notifyAdShown");
                        if(NativeAd.this.mAdListener != null) {
                            NativeAd.this.mAdListener.onAdShown();
                        }
                    }
                };
                NativeAd.this.mHandler.post(nativeAd$1$50);
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyVideoAdCompleted() {
                com.gomfactory.adpie.sdk.NativeAd.1.9 nativeAd$1$90 = new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("NativeAd", NativeAd.this.mSlotId + ":::notifyVideoAdCompleted");
                        if(NativeAd.this.mVideoAdPlaybackListener != null) {
                            NativeAd.this.mVideoAdPlaybackListener.onVideoFinished(FinishState.COMPLETED);
                        }
                    }
                };
                NativeAd.this.mHandler.post(nativeAd$1$90);
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyVideoAdError() {
                com.gomfactory.adpie.sdk.NativeAd.1.8 nativeAd$1$80 = new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("NativeAd", NativeAd.this.mSlotId + ":::notifyVideoAdError");
                        if(NativeAd.this.mVideoAdPlaybackListener != null) {
                            NativeAd.this.mVideoAdPlaybackListener.onVideoFinished(FinishState.ERROR);
                        }
                    }
                };
                NativeAd.this.mHandler.post(nativeAd$1$80);
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyVideoAdPaused() {
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyVideoAdSkipped() {
                com.gomfactory.adpie.sdk.NativeAd.1.7 nativeAd$1$70 = new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("NativeAd", NativeAd.this.mSlotId + ":::notifyVideoAdSkipped");
                        if(NativeAd.this.mVideoAdPlaybackListener != null) {
                            NativeAd.this.mVideoAdPlaybackListener.onVideoFinished(FinishState.SKIPPED);
                        }
                    }
                };
                NativeAd.this.mHandler.post(nativeAd$1$70);
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyVideoAdStarted() {
                com.gomfactory.adpie.sdk.NativeAd.1.6 nativeAd$1$60 = new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("NativeAd", NativeAd.this.mSlotId + ":::notifyVideoAdStarted");
                        if(NativeAd.this.mVideoAdPlaybackListener != null) {
                            NativeAd.this.mVideoAdPlaybackListener.onVideoAdStarted();
                        }
                    }
                };
                NativeAd.this.mHandler.post(nativeAd$1$60);
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyVideoAdStopped() {
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void receivedResponse(AdResponse adResponse0) {
                AdPieLog.d("NativeAd", NativeAd.this.mSlotId + ":::receivedResponse");
                if(adResponse0 != null) {
                    try {
                        int v = adResponse0.getResult();
                        if(v == 0) {
                            if(adResponse0.getCount() == 1) {
                                AdData adData0 = adResponse0.getAdData();
                                if(adData0 != null) {
                                    switch(adData0.getIcType()) {
                                        case 0x1F: 
                                        case 0x20: {
                                            NativeAdView nativeAdView0 = new NativeAdView(NativeAd.this.mContext, NativeAd.this.mNativeAdViewBinder, NativeAd.this.mAdEventListener);
                                            int v1 = nativeAdView0.fillAd(((NativeAdData)adData0));
                                            if(v1 == 0) {
                                                if(!NativeAd.this.mIsSkipDownload) {
                                                    nativeAdView0.downloadResource(new ResourceLoadEventListener() {
                                                        @Override  // com.gomfactory.adpie.sdk.nativeads.NativeAdView$ResourceLoadEventListener
                                                        public void onError() {
                                                            AdPieLog.d("NativeAd", ":::downloadResource:::onError");
                                                            if(NativeAd.this.mAdEventListener != null) {
                                                                NativeAd.this.mAdEventListener.notifyAdFailedToLoad(107);
                                                            }
                                                        }

                                                        @Override  // com.gomfactory.adpie.sdk.nativeads.NativeAdView$ResourceLoadEventListener
                                                        public void onSuccess() {
                                                            nativeAdView0.setupOptOut();
                                                            AdPieLog.d("NativeAd", ":::downloadResource:::onSuccess");
                                                            if(NativeAd.this.mAdEventListener != null) {
                                                                NativeAd.this.mAdEventListener.notifyAdLoaded(new Object[]{nativeAdView0});
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                nativeAdView0.setupOptOut();
                                                if(NativeAd.this.mAdEventListener != null) {
                                                    NativeAd.this.mAdEventListener.notifyAdLoaded(new Object[]{nativeAdView0});
                                                    return;
                                                }
                                            }
                                            else {
                                                switch(v1 / 10) {
                                                    case -2: {
                                                        if(NativeAd.this.mAdEventListener != null) {
                                                            NativeAd.this.mAdEventListener.notifyAdFailedToLoad(108);
                                                            return;
                                                        }
                                                        break;
                                                    }
                                                    case -1: {
                                                        if(NativeAd.this.mAdEventListener != null) {
                                                            NativeAd.this.mAdEventListener.notifyAdFailedToLoad(109);
                                                            return;
                                                        label_29:
                                                            AdPieLog.i("NativeAd", "\'" + adData0.getIcType() + "\' inventory and contentType are not matched.");
                                                            if(NativeAd.this.mAdEventListener != null) {
                                                                NativeAd.this.mAdEventListener.notifyAdFailedToLoad(104);
                                                                return;
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    default: {
                                                        if(NativeAd.this.mAdEventListener != null) {
                                                            NativeAd.this.mAdEventListener.notifyAdFailedToLoad(107);
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        default: {
                                            goto label_29;
                                        }
                                    }
                                }
                                else if(NativeAd.this.mAdEventListener != null) {
                                    NativeAd.this.mAdEventListener.notifyAdFailedToLoad(100);
                                    return;
                                }
                            }
                            else if(NativeAd.this.mAdEventListener != null) {
                                NativeAd.this.mAdEventListener.notifyAdFailedToLoad(100);
                                return;
                            }
                        }
                        else if(v == 204) {
                            if(NativeAd.this.mAdEventListener != null) {
                                NativeAd.this.mAdEventListener.notifyAdFailedToLoad(100);
                                return;
                            }
                        }
                        else if(NativeAd.this.mAdEventListener != null) {
                            NativeAd.this.mAdEventListener.notifyAdFailedToLoad(101);
                            return;
                        }
                        return;
                    }
                    catch(Exception exception0) {
                    }
                    if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                        AdPieLog.e("NativeAd", exception0);
                    }
                    if(NativeAd.this.mAdEventListener != null) {
                        NativeAd.this.mAdEventListener.notifyAdFailedToLoad(104);
                    }
                }
            }
        };
    }

    private void checkAssets() {
        try {
            HashSet hashSet0 = new HashSet();
            if(this.mNativeAdViewBinder == null) {
                hashSet0.add(NativeAsset.TITLE_ASSET);
                hashSet0.add(NativeAsset.ICON_IMAGE_ASSET);
                hashSet0.add(NativeAsset.DESCRIPTION_ASSET);
                hashSet0.add(NativeAsset.MAIN_IMAGE_ASSET);
                hashSet0.add(NativeAsset.CTA_ASSET);
            }
            else {
                ViewGroup viewGroup0 = (ViewGroup)((LayoutInflater)this.mContext.getSystemService("layout_inflater")).inflate(this.mNativeAdViewBinder.getLayoutId(), null, false);
                if(viewGroup0 != null) {
                    if(((TextView)viewGroup0.findViewById(this.mNativeAdViewBinder.getTitleId())) != null) {
                        hashSet0.add(NativeAsset.TITLE_ASSET);
                    }
                    if(((ImageView)viewGroup0.findViewById(this.mNativeAdViewBinder.getIconImageId())) != null) {
                        hashSet0.add(NativeAsset.ICON_IMAGE_ASSET);
                    }
                    if(((RatingBar)viewGroup0.findViewById(this.mNativeAdViewBinder.getRatingbarId())) != null) {
                        hashSet0.add(NativeAsset.RATING_ASSET);
                    }
                    if(((TextView)viewGroup0.findViewById(this.mNativeAdViewBinder.getDescriptionId())) != null) {
                        hashSet0.add(NativeAsset.DESCRIPTION_ASSET);
                    }
                    if(((MainAdView)viewGroup0.findViewById(this.mNativeAdViewBinder.getMainId())) != null) {
                        hashSet0.add(NativeAsset.MAIN_IMAGE_ASSET);
                    }
                    if(((Button)viewGroup0.findViewById(this.mNativeAdViewBinder.getCallToActionId())) != null) {
                        hashSet0.add(NativeAsset.CTA_ASSET);
                    }
                }
            }
            if(hashSet0.size() > 0) {
                EnumSet enumSet0 = EnumSet.copyOf(hashSet0);
                AdPieLog.d("NativeAd", this.mSlotId + ":::registered assets : " + enumSet0);
                HashMap hashMap0 = new HashMap();
                this.mHashMap = hashMap0;
                hashMap0.put("assettype", enumSet0.toString());
                return;
            }
            return;
        }
        catch(Exception exception0) {
        }
        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
            AdPieLog.e("NativeAd", exception0);
        }
    }

    public void destroy() {
        AdPieLog.d("NativeAd", this.mSlotId + ":::destroy");
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

    public AdListener getAdListener() {
        return this.mAdListener;
    }

    public String getSlotId() {
        return this.mSlotId;
    }

    public VideoAdPlaybackListener getVideoAdPlaybackListener() {
        return this.mVideoAdPlaybackListener;
    }

    private void init(Context context0, NativeAdViewBinder nativeAdViewBinder0) {
        AdPieLog.d("NativeAd", this.mSlotId + ":::init");
        if(context0 == null) {
            AdPieLog.e("NativeAd", new Exception("Context cannot be null."));
            AdEventListener adEventListener0 = this.mAdEventListener;
            if(adEventListener0 != null) {
                adEventListener0.notifyAdFailedToLoad(104);
            }
            return;
        }
        this.mContext = context0;
        this.mNativeAdViewBinder = nativeAdViewBinder0;
        this.addEventListener();
        this.checkAssets();
        this.mAdController = new AdController(this.mContext, this.mAdEventListener);
        MemUtil.setMemoryError(false);
    }

    public void loadAd() {
        try {
            if(this.mIsLoading) {
                AdPieLog.d("NativeAd", "AdPie (" + this.mSlotId + ") is already loading an ad. Wait for previous load to finish.");
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
                        AdPieLog.d("NativeAd", NativeAd.this.mSlotId + ":::load");
                        NativeAd.this.mAdController.setSlotID(NativeAd.this.mSlotId);
                        NativeAd.this.mAdController.setTargetingData(NativeAd.this.mTargetingData);
                        NativeAd.this.mAdController.loadAd(NativeAd.this.mHashMap);
                    }
                    catch(Exception exception0) {
                        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                            AdPieLog.e("NativeAd", exception0);
                        }
                        if(NativeAd.this.mAdEventListener != null) {
                            NativeAd.this.mAdEventListener.notifyAdFailedToLoad(104);
                        }
                    }
                }
            });
            this.mAdThread = thread1;
            thread1.start();
            return;
        }
        catch(Exception exception0) {
        }
        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
            AdPieLog.e("NativeAd", exception0);
        }
        AdEventListener adEventListener1 = this.mAdEventListener;
        if(adEventListener1 != null) {
            adEventListener1.notifyAdFailedToLoad(104);
        }
    }

    public void loadAd(TargetingData targetingData0) {
        this.mTargetingData = targetingData0;
        this.loadAd();
    }

    private void removeEventListener() {
        this.mAdEventListener = null;
    }

    public void setAdListener(AdListener nativeAd$AdListener0) {
        this.mAdListener = nativeAd$AdListener0;
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

    public void setSkipDownload(boolean z) {
        this.mIsSkipDownload = z;
    }

    public void setSlotId(String s) {
        this.mSlotId = s;
    }

    public void setVideoAdPlaybackListener(VideoAdPlaybackListener videoAdPlaybackListener0) {
        this.mVideoAdPlaybackListener = videoAdPlaybackListener0;
    }
}

