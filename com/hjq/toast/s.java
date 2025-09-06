package com.hjq.toast;

import android.app.Application;
import android.content.res.Resources.NotFoundException;
import com.hjq.toast.style.b;
import y2.c;
import y2.d;
import y2.f;

public final class s {
    private static Application a;
    private static d b;
    private static f c;
    private static c d;
    private static Boolean e;

    public static void A(int v) {
        s.C(s.K(v));
    }

    public static void B(o o0) {
        s.b();
        if(o0.a != null && o0.a.length() != 0) {
            if(o0.f == null) {
                o0.f = s.b;
            }
            if(o0.g == null) {
                if(s.d == null) {
                    s.d = new n();
                }
                o0.g = s.d;
            }
            if(o0.e == null) {
                o0.e = s.c;
            }
            if(o0.g.a(o0)) {
                return;
            }
            if(o0.b == -1) {
                o0.b = o0.a.length() <= 20 ? 0 : 1;
            }
            o0.f.a(o0);
        }
    }

    public static void C(CharSequence charSequence0) {
        o o0 = new o();
        o0.a = charSequence0;
        s.B(o0);
    }

    public static void D(Object object0) {
        s.C(s.r(object0));
    }

    public static void E(int v) {
        s.F(s.K(v));
    }

    public static void F(CharSequence charSequence0) {
        o o0 = new o();
        o0.a = charSequence0;
        o0.b = 1;
        s.B(o0);
    }

    public static void G(Object object0) {
        s.F(s.r(object0));
    }

    public static void H(int v) {
        s.I(s.K(v));
    }

    public static void I(CharSequence charSequence0) {
        o o0 = new o();
        o0.a = charSequence0;
        o0.b = 0;
        s.B(o0);
    }

    public static void J(Object object0) {
        s.I(s.r(object0));
    }

    private static CharSequence K(int v) {
        s.b();
        try {
            return s.a.getResources().getText(v);
        }
        catch(Resources.NotFoundException unused_ex) {
            return String.valueOf(v);
        }
    }

    public static void a() {
        s.b.d();
    }

    private static void b() {
        if(s.a == null) {
            throw new IllegalStateException("Toaster has not been initialized");
        }
    }

    public static void c(int v) {
        s.d(s.K(v));
    }

    public static void d(CharSequence charSequence0) {
        if(!s.p()) {
            return;
        }
        o o0 = new o();
        o0.a = charSequence0;
        s.B(o0);
    }

    public static void e(Object object0) {
        s.d(s.r(object0));
    }

    public static void f(int v, long v1) {
        s.g(s.K(v), v1);
    }

    public static void g(CharSequence charSequence0, long v) {
        o o0 = new o();
        o0.a = charSequence0;
        o0.c = v;
        s.B(o0);
    }

    public static void h(Object object0, long v) {
        s.g(s.r(object0), v);
    }

    public static c i() {
        return s.d;
    }

    public static d j() {
        return s.b;
    }

    public static f k() {
        return s.c;
    }

    public static void l(Application application0) {
        s.o(application0, s.c);
    }

    public static void m(Application application0, d d0) {
        s.n(application0, d0, null);
    }

    public static void n(Application application0, d d0, f f0) {
        s.a = application0;
        a.b().c(application0);
        if(d0 == null) {
            d0 = new r();
        }
        s.x(d0);
        if(f0 == null) {
            f0 = new com.hjq.toast.style.a();
        }
        s.y(f0);
    }

    public static void o(Application application0, f f0) {
        s.n(application0, null, f0);
    }

    static boolean p() {
        if(s.e == null) {
            s.b();
            s.e = Boolean.valueOf((s.a.getApplicationInfo().flags & 2) != 0);
        }
        return s.e.booleanValue();
    }

    public static boolean q() [...] // 潜在的解密器

    private static CharSequence r(Object object0) {
        return object0 == null ? "null" : object0.toString();
    }

    public static void s(boolean z) {
        s.e = Boolean.valueOf(z);
    }

    public static void t(int v) {
        s.u(v, 0, 0);
    }

    public static void u(int v, int v1, int v2) {
        s.v(v, v1, v2, 0.0f, 0.0f);
    }

    public static void v(int v, int v1, int v2, float f, float f1) {
        s.c = new com.hjq.toast.style.c(s.c, v, v1, v2, f, f1);
    }

    public static void w(c c0) {
        s.d = c0;
    }

    public static void x(d d0) {
        if(d0 == null) {
            return;
        }
        s.b = d0;
        d0.b(s.a);
    }

    public static void y(f f0) {
        if(f0 == null) {
            return;
        }
        s.c = f0;
    }

    public static void z(int v) {
        if(v <= 0) {
            return;
        }
        f f0 = s.c;
        if(f0 == null) {
            return;
        }
        s.y(new b(v, f0.getGravity(), s.c.getXOffset(), s.c.getYOffset(), s.c.getHorizontalMargin(), s.c.getVerticalMargin()));
    }
}

