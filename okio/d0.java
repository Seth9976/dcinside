package okio;

import java.io.OutputStream;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nJvmOkio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmOkio.kt\nokio/OutputStreamSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,239:1\n86#2:240\n*S KotlinDebug\n*F\n+ 1 JvmOkio.kt\nokio/OutputStreamSink\n*L\n55#1:240\n*E\n"})
final class d0 implements m0 {
    @l
    private final OutputStream a;
    @l
    private final q0 b;

    public d0(@l OutputStream outputStream0, @l q0 q00) {
        L.p(outputStream0, "out");
        L.p(q00, "timeout");
        super();
        this.a = outputStream0;
        this.b = q00;
    }

    @Override  // okio.m0
    public void close() {
        this.a.close();
    }

    @Override  // okio.m0
    public void flush() {
        this.a.flush();
    }

    @Override  // okio.m0
    @l
    public q0 timeout() {
        return this.b;
    }

    @Override
    @l
    public String toString() {
        return "sink(" + this.a + ')';
    }

    @Override  // okio.m0
    public void write(@l okio.l l0, long v) {
        L.p(l0, "source");
        i.e(l0.size(), 0L, v);
        while(v > 0L) {
            this.b.throwIfReached();
            j0 j00 = l0.a;
            L.m(j00);
            int v1 = (int)Math.min(v, j00.c - j00.b);
            this.a.write(j00.a, j00.b, v1);
            j00.b += v1;
            v -= (long)v1;
            l0.a1(l0.size() - ((long)v1));
            if(j00.b == j00.c) {
                l0.a = j00.b();
                k0.d(j00);
            }
        }
    }
}

