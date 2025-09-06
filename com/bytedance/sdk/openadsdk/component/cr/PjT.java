package com.bytedance.sdk.openadsdk.component.cr;

import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.iZZ;
import com.bytedance.sdk.openadsdk.qla.PjT.cr;
import com.bytedance.sdk.openadsdk.qla.ReZ;
import com.bytedance.sdk.openadsdk.qla.Zh;
import com.bytedance.sdk.openadsdk.utils.Co;
import org.json.JSONException;
import org.json.JSONObject;

public class PjT {
    public static void PjT(int v, int v1) {
        ReZ.PjT("openad_load_ad_timeout", false, new Zh() {
            @Override  // com.bytedance.sdk.openadsdk.qla.Zh
            public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                JSONObject jSONObject0 = new JSONObject();
                jSONObject0.put("timeout_type", v);
                jSONObject0.put("user_timeout_time", v1);
                return cr.Zh().PjT("openad_load_ad_timeout").Zh(jSONObject0.toString());
            }
        });
    }

    public static void PjT(Owx owx0) {
        com.bytedance.sdk.openadsdk.cr.ReZ.cr(owx0, "cache_expire", null);
    }

    public static void PjT(Owx owx0, int v, int v1, float f) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            PjT.PjT(jSONObject0, owx0);
            jSONObject0.put("openad_creative_type", (Owx.JQp(owx0) ? "video_normal_ad" : "image_normal_ad"));
            jSONObject0.put("skip_time", v);
            jSONObject0.put("skip_show_time", v1);
            jSONObject0.put("total_time", ((double)f));
        }
        catch(JSONException jSONException0) {
            RD.PjT("TTAppOpenAdReport", "reportSkip json error", jSONException0);
        }
        com.bytedance.sdk.openadsdk.cr.ReZ.PjT(owx0, "skip", ((long)v), jSONObject0);
    }

    public static void PjT(Owx owx0, int v, iZZ iZZ0) {
        JSONObject jSONObject0 = new JSONObject();
        long v1 = 0L;
        try {
            jSONObject0.put("openad_creative_type", (Owx.JQp(owx0) ? "video_normal_ad" : "image_normal_ad"));
            jSONObject0.put("open_ad_cache_type", v);
            if(iZZ0 != null) {
                iZZ0.Zh(Co.Zh());
                PjT.PjT(jSONObject0, owx0);
                jSONObject0.put("client_start_time", iZZ0.Zh());
                jSONObject0.put("sever_time", iZZ0.cr());
                jSONObject0.put("network_time", iZZ0.ReZ());
                jSONObject0.put("client_end_time", iZZ0.JQp());
                jSONObject0.put("download_resource_duration", iZZ0.XX());
                jSONObject0.put("resource_source", iZZ0.Au());
                jSONObject0.put("is_bidding", ((int)iZZ0.PjT));
                if(iZZ0.PjT) {
                    jSONObject0.put("load_wait_time", iZZ0.Zh);
                }
                v1 = iZZ0.cz();
            }
        }
        catch(JSONException jSONException0) {
            RD.PjT("TTAppOpenAdReport", "reportLoadNetDuration json error", jSONException0);
        }
        com.bytedance.sdk.openadsdk.cr.ReZ.PjT(owx0, "load_net_duration", v1, jSONObject0);
    }

    public static void PjT(Owx owx0, long v) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            PjT.PjT(jSONObject0, owx0);
            jSONObject0.put("openad_creative_type", (Owx.JQp(owx0) ? "video_normal_ad" : "image_normal_ad"));
        }
        catch(JSONException unused_ex) {
            RD.Zh("TTAppOpenAdReport", "reportLoadCacheDuration json error");
        }
        com.bytedance.sdk.openadsdk.cr.ReZ.PjT(owx0, "load_cache_duration", v, jSONObject0);
    }

    public static void PjT(Owx owx0, long v, float f, boolean z) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            PjT.PjT(jSONObject0, owx0);
            jSONObject0.put("openad_creative_type", (Owx.JQp(owx0) ? "video_normal_ad" : "image_normal_ad"));
            if(z) {
                jSONObject0.put("video_duration", ((double)f));
                jSONObject0.put("video_percent", ((int)(((double)v) * 1.0 / 10.0 / ((double)f))));
            }
            else {
                jSONObject0.put("image_duration", ((double)f));
            }
        }
        catch(JSONException jSONException0) {
            RD.PjT("TTAppOpenAdReport", "reportDestroy json error", jSONException0);
        }
        com.bytedance.sdk.openadsdk.cr.ReZ.cr(owx0, "destroy", jSONObject0);
    }

    public static void PjT(Owx owx0, long v, boolean z) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("order", (z ? 1 : 2));
        }
        catch(JSONException unused_ex) {
        }
        com.bytedance.sdk.openadsdk.cr.ReZ.PjT(owx0, "download_image_duration", v, jSONObject0);
    }

    private static void PjT(JSONObject jSONObject0, Owx owx0) {
        try {
            jSONObject0.put("is_icon_only", (owx0 == null || !owx0.Pv() ? 0 : 1));
            return;
        }
        catch(JSONException jSONException0) {
        }
        RD.Zh("TTAppOpenAdReport", jSONException0.getMessage());
    }

    public static void Zh(Owx owx0) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("openad_creative_type", (Owx.JQp(owx0) ? "video_normal_ad" : "image_normal_ad"));
        }
        catch(JSONException jSONException0) {
            RD.PjT("TTAppOpenAdReport", "reportCacheLoss json error", jSONException0);
        }
        com.bytedance.sdk.openadsdk.cr.ReZ.cr(owx0, "cache_loss", jSONObject0);
    }

    public static void Zh(Owx owx0, long v, boolean z) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("size", owx0.MWx().e());
            jSONObject0.put("video_duration", owx0.MWx().C());
            jSONObject0.put("order", (z ? 1 : 2));
        }
        catch(JSONException unused_ex) {
        }
        com.bytedance.sdk.openadsdk.cr.ReZ.PjT(owx0, "download_video_duration", v, jSONObject0);
    }
}

