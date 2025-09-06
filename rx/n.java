package rx;

import rx.internal.util.q;

public abstract class n implements h, o {
    private final q a;
    private final n b;
    private i c;
    private long d;
    private static final long e = 0x8000000000000000L;

    protected n() {
        this(null, false);
    }

    protected n(n n0) {
        this(n0, true);
    }

    protected n(n n0, boolean z) {
        this.d = 0x8000000000000000L;
        this.b = n0;
        this.a = !z || n0 == null ? new q() : n0.a;
    }

    public void X(i i0) {
        n n0;
        long v;
        synchronized(this) {
            v = this.d;
            this.c = i0;
            n0 = this.b;
        }
        if(n0 != null && v == 0x8000000000000000L) {
            n0.X(i0);
            return;
        }
        if(v == 0x8000000000000000L) {
            i0.request(0x7FFFFFFFFFFFFFFFL);
            return;
        }
        i0.request(v);
    }

    @Override  // rx.o
    public final boolean j() {
        return this.a.j();
    }

    @Override  // rx.o
    public final void l() {
        this.a.l();
    }

    public void onStart() {
    }

    public final void q(o o0) {
        this.a.a(o0);
    }

    private void t(long v) {
        long v1 = this.d;
        if(v1 == 0x8000000000000000L) {
            this.d = v;
            return;
        }
        long v2 = v1 + v;
        if(v2 < 0L) {
            this.d = 0x7FFFFFFFFFFFFFFFL;
            return;
        }
        this.d = v2;
    }

    protected final void v(long v) {
        if(v < 0L) {
            throw new IllegalArgumentException("number requested cannot be negative: " + v);
        }
        synchronized(this) {
            i i0 = this.c;
            if(i0 != null) {
                i0.request(v);
                return;
            }
            this.t(v);
        }
    }
}

