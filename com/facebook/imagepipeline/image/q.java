package com.facebook.imagepipeline.image;

import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class q implements r {
    int a;
    boolean b;
    boolean c;
    public static final r d;

    static {
        q.d = q.d(0x7FFFFFFF, true, true);
    }

    private q(int v, boolean z, boolean z1) {
        this.a = v;
        this.b = z;
        this.c = z1;
    }

    @Override  // com.facebook.imagepipeline.image.r
    public boolean a() {
        return this.c;
    }

    @Override  // com.facebook.imagepipeline.image.r
    public boolean b() {
        return this.b;
    }

    @Override  // com.facebook.imagepipeline.image.r
    public int c() {
        return this.a;
    }

    public static r d(int v, boolean z, boolean z1) {
        return new q(v, z, z1);
    }

    @Override
    public boolean equals(@h Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof q ? this.a == ((q)object0).a && this.b == ((q)object0).b && this.c == ((q)object0).c : false;
    }

    @Override
    public int hashCode() {
        int v = this.a;
        int v1 = 0;
        int v2 = this.b ? 0x400000 : 0;
        if(this.c) {
            v1 = 0x800000;
        }
        return v ^ v2 ^ v1;
    }
}

