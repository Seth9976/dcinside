package com.bytedance.adsdk.ugeno.ReZ;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.JQp;
import org.json.JSONObject;

public class Zh {
    public static String PjT(String s, JSONObject jSONObject0) {
        if(!TextUtils.isEmpty(s) && jSONObject0 != null) {
            try {
                if(s.startsWith("${") && s.endsWith("}")) {
                    PjT pjT0 = JQp.PjT().ReZ();
                    if(pjT0 == null) {
                        return s;
                    }
                    com.bytedance.adsdk.ugeno.ReZ.PjT.PjT pjT$PjT0 = pjT0.PjT(s.substring(2, s.length() - 1));
                    return pjT$PjT0 == null ? s : ((String)pjT$PjT0.PjT(jSONObject0));
                }
                return s;
            }
            catch(Throwable unused_ex) {
            }
        }
        return s;
    }
}

