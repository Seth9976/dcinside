package okio;

import java.io.IOException;
import javax.crypto.Cipher;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nCipherSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CipherSink.kt\nokio/CipherSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,148:1\n1#2:149\n86#3:150\n*S KotlinDebug\n*F\n+ 1 CipherSink.kt\nokio/CipherSink\n*L\n47#1:150\n*E\n"})
public final class p implements m0 {
    @l
    private final m a;
    @l
    private final Cipher b;
    private final int c;
    private boolean d;

    public p(@l m m0, @l Cipher cipher0) {
        L.p(m0, "sink");
        L.p(cipher0, "cipher");
        super();
        this.a = m0;
        this.b = cipher0;
        int v = cipher0.getBlockSize();
        this.c = v;
        if(v <= 0) {
            throw new IllegalArgumentException(("Block cipher required " + cipher0).toString());
        }
    }

    private final Throwable a() {
        int v = this.b.getOutputSize(0);
        Throwable throwable0 = null;
        if(v == 0) {
            return null;
        }
        if(v > 0x2000) {
            try {
                byte[] arr_b = this.b.doFinal();
                L.o(arr_b, "doFinal(...)");
                this.a.write(arr_b);
                return null;
            }
            catch(Throwable throwable1) {
                return throwable1;
            }
        }
        okio.l l0 = this.a.E();
        j0 j00 = l0.j1(v);
        try {
            int v1 = this.b.doFinal(j00.a, j00.c);
            j00.c += v1;
            l0.a1(l0.size() + ((long)v1));
        }
        catch(Throwable throwable0) {
        }
        if(j00.b == j00.c) {
            l0.a = j00.b();
            k0.d(j00);
        }
        return throwable0;
    }

    @l
    public final Cipher b() {
        return this.b;
    }

    private final int c(okio.l l0, long v) {
        j0 j00 = l0.a;
        L.m(j00);
        int v1 = (int)Math.min(v, j00.c - j00.b);
        okio.l l1 = this.a.E();
        int v2;
        for(v2 = this.b.getOutputSize(v1); v2 > 0x2000; v2 = this.b.getOutputSize(v1)) {
            int v3 = this.c;
            if(v1 <= v3) {
                byte[] arr_b = l0.O2(v);
                byte[] arr_b1 = this.b.update(arr_b);
                L.o(arr_b1, "update(...)");
                this.a.write(arr_b1);
                return (int)v;
            }
            v1 -= v3;
        }
        j0 j01 = l1.j1(v2);
        int v4 = this.b.update(j00.a, j00.b, v1, j01.a, j01.c);
        j01.c += v4;
        l1.a1(l1.size() + ((long)v4));
        if(j01.b == j01.c) {
            l1.a = j01.b();
            k0.d(j01);
        }
        this.a.n2();
        l0.a1(l0.size() - ((long)v1));
        int v5 = j00.b + v1;
        j00.b = v5;
        if(v5 == j00.c) {
            l0.a = j00.b();
            k0.d(j00);
        }
        return v1;
    }

    @Override  // okio.m0
    public void close() throws IOException {
        if(this.d) {
            return;
        }
        this.d = true;
        Throwable throwable0 = this.a();
        try {
            this.a.close();
        }
        catch(Throwable throwable1) {
            if(throwable0 == null) {
                throwable0 = throwable1;
            }
        }
        if(throwable0 != null) {
            throw throwable0;
        }
    }

    @Override  // okio.m0
    public void flush() {
        this.a.flush();
    }

    @Override  // okio.m0
    @l
    public q0 timeout() {
        return this.a.timeout();
    }

    @Override  // okio.m0
    public void write(@l okio.l l0, long v) throws IOException {
        L.p(l0, "source");
        i.e(l0.size(), 0L, v);
        if(this.d) {
            throw new IllegalStateException("closed");
        }
        while(v > 0L) {
            v -= (long)this.c(l0, v);
        }
    }
}

