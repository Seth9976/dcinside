package com.igaworks.ssp.plugin.unity;

import android.app.Activity;
import com.igaworks.ssp.SSPErrorCode;
import com.igaworks.ssp.b;
import com.igaworks.ssp.part.interstitial.AdPopcornSSPInterstitialAd;
import com.igaworks.ssp.part.interstitial.listener.IInterstitialEventCallbackListener;
import java.util.HashMap;

public class AdPopcornSSPUnityInterstitial {
    private Activity a;
    private AdPopcornSSPInterstitialAd b;

    public AdPopcornSSPUnityInterstitial(Activity activity0) {
        this.a = activity0;
        this.b = new AdPopcornSSPInterstitialAd(activity0);
    }

    private byte a(char c) {
        switch(c) {
            case 49: {
                return 1;
            }
            case 50: {
                return 2;
            }
            case 51: {
                return 3;
            }
            case 52: {
                return 4;
            }
            case 53: {
                return 5;
            }
            case 54: {
                return 6;
            }
            case 55: {
                return 7;
            }
            case 56: {
                return 8;
            }
            case 57: {
                return 9;
            }
            case 65: {
                return 10;
            }
            case 66: {
                return 11;
            }
            case 67: {
                return 12;
            }
            case 68: {
                return 13;
            }
            case 69: {
                return 14;
            }
            case 70: {
                return 15;
            }
            default: {
                return 0;
            }
        }
    }

    private int a(String s) {
        String s1 = s.toUpperCase();
        int v1 = 0;
        for(int v = 0; v < s1.length(); ++v) {
            v1 |= (this.a(s1.charAt(s1.length() - v - 1)) & 15) << v * 4;
        }
        return v1;
    }

    public boolean isLoaded() {
        try {
            return this.b.isLoaded();
        }
        catch(Exception unused_ex) {
            return false;
        }
    }

    public void loadAd() {
        synchronized(this) {
            this.a.runOnUiThread(new Runnable() {
                final AdPopcornSSPUnityInterstitial a;

                @Override
                public void run() {
                    if(AdPopcornSSPUnityInterstitial.this.b != null) {
                        AdPopcornSSPUnityInterstitial.this.b.loadAd();
                    }
                }

                public Runnable start() {
                    return this;
                }
            }.start());
        }
    }

    public void setCustomBooleanExtras(String s, boolean z) {
        try {
            b.c(Thread.currentThread(), "setBooleanCustomExtras : " + s + ", value : " + z);
            if(this.b != null) {
                HashMap hashMap0 = new HashMap();
                if(s != null && s.contentEquals("hideCloseBtn")) {
                    hashMap0.put("hideCloseBtn", Boolean.valueOf(z));
                }
                if(s != null && s.contentEquals("isEndingAd")) {
                    hashMap0.put("isEndingAd", Boolean.valueOf(z));
                }
                this.b.setCustomExtras(hashMap0);
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public void setCustomIntExtras(String s, int v) {
        int v1;
        try {
            b.c(Thread.currentThread(), "setIntCustomExtras : " + s + ", value : " + v);
            if(this.b != null) {
                HashMap hashMap0 = new HashMap();
                if(s != null && s.contentEquals("endingTextSize")) {
                    hashMap0.put("endingTextSize", v);
                }
                if(s != null && s.contentEquals("endingTextGravity")) {
                    if(v == 0) {
                        v1 = 3;
                    }
                    else {
                        v1 = v == 1 ? 17 : 5;
                    }
                    hashMap0.put("endingTextGravity", v1);
                }
                this.b.setCustomExtras(hashMap0);
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public void setCustomStringExtras(String s, String s1) {
        try {
            b.c(Thread.currentThread(), "setStringCustomExtras : " + s + ", value : " + s1);
            if(this.b != null) {
                HashMap hashMap0 = new HashMap();
                if(s != null && s.contentEquals("backgroundColor")) {
                    hashMap0.put("backgroundColor", this.a(s1));
                }
                if(s != null && s.contentEquals("endingTextColor")) {
                    hashMap0.put("endingTextColor", this.a(s1));
                }
                if(s != null && s.contentEquals("endingText")) {
                    hashMap0.put("endingText", s1);
                }
                this.b.setCustomExtras(hashMap0);
            }
        }
        catch(Exception unused_ex) {
        }
    }

    @Deprecated
    public void setEndingMessage(String s) {
        AdPopcornSSPInterstitialAd adPopcornSSPInterstitialAd0 = this.b;
        if(adPopcornSSPInterstitialAd0 != null) {
            adPopcornSSPInterstitialAd0.setEndingMessage(s);
        }
    }

    public void setInterstitialEventCallbackListener(AdPopcornSSPUnityInterstitialListener adPopcornSSPUnityInterstitialListener0) {
        AdPopcornSSPInterstitialAd adPopcornSSPInterstitialAd0 = this.b;
        if(adPopcornSSPInterstitialAd0 != null) {
            adPopcornSSPInterstitialAd0.setInterstitialEventCallbackListener(new IInterstitialEventCallbackListener() {
                final AdPopcornSSPUnityInterstitial b;

                @Override  // com.igaworks.ssp.part.interstitial.listener.IInterstitialEventCallbackListener
                public void OnInterstitialClicked() {
                    AdPopcornSSPUnityInterstitialListener adPopcornSSPUnityInterstitialListener0 = adPopcornSSPUnityInterstitialListener0;
                    if(adPopcornSSPUnityInterstitialListener0 != null) {
                        adPopcornSSPUnityInterstitialListener0.OnInterstitialClicked();
                    }
                }

                @Override  // com.igaworks.ssp.part.interstitial.listener.IInterstitialEventCallbackListener
                public void OnInterstitialClosed(int v) {
                    AdPopcornSSPUnityInterstitialListener adPopcornSSPUnityInterstitialListener0 = adPopcornSSPUnityInterstitialListener0;
                    if(adPopcornSSPUnityInterstitialListener0 != null) {
                        adPopcornSSPUnityInterstitialListener0.OnInterstitialClosed(v);
                    }
                }

                @Override  // com.igaworks.ssp.part.interstitial.listener.IInterstitialEventCallbackListener
                public void OnInterstitialLoaded() {
                    AdPopcornSSPUnityInterstitialListener adPopcornSSPUnityInterstitialListener0 = adPopcornSSPUnityInterstitialListener0;
                    if(adPopcornSSPUnityInterstitialListener0 != null) {
                        adPopcornSSPUnityInterstitialListener0.OnInterstitialLoaded();
                    }
                }

                @Override  // com.igaworks.ssp.part.interstitial.listener.IInterstitialEventCallbackListener
                public void OnInterstitialOpenFailed(SSPErrorCode sSPErrorCode0) {
                    AdPopcornSSPUnityInterstitialListener adPopcornSSPUnityInterstitialListener0 = adPopcornSSPUnityInterstitialListener0;
                    if(adPopcornSSPUnityInterstitialListener0 != null) {
                        adPopcornSSPUnityInterstitialListener0.OnInterstitialOpenFailed(sSPErrorCode0.getErrorCode(), sSPErrorCode0.getErrorMessage());
                    }
                }

                @Override  // com.igaworks.ssp.part.interstitial.listener.IInterstitialEventCallbackListener
                public void OnInterstitialOpened() {
                    AdPopcornSSPUnityInterstitialListener adPopcornSSPUnityInterstitialListener0 = adPopcornSSPUnityInterstitialListener0;
                    if(adPopcornSSPUnityInterstitialListener0 != null) {
                        adPopcornSSPUnityInterstitialListener0.OnInterstitialOpened();
                    }
                }

                @Override  // com.igaworks.ssp.part.interstitial.listener.IInterstitialEventCallbackListener
                public void OnInterstitialReceiveFailed(SSPErrorCode sSPErrorCode0) {
                    AdPopcornSSPUnityInterstitialListener adPopcornSSPUnityInterstitialListener0 = adPopcornSSPUnityInterstitialListener0;
                    if(adPopcornSSPUnityInterstitialListener0 != null) {
                        adPopcornSSPUnityInterstitialListener0.OnInterstitialReceiveFailed(sSPErrorCode0.getErrorCode(), sSPErrorCode0.getErrorMessage());
                    }
                }
            });
        }
    }

    @Deprecated
    public void setIsEndingInterstitial(boolean z) {
        AdPopcornSSPInterstitialAd adPopcornSSPInterstitialAd0 = this.b;
        if(adPopcornSSPInterstitialAd0 != null) {
            adPopcornSSPInterstitialAd0.setIsEndingInterstitial(z);
        }
    }

    public void setPlacementId(String s) {
        AdPopcornSSPInterstitialAd adPopcornSSPInterstitialAd0 = this.b;
        if(adPopcornSSPInterstitialAd0 != null) {
            adPopcornSSPInterstitialAd0.setPlacementId(s);
        }
    }

    public void showAd() {
        synchronized(this) {
            this.a.runOnUiThread(new Runnable() {
                final AdPopcornSSPUnityInterstitial a;

                @Override
                public void run() {
                    if(AdPopcornSSPUnityInterstitial.this.b != null) {
                        AdPopcornSSPUnityInterstitial.this.b.showAd();
                    }
                }

                public Runnable start() {
                    return this;
                }
            }.start());
        }
    }
}

