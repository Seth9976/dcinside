package okio;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nPeekSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeekSource.kt\nokio/PeekSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
public final class f0 implements o0 {
    @l
    private final n a;
    @l
    private final okio.l b;
    @m
    private j0 c;
    private int d;
    private boolean e;
    private long f;

    public f0(@l n n0) {
        L.p(n0, "upstream");
        super();
        this.a = n0;
        okio.l l0 = n0.E();
        this.b = l0;
        this.c = l0.a;
        this.d = l0.a == null ? -1 : l0.a.b;
    }

    @Override  // okio.o0
    public void close() {
        this.e = true;
    }

    @Override  // okio.o0
    public long read(@l okio.l l0, long v) {
        L.p(l0, "sink");
        int v1 = Long.compare(v, 0L);
        if(v1 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + v).toString());
        }
        if(this.e) {
            throw new IllegalStateException("closed");
        }
        j0 j00 = this.c;
        if(j00 != null) {
            j0 j01 = this.b.a;
            if(j00 != j01) {
                throw new IllegalStateException("Peek source is invalid because upstream source was used");
            }
            int v2 = this.d;
            L.m(j01);
            if(v2 != j01.b) {
                throw new IllegalStateException("Peek source is invalid because upstream source was used");
            }
        }
        if(v1 == 0) {
            return 0L;
        }
        if(!this.a.request(this.f + 1L)) {
            return -1L;
        }
        if(this.c == null) {
            j0 j02 = this.b.a;
            if(j02 != null) {
                this.c = j02;
                L.m(j02);
                this.d = j02.b;
            }
        }
        long v3 = Math.min(v, this.b.size() - this.f);
        this.b.q(l0, this.f, v3);
        this.f += v3;
        return v3;
    }

    @Override  // okio.o0
    @l
    public q0 timeout() {
        return this.a.timeout();
    }
}

