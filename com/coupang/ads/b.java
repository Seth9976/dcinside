package com.coupang.ads;

import com.coupang.ads.viewmodels.AdsRequest;
import kotlin.jvm.internal.w;
import y4.m;

public final class b extends Exception {
    @m
    private final AdsRequest a;
    private final int b;

    public b(@m AdsRequest adsRequest0, @m String s, @m Throwable throwable0, int v) {
        super(s, throwable0);
        this.a = adsRequest0;
        this.b = v;
    }

    public b(AdsRequest adsRequest0, String s, Throwable throwable0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            s = null;
        }
        if((v1 & 4) != 0) {
            throwable0 = null;
        }
        if((v1 & 8) != 0) {
            v = -1;
        }
        this(adsRequest0, s, throwable0, v);
    }

    public final int a() {
        return this.b;
    }

    @m
    public final AdsRequest b() {
        return this.a;
    }
}

