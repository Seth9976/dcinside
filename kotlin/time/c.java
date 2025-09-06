package kotlin.time;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

final class c implements r {
    @l
    private final r a;
    private final long b;

    private c(r r0, long v) {
        L.p(r0, "mark");
        super();
        this.a = r0;
        this.b = v;
    }

    public c(r r0, long v, w w0) {
        this(r0, v);
    }

    @Override  // kotlin.time.r
    public long a() {
        return e.g0(this.a.a(), this.b);
    }

    @Override  // kotlin.time.r
    public boolean b() {
        return a.a(this);
    }

    @Override  // kotlin.time.r
    public boolean c() {
        return a.b(this);
    }

    public final long d() {
        return this.b;
    }

    @l
    public final r e() {
        return this.a;
    }

    @Override  // kotlin.time.r
    @l
    public r o(long v) {
        long v1 = e.h0(this.b, v);
        return new c(this.a, v1, null);
    }

    @Override  // kotlin.time.r
    @l
    public r q(long v) {
        return a.c(this, v);
    }
}

