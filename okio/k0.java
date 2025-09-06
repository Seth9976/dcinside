package okio;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.L;
import y4.l;
import z3.n;

public final class k0 {
    @l
    public static final k0 a;
    private static final int b;
    @l
    private static final j0 c;
    private static final int d;
    @l
    private static final AtomicReference[] e;

    static {
        k0.a = new k0();
        k0.b = 0x10000;
        k0.c = new j0(new byte[0], 0, 0, false, false);
        int v1 = Integer.highestOneBit(Runtime.getRuntime().availableProcessors() * 2 - 1);
        k0.d = v1;
        AtomicReference[] arr_atomicReference = new AtomicReference[v1];
        for(int v = 0; v < v1; ++v) {
            arr_atomicReference[v] = new AtomicReference();
        }
        k0.e = arr_atomicReference;
    }

    private final AtomicReference a() {
        return k0.e[((int)(Thread.currentThread().getId() & ((long)k0.d) - 1L))];
    }

    public final int b() {
        j0 j00 = (j0)this.a().get();
        return j00 == null ? 0 : j00.c;
    }

    public final int c() {
        return k0.b;
    }

    @n
    public static final void d(@l j0 j00) {
        L.p(j00, "segment");
        if(j00.f != null || j00.g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if(j00.d) {
            return;
        }
        AtomicReference atomicReference0 = k0.a.a();
        j0 j01 = (j0)atomicReference0.getAndSet(k0.c);
        if(j01 == k0.c) {
            return;
        }
        int v = j01 == null ? 0 : j01.c;
        if(v >= k0.b) {
            atomicReference0.set(j01);
            return;
        }
        j00.f = j01;
        j00.b = 0;
        j00.c = v + 0x2000;
        atomicReference0.set(j00);
    }

    @l
    @n
    public static final j0 e() {
        AtomicReference atomicReference0 = k0.a.a();
        j0 j00 = (j0)atomicReference0.getAndSet(k0.c);
        if(j00 == k0.c) {
            return new j0();
        }
        if(j00 == null) {
            atomicReference0.set(null);
            return new j0();
        }
        atomicReference0.set(j00.f);
        j00.f = null;
        j00.c = 0;
        return j00;
    }
}

