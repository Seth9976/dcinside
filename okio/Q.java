package okio;

import java.io.IOException;
import javax.crypto.Cipher;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nCipherSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CipherSource.kt\nokio/CipherSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
public final class q implements o0 {
    @l
    private final n a;
    @l
    private final Cipher b;
    private final int c;
    @l
    private final okio.l d;
    private boolean e;
    private boolean f;

    public q(@l n n0, @l Cipher cipher0) {
        L.p(n0, "source");
        L.p(cipher0, "cipher");
        super();
        this.a = n0;
        this.b = cipher0;
        int v = cipher0.getBlockSize();
        this.c = v;
        this.d = new okio.l();
        if(v <= 0) {
            throw new IllegalArgumentException(("Block cipher required " + cipher0).toString());
        }
    }

    private final void a() {
        int v = this.b.getOutputSize(0);
        if(v == 0) {
            return;
        }
        j0 j00 = this.d.j1(v);
        int v1 = this.b.doFinal(j00.a, j00.b);
        j00.c += v1;
        this.d.a1(this.d.size() + ((long)v1));
        if(j00.b == j00.c) {
            this.d.a = j00.b();
            k0.d(j00);
        }
    }

    @l
    public final Cipher b() {
        return this.b;
    }

    private final void c() {
        while(this.d.size() == 0L && !this.e) {
            if(this.a.j3()) {
                this.e = true;
                this.a();
                return;
            }
            this.e();
        }
    }

    @Override  // okio.o0
    public void close() throws IOException {
        this.f = true;
        this.a.close();
    }

    private final void e() {
        j0 j00 = this.a.E().a;
        L.m(j00);
        int v = j00.c - j00.b;
        int v1;
        for(v1 = this.b.getOutputSize(v); v1 > 0x2000; v1 = this.b.getOutputSize(v)) {
            int v2 = this.c;
            if(v <= v2) {
                this.e = true;
                byte[] arr_b = this.a.Z0();
                byte[] arr_b1 = this.b.doFinal(arr_b);
                L.o(arr_b1, "doFinal(...)");
                this.d.Q1(arr_b1);
                return;
            }
            v -= v2;
        }
        j0 j01 = this.d.j1(v1);
        int v3 = this.b.update(j00.a, j00.b, v, j01.a, j01.b);
        this.a.skip(((long)v));
        j01.c += v3;
        this.d.a1(this.d.size() + ((long)v3));
        if(j01.b == j01.c) {
            this.d.a = j01.b();
            k0.d(j01);
        }
    }

    @Override  // okio.o0
    public long read(@l okio.l l0, long v) throws IOException {
        L.p(l0, "sink");
        int v1 = Long.compare(v, 0L);
        if(v1 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + v).toString());
        }
        if(this.f) {
            throw new IllegalStateException("closed");
        }
        if(v1 == 0) {
            return 0L;
        }
        this.c();
        return this.d.read(l0, v);
    }

    @Override  // okio.o0
    @l
    public q0 timeout() {
        return this.a.timeout();
    }
}

