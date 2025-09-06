package com.dcinside.app.ad.mediation;

import android.content.Context;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public abstract class AdmobMediationAdfitAdapter extends AdmobMediationAdapter {
    @m
    private a a;

    @Override  // com.dcinside.app.ad.mediation.AdmobMediationAdapter
    @l
    public String getAdSdkVersion() {
        return "3.17.2";
    }

    @Override  // com.google.android.gms.ads.mediation.Adapter
    public void initialize(@l Context context0, @l InitializationCompleteCallback initializationCompleteCallback0, @l List list0) {
        L.p(context0, "context");
        L.p(initializationCompleteCallback0, "initializationCompleteCallback");
        L.p(list0, "mediationConfigurations");
        initializationCompleteCallback0.onInitializationSucceeded();
    }

    @Override  // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(@l MediationBannerAdConfiguration mediationBannerAdConfiguration0, @l MediationAdLoadCallback mediationAdLoadCallback0) {
        L.p(mediationBannerAdConfiguration0, "configuration");
        L.p(mediationAdLoadCallback0, "callback");
        a a0 = new a(mediationBannerAdConfiguration0, mediationAdLoadCallback0);
        this.a = a0;
        a0.c();
    }
}

