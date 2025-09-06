package com.dcinside.app.dccon;

import androidx.compose.foundation.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class a {
    @l
    private final b a;
    @m
    private final b b;
    private final boolean c;

    public a() {
        this(null, null, false, 7, null);
    }

    public a(@l b b0, @m b b1, boolean z) {
        L.p(b0, "left");
        super();
        this.a = b0;
        this.b = b1;
        this.c = z;
    }

    public a(b b0, b b1, boolean z, int v, w w0) {
        if((v & 1) != 0) {
            b0 = new b(null, null, null, false, false, false, 0x3F, null);
        }
        if((v & 2) != 0) {
            b1 = null;
        }
        if((v & 4) != 0) {
            z = false;
        }
        this(b0, b1, z);
    }

    @l
    public final b a() {
        return this.a;
    }

    @m
    public final b b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    @l
    public final a d(@l b b0, @m b b1, boolean z) {
        L.p(b0, "left");
        return new a(b0, b1, z);
    }

    public static a e(a a0, b b0, b b1, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            b0 = a0.a;
        }
        if((v & 2) != 0) {
            b1 = a0.b;
        }
        if((v & 4) != 0) {
            z = a0.c;
        }
        return a0.d(b0, b1, z);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof a)) {
            return false;
        }
        if(!L.g(this.a, ((a)object0).a)) {
            return false;
        }
        return L.g(this.b, ((a)object0).b) ? this.c == ((a)object0).c : false;
    }

    public final boolean f() {
        return this.c;
    }

    @l
    public final b g() {
        return this.a;
    }

    @m
    public final b h() {
        return this.b;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? v * 961 + c.a(this.c) : (v * 0x1F + this.b.hashCode()) * 0x1F + c.a(this.c);
    }

    @Override
    @l
    public String toString() {
        return "DcconPack(left=" + this.a + ", right=" + this.b + ", exists=" + this.c + ")";
    }
}

