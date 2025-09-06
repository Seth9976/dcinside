package com.iab.omid.library.unity3d.utils;

import android.text.TextUtils;
import com.iab.omid.library.unity3d.adsession.f;
import com.iab.omid.library.unity3d.adsession.j;
import com.iab.omid.library.unity3d.adsession.l;
import com.iab.omid.library.unity3d.adsession.p;

public class g {
    // 去混淆评级： 低(30)
    public static void a() {
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public static void b(l l0, f f0, j j0) {
        if(l0 == l.d) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if(f0 == f.b && l0 == l.b) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if(j0 == j.b && l0 == l.b) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    public static void c(p p0) {
        g.i(p0);
        g.g(p0);
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

    public static void g(p p0) {
        if(p0.y()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    public static void h(p p0) {
        if(p0.B()) {
            throw new IllegalStateException("AdSession is started");
        }
    }

    private static void i(p p0) {
        if(!p0.B()) {
            throw new IllegalStateException("AdSession is not started");
        }
    }

    public static void j(p p0) {
        if(!p0.z()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    public static void k(p p0) {
        if(!p0.A()) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
    }

    public static void l(p p0) {
        if(p0.f().r() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    public static void m(p p0) {
        if(p0.f().s() != null) {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
    }
}

