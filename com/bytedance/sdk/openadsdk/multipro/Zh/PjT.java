package com.bytedance.sdk.openadsdk.multipro.Zh;

import org.json.JSONObject;

public class PjT {
    public interface com.bytedance.sdk.openadsdk.multipro.Zh.PjT.PjT {
        PjT cz();
    }

    public long JQp;
    public boolean PjT;
    public boolean ReZ;
    public long XX;
    public boolean Zh;
    public boolean cr;
    public long cz;

    public static PjT PjT(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return null;
        }
        PjT pjT0 = new PjT();
        pjT0.Zh(jSONObject0.optBoolean("isCompleted"));
        pjT0.ReZ(jSONObject0.optBoolean("isFromVideoDetailPage"));
        pjT0.cr(jSONObject0.optBoolean("isFromDetailPage"));
        pjT0.PjT(jSONObject0.optLong("duration"));
        pjT0.Zh(jSONObject0.optLong("totalPlayDuration"));
        pjT0.ReZ(jSONObject0.optLong("currentPlayPosition"));
        pjT0.PjT(jSONObject0.optBoolean("isAutoPlay"));
        return pjT0;
    }

    public PjT PjT(long v) {
        this.JQp = v;
        return this;
    }

    public PjT PjT(boolean z) {
        this.cr = z;
        return this;
    }

    public JSONObject PjT() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("isCompleted", this.PjT);
            jSONObject0.put("isFromVideoDetailPage", this.Zh);
            jSONObject0.put("isFromDetailPage", this.ReZ);
            jSONObject0.put("duration", this.JQp);
            jSONObject0.put("totalPlayDuration", this.cz);
            jSONObject0.put("currentPlayPosition", this.XX);
            jSONObject0.put("isAutoPlay", this.cr);
        }
        catch(Exception unused_ex) {
        }
        return jSONObject0;
    }

    public PjT ReZ(long v) {
        this.XX = v;
        return this;
    }

    public PjT ReZ(boolean z) {
        this.Zh = z;
        return this;
    }

    public PjT Zh(long v) {
        this.cz = v;
        return this;
    }

    public PjT Zh(boolean z) {
        this.PjT = z;
        return this;
    }

    public PjT cr(boolean z) {
        this.ReZ = z;
        return this;
    }
}

