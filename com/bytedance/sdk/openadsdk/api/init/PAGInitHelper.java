package com.bytedance.sdk.openadsdk.api.init;

import android.content.Context;
import android.provider.Settings.System;
import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.PjT.Zh.Zh;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.ReZ;
import com.bytedance.sdk.openadsdk.core.SM;
import com.bytedance.sdk.openadsdk.core.act.PjT;
import com.bytedance.sdk.openadsdk.core.fDm;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.core.xf;
import com.bytedance.sdk.openadsdk.multipro.cr.cr;
import com.bytedance.sdk.openadsdk.utils.KM;
import com.bytedance.sdk.openadsdk.utils.qZS;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class PAGInitHelper {
    public static final List CALLBACK_LIST;
    public static float animationScale;

    static {
        PAGInitHelper.CALLBACK_LIST = new ArrayList();
        PAGInitHelper.animationScale = 1.0f;
    }

    private static void PjT(Context context0) {
        ReZ.PjT(context0).PjT("uuid", "0140487b-c3dd-4f76-aea2-0f4b624af601");
    }

    public static void initAPM() {
        try {
            String s = SM.Zh().cr();
            if(TextUtils.isEmpty(s)) {
                return;
            }
            PAGConfig pAGConfig0 = new Builder().appId(s).build();
            ApmHelper.initApm(ub.PjT(), pAGConfig0);
        }
        catch(Exception unused_ex) {
        }
    }

    public static void initAnimationScale(Context context0) {
        try {
            float f = Settings.System.getFloat(context0.getContentResolver(), "animator_duration_scale", 1.0f);
            PAGInitHelper.animationScale = f;
            if(f <= 0.0f) {
                PAGInitHelper.animationScale = 1.0f;
            }
        }
        catch(Throwable unused_ex) {
            PAGInitHelper.animationScale = 1.0f;
        }
    }

    public static void initMemoryData() {
        ub.cr();
        cr.PjT("ttopenadsdk", "a", 0);
        cr.PjT("sp_global_file", "a", 0);
        cr.PjT("sp_global_privacy", "a", 0);
        cr.PjT("sp_global_app_id", "a", 0);
        cr.PjT("sp_global_icon_id", "a", 0);
        cr.PjT("tpl_fetch_model", "a", 0);
        cr.PjT("tt_sp", "a", 0);
        cr.PjT("tt_sdk_event_net_ad", "a", 0);
        cr.PjT("tt_sdk_event_net_state", "a", 0);
        cr.PjT("tt_sdk_event_net_trail", "a", 0);
        cr.PjT("tt_sdk_event_db_ad", "a", 0);
        cr.PjT("tt_sdk_event_db_state", "a", 0);
        cr.PjT("tt_sdk_event_db_trail", "a", 0);
        cr.PjT("pag_sp_bad_par", "did");
        cr.PjT("pag_sp_bad_par", "gaid");
    }

    public static void maybeAsyncInitTask(Context context0) {
        PjT.PjT(context0);
        KM.PjT();
        qZS.PjT(context0);
        PAGInitHelper.PjT(context0);
        ub.JQp();
        String s = xf.PjT(context0);
        com.bytedance.sdk.openadsdk.core.SM.ReZ.Zh(s);
        com.bytedance.sdk.openadsdk.cr.PjT.cr.PjT(s, true);
        Zh.PjT();
        com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.PjT().Zh();
        PAGInitHelper.initAnimationScale(context0);
        fDm.Zh().postDelayed(new Runnable() {
            @Override
            public void run() {
                com.bytedance.sdk.openadsdk.qla.ReZ.PjT();
                com.bytedance.sdk.openadsdk.qla.ReZ.PjT("android_act", false, new com.bytedance.sdk.openadsdk.qla.Zh() {
                    final com.bytedance.sdk.openadsdk.api.init.PAGInitHelper.1 PjT;

                    @Override  // com.bytedance.sdk.openadsdk.qla.Zh
                    public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                        JSONObject jSONObject0 = new JSONObject();
                        try {
                            jSONObject0.put("act", PjT.Zh(com.bytedance.sdk.openadsdk.api.init.PAGInitHelper.1.this.PjT));
                            jSONObject0.put("api_available", -1);
                            jSONObject0.put("act_signals_callback_available", -1);
                            jSONObject0.put("act_event", 0);
                            return com.bytedance.sdk.openadsdk.qla.PjT.cr.Zh().PjT("android_act").Zh(jSONObject0.toString());
                        }
                        catch(Throwable throwable0) {
                            RD.PjT("AsyncInitTask", "run: ", throwable0);
                            return com.bytedance.sdk.openadsdk.qla.PjT.cr.Zh().PjT("android_act").Zh(jSONObject0.toString());
                        }
                    }
                });
            }
        }, 10000L);
    }
}

