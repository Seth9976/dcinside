package com.dcinside.app.model;

import com.google.gson.annotations.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class r {
    @c("package_idx")
    private final int a;
    @c("title")
    @m
    private final String b;
    @c("img")
    @m
    private final String c;

    public r() {
        this(0, null, null, 7, null);
    }

    public r(int v, @m String s, @m String s1) {
        this.a = v;
        this.b = s;
        this.c = s1;
    }

    public r(int v, String s, String s1, int v1, w w0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        if((v1 & 2) != 0) {
            s = null;
        }
        if((v1 & 4) != 0) {
            s1 = null;
        }
        this(v, s, s1);
    }

    public final int a() {
        return this.a;
    }

    @m
    public final String b() {
        return this.b;
    }

    @m
    public final String c() {
        return this.c;
    }

    @l
    public final r d(int v, @m String s, @m String s1) {
        return new r(v, s, s1);
    }

    public static r e(r r0, int v, String s, String s1, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = r0.a;
        }
        if((v1 & 2) != 0) {
            s = r0.b;
        }
        if((v1 & 4) != 0) {
            s1 = r0.c;
        }
        return r0.d(v, s, s1);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof r)) {
            return false;
        }
        if(this.a != ((r)object0).a) {
            return false;
        }
        return L.g(this.b, ((r)object0).b) ? L.g(this.c, ((r)object0).c) : false;
    }

    @m
    public final String f() {
        return this.c;
    }

    public final int g() {
        return this.a;
    }

    @m
    public final String h() {
        return this.b;
    }

    @Override
    public int hashCode() {
        int v = this.a * 0x1F;
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        String s = this.c;
        if(s != null) {
            v1 = s.hashCode();
        }
        return (v + v2) * 0x1F + v1;
    }

    @Override
    @l
    public String toString() {
        return "DcConPackage(packageIndex=" + this.a + ", title=" + this.b + ", imageUrl=" + this.c + ")";
    }
}

