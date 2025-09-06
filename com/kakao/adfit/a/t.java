package com.kakao.adfit.a;

import kotlin.jvm.internal.L;
import kotlin.text.v;
import org.json.JSONArray;
import org.json.JSONObject;

public final class t {
    private final JSONObject a;
    private JSONObject b;
    private final JSONArray c;

    public t(JSONObject jSONObject0) {
        L.p(jSONObject0, "source");
        super();
        this.a = jSONObject0.optJSONObject("viewable");
        this.b = jSONObject0.optJSONObject("ext");
        this.c = jSONObject0.optJSONArray("bp");
    }

    public final JSONArray a() {
        return this.c;
    }

    public final Long b() {
        JSONObject jSONObject0 = this.b;
        if(jSONObject0 != null) {
            String s = jSONObject0.optString("expiredTime", null);
            if(s != null) {
                Long long0 = v.d1(s);
                return long0 == null ? null : ((long)(((long)long0) * 1000L));
            }
        }
        return null;
    }

    public final Long c() {
        JSONObject jSONObject0 = this.b;
        if(jSONObject0 != null) {
            String s = jSONObject0.optString("refreshInterval", null);
            if(s != null) {
                Long long0 = v.d1(s);
                return long0 == null ? null : ((long)(((long)long0) * 1000L));
            }
        }
        return null;
    }

    public final Long d() {
        JSONObject jSONObject0 = this.b;
        if(jSONObject0 != null) {
            String s = jSONObject0.optString("reqInterval", null);
            if(s != null) {
                Long long0 = v.d1(s);
                return long0 == null ? null : ((long)(((long)long0) * 1000L));
            }
        }
        return null;
    }

    public final Float e() {
        JSONObject jSONObject0 = this.a;
        if(jSONObject0 != null) {
            String s = jSONObject0.optString("area", null);
            if(s != null) {
                Integer integer0 = v.b1(s);
                return integer0 == null ? null : ((float)(((float)Math.min(integer0.intValue(), 100)) / 100.0f));
            }
        }
        return null;
    }

    public final Long f() {
        JSONObject jSONObject0 = this.a;
        if(jSONObject0 != null) {
            String s = jSONObject0.optString("time", null);
            if(s != null) {
                Long long0 = v.d1(s);
                return long0 == null ? null : Math.max(long0.longValue(), 500L);
            }
        }
        return null;
    }

    public final Long g() {
        JSONObject jSONObject0 = this.b;
        if(jSONObject0 != null) {
            String s = jSONObject0.optString("waitingTime", null);
            return s == null ? null : v.d1(s);
        }
        return null;
    }
}

