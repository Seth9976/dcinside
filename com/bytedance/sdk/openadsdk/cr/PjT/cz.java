package com.bytedance.sdk.openadsdk.cr.PjT;

import com.bytedance.sdk.openadsdk.multipro.cr.PjT;
import com.bytedance.sdk.openadsdk.qla.ReZ;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

public class cz {
    public static AtomicInteger Au;
    public static AtomicInteger JQp;
    public static AtomicInteger PjT;
    public static AtomicInteger ReZ;
    public static AtomicInteger SM;
    public static AtomicInteger XX;
    public static AtomicInteger Zh;
    public static AtomicInteger cr;
    public static AtomicInteger cz;

    static {
        cz.PjT = new AtomicInteger(0);
        cz.Zh = new AtomicInteger(0);
        cz.ReZ = new AtomicInteger(0);
        cz.cr = new AtomicInteger(0);
        cz.JQp = new AtomicInteger(0);
        cz.cz = new AtomicInteger(0);
        cz.XX = new AtomicInteger(0);
        cz.Au = new AtomicInteger(0);
        cz.SM = new AtomicInteger(0);
    }

    public static void JQp() {
        try {
            if(!DeviceUtils.Zh()) {
                cz.SM.incrementAndGet();
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    public static void PjT() {
        try {
            long v = PjT.PjT("tt_sdk_event_get_ad", "get_ad_event_time_key", 0L);
            int v1 = Long.compare(v, 0L);
            if(v1 > 0 && System.currentTimeMillis() - v >= 86400000L) {
                cz.Zh();
                PjT.PjT("tt_sdk_event_get_ad", "get_ad_event_time_key", System.currentTimeMillis());
                return;
            }
            if(v1 <= 0 || v > System.currentTimeMillis()) {
                PjT.PjT("tt_sdk_event_get_ad", "get_ad_event_time_key", System.currentTimeMillis());
            }
            JSONObject jSONObject0 = new JSONObject("");
            int v2 = jSONObject0.optInt("load_get_ad_version", 0);
            if(v2 >= 5702 && (v2 < 5800 || v2 >= 5802)) {
                cz.PjT.addAndGet(jSONObject0.optInt("load_times"));
                cz.Zh.addAndGet(jSONObject0.optInt("load_success"));
                cz.ReZ.addAndGet(jSONObject0.optInt("load_fail"));
                cz.cr.addAndGet(jSONObject0.optInt("load_success_and_parse_success"));
                cz.JQp.addAndGet(jSONObject0.optInt("load_success_and_parse_fail"));
                cz.cz.addAndGet(jSONObject0.optInt("load_success_and_no_ad"));
                cz.XX.addAndGet(jSONObject0.optInt("load_fail_by_no_net"));
                cz.Au.addAndGet(jSONObject0.optInt("load_fail_by_io"));
                cz.SM.addAndGet(jSONObject0.optInt("load_fail_in_background"));
                return;
            }
            PjT.PjT("tt_sdk_event_get_ad");
        }
        catch(Throwable unused_ex) {
        }
    }

    public static void PjT(int v, String s) {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("code", v);
            jSONObject0.put("msg", s);
            ReZ.PjT().PjT("pangle_sdk_client_load_error", jSONObject0);
        }
        catch(Throwable unused_ex) {
        }
    }

    public static void ReZ() {
        try {
            PjT.PjT("tt_sdk_event_get_ad", "get_ad_event_key", "{\"load_times\":0,\"load_success\":0,\"load_fail\":0,\"load_fail_in_background\":0,\"load_success_and_parse_success\":0,\"load_success_and_parse_fail\":0,\"load_success_and_no_ad\":0,\"load_fail_by_no_net\":0,\"load_fail_by_io\":0,\"load_get_ad_version\":7104}");
        }
        catch(Throwable unused_ex) {
        }
    }

    public static void Zh() {
        try {
            ReZ.PjT().PjT("pangle_sdk_get_ad_track", "");
            PjT.PjT("tt_sdk_event_get_ad");
        }
        catch(Throwable unused_ex) {
        }
    }

    public static JSONObject cr() {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("load_times", cz.PjT.get());
            jSONObject0.put("load_success", cz.Zh.get());
            jSONObject0.put("load_fail", cz.ReZ.get());
            jSONObject0.put("load_fail_in_background", cz.SM.get());
            jSONObject0.put("load_success_and_parse_success", cz.cr.get());
            jSONObject0.put("load_success_and_parse_fail", cz.JQp.get());
            jSONObject0.put("load_success_and_no_ad", cz.cz.get());
            jSONObject0.put("load_fail_by_no_net", cz.XX.get());
            jSONObject0.put("load_fail_by_io", cz.Au.get());
            jSONObject0.put("load_get_ad_version", 7104);
            return jSONObject0;
        }
        catch(Throwable unused_ex) {
            return new JSONObject();
        }
    }
}

