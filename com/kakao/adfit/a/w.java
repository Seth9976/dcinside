package com.kakao.adfit.a;

import com.kakao.adfit.ads.na.AdFitVideoAutoPlayPolicy;
import kotlin.J;
import kotlin.jvm.internal.L;

public final class w {
    public abstract class a {
        public static final int[] a;

        static {
            int[] arr_v = new int[AdFitVideoAutoPlayPolicy.values().length];
            try {
                arr_v[AdFitVideoAutoPlayPolicy.NONE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[AdFitVideoAutoPlayPolicy.WIFI_ONLY.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[AdFitVideoAutoPlayPolicy.ALWAYS.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            a.a = arr_v;
        }
    }

    public static final w a;
    private static final AdFitVideoAutoPlayPolicy b;
    private static com.kakao.adfit.c.a c;

    static {
        w.a = new w();
        w.b = AdFitVideoAutoPlayPolicy.WIFI_ONLY;
        w.c = com.kakao.adfit.c.a.c;
    }

    public final com.kakao.adfit.c.a a() {
        return w.c;
    }

    public final com.kakao.adfit.c.a a(AdFitVideoAutoPlayPolicy adFitVideoAutoPlayPolicy0) {
        L.p(adFitVideoAutoPlayPolicy0, "policy");
        switch(adFitVideoAutoPlayPolicy0) {
            case 1: {
                return com.kakao.adfit.c.a.b;
            }
            case 2: {
                return com.kakao.adfit.c.a.c;
            }
            case 3: {
                return com.kakao.adfit.c.a.d;
            }
            default: {
                throw new J();
            }
        }
    }

    public final void a(com.kakao.adfit.c.a a0) {
        L.p(a0, "<set-?>");
        w.c = a0;
    }

    public final AdFitVideoAutoPlayPolicy b() {
        return w.b;
    }
}

