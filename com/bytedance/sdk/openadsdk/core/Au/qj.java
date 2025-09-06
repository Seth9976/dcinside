package com.bytedance.sdk.openadsdk.core.Au;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.Au;
import com.bytedance.sdk.openadsdk.core.model.Owx.PjT;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.qla.PjT.cr;
import com.bytedance.sdk.openadsdk.qla.ReZ;
import org.json.JSONObject;

public class qj {
    private static int PjT(String s) {
        s.hashCode();
        switch(s) {
            case "banner_ad": {
                return 1;
            }
            case "fullscreen_interstitial_ad": {
                return 8;
            }
            case "interaction": {
                return 2;
            }
            case "open_ad": {
                return 3;
            }
            case "rewarded_video": {
                return 7;
            }
            default: {
                return 5;
            }
        }
    }

    public static void PjT(String s, int v, String s1, String s2, String s3, Owx owx0) {
        if(TextUtils.isEmpty(s1)) {
            s1 = Au.PjT(v);
        }
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("render_source", s);
            PjT owx$PjT0 = owx0.VY();
            if(owx$PjT0 != null) {
                jSONObject0.put("tpl_id", owx$PjT0.cz());
                if("Web".equals(s)) {
                    if(owx$PjT0.fDm()) {
                        jSONObject0.put("engine_version", "v3");
                    }
                    else {
                        jSONObject0.put("engine_version", "v1");
                    }
                }
            }
            else if(owx0.xH() != null) {
                jSONObject0.put("tpl_id", owx0.xH().PjT());
                if("Web".equals(s)) {
                    jSONObject0.put("engine_version", "v3");
                }
            }
        }
        catch(Exception unused_ex) {
        }
        cr cr0 = cr.Zh().PjT(qj.PjT(s2)).ReZ(s3).JQp((owx0 == null ? "" : owx0.ydj())).Zh(v).Zh(jSONObject0.toString()).cz(s1);
        ReZ.PjT().PjT(cr0);
    }
}

