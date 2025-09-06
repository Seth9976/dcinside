package com.kakao.adfit.a;

import com.kakao.adfit.ads.AdError;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;

public final class j extends k {
    private final AdError a;
    private final String b;
    private final t c;

    public j(AdError adError0, String s, t t0) {
        L.p(adError0, "error");
        L.p(s, "message");
        super(null);
        this.a = adError0;
        this.b = s;
        this.c = t0;
    }

    public j(AdError adError0, String s, t t0, int v, w w0) {
        if((v & 4) != 0) {
            t0 = null;
        }
        this(adError0, s, t0);
    }

    public final AdError a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final t c() {
        return this.c;
    }
}

