package com.dcinside.app.read;

import com.google.gson.annotations.c;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class e {
    @c("base")
    @l
    private final List a;
    @c("ext")
    @l
    private final List b;

    public e(@l List list0, @l List list1) {
        L.p(list0, "base");
        L.p(list1, "wide");
        super();
        this.a = list0;
        this.b = list1;
    }

    @l
    public final List a() {
        return this.a;
    }

    @l
    public final List b() {
        return this.b;
    }

    @l
    public final e c(@l List list0, @l List list1) {
        L.p(list0, "base");
        L.p(list1, "wide");
        return new e(list0, list1);
    }

    public static e d(e e0, List list0, List list1, int v, Object object0) {
        if((v & 1) != 0) {
            list0 = e0.a;
        }
        if((v & 2) != 0) {
            list1 = e0.b;
        }
        return e0.c(list0, list1);
    }

    @l
    public final List e() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof e)) {
            return false;
        }
        return L.g(this.a, ((e)object0).a) ? L.g(this.b, ((e)object0).b) : false;
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
        return "BadWords(base=" + this.a + ", wide=" + this.b + ")";
    }
}

