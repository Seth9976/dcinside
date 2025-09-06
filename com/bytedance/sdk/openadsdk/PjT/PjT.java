package com.bytedance.sdk.openadsdk.PjT;

import android.text.TextUtils;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.openadsdk.AdSlot.Builder;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGLoadListener;
import com.bytedance.sdk.openadsdk.api.PAGRequest;
import com.bytedance.sdk.openadsdk.core.fDm;
import com.bytedance.sdk.openadsdk.core.settings.SM;
import com.bytedance.sdk.openadsdk.ub.cr;
import com.bytedance.sdk.openadsdk.utils.wN;
import java.util.Map;

public class PjT {
    public static void PjT(Au au0, PAGLoadListener pAGLoadListener0, AdSlot adSlot0) {
        com.bytedance.sdk.openadsdk.PjT.PjT.1 pjT$10 = new Runnable() {
            @Override
            public void run() {
                PAGLoadListener pAGLoadListener0 = pAGLoadListener0;
                if(pAGLoadListener0 != null) {
                    pAGLoadListener0.onError(10000, "Please exec TTAdSdk.init before load ad");
                }

                class com.bytedance.sdk.openadsdk.PjT.PjT.1.1 implements cr {
                    final com.bytedance.sdk.openadsdk.PjT.PjT.1 PjT;

                    @Override  // com.bytedance.sdk.openadsdk.ub.cr
                    public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                        com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                        pjT0.Zh("load_ad");
                        pjT0.ReZ(com.bytedance.sdk.openadsdk.PjT.PjT.1.this.Zh.getCodeId());
                        pjT0.cr(wN.ReZ(com.bytedance.sdk.openadsdk.PjT.PjT.1.this.Zh.getDurationSlotType()));
                        pjT0.PjT("7.1.0.4");
                        pjT0.XX(wN.PjT(com.bytedance.sdk.openadsdk.PjT.PjT.1.this.Zh).toString());
                        return pjT0;
                    }
                }

            }
        };
        if(fDm.JQp()) {
            pjT$10.run();
            return;
        }
        fDm.Zh().post(pjT$10);
    }

    public static void PjT(Builder adSlot$Builder0, PAGRequest pAGRequest0) {
        if(!fDm.JQp()) {
            return;
        }
        if(pAGRequest0 != null && adSlot$Builder0 != null) {
            Map map0 = pAGRequest0.getExtraInfo();
            if(map0 != null) {
                if(map0.containsKey("ad_id") && map0.get("ad_id") != null) {
                    adSlot$Builder0.setAdId(map0.get("ad_id").toString());
                }
                if(map0.containsKey("creative_id") && map0.get("creative_id") != null) {
                    adSlot$Builder0.setCreativeId(map0.get("creative_id").toString());
                }
                if(map0.containsKey("ext") && map0.get("ext") != null) {
                    adSlot$Builder0.setExt(map0.get("ext").toString());
                }
                if(map0.containsKey("media_extra") && map0.get("media_extra") != null) {
                    adSlot$Builder0.setMediaExtra(map0.get("media_extra").toString());
                }
            }
        }
    }

    public static boolean PjT(PAGLoadListener pAGLoadListener0) {
        if(!SM.PjT()) {
            if(pAGLoadListener0 != null) {
                pAGLoadListener0.onError(1000, "Ad request is temporarily paused, Please contact your AM");
            }
            return true;
        }
        return false;
    }

    public static boolean PjT(String s, PAGRequest pAGRequest0, PAGLoadListener pAGLoadListener0) {
        if(TextUtils.isEmpty(s) && pAGLoadListener0 != null) {
            pAGLoadListener0.onError(1, "slot id param should not be null");
            return true;
        }
        if(pAGRequest0 == null && pAGLoadListener0 != null) {
            pAGLoadListener0.onError(2, "request param should not be null");
            return true;
        }
        return false;
    }
}

