package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.internal.presenter.b;
import com.vungle.ads.internal.presenter.p;
import com.vungle.ads.internal.ui.a;
import kotlin.jvm.internal.L;
import y4.l;

public final class r extends m implements p {
    @y4.m
    private String alertBodyText;
    @y4.m
    private String alertCloseButtonText;
    @y4.m
    private String alertContinueButtonText;
    @y4.m
    private String alertTitleText;
    @y4.m
    private String userId;

    public r(@l Context context0) {
        L.p(context0, "context");
        super(context0);
    }

    @Override  // com.vungle.ads.internal.presenter.p
    @y4.m
    public String getAlertBodyText() {
        return this.alertBodyText;
    }

    @y4.m
    public final String getAlertBodyText$vungle_ads_release() {
        return this.alertBodyText;
    }

    @Override  // com.vungle.ads.internal.presenter.p
    @y4.m
    public String getAlertCloseButtonText() {
        return this.alertCloseButtonText;
    }

    @y4.m
    public final String getAlertCloseButtonText$vungle_ads_release() {
        return this.alertCloseButtonText;
    }

    @Override  // com.vungle.ads.internal.presenter.p
    @y4.m
    public String getAlertContinueButtonText() {
        return this.alertContinueButtonText;
    }

    @y4.m
    public final String getAlertContinueButtonText$vungle_ads_release() {
        return this.alertContinueButtonText;
    }

    @Override  // com.vungle.ads.internal.presenter.p
    @y4.m
    public String getAlertTitleText() {
        return this.alertTitleText;
    }

    @y4.m
    public final String getAlertTitleText$vungle_ads_release() {
        return this.alertTitleText;
    }

    @Override  // com.vungle.ads.internal.presenter.p
    @y4.m
    public String getUserId() {
        return this.userId;
    }

    @y4.m
    public final String getUserId$vungle_ads_release() {
        return this.userId;
    }

    @Override  // com.vungle.ads.internal.a
    public boolean isValidAdTypeForPlacement(@l com.vungle.ads.internal.model.m m0) {
        L.p(m0, "placement");
        return m0.isRewardedVideo();
    }

    @Override  // com.vungle.ads.internal.a
    public void renderAd$vungle_ads_release(@y4.m b b0, @l com.vungle.ads.internal.model.b b1) {
        L.p(b1, "advertisement");
        a.Companion.setPresenterDelegate$vungle_ads_release(this);
        super.renderAd$vungle_ads_release(b0, b1);
    }

    public final void setAlertBodyText$vungle_ads_release(@y4.m String s) {
        this.alertBodyText = s;
    }

    public final void setAlertCloseButtonText$vungle_ads_release(@y4.m String s) {
        this.alertCloseButtonText = s;
    }

    public final void setAlertContinueButtonText$vungle_ads_release(@y4.m String s) {
        this.alertContinueButtonText = s;
    }

    public final void setAlertTitleText$vungle_ads_release(@y4.m String s) {
        this.alertTitleText = s;
    }

    public final void setUserId$vungle_ads_release(@y4.m String s) {
        this.userId = s;
    }
}

