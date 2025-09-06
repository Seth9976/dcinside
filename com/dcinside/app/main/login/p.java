package com.dcinside.app.main.login;

import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class p {
    @l
    private final String a;
    @l
    private final List b;

    public p() {
        this(null, null, 3, null);
    }

    public p(@l String s, @l List list0) {
        L.p(s, "galleryId");
        L.p(list0, "managerList");
        super();
        this.a = s;
        this.b = list0;
    }

    public p(String s, List list0, int v, w w0) {
        if((v & 1) != 0) {
            s = "";
        }
        if((v & 2) != 0) {
            list0 = u.H();
        }
        this(s, list0);
    }

    @l
    public final String a() {
        return this.a;
    }

    @l
    public final List b() {
        return this.b;
    }

    @l
    public final p c(@l String s, @l List list0) {
        L.p(s, "galleryId");
        L.p(list0, "managerList");
        return new p(s, list0);
    }

    public static p d(p p0, String s, List list0, int v, Object object0) {
        if((v & 1) != 0) {
            s = p0.a;
        }
        if((v & 2) != 0) {
            list0 = p0.b;
        }
        return p0.c(s, list0);
    }

    @l
    public final String e() [...] // 潜在的解密器

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof p)) {
            return false;
        }
        return L.g(this.a, ((p)object0).a) ? L.g(this.b, ((p)object0).b) : false;
    }

    @l
    public final List f() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "SimpleLoginGalleryManagerInfo(galleryId=" + this.a + ", managerList=" + this.b + ")";
    }
}

