package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.FullScreenWebViewDisplay;
import kotlin.jvm.internal.m0;
import y4.l;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public final class AdActivity extends Enum {
    private static final AdActivity[] $VALUES;
    public static final enum AdActivity APPLOVIN_ADS_ACTIVITY;
    public static final enum AdActivity APPLOVIN_INTERSTITIAL_ACTIVITY;
    public static final enum AdActivity APPLOVIN_INTERSTITIAL_ORIENTATION_AWARE_ACTIVITY;
    public static final enum AdActivity FACEBOOK_ADS_ACTIVITY;
    public static final enum AdActivity GOOGLE_ADS_ACTIVITY;
    public static final enum AdActivity IRONSOURCE_ADS_ACTIVITY;
    public static final enum AdActivity IRONSOURCE_INTERSTITIAL_ACTIVITY;
    public static final enum AdActivity UNITY_ADS_FULLSCREEN_ACTIVITY;
    @l
    private final String activityName;

    private static final AdActivity[] $values() [...] // Inlined contents

    static {
        AdActivity.GOOGLE_ADS_ACTIVITY = new AdActivity("GOOGLE_ADS_ACTIVITY", 0, "com.google.android.gms.ads.AdActivity");
        AdActivity.FACEBOOK_ADS_ACTIVITY = new AdActivity("FACEBOOK_ADS_ACTIVITY", 1, "com.facebook.ads.AudienceNetworkActivity");
        AdActivity.APPLOVIN_ADS_ACTIVITY = new AdActivity("APPLOVIN_ADS_ACTIVITY", 2, "com.applovin.adview.AppLovinFullscreenThemedActivity");
        AdActivity.APPLOVIN_INTERSTITIAL_ACTIVITY = new AdActivity("APPLOVIN_INTERSTITIAL_ACTIVITY", 3, "com.applovin.adview.AppLovinFullscreenActivity");
        AdActivity.APPLOVIN_INTERSTITIAL_ORIENTATION_AWARE_ACTIVITY = new AdActivity("APPLOVIN_INTERSTITIAL_ORIENTATION_AWARE_ACTIVITY", 4, "com.applovin.impl.adview.AppLovinOrientationAwareInterstitialActivity");
        AdActivity.IRONSOURCE_ADS_ACTIVITY = new AdActivity("IRONSOURCE_ADS_ACTIVITY", 5, "com.ironsource.sdk.controller.ControllerActivity");
        AdActivity.IRONSOURCE_INTERSTITIAL_ACTIVITY = new AdActivity("IRONSOURCE_INTERSTITIAL_ACTIVITY", 6, "com.ironsource.sdk.controller.InterstitialActivity");
        String s = m0.a.d(FullScreenWebViewDisplay.class).g();
        if(s == null) {
            s = "FullScreenWebViewDisplay";
        }
        AdActivity.UNITY_ADS_FULLSCREEN_ACTIVITY = new AdActivity("UNITY_ADS_FULLSCREEN_ACTIVITY", 7, s);
        AdActivity.$VALUES = new AdActivity[]{AdActivity.GOOGLE_ADS_ACTIVITY, AdActivity.FACEBOOK_ADS_ACTIVITY, AdActivity.APPLOVIN_ADS_ACTIVITY, AdActivity.APPLOVIN_INTERSTITIAL_ACTIVITY, AdActivity.APPLOVIN_INTERSTITIAL_ORIENTATION_AWARE_ACTIVITY, AdActivity.IRONSOURCE_ADS_ACTIVITY, AdActivity.IRONSOURCE_INTERSTITIAL_ACTIVITY, AdActivity.UNITY_ADS_FULLSCREEN_ACTIVITY};
    }

    private AdActivity(String s, int v, String s1) {
        super(s, v);
        this.activityName = s1;
    }

    @l
    public final String getActivityName() {
        return this.activityName;
    }

    public static AdActivity valueOf(String s) {
        return (AdActivity)Enum.valueOf(AdActivity.class, s);
    }

    public static AdActivity[] values() {
        return (AdActivity[])AdActivity.$VALUES.clone();
    }
}

