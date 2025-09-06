package com.kakao.adfit.ads.ba;

import com.kakao.adfit.a.g;
import kotlin.jvm.internal.L;
import kotlin.text.v;
import org.json.JSONObject;

public abstract class c {
    public static final b a(JSONObject jSONObject0) {
        L.p(jSONObject0, "<this>");
        String s = jSONObject0.optString("type", null);
        if(s != null) {
            if(!L.g(s, "banner")) {
                s = null;
            }
            if(s != null) {
                String s1 = jSONObject0.optString("mimeType", null);
                if(s1 != null) {
                    if(!L.g(s1, "text/html")) {
                        s1 = null;
                    }
                    if(s1 != null) {
                        String s2 = jSONObject0.optString("dspId", "");
                        L.o(s2, "optString(\"dspId\", \"\")");
                        String s3 = jSONObject0.optString("content", null);
                        if(s3 != null) {
                            if(v.x3(s3)) {
                                s3 = null;
                            }
                            if(s3 != null) {
                                d b$d0 = c.b(jSONObject0);
                                return b$d0 == null ? null : new b(s2, s3, b$d0, g.a(jSONObject0));
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    private static final d b(JSONObject jSONObject0) {
        d b$d0 = c.d(jSONObject0);
        return b$d0 == null ? c.c(jSONObject0) : b$d0;
    }

    private static final com.kakao.adfit.ads.ba.b.b c(JSONObject jSONObject0) {
        int v = jSONObject0.optInt("width");
        Integer integer0 = v > 0 ? v : null;
        if(integer0 != null) {
            int v1 = jSONObject0.optInt("height");
            Integer integer1 = v1 > 0 ? v1 : null;
            return integer1 == null ? null : new com.kakao.adfit.ads.ba.b.b(((int)integer0), ((int)integer1));
        }
        return null;
    }

    private static final com.kakao.adfit.ads.ba.b.c d(JSONObject jSONObject0) {
        int v = jSONObject0.optInt("wratio");
        Integer integer0 = v > 0 ? v : null;
        if(integer0 != null) {
            int v1 = (int)integer0;
            int v2 = jSONObject0.optInt("hratio");
            Integer integer1 = v2 > 0 ? v2 : null;
            if(integer1 != null) {
                int v3 = jSONObject0.optInt("wmin");
                Integer integer2 = v3 > 0 ? v3 : null;
                return integer2 == null ? null : new com.kakao.adfit.ads.ba.b.c(v1, ((int)integer1), ((int)integer2));
            }
        }
        return null;
    }
}

