package okio;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nDeflaterSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeflaterSink.kt\nokio/DeflaterSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,163:1\n86#2:164\n*S KotlinDebug\n*F\n+ 1 DeflaterSink.kt\nokio/DeflaterSink\n*L\n58#1:164\n*E\n"})
public final class r implements m0 {
    @l
    private final m a;
    @l
    private final Deflater b;
    private boolean c;

    public r(@l m0 m00, @l Deflater deflater0) {
        L.p(m00, "sink");
        L.p(deflater0, "deflater");
        this(Z.d(m00), deflater0);
    }

    public r(@l m m0, @l Deflater deflater0) {
        L.p(m0, "sink");
        L.p(deflater0, "deflater");
        super();
        this.a = m0;
        this.b = deflater0;
    }

    private final void a(boolean z) {
        int v;
        j0 j00;
        okio.l l0 = this.a.E();
        while(true) {
            j00 = l0.j1(1);
            try {
                v = z ? this.b.deflate(j00.a, j00.c, 0x2000 - j00.c, 2) : this.b.deflate(j00.a, j00.c, 0x2000 - j00.c);
            }
            catch(NullPointerException nullPointerException0) {
                throw new IOException("Deflater already closed", nullPointerException0);
            }
            if(v > 0) {
                j00.c += v;
                l0.a1(l0.size() + ((long)v));
                this.a.n2();
            }
            else if(this.b.needsInput()) {
                break;
            }
        }
        if(j00.b == j00.c) {
            l0.a = j00.b();
            k0.d(j00);
        }
    }

    public final void b() {
        this.b.finish();
        this.a(false);
    }

    @Override  // okio.m0
    public void close() throws IOException {
        try {
            if(this.c) {
                return;
            }
            this.b();
            throwable0 = null;
        }
        catch(Throwable throwable0) {
        }
        try {
            this.b.end();
        }
        catch(Throwable throwable1) {
            if(throwable0 == null) {
                throwable0 = throwable1;
            }
        }
        try {
            this.a.close();
        }
        catch(Throwable throwable2) {
            if(throwable0 == null) {
                throwable0 = throwable2;
            }
        }
        this.c = true;
        if(throwable0 != null) {
            throw throwable0;
        }
    }

    @Override  // okio.m0
    public void flush() throws IOException {
        this.a(true);
        this.a.flush();
    }

    @Override  // okio.m0
    @l
    public q0 timeout() {
        return this.a.timeout();
    }

    @Override
    @l
    public String toString() {
        return "DeflaterSink(" + this.a + ')';
    }

    @Override  // okio.m0
    public void write(@l okio.l l0, long v) throws IOException {
        L.p(l0, "source");
        i.e(l0.size(), 0L, v);
        while(v > 0L) {
            j0 j00 = l0.a;
            L.m(j00);
            int v1 = (int)Math.min(v, j00.c - j00.b);
            this.b.setInput(j00.a, j00.b, v1);
            this.a(false);
            l0.a1(l0.size() - ((long)v1));
            int v2 = j00.b + v1;
            j00.b = v2;
            if(v2 == j00.c) {
                l0.a = j00.b();
                k0.d(j00);
            }
            v -= (long)v1;
        }
    }
}

