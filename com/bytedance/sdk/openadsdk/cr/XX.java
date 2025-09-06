package com.bytedance.sdk.openadsdk.cr;

import org.json.JSONObject;

public class XX {
    private long JQp;
    private long PjT;
    private long ReZ;
    private long Zh;
    private long cr;

    public void JQp(long v) {
        if(this.JQp <= 0L) {
            this.JQp = v;
        }
    }

    public JSONObject PjT(JSONObject jSONObject0) {
        try {
            if(jSONObject0 == null) {
                jSONObject0 = new JSONObject();
            }
            long v = this.PjT;
            if(v > 0L) {
                jSONObject0.put("show_start", v);
                long v1 = this.Zh;
                if(v1 > 0L) {
                    jSONObject0.put("show_firstQuartile", v1);
                    long v2 = this.ReZ;
                    if(v2 > 0L) {
                        jSONObject0.put("show_mid", v2);
                        long v3 = this.cr;
                        if(v3 > 0L) {
                            jSONObject0.put("show_thirdQuartile", v3);
                            long v4 = this.JQp;
                            if(v4 > 0L) {
                                jSONObject0.put("show_full", v4);
                            }
                        }
                    }
                }
            }
        }
        catch(Exception unused_ex) {
        }
        return jSONObject0;
    }

    public void PjT(long v) {
        if(this.PjT <= 0L) {
            this.PjT = v;
        }
    }

    public void PjT(long v, float f) {
        if(f > 0.0f) {
            this.PjT(v);
        }
        if(((double)f) >= 0.25) {
            this.PjT(v);
            this.Zh(v);
        }
        if(((double)f) >= 0.5) {
            this.PjT(v);
            this.Zh(v);
            this.ReZ(v);
        }
        if(((double)f) >= 0.75) {
            this.PjT(v);
            this.Zh(v);
            this.ReZ(v);
            this.cr(v);
        }
        if(f >= 1.0f) {
            this.PjT(v);
            this.Zh(v);
            this.ReZ(v);
            this.cr(v);
            this.JQp(v);
        }
    }

    public boolean PjT() {
        return this.PjT > 0L;
    }

    public void ReZ(long v) {
        if(this.ReZ <= 0L) {
            this.ReZ = v;
        }
    }

    public JSONObject Zh() {
        return this.PjT(null);
    }

    public void Zh(long v) {
        if(this.Zh <= 0L) {
            this.Zh = v;
        }
    }

    public void cr(long v) {
        if(this.cr <= 0L) {
            this.cr = v;
        }
    }
}

