package com.bytedance.sdk.openadsdk.cr.PjT;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.core.xf;
import com.bytedance.sdk.openadsdk.cr.cz;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.Sks;
import com.bytedance.sdk.openadsdk.utils.iZZ;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.wN;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ReZ {
    static class PjT {
        private static final ReZ PjT;

        static {
            PjT.PjT = new ReZ(null);
        }
    }

    private final String JQp;
    private long PjT;
    private final Context ReZ;
    private int Zh;
    private final boolean cr;

    private ReZ() {
        this.cr = this.ReZ();
        this.ReZ = ub.PjT().getApplicationContext();
        this.JQp = this.JQp();
    }

    ReZ(com.bytedance.sdk.openadsdk.cr.PjT.ReZ.1 reZ$10) {
    }

    private String JQp() {
        if(DeviceUtils.ReZ(this.ReZ)) {
            return "tv";
        }
        return DeviceUtils.Zh(this.ReZ) ? "android_pad" : "android";
    }

    public static ReZ PjT() {
        return PjT.PjT;
    }

    private String PjT(int v) {
        if(v != 120) {
            switch(v) {
                case 0xF0: {
                    return "hdpi";
                }
                case 320: {
                    return "xhdpi";
                }
                case 480: {
                    return "xxhdpi";
                }
                case 640: {
                    return "xxxhdpi";
                }
                default: {
                    return "mdpi";
                }
            }
        }
        return "ldpi";
    }

    private String PjT(Context context0) {
        try {
            TelephonyManager telephonyManager0 = (TelephonyManager)context0.getSystemService("phone");
            return telephonyManager0 == null ? "" : telephonyManager0.getSimOperator();
        }
        catch(Throwable unused_ex) {
            return "";
        }
    }

    private void PjT(com.bytedance.sdk.openadsdk.cr.PjT pjT0, boolean z) {
        if(pjT0 == null) {
            return;
        }
        try {
            String s = z ? pjT0.ReZ().optJSONObject("params").optString("log_extra", "") : pjT0.ReZ().optString("log_extra", "");
            long v = Owx.PjT(s);
            int v1 = Owx.cr(s);
            if(v == 0L) {
                v = this.PjT;
            }
            this.PjT = v;
            if(v1 == 0) {
                v1 = this.Zh;
            }
            this.Zh = v1;
            return;
        }
        catch(Exception exception0) {
        }
        RD.Zh("AdLogParamsGenerate", new Object[]{"getInfoFromLogExtra exception", exception0.getMessage()});
    }

    public String PjT(List list0) {
        return list0.size() <= 0 || list0.get(0) == null || ((com.bytedance.sdk.openadsdk.cr.PjT)list0.get(0)).ReZ() == null ? wN.JQp("") : wN.JQp(((com.bytedance.sdk.openadsdk.cr.PjT)list0.get(0)).ReZ().optString("app_log_url"));
    }

    public List PjT(List list0, boolean z) {
        List list1 = new ArrayList();
        for(Object object0: list0) {
            com.bytedance.sdk.openadsdk.cr.PjT pjT0 = (com.bytedance.sdk.openadsdk.cr.PjT)object0;
            try {
                JSONObject jSONObject0 = new JSONObject();
                JSONObject jSONObject1 = pjT0.ReZ();
                jSONObject0.putOpt("event", jSONObject1.optString("label"));
                long v = jSONObject1.optLong("event_ts", System.currentTimeMillis());
                jSONObject0.putOpt("local_time_ms", v);
                Date date0 = new Date(v);
                jSONObject0.putOpt("datetime", cz.ReZ.format(date0));
                JSONObject jSONObject2 = new JSONObject();
                Iterator iterator1 = jSONObject1.keys();
                while(iterator1.hasNext()) {
                    Object object1 = iterator1.next();
                    String s = (String)object1;
                    if(!TextUtils.equals(s, "label")) {
                        jSONObject2.putOpt(s, jSONObject1.opt(s));
                    }
                }
                if(z) {
                    jSONObject2.putOpt("_ad_staging_flag", 3);
                }
                jSONObject0.putOpt("params", jSONObject2);
                ((ArrayList)list1).add(new cz(pjT0.PjT, jSONObject0));
                continue;
            }
            catch(Exception exception0) {
            }
            RD.Zh("AdLogParamsGenerate", exception0.getMessage());
        }
        return list1;
    }

    public JSONObject PjT(List list0, long v, JSONObject jSONObject0, boolean z) {
        JSONObject jSONObject1 = new JSONObject();
        try {
            this.PjT(((com.bytedance.sdk.openadsdk.cr.PjT)list0.get(0)), z);
            jSONObject1.put("header", jSONObject0);
            JSONArray jSONArray0 = new JSONArray();
            for(Object object0: list0) {
                jSONArray0.put(((com.bytedance.sdk.openadsdk.cr.PjT)object0).PjT(z));
            }
            if(z) {
                jSONObject1.put("event_v3", jSONArray0);
                jSONObject1.put("magic_tag", "ss_app_log");
            }
            else {
                jSONObject1.put("event", jSONArray0);
            }
            jSONObject1.put("_gen_time", v);
            jSONObject1.put("local_time", v / 1000L);
        }
        catch(JSONException unused_ex) {
        }
        return jSONObject1;
    }

    private boolean ReZ() {
        try {
            if(new File("/system/bin/su").exists() || new File("/system/xbin/su").exists()) {
                return true;
            }
        }
        catch(Exception unused_ex) {
        }
        return false;
    }

    public List Zh(List list0) {
        List list1 = new ArrayList();
        for(Object object0: list0) {
            com.bytedance.sdk.openadsdk.cr.PjT pjT0 = (com.bytedance.sdk.openadsdk.cr.PjT)object0;
            try {
                JSONObject jSONObject0 = pjT0.ReZ();
                jSONObject0.putOpt("_ad_staging_flag", 1);
                ((ArrayList)list1).add(new com.bytedance.sdk.openadsdk.cr.PjT(pjT0.PjT, jSONObject0));
            }
            catch(Exception exception0) {
                RD.Zh("AdLogParamsGenerate", exception0.getMessage());
            }
        }
        return list1;
    }

    @SuppressLint({"HardwareIds"})
    public JSONObject Zh() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("ua", wN.ReZ());
            jSONObject0.put("ad_sdk_version", "7.1.0.4");
            jSONObject0.put("app_version", wN.XX());
            jSONObject0.put("sim_op", this.PjT(this.ReZ));
            jSONObject0.put("root", ((int)this.cr));
            jSONObject0.put("timezone", this.cr());
            jSONObject0.put("access", Sks.PjT(this.ReZ));
            jSONObject0.put("os", "Android");
            jSONObject0.put("os_version", Build.VERSION.RELEASE);
            jSONObject0.put("os_api", Build.VERSION.SDK_INT);
            jSONObject0.put("device_type", this.JQp);
            jSONObject0.put("device_model", Build.MODEL);
            jSONObject0.put("device_brand", Build.BRAND);
            jSONObject0.put("device_manufacturer", Build.MANUFACTURER);
            jSONObject0.put("language", Locale.getDefault().getLanguage());
            jSONObject0.put("resolution", qZS.JQp(this.ReZ) + "x" + qZS.ReZ(this.ReZ));
            jSONObject0.put("display_density", this.PjT(qZS.SM(this.ReZ)));
            jSONObject0.put("density_dpi", qZS.SM(this.ReZ));
            jSONObject0.put("aid", "1371");
            jSONObject0.put("device_id", xf.PjT(this.ReZ));
            jSONObject0.put("rom", "");
            jSONObject0.put("cpu_abi", "arm64-v8a");
            jSONObject0.put("ut", this.Zh);
            jSONObject0.put("uid", this.PjT);
            jSONObject0.put("google_aid", com.bytedance.sdk.openadsdk.ltE.PjT.Zh.PjT.PjT().Zh());
            jSONObject0.put("locale_language", DeviceUtils.cr());
            jSONObject0.put("screen_bright", Math.ceil(DeviceUtils.JQp() * 10.0f) / 10.0);
            jSONObject0.put("is_screen_off", !DeviceUtils.Zh());
            com.bytedance.sdk.openadsdk.core.settings.cz cz0 = ub.cr();
            jSONObject0.put("force_language", Lrd.PjT(this.ReZ, "tt_choose_language"));
            if(cz0.Yo("mnc")) {
                jSONObject0.put("mnc", iZZ.ReZ());
            }
            if(cz0.Yo("mcc")) {
                jSONObject0.put("mcc", iZZ.Zh());
            }
        }
        catch(Exception unused_ex) {
        }
        return jSONObject0;
    }

    private int cr() {
        int v = TimeZone.getDefault().getRawOffset() / 3600000;
        if(v < -12) {
            v = -12;
        }
        return v <= 12 ? v : 12;
    }

    private String cz() [...] // 潜在的解密器

    class com.bytedance.sdk.openadsdk.cr.PjT.ReZ.1 {
    }

}

