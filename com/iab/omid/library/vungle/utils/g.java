package com.iab.omid.library.vungle.utils;

import android.text.TextUtils;
import com.iab.omid.library.vungle.adsession.f;
import com.iab.omid.library.vungle.adsession.j;
import com.iab.omid.library.vungle.adsession.m;
import com.iab.omid.library.vungle.adsession.q;

public class g {
    // 去混淆评级： 低(30)
    public static void a() {
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public static void b(m m0, f f0, j j0) {
        if(m0 == m.d) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if(f0 == f.b && m0 == m.b) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if(j0 == j.b && m0 == m.b) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    public static void c(q q0) {
        g.i(q0);
        g.g(q0);
    }

    public static void d(Object object0, String s) {
        if(object0 == null) {
            throw new IllegalArgumentException(s);
        }
    }

    public static void e(String s, int v, String s1) {
        if(s.length() > v) {
            throw new IllegalArgumentException(s1);
        }
    }

    public static void f(String s, String s1) {
        if(TextUtils.isEmpty(s)) {
            throw new IllegalArgumentException(s1);
        }
    }

    public static void g(q q0) {
        if(q0.v()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    public static void h(q q0) {
        if(q0.y()) {
            throw new IllegalStateException("AdSession is started");
        }
    }

    private static void i(q q0) {
        if(!q0.y()) {
            throw new IllegalStateException("AdSession is not started");
        }
    }

    public static void j(q q0) {
        if(!q0.w()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    public static void k(q q0) {
        if(!q0.x()) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
    }

    public static void l(q q0) {
        if(q0.f().s() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    public static void m(q q0) {
        if(q0.f().t() != null) {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
    }
}

