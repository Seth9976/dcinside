package com.dcinside.app.recent;

import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class c {
    @l
    private final List a;
    @l
    private final List b;

    public c(@l List list0, @l List list1) {
        L.p(list0, "arg0");
        L.p(list1, "arg1");
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
    public final c c(@l List list0, @l List list1) {
        L.p(list0, "arg0");
        L.p(list1, "arg1");
        return new c(list0, list1);
    }

    public static c d(c c0, List list0, List list1, int v, Object object0) {
        if((v & 1) != 0) {
            list0 = c0.a;
        }
        if((v & 2) != 0) {
            list1 = c0.b;
        }
        return c0.c(list0, list1);
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
        if(!(object0 instanceof c)) {
            return false;
        }
        return L.g(this.a, ((c)object0).a) ? L.g(this.b, ((c)object0).b) : false;
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
        return "RecentCombine(arg0=" + this.a + ", arg1=" + this.b + ")";
    }
}

