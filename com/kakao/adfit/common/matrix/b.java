package com.kakao.adfit.common.matrix;

import kotlin.jvm.internal.L;

public interface b {
    public static abstract class a {
        public static f a(b b0, e e0) {
            L.p(e0, "event");
            return b0.a(e0, null);
        }

        public static f a(b b0, Throwable throwable0, Object object0) {
            L.p(throwable0, "throwable");
            return b0.a(com.kakao.adfit.common.matrix.e.a.a(e.t, null, throwable0, null, 5, null), object0);
        }
    }

    f a(e arg1);

    f a(e arg1, Object arg2);

    void a(com.kakao.adfit.i.b arg1);
}

