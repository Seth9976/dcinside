package kotlin.random;

import java.util.Random;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

final class c extends Random {
    static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    private final f a;
    private boolean b;
    @l
    private static final a c;
    private static final long d;

    static {
        c.c = new a(null);
    }

    public c(@l f f0) {
        L.p(f0, "impl");
        super();
        this.a = f0;
    }

    @l
    public final f a() {
        return this.a;
    }

    @Override
    protected int next(int v) {
        return this.a.b(v);
    }

    @Override
    public boolean nextBoolean() {
        return this.a.c();
    }

    @Override
    public void nextBytes(@l byte[] arr_b) {
        L.p(arr_b, "bytes");
        this.a.e(arr_b);
    }

    @Override
    public double nextDouble() {
        return this.a.h();
    }

    @Override
    public float nextFloat() {
        return this.a.k();
    }

    @Override
    public int nextInt() {
        return this.a.l();
    }

    @Override
    public int nextInt(int v) {
        return this.a.m(v);
    }

    @Override
    public long nextLong() {
        return this.a.o();
    }

    @Override
    public void setSeed(long v) {
        if(this.b) {
            throw new UnsupportedOperationException("Setting seed is not supported.");
        }
        this.b = true;
    }
}

