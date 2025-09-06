package com.kakao.adfit.e;

import com.kakao.adfit.a.a;
import com.kakao.adfit.a.l;
import com.kakao.adfit.ads.na.k;
import kotlin.jvm.internal.L;
import org.json.JSONObject;

public final class i extends l {
    @Override  // com.kakao.adfit.a.l
    public a a(JSONObject jSONObject0) {
        return this.b(jSONObject0);
    }

    public k b(JSONObject jSONObject0) {
        L.p(jSONObject0, "src");
        return com.kakao.adfit.ads.na.l.j(jSONObject0);
    }
}

