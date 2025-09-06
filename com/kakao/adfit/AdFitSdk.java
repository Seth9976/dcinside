package com.kakao.adfit;

import android.content.Context;
import android.webkit.WebView;
import androidx.annotation.MainThread;
import com.kakao.adfit.a.w;
import com.kakao.adfit.ads.a;
import com.kakao.adfit.ads.na.AdFitVideoAutoPlayPolicy;
import com.kakao.adfit.m.B;
import com.kakao.adfit.m.r;
import kotlin.jvm.internal.L;
import y4.l;
import z3.n;

public final class AdFitSdk {
    @l
    public static final String BUILD_ID = "912573df-78e9-4e24-9347-3dfd3ae483ec";
    @l
    public static final AdFitSdk INSTANCE = null;
    @l
    public static final String SDK_VERSION = "3.17.2";
    private static AdFitVideoAutoPlayPolicy a;

    static {
        AdFitSdk.INSTANCE = new AdFitSdk();
        AdFitSdk.a = w.a.b();
    }

    @n
    public static final void clearKakaoAccountInfo() {
        r.a.a();
    }

    @l
    @n
    public static final String getKakaoAid() {
        return B.a.a();
    }

    @l
    public static final AdFitVideoAutoPlayPolicy getVideoAdAutoPlayPolicy() {
        return AdFitSdk.a;
    }

    @n
    public static void getVideoAdAutoPlayPolicy$annotations() {
    }

    @MainThread
    @n
    public static final boolean register(@l WebView webView0) {
        L.p(webView0, "webView");
        return a.f.a(webView0);
    }

    @n
    public static final void setGdprConsent(boolean z) {
        B.a.b(Boolean.valueOf(z));
    }

    @n
    public static final void setKakaoAccountId(@l Context context0, @l String s) {
        L.p(context0, "context");
        L.p(s, "accountId");
        r.a.a(context0, s);
    }

    @n
    public static final void setKakaoUserId(@l Context context0, @l String s, long v) {
        L.p(context0, "context");
        L.p(s, "appKey");
        r.a.a(context0, s, v);
    }

    @n
    public static final void setRestrictedAge(boolean z) {
        B.a.a(Boolean.valueOf(z));
    }

    public static final void setVideoAdAutoPlayPolicy(@l AdFitVideoAutoPlayPolicy adFitVideoAutoPlayPolicy0) {
        L.p(adFitVideoAutoPlayPolicy0, "value");
        if(AdFitSdk.a != adFitVideoAutoPlayPolicy0) {
            synchronized(AdFitSdk.INSTANCE) {
                if(AdFitSdk.a != adFitVideoAutoPlayPolicy0) {
                    AdFitSdk.a = adFitVideoAutoPlayPolicy0;
                    com.kakao.adfit.c.a a0 = w.a.a(adFitVideoAutoPlayPolicy0);
                    w.a.a(a0);
                }
            }
        }
    }
}

