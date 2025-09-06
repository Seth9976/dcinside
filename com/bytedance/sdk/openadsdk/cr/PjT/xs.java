package com.bytedance.sdk.openadsdk.cr.PjT;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.cz.PjT.cz.cr;
import com.bytedance.sdk.openadsdk.qla.PjT.ReZ;
import com.bytedance.sdk.openadsdk.qla.Zh;
import org.json.JSONArray;
import org.json.JSONObject;

public class xs implements Zh {
    private final cr PjT;
    private final boolean Zh;

    public xs(boolean z, cr cr0) {
        this.PjT = cr0;
        this.Zh = z;
    }

    @Override  // com.bytedance.sdk.openadsdk.qla.Zh
    @Nullable
    public ReZ getLogStats() throws Exception {
        int v2;
        if(this.PjT == null) {
            return null;
        }
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("success", this.Zh);
        jSONObject0.put("url", this.PjT.Zh());
        int v = this.PjT.cr();
        if(v <= 0) {
            v = 0;
        }
        jSONObject0.put("retry_times", v);
        jSONObject0.put("ad_id", this.PjT.cz());
        jSONObject0.put("track_type", this.PjT.JQp());
        if(!this.Zh) {
            v2 = 4;
        }
        else if(this.PjT.DWo()) {
            v2 = 3;
        }
        else if(this.PjT.cr() <= 0) {
            v2 = 1;
        }
        else {
            v2 = 2;
        }
        jSONObject0.put("upload_scene", v2);
        String s = this.PjT.XX();
        if(!TextUtils.isEmpty(s)) {
            JSONArray jSONArray0 = new JSONArray();
            String[] arr_s = s.split(",");
            for(int v3 = 0; v3 < arr_s.length; ++v3) {
                jSONArray0.put(arr_s[v3]);
            }
            jSONObject0.put("error_code", jSONArray0);
        }
        String s1 = this.PjT.SM();
        if(!TextUtils.isEmpty(s1)) {
            JSONArray jSONArray1 = new JSONArray();
            String[] arr_s1 = s1.split(",");
            for(int v1 = 0; v1 < arr_s1.length; ++v1) {
                jSONArray1.put(arr_s1[v1]);
            }
            jSONObject0.put("error_msg", jSONArray1);
        }
        return com.bytedance.sdk.openadsdk.qla.PjT.cr.Zh().PjT("track_link_result").Zh(jSONObject0.toString());
    }
}

