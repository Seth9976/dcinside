package com.bytedance.sdk.openadsdk;

import android.content.Context;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.component.XX.PjT;
import com.bytedance.sdk.openadsdk.component.XX;

public class TTC2Proxy {
    public static void a(Context context0) {
        PjT.PjT(context0);
    }

    public static void load(Context context0, AdSlot adSlot0, PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener0, int v) {
        adSlot0.setDurationSlotType(3);
        XX.PjT(context0).PjT(adSlot0, pAGAppOpenAdLoadListener0, v);
    }
}

