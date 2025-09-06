package com.iab.omid.library.bytedance2.utils;

import android.text.TextUtils;
import com.iab.omid.library.bytedance2.adsession.CreativeType;
import com.iab.omid.library.bytedance2.adsession.ImpressionType;
import com.iab.omid.library.bytedance2.adsession.Owner;
import com.iab.omid.library.bytedance2.adsession.a;

public class g {
    // 去混淆评级： 低(30)
    public static void a() {
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public static void a(Owner owner0, CreativeType creativeType0, ImpressionType impressionType0) {
        if(owner0 == Owner.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if(creativeType0 == CreativeType.DEFINED_BY_JAVASCRIPT && owner0 == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if(impressionType0 == ImpressionType.DEFINED_BY_JAVASCRIPT && owner0 == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    public static void a(a a0) {
        g.d(a0);
        g.b(a0);
    }

    public static void a(Object object0, String s) {
        if(object0 == null) {
            throw new IllegalArgumentException(s);
        }
    }

    public static void a(String s, int v, String s1) {
        if(s.length() > v) {
            throw new IllegalArgumentException(s1);
        }
    }

    public static void a(String s, String s1) {
        if(TextUtils.isEmpty(s)) {
            throw new IllegalArgumentException(s1);
        }
    }

    public static void b(a a0) {
        if(a0.g()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    public static void c(a a0) {
        if(a0.j()) {
            throw new IllegalStateException("AdSession is started");
        }
    }

    private static void d(a a0) {
        if(!a0.j()) {
            throw new IllegalStateException("AdSession is not started");
        }
    }

    public static void e(a a0) {
        if(!a0.h()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    public static void f(a a0) {
        if(!a0.i()) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
    }

    public static void g(a a0) {
        if(a0.getAdSessionStatePublisher().c() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    public static void h(a a0) {
        if(a0.getAdSessionStatePublisher().d() != null) {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
    }
}

