package com.facebook.imagepipeline.request;

import android.net.Uri;
import com.facebook.imagepipeline.common.f;
import com.facebook.imagepipeline.common.g;
import com.facebook.imagepipeline.core.n;
import com.facebook.imagepipeline.core.y;
import java.util.HashSet;
import java.util.Set;
import o3.h;

public class e {
    public static class a extends RuntimeException {
        public a(String s) {
            super("Invalid request builder: " + s);
        }
    }

    @h
    private Uri a;
    private d b;
    private int c;
    @h
    private g d;
    @h
    private com.facebook.imagepipeline.common.h e;
    private com.facebook.imagepipeline.common.d f;
    private b g;
    private boolean h;
    private boolean i;
    private boolean j;
    private f k;
    @h
    private com.facebook.imagepipeline.request.f l;
    @h
    private Boolean m;
    @h
    private f1.f n;
    @h
    private com.facebook.imagepipeline.common.b o;
    @h
    private Boolean p;
    @h
    private n q;
    private int r;
    @h
    private String s;
    private static final Set t;

    static {
        e.t = new HashSet();
    }

    private e() {
        this.a = null;
        this.b = d.b;
        this.c = 0;
        this.d = null;
        this.e = null;
        this.f = com.facebook.imagepipeline.common.d.a();
        this.g = b.b;
        this.h = y.O().a();
        this.i = false;
        this.j = false;
        this.k = f.d;
        this.l = null;
        this.m = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.s = null;
    }

    public static e A(int v) {
        return e.B(com.facebook.common.util.h.i(v));
    }

    public static e B(Uri uri0) {
        return new e().V(uri0);
    }

    // 去混淆评级： 低(20)
    @Deprecated
    public e C(boolean z) {
        return z ? this.T(com.facebook.imagepipeline.common.h.d()) : this.T(com.facebook.imagepipeline.common.h.g());
    }

    public e D(@h com.facebook.imagepipeline.common.b b0) {
        this.o = b0;
        return this;
    }

    public e E(b d$b0) {
        this.g = d$b0;
        return this;
    }

    private e F(int v) {
        this.c = v;
        if(this.g != b.c) {
            this.s = null;
        }
        return this;
    }

    public e G(int v) {
        this.r = v;
        return this;
    }

    public e H(@h String s) {
        this.s = s;
        return this;
    }

    public e I(@h n n0) {
        this.q = n0;
        return this;
    }

    public e J(com.facebook.imagepipeline.common.d d0) {
        this.f = d0;
        return this;
    }

    public e K(boolean z) {
        this.j = z;
        return this;
    }

    public e L(boolean z) {
        this.i = z;
        return this;
    }

    public e M(d d$d0) {
        this.b = d$d0;
        return this;
    }

    public e N(@h com.facebook.imagepipeline.request.f f0) {
        this.l = f0;
        return this;
    }

    public e O(boolean z) {
        this.h = z;
        return this;
    }

    public e P(@h f1.f f0) {
        this.n = f0;
        return this;
    }

    public e Q(f f0) {
        this.k = f0;
        return this;
    }

    public e R(@h g g0) {
        this.d = g0;
        return this;
    }

    public e S(@h Boolean boolean0) {
        this.p = boolean0;
        return this;
    }

    public e T(@h com.facebook.imagepipeline.common.h h0) {
        this.e = h0;
        return this;
    }

    public e U(@h Boolean boolean0) {
        this.m = boolean0;
        return this;
    }

    public e V(Uri uri0) {
        com.facebook.common.internal.n.i(uri0);
        this.a = uri0;
        return this;
    }

    @h
    public Boolean W() {
        return this.m;
    }

    protected void X() {
        Uri uri0 = this.a;
        if(uri0 == null) {
            throw new a("Source must be set!");
        }
        if(com.facebook.common.util.h.p(uri0)) {
            if(!this.a.isAbsolute()) {
                throw new a("Resource URI path must be absolute.");
            }
            if(!this.a.getPath().isEmpty()) {
                try {
                    Integer.parseInt(this.a.getPath().substring(1));
                    goto label_10;
                }
                catch(NumberFormatException unused_ex) {
                    throw new a("Resource URI path must be a resource id.");
                }
            }
            throw new a("Resource URI must not be empty");
        }
    label_10:
        if(com.facebook.common.util.h.k(this.a) && !this.a.isAbsolute()) {
            throw new a("Asset URI path must be absolute.");
        }
    }

    public static void a(String s) {
        e.t.add(s);
    }

    public com.facebook.imagepipeline.request.d b() {
        this.X();
        return new com.facebook.imagepipeline.request.d(this);
    }

    public e c() {
        this.c |= 0x30;
        return this;
    }

    public e d() {
        this.c |= 15;
        return this;
    }

    public static e e(com.facebook.imagepipeline.request.d d0) {
        return e.B(d0.z()).J(d0.l()).D(d0.e()).E(d0.f()).L(d0.n()).K(d0.m()).M(d0.o()).F(d0.g()).N(d0.p()).O(d0.t()).Q(d0.s()).R(d0.v()).P(d0.u()).T(d0.x()).U(d0.I()).G(d0.h()).H(d0.i()).I(d0.j()).S(d0.w());
    }

    @h
    public com.facebook.imagepipeline.common.b f() {
        return this.o;
    }

    public b g() {
        return this.g;
    }

    public int h() {
        return this.c;
    }

    public int i() {
        return this.r;
    }

    @h
    public String j() {
        return this.s;
    }

    @h
    public n k() {
        return this.q;
    }

    public com.facebook.imagepipeline.common.d l() {
        return this.f;
    }

    public boolean m() {
        return this.j;
    }

    public d n() {
        return this.b;
    }

    @h
    public com.facebook.imagepipeline.request.f o() {
        return this.l;
    }

    @h
    public f1.f p() {
        return this.n;
    }

    public f q() {
        return this.k;
    }

    @h
    public g r() {
        return this.d;
    }

    @h
    public Boolean s() {
        return this.p;
    }

    @h
    public com.facebook.imagepipeline.common.h t() {
        return this.e;
    }

    public Uri u() {
        return this.a;
    }

    public static boolean v(@h Uri uri0) {
        Set set0 = e.t;
        if(set0 != null && uri0 != null) {
            for(Object object0: set0) {
                if(((String)object0).equals(uri0.getScheme())) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    // 去混淆评级： 低(20)
    public boolean w() {
        return (this.c & 0x30) == 0 && (com.facebook.common.util.h.q(this.a) || e.v(this.a));
    }

    public boolean x() {
        return this.i;
    }

    public boolean y() {
        return (this.c & 15) == 0;
    }

    public boolean z() {
        return this.h;
    }
}

