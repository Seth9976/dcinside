package com.google.firebase.perf.logging;

import androidx.annotation.VisibleForTesting;
import java.util.Locale;

public class a {
    private final c a;
    private boolean b;
    private static volatile a c;

    private a() {
        this(null);
    }

    @VisibleForTesting
    public a(c c0) {
        this.b = false;
        if(c0 == null) {
            c0 = c.c();
        }
        this.a = c0;
    }

    public void a(String s) {
        if(this.b) {
            this.a.a(s);
        }
    }

    public void b(String s, Object[] arr_object) {
        if(this.b) {
            this.a.a(String.format(Locale.ENGLISH, s, arr_object));
        }
    }

    public void c(String s) {
        if(this.b) {
            this.a.b(s);
        }
    }

    public void d(String s, Object[] arr_object) {
        if(this.b) {
            this.a.b(String.format(Locale.ENGLISH, s, arr_object));
        }
    }

    public static a e() {
        if(a.c == null) {
            Class class0 = a.class;
            synchronized(class0) {
                if(a.c == null) {
                    a.c = new a();
                }
            }
        }
        return a.c;
    }

    public void f(String s) {
        if(this.b) {
            this.a.d(s);
        }
    }

    public void g(String s, Object[] arr_object) {
        if(this.b) {
            this.a.d(String.format(Locale.ENGLISH, s, arr_object));
        }
    }

    public boolean h() {
        return this.b;
    }

    public void i(boolean z) {
        this.b = z;
    }

    public void j(String s) {
        if(this.b) {
            this.a.e(s);
        }
    }

    public void k(String s, Object[] arr_object) {
        if(this.b) {
            this.a.e(String.format(Locale.ENGLISH, s, arr_object));
        }
    }

    public void l(String s) {
        if(this.b) {
            this.a.f(s);
        }
    }

    public void m(String s, Object[] arr_object) {
        if(this.b) {
            this.a.f(String.format(Locale.ENGLISH, s, arr_object));
        }
    }
}

