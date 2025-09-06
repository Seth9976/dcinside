package com.dcinside.app.settings.image;

import java.util.HashMap;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.r0;
import y4.l;
import y4.m;

public final class d {
    @l
    private final HashMap a;
    @m
    private final AutoImageData b;

    public d() {
        this(null, null, 3, null);
    }

    public d(@l HashMap hashMap0, @m AutoImageData autoImageData0) {
        L.p(hashMap0, "images");
        super();
        this.a = hashMap0;
        this.b = autoImageData0;
    }

    public d(HashMap hashMap0, AutoImageData autoImageData0, int v, w w0) {
        if((v & 1) != 0) {
            hashMap0 = Y.M(new V[]{r0.a("", null)});
        }
        if((v & 2) != 0) {
            autoImageData0 = null;
        }
        this(hashMap0, autoImageData0);
    }

    @l
    public final HashMap a() {
        return this.a;
    }

    @m
    public final AutoImageData b() {
        return this.b;
    }

    @l
    public final d c(@l HashMap hashMap0, @m AutoImageData autoImageData0) {
        L.p(hashMap0, "images");
        return new d(hashMap0, autoImageData0);
    }

    public static d d(d d0, HashMap hashMap0, AutoImageData autoImageData0, int v, Object object0) {
        if((v & 1) != 0) {
            hashMap0 = d0.a;
        }
        if((v & 2) != 0) {
            autoImageData0 = d0.b;
        }
        return d0.c(hashMap0, autoImageData0);
    }

    @m
    public final AutoImageData e() {
        return this.b;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof d)) {
            return false;
        }
        return L.g(this.a, ((d)object0).a) ? L.g(this.b, ((d)object0).b) : false;
    }

    @l
    public final HashMap f() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "AutoImageCache(images=" + this.a + ", global=" + this.b + ")";
    }
}

