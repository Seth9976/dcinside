package kotlin.time;

import kotlin.W0;
import kotlin.h0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.m;

@W0(markerClass = {l.class})
@h0(version = "1.9")
public final class t {
    private final Object a;
    private final long b;

    private t(Object object0, long v) {
        this.a = object0;
        this.b = v;
    }

    public t(Object object0, long v, w w0) {
        this(object0, v);
    }

    public final Object a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    @y4.l
    public final t c(Object object0, long v) {
        return new t(object0, v, null);
    }

    public static t d(t t0, Object object0, long v, int v1, Object object1) {
        if((v1 & 1) != 0) {
            object0 = t0.a;
        }
        if((v1 & 2) != 0) {
            v = t0.b;
        }
        return t0.c(object0, v);
    }

    public final long e() {
        return this.b;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof t)) {
            return false;
        }
        return L.g(this.a, ((t)object0).a) ? e.n(this.b, ((t)object0).b) : false;
    }

    public final Object f() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.a == null ? e.Z(this.b) : this.a.hashCode() * 0x1F + e.Z(this.b);
    }

    @Override
    @y4.l
    public String toString() {
        return "TimedValue(value=" + this.a + ", duration=" + e.v0(this.b) + ')';
    }
}

