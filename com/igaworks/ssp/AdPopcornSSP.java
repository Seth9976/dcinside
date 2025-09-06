package com.igaworks.ssp;

import android.app.Activity;
import android.content.Context;
import com.igaworks.ssp.part.video.listener.IRewardPlusSettingEventCallbackListener;
import com.igaworks.ssp.part.video.listener.IRewardPlusSettingPageCallbackListener;

public class AdPopcornSSP {
    public class UIDIdentifierType {
        public static final int EMAIL = 0;
        public static final int PHONE_NUMBER = 1;
        final AdPopcornSSP a;

    }

    public static void destroy() {
        E.g().o();
    }

    public static void gdprConsentAvailable(boolean z) {
        E.g().a(z);
    }

    // 去混淆评级： 低(20)
    public static String getADID() [...] // 潜在的解密器

    @Deprecated
    public static void getRewardPlusUserSetting(IRewardPlusSettingEventCallbackListener iRewardPlusSettingEventCallbackListener0) {
        E.g().a(iRewardPlusSettingEventCallbackListener0);
    }

    public static void init(Context context0) {
        E.g().a(context0, null, null);
    }

    public static void init(Context context0, SdkInitListener sdkInitListener0) {
        E.g().a(context0, null, sdkInitListener0);
    }

    public static void init(Context context0, String s) {
        E.g().a(context0, s, null);
    }

    public static void init(Context context0, String s, SdkInitListener sdkInitListener0) {
        E.g().a(context0, s, sdkInitListener0);
    }

    public static boolean isInitialized(Context context0) {
        return E.g().b(context0);
    }

    @Deprecated
    public static void openRewardPlusSetting(Context context0) {
        E.g().a(context0, null);
    }

    @Deprecated
    public static void openRewardPlusSetting(Context context0, IRewardPlusSettingPageCallbackListener iRewardPlusSettingPageCallbackListener0) {
        E.g().a(context0, iRewardPlusSettingPageCallbackListener0);
    }

    public static void openRewardVideoCSPage(Activity activity0, String s) {
        E.g();
        E.a(activity0, s);
    }

    public static void setLogEnable(boolean z) {
        E.g();
        E.b(z);
    }

    public static void setUIDIdentifier(Context context0, int v, String s) {
        E.g().a(context0, v, s, false);
    }

    public static void setUserId(Context context0, String s) {
        E.g().c(context0, s);
    }

    public static void setUserProperties(AdPopcornSSPUserProperties adPopcornSSPUserProperties0) {
        E.g().a(adPopcornSSPUserProperties0);
    }

    public static void tagForChildDirectedTreatment(Context context0, boolean z) {
        E.g().a(context0, z);
    }
}

