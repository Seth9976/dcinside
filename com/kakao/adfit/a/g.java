package com.kakao.adfit.a;

import kotlin.jvm.internal.L;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class g {
    public static final f a() {
        return new f();
    }

    public static final f a(JSONObject jSONObject0) {
        L.p(jSONObject0, "<this>");
        JSONArray jSONArray0 = jSONObject0.optJSONArray("events");
        return jSONArray0 == null ? g.a() : new f(jSONArray0);
    }
}

