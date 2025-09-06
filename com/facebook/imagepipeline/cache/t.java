package com.facebook.imagepipeline.cache;

import android.net.Uri;
import com.facebook.cache.common.e;
import com.facebook.cache.common.l;
import com.facebook.imagepipeline.request.d;
import com.facebook.imagepipeline.request.f;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class t implements com.facebook.imagepipeline.cache.n {
    @h
    private static t a = null;
    private static boolean b = false;

    static {
    }

    @Override  // com.facebook.imagepipeline.cache.n
    public e a(d d0, @h Object object0) {
        e e1;
        String s;
        f f0 = d0.p();
        if(f0 == null) {
            e1 = null;
            s = null;
        }
        else {
            e e0 = f0.a();
            s = f0.getClass().getName();
            e1 = e0;
        }
        e e2 = new c(d0.z().toString(), d0.v(), d0.x(), d0.l(), e1, s);
        if(t.b) {
            ((c)e2).t(null);
            return e2;
        }
        ((c)e2).t(object0);
        return e2;
    }

    @Override  // com.facebook.imagepipeline.cache.n
    public e b(d d0, @h Object object0) {
        return this.d(d0, d0.z(), object0);
    }

    @Override  // com.facebook.imagepipeline.cache.n
    public e c(d d0, @h Object object0) {
        e e0 = new c(this.e(d0.z()).toString(), d0.v(), d0.x(), d0.l(), null, null);
        if(t.b) {
            ((c)e0).t(null);
            return e0;
        }
        ((c)e0).t(object0);
        return e0;
    }

    @Override  // com.facebook.imagepipeline.cache.n
    public e d(d d0, Uri uri0, @h Object object0) {
        return new l(uri0.toString());
    }

    protected Uri e(Uri uri0) [...] // Inlined contents

    public static t f() {
        synchronized(t.class) {
            if(t.a == null) {
                t.a = new t();
            }
            return t.a;
        }
    }

    public static void g(boolean z) {
        t.b = z;
    }
}

