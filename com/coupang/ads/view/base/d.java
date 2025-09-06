package com.coupang.ads.view.base;

import y4.l;
import y4.m;

public interface d {
    public static final class a {
        public static void a(d d0, long v, String s, String s1, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadData");
            }
            if((v1 & 2) != 0) {
                s = null;
            }
            if((v1 & 4) != 0) {
                s1 = null;
            }
            d0.c(v, s, s1);
        }
    }

    void a();

    void b();

    void c(long arg1, @m String arg2, @m String arg3);

    void d();

    void e(@l String arg1);
}

