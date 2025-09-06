package com.bykv.vk.openvk.PjT.PjT.Zh.Zh;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import java.util.Set;

public class c {
    static volatile d.d a;
    static volatile d.c b;
    private static volatile h.d c;
    public static final boolean d;
    @SuppressLint({"StaticFieldLeak"})
    private static volatile Context e;
    public static volatile boolean f;
    static volatile boolean g;
    static volatile boolean h;
    static volatile int i;
    public static volatile int j;
    public static volatile Integer k;

    static {
        c.d = false;
        c.g = true;
        c.i = 0;
        c.j = 3;
    }

    public static Context a() {
        return c.e;
    }

    public static void b(int v) {
        c.i = v;
    }

    public static void c(d.c d$c0, Context context0) {
        static final class a implements f {
            @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.Zh.d$c$f
            public void PjT(String s) {
                if(c.d) {
                    Log.i("TAG_PROXY_DiskLruCache", "new cache created: " + s);
                }
            }

            @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.Zh.d$c$f
            public void a(Set set0) {
                c.c.g(set0, 0);
                if(c.d) {
                    Log.i("TAG_PROXY_DiskLruCache", "cache file removed, " + set0);
                }
            }
        }

        if(d$c0 == null || context0 == null) {
            throw new IllegalArgumentException("DiskLruCache and Context can\'t be null !!!");
        }
        c.e = context0.getApplicationContext();
        if(c.b != null) {
            return;
        }
        if(c.a != null) {
            throw null;
        }
        c.b = d$c0;
        c.c = h.d.d(context0);
        c.b.i(new a());
        j j0 = j.g();
        j0.j(d$c0);
        j0.k(c.c);
        i i0 = i.l();
        i0.e(d$c0);
        i0.f(c.c);
    }

    public static void d(boolean z) {
        c.g = z;
    }

    public static d.d e() {
        return c.a;
    }

    public static d.c f() {
        return c.b;
    }

    public static void g(boolean z) {
        c.h = z;
    }
}

