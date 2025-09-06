package com.bytedance.sdk.openadsdk.core.qj.Zh;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class PjT extends ReZ implements Comparable {
    public static class com.bytedance.sdk.openadsdk.core.qj.Zh.PjT.PjT {
        private final String PjT;
        private com.bytedance.sdk.openadsdk.core.qj.Zh.ReZ.ReZ ReZ;
        private final long Zh;
        private boolean cr;

        public com.bytedance.sdk.openadsdk.core.qj.Zh.PjT.PjT(String s, long v) {
            this.ReZ = com.bytedance.sdk.openadsdk.core.qj.Zh.ReZ.ReZ.PjT;
            this.cr = false;
            this.PjT = s;
            this.Zh = v;
        }

        public PjT PjT() {
            return new PjT(this.Zh, this.PjT, this.ReZ, Boolean.valueOf(this.cr));
        }
    }

    public long PjT;

    protected PjT(long v, String s, com.bytedance.sdk.openadsdk.core.qj.Zh.ReZ.ReZ reZ$ReZ0, Boolean boolean0) {
        super(s, reZ$ReZ0, boolean0);
        this.PjT = v;
    }

    public static int PjT(String s) {
        if(TextUtils.isEmpty(s)) {
            return 0x80000000;
        }
        String[] arr_s = s.split(":");
        if(arr_s.length == 3) {
            try {
                return (int)(((float)(Integer.parseInt(arr_s[0]) * 3600000 + Integer.parseInt(arr_s[1]) * 60000)) + Float.parseFloat(arr_s[2]) * 1000.0f);
            }
            catch(Throwable unused_ex) {
            }
        }
        return 0x80000000;
    }

    public int PjT(PjT pjT0) {
        if(pjT0 != null) {
            long v = this.PjT;
            long v1 = pjT0.PjT;
            if(v <= v1) {
                return v >= v1 ? 0 : -1;
            }
        }
        return 1;
    }

    public JSONObject PjT() throws JSONException {
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("content", this.ReZ());
        jSONObject0.put("trackingMilliseconds", this.PjT);
        return jSONObject0;
    }

    public boolean PjT(long v) {
        return this.PjT <= v && !this.JQp();
    }

    @Override
    public int compareTo(Object object0) {
        return this.PjT(((PjT)object0));
    }
}

