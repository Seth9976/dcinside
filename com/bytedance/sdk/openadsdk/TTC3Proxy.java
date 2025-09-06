package com.bytedance.sdk.openadsdk;

import android.content.Context;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.component.ReZ.Zh;
import com.bytedance.sdk.openadsdk.component.reward.DWo;
import com.bytedance.sdk.openadsdk.component.reward.JQp;
import com.bytedance.sdk.openadsdk.component.reward.XX;
import com.bytedance.sdk.openadsdk.component.reward.xs;

public class TTC3Proxy {
    public static void a(Context context0) {
        try {
            xs.PjT(context0).PjT();
        }
        catch(Throwable unused_ex) {
        }
        try {
            JQp.PjT(context0).PjT();
        }
        catch(Throwable unused_ex) {
        }
    }

    public static void loadFull(Context context0, AdSlot adSlot0, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener0) {
        adSlot0.setDurationSlotType(8);
        JQp.PjT(context0).PjT(adSlot0, new Zh(pAGInterstitialAdLoadListener0));
    }

    public static void loadReward(Context context0, AdSlot adSlot0, PAGRewardedAdLoadListener pAGRewardedAdLoadListener0) {
        adSlot0.setDurationSlotType(7);
        xs.PjT(context0).PjT(adSlot0, new XX(pAGRewardedAdLoadListener0));
    }

    public static void verityPlayable(String s, int v, String s1, String s2, String s3) {
        DWo.PjT(s, v, s1, s2, s3);
    }
}

