package com.kakao.adfit.b;

import com.kakao.adfit.a.a;
import com.kakao.adfit.a.l;
import com.kakao.adfit.ads.ba.b;
import com.kakao.adfit.ads.ba.c;
import kotlin.jvm.internal.L;
import org.json.JSONObject;

public final class d extends l {
    @Override  // com.kakao.adfit.a.l
    public a a(JSONObject jSONObject0) {
        return this.b(jSONObject0);
    }

    public b b(JSONObject jSONObject0) {
        L.p(jSONObject0, "src");
        return c.a(jSONObject0);
    }
}

