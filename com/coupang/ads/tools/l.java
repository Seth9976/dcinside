package com.coupang.ads.tools;

import com.coupang.ads.clog.b;
import com.coupang.ads.viewmodels.AdsRequest;
import kotlin.e0;
import kotlin.jvm.internal.L;
import y4.m;

public final class l {
    @m
    public static final Object a(@y4.l Object object0, @y4.l String s) {
        L.p(s, "tag");
        Object object1 = e0.i(object0) ? null : object0;
        if(e0.i(object0)) {
            b b0 = b.a;
            Throwable throwable0 = e0.e(object0);
            if(throwable0 == null) {
                throwable0 = new Exception("unknown");
            }
            b0.o(s, "checkResult[Failure]", throwable0);
            return null;
        }
        return object1;
    }

    @m
    public static final Object b(@y4.l Object object0, @m AdsRequest adsRequest0, @m String s) {
        Throwable throwable0 = e0.e(object0);
        if(throwable0 == null) {
            return e0.i(object0) ? null : object0;
        }
        if(!(throwable0 instanceof com.coupang.ads.b)) {
            if(s == null) {
                s = "getOrThrowAdsException";
            }
            throwable0 = new com.coupang.ads.b(adsRequest0, s, throwable0, 0, 8, null);
        }
        throw throwable0;
    }

    public static Object c(Object object0, AdsRequest adsRequest0, String s, int v, Object object1) {
        if((v & 2) != 0) {
            s = null;
        }
        return l.b(object0, adsRequest0, s);
    }
}

