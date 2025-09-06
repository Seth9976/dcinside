package com.dcinside.app.span;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class j {
    @l
    private final String a;

    public j(@l String s) {
        L.p(s, "word");
        super();
        this.a = s;
    }

    @l
    public final String a() {
        return this.a;
    }

    @l
    public final j b(@l String s) {
        L.p(s, "word");
        return new j(s);
    }

    public static j c(j j0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            s = j0.a;
        }
        return j0.b(s);
    }

    @l
    public final String d() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof j ? L.g(this.a, ((j)object0).a) : false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "SpanSpoilerOption(word=" + this.a + ")";
    }
}

