package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class XX {
    public boolean JQp;
    public static final XX PjT;
    public String ReZ;
    public static String Zh;
    public boolean cr;
    public boolean cz;

    static {
        XX.PjT = new XX(null);
        XX.Zh = "";
    }

    public XX(String s) {
        this.ReZ = "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/3p_monitor.9db44671.js";
        this.cr = true;
        this.JQp = true;
        this.cz = true;
        try {
            JSONObject jSONObject0 = new JSONObject(s).optJSONObject("performance_js");
            String s1 = jSONObject0.optString("url", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/3p_monitor.9db44671.js");
            if(!TextUtils.isEmpty(s1)) {
                this.ReZ = s1;
            }
            JSONArray jSONArray0 = jSONObject0.optJSONArray("execute_time");
            ArrayList arrayList0 = new ArrayList();
            for(int v = 0; v < jSONArray0.length(); ++v) {
                arrayList0.add(jSONArray0.optString(v));
            }
            this.cr = arrayList0.contains("load_finish");
            this.cz = arrayList0.contains("load_fail");
            this.JQp = arrayList0.contains("load");
        }
        catch(Exception unused_ex) {
        }
    }
}

