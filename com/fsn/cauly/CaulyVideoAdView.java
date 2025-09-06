package com.fsn.cauly;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;

public class CaulyVideoAdView extends RelativeLayout implements BDAdProxyListener {
    public static final int MSG_VIDEO_CLICK = 203;
    public static final int MSG_VIDEO_COMPLETED = 201;
    public static final int MSG_VIDEO_ERROR = 202;
    public static final int MSG_VIDEO_SKIPED = 204;
    public static final int MSG_VIDEO_STARTED = 200;
    CaulyAdInfo a;
    HashMap b;
    CaulyVideoAdViewListener c;
    boolean d;
    boolean e;
    boolean f;
    BDAdProxy g;
    BDCommand h;
    CaulyVideoAdView i;
    ViewGroup j;
    String k;
    int l;
    static ArrayList m;

    static {
        CaulyVideoAdView.m = new ArrayList();
    }

    public CaulyVideoAdView(Context context0) {
        super(context0);
        this.l = 0;
    }

    public CaulyVideoAdView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.l = 0;
        this.a = new CaulyAdInfoBuilder(context0, attributeSet0).build();
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void OnAdItemReceived(int v, Object object0) {
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void OnCusomMessageReceived(int v, Object object0) {
        switch(v) {
            case 200: {
                CaulyVideoAdViewListener caulyVideoAdViewListener0 = this.c;
                if(caulyVideoAdViewListener0 != null) {
                    caulyVideoAdViewListener0.onStartVideoAd();
                    return;
                }
                break;
            }
            case 201: {
                CaulyVideoAdViewListener caulyVideoAdViewListener1 = this.c;
                if(caulyVideoAdViewListener1 != null) {
                    caulyVideoAdViewListener1.onFinishVideoAd(201, "COMPLETE");
                    return;
                }
                break;
            }
            case 202: {
                CaulyVideoAdViewListener caulyVideoAdViewListener2 = this.c;
                if(caulyVideoAdViewListener2 != null) {
                    caulyVideoAdViewListener2.onFinishVideoAd(202, ((String)object0));
                    return;
                }
                break;
            }
            case 203: {
                CaulyVideoAdViewListener caulyVideoAdViewListener3 = this.c;
                if(caulyVideoAdViewListener3 != null) {
                    caulyVideoAdViewListener3.onFinishVideoAd(203, "CLICK");
                    return;
                }
                break;
            }
            case 204: {
                CaulyVideoAdViewListener caulyVideoAdViewListener4 = this.c;
                if(caulyVideoAdViewListener4 != null) {
                    caulyVideoAdViewListener4.onFinishVideoAd(204, "SKIP");
                    return;
                }
                break;
            }
        }
    }

    public void attachToView(ViewGroup viewGroup0) {
        if(this.g == null) {
            return;
        }
        if(this.j != null) {
            return;
        }
        this.j = viewGroup0;
        viewGroup0.addView(this);
    }

    public void destroy() {
        if(this.e) {
            BDAdProxy bDAdProxy0 = this.g;
            if(bDAdProxy0 != null) {
                this.e = false;
                bDAdProxy0.r();
                this.g = null;
                BDCommand bDCommand0 = this.h;
                if(bDCommand0 != null) {
                    bDCommand0.cancel();
                    this.h = null;
                }
                CaulyVideoAdView caulyVideoAdView0 = this.i;
                if(caulyVideoAdView0 != null) {
                    CaulyVideoAdView.m.remove(caulyVideoAdView0);
                    this.i = null;
                }
                Logger.writeLog(LogLevel.Debug, "Video - Destroyed");
            }
        }
    }

    public CaulyAdInfo getAdInfo() {
        return this.a;
    }

    public boolean isAttachedtoView() {
        return this.d;
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onClickAd() {
        Logger.writeLog(LogLevel.Debug, "Video - onCloseClick");
        CaulyVideoAdViewListener caulyVideoAdViewListener0 = this.c;
        if(caulyVideoAdViewListener0 != null) {
            caulyVideoAdViewListener0.onFinishVideoAd(203, "CLICK");
        }
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onClickAd(boolean z) {
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onCloseLandingScreen() {
        Logger.writeLog(LogLevel.Debug, "Video - onCloseLandingScreen");
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onFailedToLoad(int v, String s) {
        Logger.writeLog(LogLevel.Debug, "Video - onFailedToReceiveAd (" + v + ") " + s);
        CaulyVideoAdViewListener caulyVideoAdViewListener0 = this.c;
        if(caulyVideoAdViewListener0 == null) {
            return;
        }
        caulyVideoAdViewListener0.onFailToReceiveVideoAd(this, v, s);
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onInterstitialAdClosed() {
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onModuleLoaded() {
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onShowLandingScreen() {
        Logger.writeLog(LogLevel.Debug, "Video - onShowLandingScreen");
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onSucceededToLoad(int v, String s) {
        Logger.writeLog(LogLevel.Debug, "Video - onReceiveAd (" + v + ") " + s);
        CaulyVideoAdViewListener caulyVideoAdViewListener0 = this.c;
        if(caulyVideoAdViewListener0 == null) {
            return;
        }
        caulyVideoAdViewListener0.onReceiveVideoAd(this, v == 0);
    }

    public void request() {
        Logger.writeLog(LogLevel.Debug, "Video - request");
        this.e = true;
        this.f = false;
        HashMap hashMap0 = (HashMap)this.a.b().clone();
        hashMap0.put("adType", AdType.Video.ordinal());
        if(!TextUtils.isEmpty(this.k)) {
            hashMap0.put("keyword", this.k);
        }
        int v = this.l;
        if(v > 0) {
            hashMap0.put("skip_count", v);
        }
        BDAdProxy bDAdProxy0 = new BDAdProxy(hashMap0, this.getContext(), this);
        this.g = bDAdProxy0;
        bDAdProxy0.e(this);
        this.g.p();
        this.i = this;
        CaulyVideoAdView.m.add(this);
    }

    public void setAdInfo(CaulyAdInfo caulyAdInfo0) {
        this.a = caulyAdInfo0;
    }

    public void setAdViewListener(CaulyVideoAdViewListener caulyVideoAdViewListener0) {
        this.c = caulyVideoAdViewListener0;
    }

    protected void setDataObject(HashMap hashMap0) {
        this.b = hashMap0;
    }

    public void setKeywords(String s) {
        String s1;
        try {
            s1 = URLEncoder.encode(s, "UTF-8");
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            unsupportedEncodingException0.printStackTrace();
            s1 = "";
        }
        this.k = s1;
    }

    public void setSkipCount(int v) {
        this.l = v;
    }
}

