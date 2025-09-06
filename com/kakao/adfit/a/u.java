package com.kakao.adfit.a;

import kotlin.jvm.internal.L;
import org.json.JSONObject;

public abstract class u {
    public static final t a(JSONObject jSONObject0) {
        L.p(jSONObject0, "<this>");
        return new t(jSONObject0);
    }

    public static final t a(JSONObject jSONObject0, String s) {
        L.p(jSONObject0, "<this>");
        L.p(s, "key");
        JSONObject jSONObject1 = jSONObject0.optJSONObject(s);
        if(jSONObject1 != null) {
            L.o(jSONObject1, "optJSONObject(key)");
            return u.a(jSONObject1);
        }
        return null;
    }
}

