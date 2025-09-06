package com.facebook.imagepipeline.image;

import X0.c;
import android.graphics.ColorSpace;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.q;
import com.facebook.common.memory.k;
import com.facebook.imageutils.e;
import com.facebook.imageutils.f;
import com.facebook.imageutils.i;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import jeb.synthetic.TWR;
import k1.d;
import k1.n.a;
import k1.n;
import kotlin.V;
import o3.h;
import p3.b;

@n(a.a)
@b
public class l implements Closeable {
    @h
    private final com.facebook.common.references.a a;
    @h
    private final q b;
    private c c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    @h
    private com.facebook.imagepipeline.common.b j;
    @h
    private ColorSpace k;
    @h
    private String l;
    private boolean m;
    public static final int n = -1;
    public static final int o = -1;
    public static final int p = -1;
    public static final int q = -1;
    public static final int r = 1;
    private static boolean s;

    public l(q q0) {
        this.c = c.d;
        this.d = -1;
        this.e = 0;
        this.f = -1;
        this.g = -1;
        this.h = 1;
        this.i = -1;
        com.facebook.common.internal.n.i(q0);
        this.a = null;
        this.b = q0;
    }

    public l(q q0, int v) {
        this(q0);
        this.i = v;
    }

    public l(com.facebook.common.references.a a0) {
        this.c = c.d;
        this.d = -1;
        this.e = 0;
        this.f = -1;
        this.g = -1;
        this.h = 1;
        this.i = -1;
        com.facebook.common.internal.n.d(Boolean.valueOf(com.facebook.common.references.a.s(a0)));
        this.a = a0.b();
        this.b = null;
    }

    public int A0() {
        this.Y();
        return this.e;
    }

    public void E0(int v) {
        this.h = v;
    }

    public static boolean L(l l0) {
        return l0.d >= 0 && l0.f >= 0 && l0.g >= 0;
    }

    public void L0(@h String s) {
        this.l = s;
    }

    public boolean Q() {
        synchronized(this) {
            return com.facebook.common.references.a.s(this.a) || this.b != null;
        }
    }

    @d
    public static boolean R(@h l l0) {
        return l0 != null && l0.Q();
    }

    public void T() {
        if(!l.s) {
            this.w();
            return;
        }
        if(this.m) {
            return;
        }
        this.w();
        this.m = true;
    }

    public void T0(int v) {
        this.i = v;
    }

    private void Y() {
        if(this.f < 0 || this.g < 0) {
            this.T();
        }
    }

    public static void Y0(boolean z) {
        l.s = z;
    }

    @h
    public l a() {
        l l0;
        q q0 = this.b;
        if(q0 == null) {
            com.facebook.common.references.a a0 = com.facebook.common.references.a.e(this.a);
            try {
                l0 = a0 == null ? null : new l(a0);
            }
            finally {
                com.facebook.common.references.a.j(a0);
            }
        }
        else {
            l0 = new l(q0, this.i);
        }
        if(l0 != null) {
            l0.e(this);
        }
        return l0;
    }

    public void a1(int v) {
        this.f = v;
    }

    @h
    public static l b(@h l l0) {
        return l0 == null ? null : l0.a();
    }

    public static void c(@h l l0) {
        if(l0 != null) {
            l0.close();
        }
    }

    @Override
    public void close() {
        com.facebook.common.references.a.j(this.a);
    }

    private e d0() {
        InputStream inputStream0;
        try {
            inputStream0 = this.o();
            e e0 = com.facebook.imageutils.c.g(inputStream0);
            this.k = e0.a();
            V v1 = e0.b();
            if(v1 != null) {
                this.f = (int)(((Integer)v1.a()));
                this.g = (int)(((Integer)v1.b()));
            }
            return e0;
        }
        finally {
            if(inputStream0 != null) {
                try {
                    inputStream0.close();
                }
                catch(IOException unused_ex) {
                }
            }
        }
    }

    public void e(l l0) {
        this.c = l0.n();
        this.f = l0.getWidth();
        this.g = l0.getHeight();
        this.d = l0.k3();
        this.e = l0.A0();
        this.h = l0.q();
        this.i = l0.getSize();
        this.j = l0.i();
        this.k = l0.j();
        this.m = l0.v();
    }

    @h
    private V e0() {
        InputStream inputStream0 = this.o();
        if(inputStream0 == null) {
            return null;
        }
        V v0 = i.f(inputStream0);
        if(v0 != null) {
            this.f = (int)(((Integer)v0.a()));
            this.g = (int)(((Integer)v0.b()));
        }
        return v0;
    }

    public com.facebook.common.references.a f() {
        return com.facebook.common.references.a.e(this.a);
    }

    public void f0(@h com.facebook.imagepipeline.common.b b0) {
        this.j = b0;
    }

    public int getHeight() {
        this.Y();
        return this.g;
    }

    public int getSize() {
        return this.a == null || this.a.n() == null ? this.i : ((com.facebook.common.memory.i)this.a.n()).size();
    }

    public int getWidth() {
        this.Y();
        return this.f;
    }

    public void h0(int v) {
        this.e = v;
    }

    @h
    public com.facebook.imagepipeline.common.b i() {
        return this.j;
    }

    @h
    public ColorSpace j() {
        this.Y();
        return this.k;
    }

    public String k(int v) {
        com.facebook.common.references.a a0 = this.f();
        if(a0 == null) {
            return "";
        }
        int v1 = Math.min(this.getSize(), v);
        byte[] arr_b = new byte[v1];
        try {
            com.facebook.common.memory.i i0 = (com.facebook.common.memory.i)a0.n();
            if(i0 != null) {
                i0.m(0, arr_b, 0, v1);
                goto label_12;
            }
            goto label_20;
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(a0, throwable0);
            throw throwable0;
        }
    label_12:
        a0.close();
        StringBuilder stringBuilder0 = new StringBuilder(v1 * 2);
        for(int v2 = 0; v2 < v1; ++v2) {
            stringBuilder0.append(String.format("%02X", ((byte)arr_b[v2])));
        }
        return stringBuilder0.toString();
    label_20:
        a0.close();
        return "";
    }

    public int k3() {
        this.Y();
        return this.d;
    }

    public void l0(int v) {
        this.g = v;
    }

    public c n() {
        this.Y();
        return this.c;
    }

    @h
    public InputStream o() {
        q q0 = this.b;
        if(q0 != null) {
            return (InputStream)q0.get();
        }
        com.facebook.common.references.a a0 = com.facebook.common.references.a.e(this.a);
        if(a0 != null) {
            try {
                return new k(((com.facebook.common.memory.i)a0.n()));
            }
            finally {
                com.facebook.common.references.a.j(a0);
            }
        }
        return null;
    }

    public InputStream p() {
        return (InputStream)com.facebook.common.internal.n.i(this.o());
    }

    public int q() {
        return this.h;
    }

    @h
    public String s() {
        return this.l;
    }

    @VisibleForTesting
    @h
    public com.facebook.common.references.i t() {
        synchronized(this) {
            return this.a == null ? null : this.a.o();
        }
    }

    public void u0(c c0) {
        this.c = c0;
    }

    protected boolean v() {
        return this.m;
    }

    private void w() {
        c c0 = X0.e.f(this.o());
        this.c = c0;
        V v0 = X0.b.b(c0) ? this.e0() : this.d0().b();
        if(c0 != X0.b.b || this.d != -1) {
            if(c0 == X0.b.l && this.d == -1) {
                int v2 = com.facebook.imageutils.d.a(this.o());
                this.e = v2;
                this.d = f.a(v2);
                return;
            }
            if(this.d == -1) {
                this.d = 0;
            }
        }
        else if(v0 != null) {
            int v1 = f.b(this.o());
            this.e = v1;
            this.d = f.a(v1);
        }
    }

    public boolean x(int v) {
        if(this.c != X0.b.b && this.c != X0.b.m) {
            return true;
        }
        if(this.b != null) {
            return true;
        }
        com.facebook.common.internal.n.i(this.a);
        com.facebook.common.memory.i i0 = (com.facebook.common.memory.i)this.a.n();
        return v >= 2 ? i0.G(v - 2) == -1 && i0.G(v - 1) == -39 : false;
    }

    public void x0(int v) {
        this.d = v;
    }
}

