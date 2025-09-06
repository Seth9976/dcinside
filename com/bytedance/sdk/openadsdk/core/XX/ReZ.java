package com.bytedance.sdk.openadsdk.core.XX;

import com.bytedance.sdk.component.XX.PjT.PjT;
import com.bytedance.sdk.component.XX.Zh.cr;
import com.bytedance.sdk.openadsdk.gK.Zh;
import com.bytedance.sdk.openadsdk.utils.Owx;
import com.bytedance.sdk.openadsdk.utils.wN;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public class ReZ {
    public static void PjT(String s, long v) {
        JSONObject jSONObject0 = ReZ.Zh(s, v);
        cr cr0 = Zh.PjT().Zh().Zh();
        cr0.Zh(wN.cr("/api/ad/union/sdk/stats/"));
        cr0.cr(jSONObject0.toString());
        cr0.PjT(6);
        cr0.PjT("uploadFrequentEvent");
        cr0.PjT(new PjT() {
            @Override  // com.bytedance.sdk.component.XX.PjT.PjT
            public void PjT(com.bytedance.sdk.component.XX.Zh.ReZ reZ0, com.bytedance.sdk.component.XX.Zh zh0) {
            }

            @Override  // com.bytedance.sdk.component.XX.PjT.PjT
            public void PjT(com.bytedance.sdk.component.XX.Zh.ReZ reZ0, IOException iOException0) {
                iOException0.getMessage();
                if(reZ0 != null) {
                    Owx.PjT(reZ0.cr());
                }
            }
        });
    }

    private static JSONObject Zh(String s, long v) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("type", "over_freq");
            jSONObject0.put("rit", s);
            jSONObject0.put("ad_sdk_version", "7.1.0.4");
            jSONObject0.put("timestamp", v);
        }
        catch(JSONException unused_ex) {
        }
        return jSONObject0;
    }
}

