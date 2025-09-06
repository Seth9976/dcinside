package com.fsn.cauly;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.util.HashMap;

public class CaulyAdInfoBuilder {
    public static final String ADAPTIVE = "Adaptive";
    public static final String FIXED = "Fixed";
    @Deprecated
    public static final String FIXED_50 = "Fixed_50";
    public static final String PROPORTIONAL = "Proportional";
    public static final String SQUARE = "Square";
    protected HashMap a;

    public CaulyAdInfoBuilder(Context context0, AttributeSet attributeSet0) {
        this.a = new HashMap();
        this.appCode(attributeSet0.getAttributeValue("http://schemas.android.com/apk/res/com.dcinside.app.android", "appcode"));
        this.gender(attributeSet0.getAttributeValue("http://schemas.android.com/apk/res/com.dcinside.app.android", "gender"));
        this.age(attributeSet0.getAttributeValue("http://schemas.android.com/apk/res/com.dcinside.app.android", "age"));
        this.tagForChildDirectedTreatment(false);
        this.gdprConsentAvailable(false);
        this.effect(attributeSet0.getAttributeValue("http://schemas.android.com/apk/res/com.dcinside.app.android", "effect"));
        this.dynamicReloadInterval(attributeSet0.getAttributeBooleanValue("http://schemas.android.com/apk/res/com.dcinside.app.android", "dynamicReloadInterval", true));
        this.reloadInterval(attributeSet0.getAttributeIntValue("http://schemas.android.com/apk/res/com.dcinside.app.android", "reloadInterval", 30));
        this.bannerHeight(attributeSet0.getAttributeValue("http://schemas.android.com/apk/res/com.dcinside.app.android", "bannerHeight"));
        this.enableDefaultBannerAd(attributeSet0.getAttributeBooleanValue("http://schemas.android.com/apk/res/com.dcinside.app.android", "enableDefaultAd", false));
        this.statusbarHide(false);
        this.banner_interval(true);
        String s = attributeSet0.getAttributeValue("http://schemas.android.com/apk/res/com.dcinside.app.android", "banner_customSize_width");
        String s1 = attributeSet0.getAttributeValue("http://schemas.android.com/apk/res/com.dcinside.app.android", "banner_customSize_height");
        if(s != null && s1 != null) {
            this.setBannerSize(Integer.parseInt(s), Integer.parseInt(s1));
        }
    }

    public CaulyAdInfoBuilder(String s) {
        this.a = new HashMap();
        this.appCode(s);
        this.gender("all");
        this.age("all");
        this.tagForChildDirectedTreatment(false);
        this.gdprConsentAvailable(false);
        this.effect("LeftSlide");
        this.dynamicReloadInterval(true);
        this.reloadInterval(30);
        this.bannerHeight("Proportional");
        this.statusbarHide(false);
        this.banner_interval(true);
    }

    public CaulyAdInfoBuilder adContentId(int v) {
        this.a.put("ad_content_id", v);
        return this;
    }

    public CaulyAdInfoBuilder adDim(String s) {
        this.a.put("ad_dim", s);
        return this;
    }

    public CaulyAdInfoBuilder age(String s) {
        this.a.put("age", CaulyAdInfo.a(s).toString());
        return this;
    }

    public CaulyAdInfoBuilder appCode(String s) {
        this.a.put("appcode", s);
        return this;
    }

    public CaulyAdInfoBuilder bannerCornerRound(int v) {
        this.a.put("banner_corner_round", v);
        return this;
    }

    public CaulyAdInfoBuilder bannerHeight(String s) {
        this.a.put("bannerHeight", CaulyAdInfo.c(s).toString());
        return this;
    }

    public CaulyAdInfoBuilder banner_interval(boolean z) {
        this.a.put("banner_interval", Boolean.valueOf(z));
        return this;
    }

    public CaulyAdInfo build() {
        return new CaulyAdInfo(this);
    }

    public CaulyAdInfoBuilder dynamicReloadInterval(boolean z) {
        this.a.put("dynamicReloadInterval", Boolean.valueOf(z));
        return this;
    }

    public CaulyAdInfoBuilder effect(String s) {
        if(!TextUtils.isEmpty(((String)this.a.get("bannerViewClass")))) {
            s = "None";
        }
        this.a.put("effect", CaulyAdInfo.d(s).toString());
        return this;
    }

    public CaulyAdInfoBuilder enableDefaultBannerAd(boolean z) {
        this.a.put("enable_default_ad", Boolean.valueOf(z));
        return this;
    }

    public CaulyAdInfoBuilder enableLock(boolean z) {
        this.a.put("enable_lock", Boolean.valueOf(z));
        return this;
    }

    public CaulyAdInfoBuilder gdprConsentAvailable(boolean z) {
        this.a.put("gdpr_consent", Boolean.valueOf(z));
        return this;
    }

    public CaulyAdInfoBuilder gender(String s) {
        this.a.put("gender", CaulyAdInfo.e(s).toString());
        return this;
    }

    public CaulyAdInfoBuilder layoutID(int v) {
        this.a.put("layout_id", v);
        return this;
    }

    public CaulyAdInfoBuilder leftButtonId(int v) {
        this.a.put("left_btn_id", v);
        return this;
    }

    public CaulyAdInfoBuilder reloadInterval(int v) {
        this.a.put("reloadInterval", v);
        return this;
    }

    public CaulyAdInfoBuilder rightButtonId(int v) {
        this.a.put("right_btn_id", v);
        return this;
    }

    public CaulyAdInfoBuilder setBannerSize(int v, int v1) {
        this.a.put("banner_customSize_x", Integer.toString(v));
        this.a.put("banner_customSize_y", Integer.toString(v1));
        this.a.put("ad_dim", v + "x" + v1);
        return this;
    }

    public CaulyAdInfoBuilder statusbarHide(boolean z) {
        this.a.put("statusbar_hide", Boolean.valueOf(z));
        return this;
    }

    public CaulyAdInfoBuilder tagForChildDirectedTreatment(boolean z) {
        this.a.put("coppa", Boolean.valueOf(z));
        return this;
    }

    public CaulyAdInfoBuilder testVersion(boolean z) {
        this.a.put("is_test", Boolean.valueOf(z));
        return this;
    }

    public CaulyAdInfoBuilder threadPriority(int v) {
        this.a.put("priority", v);
        return this;
    }

    public CaulyAdInfoBuilder timeoutSec(int v) {
        this.a.put("timeout_sec", v);
        return this;
    }

    public CaulyAdInfoBuilder userTargetBrowser(String s) {
        this.a.put("userTargetBrowser", s);
        return this;
    }

    public CaulyAdInfoBuilder youtubeKey(String s) {
        this.a.put("youtube_key", s);
        return this;
    }
}

