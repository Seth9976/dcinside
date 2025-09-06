package org.bson.types;

import java.io.Serializable;
import java.util.Date;

public final class a implements Serializable, Comparable {
    private final int a;
    private final Date b;
    private static final long c = 0xD2A40453A4F33D30L;

    public a() {
        this.a = 0;
        this.b = null;
    }

    public a(int v, int v1) {
        this.b = new Date(((long)v) * 1000L);
        this.a = v1;
    }

    public int a(a a0) {
        return this.c() == a0.c() ? this.b() - a0.b() : this.c() - a0.c();
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b == null ? 0 : ((int)(this.b.getTime() / 1000L));
    }

    @Override
    public int compareTo(Object object0) {
        return this.a(((a)object0));
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object object0) {
        return object0 == this ? true : object0 instanceof a && (this.c() == ((a)object0).c() && this.b() == ((a)object0).b());
    }

    @Override
    public int hashCode() {
        int v = this.c();
        return (this.a + 0x1F) * 0x1F + v;
    }

    @Override
    public String toString() {
        return "TS time:" + this.b + " inc:" + this.a;
    }
}

