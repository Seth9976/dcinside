package com.dcinside.app.ad.mediation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.kakao.adfit.ads.AdListener;
import com.kakao.adfit.ads.ba.BannerAdView;
import kotlin.jvm.internal.L;
import y4.l;

final class a implements MediationBannerAd, AdListener {
    @l
    private final MediationBannerAdConfiguration a;
    @l
    private final MediationAdLoadCallback b;
    @l
    private final String c;
    private BannerAdView d;

    public a(@l MediationBannerAdConfiguration mediationBannerAdConfiguration0, @l MediationAdLoadCallback mediationAdLoadCallback0) {
        L.p(mediationBannerAdConfiguration0, "configuration");
        L.p(mediationAdLoadCallback0, "callback");
        super();
        this.a = mediationBannerAdConfiguration0;
        this.b = mediationAdLoadCallback0;
        this.c = "com.kakao.adfit";
    }

    @l
    public final MediationAdLoadCallback a() {
        return this.b;
    }

    @l
    public final MediationBannerAdConfiguration b() {
        return this.a;
    }

    public final void c() {
        String s = this.a.getServerParameters().getString("parameter");
        if(s == null) {
            AdError adError0 = new AdError(8, "server_parameter_null", this.c);
            this.b.onFailure(adError0);
            return;
        }
        Context context0 = this.a.getContext();
        L.o(context0, "getContext(...)");
        BannerAdView bannerAdView0 = new BannerAdView(context0, null, 0, 6, null);
        bannerAdView0.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        bannerAdView0.setAdListener(this);
        bannerAdView0.setClientId(s);
        bannerAdView0.loadAd();
        this.d = bannerAdView0;
    }

    @Override  // com.google.android.gms.ads.mediation.MediationBannerAd
    @l
    public View getView() {
        View view0 = this.d;
        if(view0 == null) {
            L.S("banner");
            return null;
        }
        return view0;
    }

    @Override  // com.kakao.adfit.ads.AdListener
    public void onAdClicked() {
    }

    @Override  // com.kakao.adfit.ads.AdListener
    public void onAdFailed(int v) {
        switch(v) {
            case 202: {
                AdError adError5 = new AdError(2, "network_error", this.c);
                this.b.onFailure(adError5);
                return;
            }
            case 301: {
                AdError adError2 = new AdError(1, "invalid_request", this.c);
                this.b.onFailure(adError2);
                return;
            }
            case 302: {
                AdError adError1 = new AdError(3, "no_fill", this.c);
                this.b.onFailure(adError1);
                return;
            }
            case 501: {
                AdError adError4 = new AdError(2, "load_failed", this.c);
                this.b.onFailure(adError4);
                return;
            }
            case 601: {
                AdError adError3 = new AdError(0, "internal_error", this.c);
                this.b.onFailure(adError3);
                return;
            }
            default: {
                AdError adError0 = new AdError(0, "unknown_error", this.c);
                this.b.onFailure(adError0);
            }
        }
    }

    @Override  // com.kakao.adfit.ads.AdListener
    public void onAdLoaded() {
        this.b.onSuccess(this);
    }
}

