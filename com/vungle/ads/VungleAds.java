package com.vungle.ads;

import T2.c;
import android.app.Application;
import android.content.Context;
import androidx.annotation.Keep;
import com.vungle.ads.internal.util.b;
import com.vungle.ads.internal.z;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import y4.l;
import y4.m;
import z3.f;
import z3.n;

public final class VungleAds {
    @Keep
    public static enum WrapperFramework {
        admob,
        air,
        cocos2dx,
        corona,
        dfp,
        heyzap,
        marmalade,
        mopub,
        unity,
        fyber,
        ironsource,
        upsight,
        appodeal,
        aerserv,
        adtoapp,
        tapdaq,
        vunglehbs,
        max,
        none;

        private static final WrapperFramework[] $values() [...] // Inlined contents
    }

    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @n
        public final void deInit(@l Context context0) {
            L.p(context0, "context");
            VungleAds.initializer.deInit$vungle_ads_release();
            b.Companion.deInit(context0);
        }

        @k(message = "Replaced with getBiddingToken(Context, BidTokenCallback) method.")
        @m
        @n
        public final String getBiddingToken(@l Context context0) {
            L.p(context0, "context");
            return VungleAds.vungleInternal.getAvailableBidTokens(context0);
        }

        @n
        public final void getBiddingToken(@l Context context0, @l V v0) {
            L.p(context0, "context");
            L.p(v0, "callback");
            VungleAds.vungleInternal.getAvailableBidTokensAsync(context0, v0);
        }

        @l
        @n
        public final String getSdkVersion() [...] // 潜在的解密器

        @n
        public final void init(@l Context context0, @l String s, @l f0 f00) {
            L.p(context0, "context");
            L.p(s, "appId");
            L.p(f00, "callback");
            if(!(context0 instanceof Application)) {
                context0 = context0.getApplicationContext();
            }
            L.o(context0, "appContext");
            VungleAds.initializer.init(s, context0, f00);
        }

        @n
        public final boolean isInitialized() {
            return VungleAds.initializer.isInitialized();
        }

        @n
        public final boolean isInline(@l String s) {
            L.p(s, "placementId");
            com.vungle.ads.internal.model.m m0 = com.vungle.ads.internal.k.INSTANCE.getPlacement(s);
            return m0 == null ? false : m0.isInline();
        }

        @n
        public final void setIntegrationName(@l WrapperFramework vungleAds$WrapperFramework0, @l String s) {
            L.p(vungleAds$WrapperFramework0, "wrapperFramework");
            L.p(s, "wrapperFrameworkVersion");
            VungleAds.initializer.setIntegrationName(vungleAds$WrapperFramework0, s);
        }
    }

    @l
    public static final a Companion = null;
    @l
    public static final String TAG = "VungleAds";
    @l
    @f
    public static final c firstPartyData;
    @l
    private static com.vungle.ads.internal.w initializer;
    @l
    private static z vungleInternal;

    static {
        VungleAds.Companion = new a(null);
        VungleAds.vungleInternal = new z();
        VungleAds.initializer = new com.vungle.ads.internal.w();
        VungleAds.firstPartyData = new c();
    }

    @n
    public static final void deInit(@l Context context0) {
        VungleAds.Companion.deInit(context0);
    }

    @k(message = "Replaced with getBiddingToken(Context, BidTokenCallback) method.")
    @m
    @n
    public static final String getBiddingToken(@l Context context0) {
        return VungleAds.Companion.getBiddingToken(context0);
    }

    @n
    public static final void getBiddingToken(@l Context context0, @l V v0) {
        VungleAds.Companion.getBiddingToken(context0, v0);
    }

    // 去混淆评级： 低(20)
    @l
    @n
    public static final String getSdkVersion() {
        return "7.4.3";
    }

    @n
    public static final void init(@l Context context0, @l String s, @l f0 f00) {
        VungleAds.Companion.init(context0, s, f00);
    }

    @n
    public static final boolean isInitialized() {
        return VungleAds.Companion.isInitialized();
    }

    @n
    public static final boolean isInline(@l String s) {
        return VungleAds.Companion.isInline(s);
    }

    @n
    public static final void setIntegrationName(@l WrapperFramework vungleAds$WrapperFramework0, @l String s) {
        VungleAds.Companion.setIntegrationName(vungleAds$WrapperFramework0, s);
    }
}

