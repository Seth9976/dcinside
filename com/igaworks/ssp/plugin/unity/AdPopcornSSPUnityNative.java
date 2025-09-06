package com.igaworks.ssp.plugin.unity;

import android.app.Activity;
import com.igaworks.ssp.CustomAdType;
import com.igaworks.ssp.SSPErrorCode;
import com.igaworks.ssp.part.custom.AdPopcornSSPCustomAd;
import com.igaworks.ssp.part.custom.listener.ICustomAdListener;
import org.json.JSONObject;

public class AdPopcornSSPUnityNative {
    private Activity a;
    private AdPopcornSSPCustomAd b;

    public AdPopcornSSPUnityNative(Activity activity0) {
        this.a = activity0;
        AdPopcornSSPCustomAd adPopcornSSPCustomAd0 = new AdPopcornSSPCustomAd(activity0);
        this.b = adPopcornSSPCustomAd0;
        adPopcornSSPCustomAd0.setAdType(CustomAdType.NATIVE_AD);
    }

    public void loadAd() {
        synchronized(this) {
            this.a.runOnUiThread(new Runnable() {
                final AdPopcornSSPUnityNative a;

                @Override
                public void run() {
                    if(AdPopcornSSPUnityNative.this.b != null) {
                        AdPopcornSSPUnityNative.this.b.loadAd();
                    }
                }

                public Runnable start() {
                    return this;
                }
            }.start());
        }
    }

    public void reportClick() {
        synchronized(this) {
            try {
                this.a.runOnUiThread(new Runnable() {
                    final AdPopcornSSPUnityNative a;

                    @Override
                    public void run() {
                        if(AdPopcornSSPUnityNative.this.b != null) {
                            AdPopcornSSPUnityNative.this.b.reportClick();
                        }
                    }

                    public Runnable start() {
                        return this;
                    }
                }.start());
            }
            catch(Exception exception0) {
                exception0.printStackTrace();
            }
        }
    }

    public void reportImpression() {
        synchronized(this) {
            try {
                this.a.runOnUiThread(new Runnable() {
                    final AdPopcornSSPUnityNative a;

                    @Override
                    public void run() {
                        if(AdPopcornSSPUnityNative.this.b != null) {
                            AdPopcornSSPUnityNative.this.b.reportImpression();
                        }
                    }

                    public Runnable start() {
                        return this;
                    }
                }.start());
            }
            catch(Exception exception0) {
                exception0.printStackTrace();
            }
        }
    }

    public void setNativeEventCallbackListener(AdPopcornSSPUnityNativeListener adPopcornSSPUnityNativeListener0) {
        AdPopcornSSPCustomAd adPopcornSSPCustomAd0 = this.b;
        if(adPopcornSSPCustomAd0 != null) {
            adPopcornSSPCustomAd0.setCustomAdEventCallbackListener(new ICustomAdListener() {
                final AdPopcornSSPUnityNative b;

                @Override  // com.igaworks.ssp.part.custom.listener.ICustomAdListener
                public void OnCustomAdReceiveFailed(String s, SSPErrorCode sSPErrorCode0) {
                    AdPopcornSSPUnityNativeListener adPopcornSSPUnityNativeListener0 = adPopcornSSPUnityNativeListener0;
                    if(adPopcornSSPUnityNativeListener0 != null) {
                        adPopcornSSPUnityNativeListener0.OnNativeAdLoadFailed(sSPErrorCode0.getErrorCode(), sSPErrorCode0.getErrorMessage());
                    }
                }

                @Override  // com.igaworks.ssp.part.custom.listener.ICustomAdListener
                public void OnCustomAdReceiveSuccess(String s, String s1) {
                    if(adPopcornSSPUnityNativeListener0 != null) {
                        try {
                            JSONObject jSONObject0 = new JSONObject(s1);
                            String s2 = jSONObject0.getString("IconImageURL");
                            String s3 = jSONObject0.getString("MainImageURL");
                            String s4 = jSONObject0.getString("Title");
                            String s5 = jSONObject0.getString("Desc");
                            String s6 = jSONObject0.getString("CtaText");
                            String s7 = jSONObject0.getString("LandingURL");
                            String s8 = jSONObject0.getString("PrivacyPolicyImageURL");
                            String s9 = jSONObject0.getString("PrivacyPolicyURL");
                            adPopcornSSPUnityNativeListener0.OnNativeAdLoadSuccess(s4, s5, s2, s3, s6, s7, s8, s9);
                        }
                        catch(Exception unused_ex) {
                            if(adPopcornSSPUnityNativeListener0 != null) {
                                SSPErrorCode sSPErrorCode0 = new SSPErrorCode(5001);
                                adPopcornSSPUnityNativeListener0.OnNativeAdLoadFailed(sSPErrorCode0.getErrorCode(), "Load Ad Failed");
                            }
                        }
                    }
                }
            });
        }
    }

    public void setPlacementId(String s) {
        AdPopcornSSPCustomAd adPopcornSSPCustomAd0 = this.b;
        if(adPopcornSSPCustomAd0 != null) {
            adPopcornSSPCustomAd0.setPlacementId(s);
        }
    }
}

