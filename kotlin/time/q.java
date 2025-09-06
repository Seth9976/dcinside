package kotlin.time;

import kotlin.W0;
import kotlin.h0;
import kotlin.jvm.internal.s0;

@W0(markerClass = {l.class})
@h0(version = "1.9")
@s0({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,199:1\n80#2:200\n80#2:201\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n*L\n173#1:200\n180#1:201\n*E\n"})
public final class q extends b {
    private long d;

    public q() {
        super(h.b);
        this.a();
    }

    @Override  // kotlin.time.b
    protected long f() {
        return this.d;
    }

    private final void g(long v) {
        throw new IllegalStateException("TestTimeSource will overflow if its reading " + this.d + k.h(this.d()) + " is advanced by " + e.v0(v) + '.');
    }

    public final void h(long v) {
        long v3;
        long v1 = e.r0(v, this.d());
        if((v1 - 1L | 1L) == 0x7FFFFFFFFFFFFFFFL) {
            long v2 = e.l(v, 2);
            if((1L | e.r0(v2, this.d()) - 1L) == 0x7FFFFFFFFFFFFFFFL) {
                this.g(v);
                return;
            }
            try {
                v3 = this.d;
                this.h(v2);
                this.h(e.g0(v, v2));
                return;
            }
            catch(IllegalStateException illegalStateException0) {
                this.d = v3;
                throw illegalStateException0;
            }
        }
        long v4 = this.d + v1;
        if((v1 ^ this.d) >= 0L && (this.d ^ v4) < 0L) {
            this.g(v);
        }
        this.d = v4;
    }
}

