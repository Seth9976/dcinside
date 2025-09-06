package com.coupang.ads.view.banner.auto;

import android.view.View;
import com.coupang.ads.dto.AdsProduct;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class e {
    @l
    private final AdsProduct a;
    @m
    private View b;

    public e(@l AdsProduct adsProduct0) {
        L.p(adsProduct0, "bean");
        super();
        this.a = adsProduct0;
    }

    @l
    public final AdsProduct a() {
        return this.a;
    }

    @m
    public final View b() {
        return this.b;
    }

    public final void c(@m View view0) {
        this.b = view0;
    }
}

