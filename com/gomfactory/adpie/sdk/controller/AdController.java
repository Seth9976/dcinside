package com.gomfactory.adpie.sdk.controller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.gomfactory.adpie.sdk.AdPieSDK;
import com.gomfactory.adpie.sdk.TargetingData;
import com.gomfactory.adpie.sdk.common.AdData;
import com.gomfactory.adpie.sdk.common.AdRequest;
import com.gomfactory.adpie.sdk.common.AdResponse;
import com.gomfactory.adpie.sdk.event.AdEventListener;
import com.gomfactory.adpie.sdk.nativeads.NativeAdData;
import com.gomfactory.adpie.sdk.network.NetworkServiceManager;
import com.gomfactory.adpie.sdk.pref.Preference;
import com.gomfactory.adpie.sdk.util.AdPieLog;
import com.gomfactory.adpie.sdk.videoads.VideoAdData;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public class AdController {
    public static final String TAG = "AdController";
    private static final int WAIT_INTERVAL_MILLI_TIME = 100;
    private static final int WAIT_MAXIMUM_MILLI_TIME = 2000;
    private AdEventListener mAdEventListener;
    private AdRequest mAdRequest;
    private Context mContext;
    private Handler mHandler;
    private boolean mIsLoading;
    private HashMap mQueryMap;
    private String mSlotId;
    private TargetingData mTargetingData;
    private int waitTime;

    static {
    }

    public AdController(Context context0, AdEventListener adEventListener0) {
        this.waitTime = 0;
        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
            AdPieLog.d("AdController", "AdController instance is created.");
        }
        this.mContext = context0;
        this.mAdEventListener = adEventListener0;
        this.waitTime = 0;
    }

    private ArrayList convertJSONArrayToArrayList(JSONArray jSONArray0) {
        if(jSONArray0 == null) {
            return null;
        }
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < jSONArray0.length(); ++v) {
            String s = jSONArray0.optString(v);
            if(s != null) {
                arrayList0.add(s);
            }
        }
        return arrayList0;
    }

    private int[] convertJSONArrayToIntArray(JSONArray jSONArray0) {
        if(jSONArray0 == null) {
            return null;
        }
        int[] arr_v = new int[jSONArray0.length()];
        for(int v = 0; v < jSONArray0.length(); ++v) {
            arr_v[v] = jSONArray0.optInt(v);
        }
        return arr_v;
    }

    public void destroy() {
        AdPieLog.d("AdController", this.mSlotId + ":::destroy");
        Handler handler0 = this.mHandler;
        if(handler0 != null) {
            handler0.removeCallbacks(null);
            this.mHandler = null;
        }
        this.mAdRequest = null;
        this.mAdEventListener = null;
    }

    private void fetchAd() {
        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
            AdPieLog.d("AdController", "fetchAd : " + this.getRequest().toString());
        }
        NetworkServiceManager.getInstance().post(this.getRequest().getRequestURL(), this.getRequest().toUri().getEncodedQuery(), new Handler(Looper.getMainLooper()) {
            @Override  // android.os.Handler
            public void handleMessage(Message message0) {
                if(message0.what == 200) {
                    AdController.this.parsing(message0.obj);
                }
                else if(AdController.this.mAdEventListener != null) {
                    AdController.this.mAdEventListener.notifyAdFailedToLoad(102);
                }
                AdController.this.mIsLoading = false;
            }
        });
    }

    private AdRequest getRequest() {
        if(this.mAdRequest == null) {
            this.mAdRequest = (AdRequest)AdPieSDK.getInstance().getCommonHeader().clone();
        }
        try {
            String s = Preference.getStringValue(this.mContext, "SSP_URL", "");
            if(TextUtils.isEmpty(s)) {
                this.mAdRequest.setRequestURL("https://ssp.adpies.com/ssp/request", true);
            }
            else {
                this.mAdRequest.setRequestURL(s, true);
            }
        }
        catch(Exception unused_ex) {
            this.mAdRequest.setRequestURL("https://ssp.adpies.com/ssp/request", true);
        }
        this.mAdRequest.setAppID(AdPieSDK.getInstance().getAppId());
        this.mAdRequest.setSlotID(this.mSlotId);
        this.mAdRequest.setQueryMap(this.mQueryMap);
        this.mAdRequest.setTargetingData(this.mTargetingData);
        return this.mAdRequest;
    }

    public void loadAd() {
        if(this.mContext == null) {
            AdPieLog.e("AdController", new Exception("Context cannot be null."));
            AdEventListener adEventListener0 = this.mAdEventListener;
            if(adEventListener0 != null) {
                adEventListener0.notifyAdFailedToLoad(104);
            }
            return;
        }
        if(TextUtils.isEmpty(this.mSlotId)) {
            AdPieLog.e("AdController", new Exception("Slot ID cannot be null."));
            AdEventListener adEventListener1 = this.mAdEventListener;
            if(adEventListener1 != null) {
                adEventListener1.notifyAdFailedToLoad(101);
            }
            return;
        }
        try {
            if(!Preference.getBooleanValue(this.mContext, "SSP_ENABLE:null", true)) {
                AdPieLog.e("AdController", new Exception("This app was blocked. (" + AdPieSDK.getInstance().getAppId() + ")"));
                AdEventListener adEventListener2 = this.mAdEventListener;
                if(adEventListener2 != null) {
                    adEventListener2.notifyAdFailedToLoad(101);
                    return;
                }
                return;
            }
        }
        catch(Exception unused_ex) {
        }
        if(!TextUtils.isEmpty(AdPieSDK.getInstance().getAppId())) {
            if(!AdPieSDK.getInstance().isInitialized()) {
                if(this.waitTime < 2000) {
                    Handler handler0 = this.mHandler;
                    if(handler0 != null) {
                        handler0.removeCallbacks(null);
                        this.mHandler = null;
                    }
                    Handler handler1 = new Handler(Looper.getMainLooper());
                    this.mHandler = handler1;
                    handler1.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            AdController.this.waitTime += 100;
                            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                                AdPieLog.d("AdController", "waiting : " + AdController.this.waitTime);
                            }
                            AdController.this.loadAd();
                        }
                    }, 100L);
                    return;
                }
                AdPieLog.d("AdController", "AdPie SDK must be initialized before ads loading.");
                AdEventListener adEventListener3 = this.mAdEventListener;
                if(adEventListener3 != null) {
                    adEventListener3.notifyAdFailedToLoad(105);
                }
                return;
            }
            if(this.mIsLoading) {
                AdPieLog.d("AdController", "AdPie (" + this.mSlotId + ") is already loading an ad. Wait for previous load to finish.");
                AdEventListener adEventListener4 = this.mAdEventListener;
                if(adEventListener4 != null) {
                    adEventListener4.notifyAdFailedToLoad(106);
                }
                return;
            }
            int v = AdPieSDK.getInstance().getNetworkConnectionType();
            if(v == 0) {
                AdEventListener adEventListener5 = this.mAdEventListener;
                if(adEventListener5 != null) {
                    adEventListener5.notifyAdFailedToLoad(103);
                }
                return;
            }
            long v1 = Preference.getLongValue(this.mContext, "REQUEST_TIME_" + this.mSlotId, 0L);
            long v2 = Preference.getLongValue(this.mContext, "REQUEST_LIMIT_INTERVAL_" + this.mSlotId, 3000L);
            long v3 = new Date().getTime();
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.d("AdController", "currentTime : " + v3 + ", preReqTime : " + v1 + ", requestLimit : " + v2);
            }
            if(v2 > 60000L) {
                v2 = 60000L;
            }
            if(v3 < v1 + v2) {
                AdEventListener adEventListener6 = this.mAdEventListener;
                if(adEventListener6 != null) {
                    adEventListener6.notifyAdFailedToLoad(110);
                }
                return;
            }
            Preference.putString(this.mContext, "MEDIA_ID_OF_SLOT_" + this.mSlotId, AdPieSDK.getInstance().getAppId());
            Preference.putLong(this.mContext, "REQUEST_TIME_" + this.mSlotId, v3);
            this.getRequest().setConnectionType(v);
            this.getRequest().setUserAgent(AdPieSDK.getInstance().getUserAgent());
            this.mIsLoading = true;
            this.fetchAd();
            return;
        }
        String s = Preference.getStringValue(this.mContext, "MEDIA_ID_OF_SLOT_" + this.mSlotId, null);
        if(!TextUtils.isEmpty(s)) {
            AdPieSDK.getInstance().initialize(this.mContext, s);
        }
        AdPieLog.d("AdController", "AdPie SDK must be initialized before ads loading.");
        AdEventListener adEventListener7 = this.mAdEventListener;
        if(adEventListener7 != null) {
            adEventListener7.notifyAdFailedToLoad(105);
        }
    }

    public void loadAd(HashMap hashMap0) {
        this.mQueryMap = hashMap0;
        this.loadAd();
    }

    private void parsing(Object object0) {
        int v10;
        long v9;
        int v8;
        try {
            AdResponse adResponse0 = new AdResponse();
            JSONObject jSONObject0 = new JSONObject(((String)object0));
            int v = jSONObject0.optInt("result", -1);
            adResponse0.setResult(v);
            adResponse0.setMessage(jSONObject0.optString("message"));
            JSONObject jSONObject1 = jSONObject0.optJSONObject("data");
            long v1 = 0L;
            if(jSONObject1 == null) {
            label_152:
                v10 = 0;
            }
            else {
                long v2 = jSONObject1.optLong("interval");
                long v3 = jSONObject1.optLong("limit");
                if(v3 == 0L) {
                    v3 = 3000L;
                }
                Preference.putLong(this.mContext, "REQUEST_LIMIT_INTERVAL_" + this.mSlotId, v3);
                if(v == 0) {
                    int v4 = jSONObject1.optInt("count");
                    JSONObject jSONObject2 = jSONObject1.optJSONObject("ad");
                    if(jSONObject2 == null) {
                        v8 = v4;
                        v9 = v2;
                    }
                    else {
                        int v5 = jSONObject2.optInt("ictype");
                        int v6 = jSONObject2.optInt("wv_clk_v2");
                        int v7 = jSONObject2.optInt("back_enable", 1);
                        if(v5 == 11 || v5 == 21) {
                            v8 = v4;
                            v9 = v2;
                            AdData adData0 = new AdData();
                            adData0.setIcType(v5);
                            adData0.setOrientation(jSONObject2.optInt("orientation"));
                            adData0.setWebviewLanding(v6);
                            adData0.setBackButtonEnabled(v7);
                            adData0.setAdm(jSONObject2.getString("adm"));
                            adData0.setAdmImageTag(jSONObject2.optString("adm_img_tag"));
                            adData0.setContentWidth(jSONObject2.optInt("width"));
                            adData0.setContentHeight(jSONObject2.optInt("height"));
                            adData0.setBgColor(jSONObject2.optString("bgcolor"));
                            adData0.setPosition(jSONObject2.optInt("position"));
                            adData0.setAnimationType(jSONObject2.optInt("animation"));
                            adData0.setCloseButtonPosition(jSONObject2.optInt("xposition"));
                            adData0.setCloseButtonDelay(jSONObject2.optLong("cbd"));
                            adData0.setMonitoring(jSONObject2.optInt("act"));
                            adData0.setWebviewLoadingSkip(jSONObject2.optInt("wvls"));
                            adData0.setCheckView(jSONObject2.optInt("check_view"));
                            adData0.setTrackingImpUrls(this.convertJSONArrayToArrayList(jSONObject2.optJSONArray("imptrackers")));
                            adData0.setTrackingClkUrls(this.convertJSONArrayToArrayList(jSONObject2.optJSONArray("clicktrackers")));
                            adResponse0.setAdData(adData0);
                        }
                        else {
                            v8 = v4;
                            v9 = v2;
                            switch(v5) {
                                case 0x1F: {
                                    JSONObject jSONObject5 = jSONObject2.getJSONObject("native");
                                    NativeAdData nativeAdData0 = new NativeAdData();
                                    nativeAdData0.setIcType(0x1F);
                                    nativeAdData0.setWebviewLanding(v6);
                                    nativeAdData0.setAssetTypes(this.convertJSONArrayToIntArray(jSONObject5.optJSONArray("assettype")));
                                    nativeAdData0.setTitle(jSONObject5.optString("title"));
                                    nativeAdData0.setDescription(jSONObject5.optString("desc"));
                                    nativeAdData0.setIconImageUrl(jSONObject5.optString("img_icon"));
                                    nativeAdData0.setMainImageUrl(jSONObject5.optString("img_main"));
                                    nativeAdData0.setMainWidth(jSONObject2.optInt("width"));
                                    nativeAdData0.setMainHeight(jSONObject2.optInt("height"));
                                    nativeAdData0.setCallToAction(jSONObject5.optString("cta"));
                                    nativeAdData0.setRating(jSONObject5.optDouble("rating"));
                                    nativeAdData0.setLink(jSONObject5.optString("link"));
                                    nativeAdData0.setTrackingImpUrls(this.convertJSONArrayToArrayList(jSONObject5.optJSONArray("imptrackers")));
                                    nativeAdData0.setTrackingClkUrls(this.convertJSONArrayToArrayList(jSONObject5.optJSONArray("clicktrackers")));
                                    nativeAdData0.setOptoutImageUrl(jSONObject5.optString("optout_img"));
                                    nativeAdData0.setOptoutLink(jSONObject5.optString("optout_link"));
                                    nativeAdData0.setOnlyClickCTA(jSONObject5.optInt("ck_cta"));
                                    adResponse0.setAdData(nativeAdData0);
                                    break;
                                }
                                case 0x20: {
                                    JSONObject jSONObject6 = jSONObject2.getJSONObject("video");
                                    NativeAdData nativeAdData1 = new NativeAdData();
                                    nativeAdData1.setIcType(0x20);
                                    nativeAdData1.setWebviewLanding(v6);
                                    nativeAdData1.setAssetTypes(this.convertJSONArrayToIntArray(jSONObject6.optJSONArray("assettype")));
                                    nativeAdData1.setTitle(jSONObject6.optString("title"));
                                    nativeAdData1.setDescription(jSONObject6.optString("description"));
                                    nativeAdData1.setIconImageUrl(jSONObject6.optString("img_icon"));
                                    nativeAdData1.setCallToAction(jSONObject6.optString("link_text"));
                                    nativeAdData1.setLink(jSONObject6.optString("link"));
                                    nativeAdData1.setOptoutImageUrl(jSONObject6.optString("optout_img"));
                                    nativeAdData1.setOptoutLink(jSONObject6.optString("optout_link"));
                                    nativeAdData1.setOnlyClickCTA(jSONObject6.optInt("ck_cta"));
                                    VideoAdData videoAdData1 = new VideoAdData();
                                    videoAdData1.setIcType(0x20);
                                    videoAdData1.setTitle(jSONObject6.optString("title"));
                                    videoAdData1.setDescription(jSONObject6.optString("description"));
                                    videoAdData1.setDuration(jSONObject6.optInt("duration"));
                                    videoAdData1.setLink(jSONObject6.optString("link"));
                                    videoAdData1.setLinkText(jSONObject6.optString("link_text"));
                                    videoAdData1.setVideoContent(jSONObject6.getString("content"));
                                    videoAdData1.setVideoContentType(jSONObject6.optString("content_type"));
                                    videoAdData1.setDelivery(jSONObject6.optInt("delivery"));
                                    videoAdData1.setContentWidth(jSONObject6.optInt("content_width"));
                                    videoAdData1.setContentHeight(jSONObject6.optInt("content_height"));
                                    videoAdData1.setAutoPlay(jSONObject6.optInt("autoplay") != 0);
                                    JSONObject jSONObject7 = jSONObject6.optJSONObject("trackers");
                                    if(jSONObject7 != null) {
                                        videoAdData1.setTrackingStartUrls(this.convertJSONArrayToArrayList(jSONObject7.optJSONArray("start")));
                                        videoAdData1.setTrackingFirstQuartileUrls(this.convertJSONArrayToArrayList(jSONObject7.optJSONArray("first_quartile")));
                                        videoAdData1.setTrackingMidpointUrls(this.convertJSONArrayToArrayList(jSONObject7.optJSONArray("midpoint")));
                                        videoAdData1.setTrackingThirdQuartileUrls(this.convertJSONArrayToArrayList(jSONObject7.optJSONArray("third_quartile")));
                                        videoAdData1.setTrackingCompleteUrls(this.convertJSONArrayToArrayList(jSONObject7.optJSONArray("complete")));
                                        videoAdData1.setTrackingImpUrls(this.convertJSONArrayToArrayList(jSONObject7.optJSONArray("impression")));
                                        nativeAdData1.setTrackingImpUrls(this.convertJSONArrayToArrayList(jSONObject7.optJSONArray("impression")));
                                        videoAdData1.setTrackingClkUrls(this.convertJSONArrayToArrayList(jSONObject7.optJSONArray("click")));
                                        nativeAdData1.setTrackingClkUrls(this.convertJSONArrayToArrayList(jSONObject7.optJSONArray("click")));
                                    }
                                    nativeAdData1.setVideoAdData(videoAdData1);
                                    adResponse0.setAdData(nativeAdData1);
                                    break;
                                }
                                default: {
                                    if(v5 != 22 && v5 != 42 && v5 != 52) {
                                        AdPieLog.i("AdController", "This icType is not matched. -> " + v5);
                                        AdEventListener adEventListener0 = this.mAdEventListener;
                                        if(adEventListener0 != null) {
                                            adEventListener0.notifyAdFailedToLoad(108);
                                        }
                                        return;
                                    }
                                    JSONObject jSONObject3 = jSONObject2.getJSONObject("video");
                                    VideoAdData videoAdData0 = new VideoAdData();
                                    videoAdData0.setIcType(v5);
                                    videoAdData0.setOrientation(jSONObject2.optInt("orientation"));
                                    videoAdData0.setWebviewLanding(v6);
                                    videoAdData0.setBackButtonEnabled(v7);
                                    videoAdData0.setTitle(jSONObject3.optString("title"));
                                    videoAdData0.setDescription(jSONObject3.optString("description"));
                                    videoAdData0.setSkipOffset(jSONObject3.optInt("skip_offset"));
                                    videoAdData0.setDuration(jSONObject3.optInt("duration"));
                                    videoAdData0.setLink(jSONObject3.optString("link"));
                                    videoAdData0.setLinkText(jSONObject3.optString("link_text"));
                                    videoAdData0.setVideoContent(jSONObject3.getString("content"));
                                    videoAdData0.setVideoContentType(jSONObject3.optString("content_type"));
                                    videoAdData0.setDelivery(jSONObject3.optInt("delivery"));
                                    videoAdData0.setContentWidth(jSONObject3.optInt("content_width"));
                                    videoAdData0.setContentHeight(jSONObject3.optInt("content_height"));
                                    videoAdData0.setOptoutImageUrl(jSONObject3.optString("optout_img"));
                                    videoAdData0.setOptoutLink(jSONObject3.optString("optout_link"));
                                    if(v5 == 52) {
                                        videoAdData0.setSsvUrl(jSONObject2.optString("ssv_url"));
                                    }
                                    JSONObject jSONObject4 = jSONObject3.optJSONObject("trackers");
                                    if(jSONObject4 != null) {
                                        videoAdData0.setTrackingStartUrls(this.convertJSONArrayToArrayList(jSONObject4.optJSONArray("start")));
                                        videoAdData0.setTrackingFirstQuartileUrls(this.convertJSONArrayToArrayList(jSONObject4.optJSONArray("first_quartile")));
                                        videoAdData0.setTrackingMidpointUrls(this.convertJSONArrayToArrayList(jSONObject4.optJSONArray("midpoint")));
                                        videoAdData0.setTrackingThirdQuartileUrls(this.convertJSONArrayToArrayList(jSONObject4.optJSONArray("third_quartile")));
                                        videoAdData0.setTrackingCompleteUrls(this.convertJSONArrayToArrayList(jSONObject4.optJSONArray("complete")));
                                        videoAdData0.setTrackingImpUrls(this.convertJSONArrayToArrayList(jSONObject4.optJSONArray("impression")));
                                        videoAdData0.setTrackingClkUrls(this.convertJSONArrayToArrayList(jSONObject4.optJSONArray("click")));
                                    }
                                    adResponse0.setAdData(videoAdData0);
                                }
                            }
                        }
                    }
                    v10 = v8;
                    v1 = v9;
                }
                else {
                    v1 = v2;
                    goto label_152;
                }
            }
            adResponse0.setInterval(v1);
            adResponse0.setCount(v10);
            AdEventListener adEventListener1 = this.mAdEventListener;
            if(adEventListener1 != null) {
                adEventListener1.receivedResponse(adResponse0);
            }
        }
        catch(Exception exception0) {
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.e("AdController", exception0);
            }
            AdEventListener adEventListener2 = this.mAdEventListener;
            if(adEventListener2 != null) {
                adEventListener2.notifyAdFailedToLoad(104);
            }
        }
    }

    public void setSlotID(String s) {
        this.mSlotId = s;
    }

    public void setTargetingData(TargetingData targetingData0) {
        this.mTargetingData = targetingData0;
    }
}

