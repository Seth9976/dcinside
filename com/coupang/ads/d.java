package com.coupang.ads;

import android.content.Context;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;
import y4.m;

public final class d {
    @l
    public static final d a;

    static {
        d.a = new d();
    }

    @k(message = "", replaceWith = @c0(expression = "AndroidManifest.xml meta-data coupang_ads_affiliate_id & coupang_ads_sub_id", imports = {}))
    @l
    public final d a(@l Context context0, @l String s, @m String s1) {
        L.p(context0, "context");
        L.p(s, "affiliateId");
        a.o.b().p(s);
        a.o.b().s(s1);
        return this;
    }

    public static d b(d d0, Context context0, String s, String s1, int v, Object object0) {
        if((v & 4) != 0) {
            s1 = null;
        }
        return d0.a(context0, s, s1);
    }
}

