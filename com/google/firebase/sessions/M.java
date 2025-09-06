package com.google.firebase.sessions;

import kotlin.jvm.internal.L;
import y4.l;

public final class m {
    @y4.m
    private final String a;

    public m(@y4.m String s) {
        this.a = s;
    }

    @y4.m
    public final String a() {
        return this.a;
    }

    @l
    public final m b(@y4.m String s) {
        return new m(s);
    }

    public static m c(m m0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            s = m0.a;
        }
        return m0.b(s);
    }

    @y4.m
    public final String d() {
        return this.a;
    }

    @Override
    public boolean equals(@y4.m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof m ? L.g(this.a, ((m)object0).a) : false;
    }

    @Override
    public int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "FirebaseSessionsData(sessionId=" + this.a + ')';
    }
}

