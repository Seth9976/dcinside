package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.j;
import com.bumptech.glide.util.m;
import java.security.MessageDigest;
import java.util.Map;

class n implements g {
    private final Object c;
    private final int d;
    private final int e;
    private final Class f;
    private final Class g;
    private final g h;
    private final Map i;
    private final j j;
    private int k;

    n(Object object0, g g0, int v, int v1, Map map0, Class class0, Class class1, j j0) {
        this.c = m.e(object0);
        this.h = (g)m.f(g0, "Signature must not be null");
        this.d = v;
        this.e = v1;
        this.i = (Map)m.e(map0);
        this.f = (Class)m.f(class0, "Resource class must not be null");
        this.g = (Class)m.f(class1, "Transcode class must not be null");
        this.j = (j)m.e(j0);
    }

    @Override  // com.bumptech.glide.load.g
    public void b(@NonNull MessageDigest messageDigest0) {
        throw new UnsupportedOperationException();
    }

    // 去混淆评级： 中等(70)
    @Override  // com.bumptech.glide.load.g
    public boolean equals(Object object0) {
        return object0 instanceof n && this.c.equals(((n)object0).c) && this.h.equals(((n)object0).h) && this.e == ((n)object0).e && this.d == ((n)object0).d && this.i.equals(((n)object0).i) && this.f.equals(((n)object0).f) && this.g.equals(((n)object0).g) && this.j.equals(((n)object0).j);
    }

    @Override  // com.bumptech.glide.load.g
    public int hashCode() {
        if(this.k == 0) {
            this.k = ((((((this.c.hashCode() * 0x1F + this.h.hashCode()) * 0x1F + this.d) * 0x1F + this.e) * 0x1F + this.i.hashCode()) * 0x1F + this.f.hashCode()) * 0x1F + this.g.hashCode()) * 0x1F + this.j.hashCode();
        }
        return this.k;
    }

    @Override
    public String toString() {
        return "EngineKey{model=" + this.c + ", width=" + this.d + ", height=" + this.e + ", resourceClass=" + this.f + ", transcodeClass=" + this.g + ", signature=" + this.h + ", hashCode=" + this.k + ", transformations=" + this.i + ", options=" + this.j + '}';
    }
}

