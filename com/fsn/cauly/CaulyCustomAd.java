package com.fsn.cauly;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CaulyCustomAd extends RelativeLayout implements BDAdProxyListener, OnCommandCompletedListener {
    public static final int BANNER_LANDSCAPE = 4;
    public static final int INTERSTITIAL_PORTRAIT = 0;
    public static final int NATIVE_LANDSCAPE = 3;
    public static final int NATIVE_PORTRAIT = 2;
    CaulyAdInfo a;
    CaulyCustomAdListener b;
    BDAdProxy c;
    BDDelayedCommand d;
    Context e;
    Bitmap f;
    ArrayList g;
    String h;
    int i;
    boolean j;
    String k;
    boolean l;
    static ArrayList m;

    static {
        CaulyCustomAd.m = new ArrayList();
    }

    public CaulyCustomAd(Context context0) {
        super(context0);
        this.j = false;
        this.l = false;
        this.e = context0;
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void OnAdItemReceived(int v, Object object0) {
        Logger.writeLog(LogLevel.Debug, "CaulyCustomAd - onLoadedAd(" + v + ")" + object0);
        if(this.l) {
            this.b();
            return;
        }
        this.l = true;
        CaulyCustomAdListener caulyCustomAdListener0 = this.b;
        if(object0 != null) {
            switch(this.i) {
                case 0: {
                    if(object0 instanceof Bitmap) {
                        this.f = (Bitmap)object0;
                        if(caulyCustomAdListener0 != null) {
                            caulyCustomAdListener0.onLoadedAd(v == 0);
                        }
                        return;
                    }
                    if(object0 instanceof ArrayList && ((ArrayList)object0).size() == 2) {
                        Object object1 = ((ArrayList)object0).get(0);
                        Object object2 = ((ArrayList)object0).get(1);
                        if(object2 instanceof String) {
                            this.k = (String)object2;
                        }
                        if(object1 instanceof Bitmap) {
                            this.f = (Bitmap)object1;
                            if(caulyCustomAdListener0 != null) {
                                caulyCustomAdListener0.onLoadedAd(v == 0);
                            }
                        }
                        return;
                    }
                    break;
                }
                case 2: 
                case 3: {
                    if(this.j) {
                        if(object0 instanceof String) {
                            this.h = (String)object0;
                            caulyCustomAdListener0.onLoadedAd(v == 0);
                            return;
                        }
                    }
                    else if(object0 instanceof ArrayList) {
                        this.g = new ArrayList();
                        for(Object object3: ((ArrayList)object0)) {
                            CaulyNativeAdView caulyNativeAdView0 = new CaulyNativeAdView(this.getContext());
                            HashMap hashMap0 = (HashMap)this.a.a.clone();
                            hashMap0.put("adItem", object3);
                            caulyNativeAdView0.setDataObject(hashMap0);
                            this.g.add(caulyNativeAdView0);
                        }
                        caulyCustomAdListener0.onLoadedAd(v == 0);
                        return;
                    }
                    break;
                }
                case 4: {
                    if(object0 instanceof String) {
                        this.h = (String)object0;
                        caulyCustomAdListener0.onLoadedAd(v == 0);
                        return;
                    }
                }
            }
            if(caulyCustomAdListener0 != null) {
                caulyCustomAdListener0.onFailedAd(-100, "internal error");
            }
        }
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void OnCusomMessageReceived(int v, Object object0) {
    }

    // 去混淆评级： 低(20)
    String a(String s, JSONObject jSONObject0, String s1) {
        return !jSONObject0.has(s) || TextUtils.isEmpty(jSONObject0.getString(s)) ? s1 : jSONObject0.getString(s);
    }

    public void attachLayout(ViewGroup viewGroup0) {
        if(viewGroup0 != null) {
            viewGroup0.addView(this);
            viewGroup0.setOnClickListener(new View.OnClickListener() {
                final CaulyCustomAd a;

                @Override  // android.view.View$OnClickListener
                public void onClick(View view0) {
                    BDAdProxy bDAdProxy0 = CaulyCustomAd.this.c;
                    if(bDAdProxy0 != null) {
                        bDAdProxy0.a(17, null, null);
                    }
                    CaulyCustomAdListener caulyCustomAdListener0 = CaulyCustomAd.this.b;
                    if(caulyCustomAdListener0 != null) {
                        caulyCustomAdListener0.onClikedAd();
                    }
                }
            });
        }
    }

    private void b() {
        BDDelayedCommand bDDelayedCommand0 = this.d;
        if(bDDelayedCommand0 != null) {
            bDDelayedCommand0.cancel();
        }
        this.d = null;
    }

    private void c(int v) {
        if(v > 0) {
            BDDelayedCommand bDDelayedCommand0 = this.d;
            if(bDDelayedCommand0 != null) {
                bDDelayedCommand0.cancel();
            }
            BDDelayedCommand bDDelayedCommand1 = new BDDelayedCommand(v * 1000);
            this.d = bDDelayedCommand1;
            bDDelayedCommand1.setOnCommandResult(this);
            this.d.execute();
        }
    }

    public void cancel() {
        if(this.c == null) {
            return;
        }
        Logger.writeLog(LogLevel.Debug, "CaulyCustomAd - cancel");
        ArrayList arrayList0 = this.g;
        if(arrayList0 != null) {
            for(Object object0: arrayList0) {
                ((CaulyNativeAdView)object0).destroy();
            }
            this.g.clear();
        }
        this.c.e(null);
        this.c.r();
        this.c = null;
        CaulyCustomAd.m.remove(this);
    }

    public List getAdsList() {
        HashMap hashMap0;
        int v;
        if(!TextUtils.isEmpty(this.h)) {
            List list0 = new ArrayList();
            try {
                JSONObject jSONObject0 = new JSONObject(this.h);
                if(!jSONObject0.has("ads")) {
                    return list0;
                }
                JSONArray jSONArray0 = jSONObject0.getJSONArray("ads");
                v = 0;
                while(true) {
                label_6:
                    if(v < jSONArray0.length()) {
                        hashMap0 = new HashMap();
                        Object object0 = jSONArray0.get(v);
                        hashMap0.put("id", this.a("id", ((JSONObject)object0), ""));
                        hashMap0.put("image", this.a("image", ((JSONObject)object0), ""));
                        hashMap0.put("title", this.a("title", ((JSONObject)object0), ""));
                        hashMap0.put("subtitle", this.a("subtitle", ((JSONObject)object0), ""));
                        hashMap0.put("description", this.a("description", ((JSONObject)object0), ""));
                        hashMap0.put("icon", this.a("icon", ((JSONObject)object0), ""));
                        hashMap0.put("ad_charge_type", this.a("ad_charge_type", ((JSONObject)object0), ""));
                        hashMap0.put("linkUrl", this.a("linkUrl", ((JSONObject)object0), ""));
                        hashMap0.put("price", this.a("price", ((JSONObject)object0), ""));
                        hashMap0.put("earntype", this.a("earntype", ((JSONObject)object0), ""));
                        hashMap0.put("image_l", this.a("image_l", ((JSONObject)object0), ""));
                        hashMap0.put("image_r", this.a("image_r", ((JSONObject)object0), ""));
                        hashMap0.put("image_content_type", this.a("image_content_type", ((JSONObject)object0), ""));
                        hashMap0.put("bg_color", this.a("bg_color", ((JSONObject)object0), ""));
                        hashMap0.put("optout_img_url", this.a("optout_img_url", ((JSONObject)object0), ""));
                        hashMap0.put("optout_url", this.a("optout_url", ((JSONObject)object0), ""));
                        hashMap0.put("optout", this.a("optout", ((JSONObject)object0), ""));
                        break;
                    }
                    return list0;
                }
            }
            catch(JSONException unused_ex) {
                return list0;
            }
            try {
                list0.add(hashMap0);
                ++v;
                goto label_6;
            }
            catch(JSONException unused_ex) {
                return list0;
            }
        }
        return null;
    }

    public Object getCustomParam(String s, Object object0) {
        if(!TextUtils.isEmpty(this.h)) {
            try {
                JSONObject jSONObject0 = new JSONObject(this.h);
                if(jSONObject0.has("custom_params")) {
                    String s1 = jSONObject0.getString("custom_params");
                    if(!TextUtils.isEmpty(s1)) {
                        JSONObject jSONObject1 = new JSONObject(s1);
                        return jSONObject1.has(s) ? jSONObject1.get(s) : object0;
                    }
                }
                return object0;
            }
            catch(JSONException unused_ex) {
            }
        }
        return object0;
    }

    public String getExtraInfos() {
        return this.k;
    }

    public Bitmap getImageBitmap() {
        return this.f;
    }

    public String getJsonString() {
        return this.h;
    }

    public ArrayList getNativeAdViews() {
        return this.g;
    }

    public String getOptoutUrl(String s, String s1) {
        return "http://rd.cauly.co.kr/opt-out?sdk_type=native&platform=Android&code=" + s + "&scode=" + BDPrefUtil.getStrValue(this.getContext(), "GID", "") + "&ad_cd=" + s1;
    }

    public void loadData(CaulyNativeAdView caulyNativeAdView0) {
        caulyNativeAdView0.a(AdType.Multi);
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        BDAdProxy bDAdProxy0 = this.c;
        if(bDAdProxy0 != null) {
            bDAdProxy0.a(16, null, null);
            CaulyCustomAdListener caulyCustomAdListener0 = this.b;
            if(caulyCustomAdListener0 != null) {
                caulyCustomAdListener0.onShowedAd();
            }
        }
        super.onAttachedToWindow();
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onClickAd() {
        Logger.writeLog(LogLevel.Debug, "CaulyCustomAd - onClickAd");
        CaulyCustomAdListener caulyCustomAdListener0 = this.b;
        if(caulyCustomAdListener0 == null) {
            return;
        }
        caulyCustomAdListener0.onClikedAd();
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onClickAd(boolean z) {
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onCloseLandingScreen() {
    }

    @Override  // com.fsn.cauly.BDCommand$OnCommandCompletedListener
    public void onCommandCompleted(BDCommand bDCommand0) {
        CaulyCustomAdListener caulyCustomAdListener0 = this.b;
        if(caulyCustomAdListener0 != null && !this.l) {
            caulyCustomAdListener0.onFailedAd(-500, "request Timeout");
            this.l = true;
            this.cancel();
        }
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onFailedToLoad(int v, String s) {
        Logger.writeLog(LogLevel.Debug, "CaulyCustomAd - onFailedAd(" + v + ")" + s);
        if(this.l) {
            this.b();
            return;
        }
        this.l = true;
        CaulyCustomAdListener caulyCustomAdListener0 = this.b;
        if(caulyCustomAdListener0 == null) {
            return;
        }
        caulyCustomAdListener0.onFailedAd(v, s);
        CaulyCustomAd.m.remove(this);
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onInterstitialAdClosed() {
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onModuleLoaded() {
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onShowLandingScreen() {
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onSucceededToLoad(int v, String s) {
    }

    public void requestAd(int v) {
        this.requestAdView(v, 1);
    }

    public void requestAdData(int v, int v1) {
        this.requestAdData(v, v1, 0);
    }

    public void requestAdData(int v, int v1, int v2) {
        if(this.c != null) {
            this.cancel();
        }
        Logger.writeLog(LogLevel.Debug, "CaulyCustomAd - start");
        this.i = v;
        this.l = false;
        this.j = true;
        HashMap hashMap0 = (HashMap)this.a.b().clone();
        hashMap0.put("adType", AdType.Custom.ordinal());
        hashMap0.put("custom_type", v);
        hashMap0.put("ret_data", Boolean.TRUE);
        hashMap0.put("ad_count", v1);
        hashMap0.put("sdk_viewtype", "img");
        hashMap0.put("custom_instl", "y");
        BDAdProxy bDAdProxy0 = new BDAdProxy(hashMap0, this.e, this);
        this.c = bDAdProxy0;
        bDAdProxy0.e(this);
        this.c.p();
        CaulyCustomAd.m.add(this);
        this.c(v2);
    }

    public void requestAdView(int v, int v1) {
        if(this.c != null) {
            this.cancel();
        }
        Logger.writeLog(LogLevel.Debug, "CaulyCustomAd - start");
        this.i = v;
        this.j = false;
        HashMap hashMap0 = (HashMap)this.a.b().clone();
        hashMap0.put("adType", AdType.Custom.ordinal());
        hashMap0.put("custom_type", v);
        hashMap0.put("ad_count", v1);
        hashMap0.put("sdk_viewtype", "img");
        hashMap0.put("custom_instl", "y");
        BDAdProxy bDAdProxy0 = new BDAdProxy(hashMap0, this.e, this);
        this.c = bDAdProxy0;
        bDAdProxy0.e(this);
        this.c.p();
        CaulyCustomAd.m.add(this);
    }

    public void sendImpressInform(String s) {
        BDAdProxy bDAdProxy0 = this.c;
        if(bDAdProxy0 != null) {
            bDAdProxy0.a(16, s, null);
        }
    }

    public void setAdInfo(CaulyAdInfo caulyAdInfo0) {
        this.a = caulyAdInfo0;
    }

    public void setCustomAdListener(CaulyCustomAdListener caulyCustomAdListener0) {
        this.b = caulyCustomAdListener0;
    }
}

