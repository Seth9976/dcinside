package androidx.collection;

import y4.l;
import y4.m;

public final class LongLongPair {
    private final long a;
    private final long b;

    public LongLongPair(long v, long v1) {
        this.a = v;
        this.b = v1;
    }

    public final long a() {
        return this.c();
    }

    public final long b() {
        return this.d();
    }

    public final long c() {
        return this.a;
    }

    public final long d() {
        return this.b;
    }

    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof LongLongPair ? ((LongLongPair)object0).a == this.a && ((LongLongPair)object0).b == this.b : false;
    }

    @Override
    public int hashCode() {
        return ((int)(this.a ^ this.a >>> 0x20)) ^ ((int)(this.b ^ this.b >>> 0x20));
    }

    @Override
    @l
    public String toString() {
        return '(' + this.a + ", " + this.b + ')';
    }
}

