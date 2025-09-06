package kotlin.ranges;

import B3.a;
import androidx.collection.b;
import java.util.Iterator;
import kotlin.H0;
import kotlin.W0;
import kotlin.h0;
import kotlin.internal.r;
import kotlin.jvm.internal.w;
import kotlin.t;
import y4.l;
import y4.m;

@W0(markerClass = {t.class})
@h0(version = "1.5")
public class y implements a, Iterable {
    public static final class kotlin.ranges.y.a {
        private kotlin.ranges.y.a() {
        }

        public kotlin.ranges.y.a(w w0) {
        }

        @l
        public final y a(long v, long v1, long v2) {
            return new y(v, v1, v2, null);
        }
    }

    private final long a;
    private final long b;
    private final long c;
    @l
    public static final kotlin.ranges.y.a d;

    static {
        y.d = new kotlin.ranges.y.a(null);
    }

    private y(long v, long v1, long v2) {
        if(v2 == 0L) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if(v2 == 0x8000000000000000L) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.a = v;
        this.b = r.c(v, v1, v2);
        this.c = v2;
    }

    public y(long v, long v1, long v2, w w0) {
        this(v, v1, v2);
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof y && (this.isEmpty() && ((y)object0).isEmpty() || this.a == ((y)object0).a && this.b == ((y)object0).b && this.c == ((y)object0).c);
    }

    public final long g() {
        return this.a;
    }

    public final long h() {
        return this.b;
    }

    // 去混淆评级： 低(20)
    @Override
    public int hashCode() {
        return this.isEmpty() ? -1 : ((int)(this.c ^ this.c >>> 0x20)) + (((int)(this.a ^ this.a >>> 0x20)) * 0x1F + ((int)(this.b ^ this.b >>> 0x20))) * 0x1F;
    }

    public final long i() {
        return this.c;
    }

    public boolean isEmpty() {
        int v = b.a(this.a, this.b);
        return Long.compare(this.c, 0L) <= 0 ? v < 0 : v > 0;
    }

    @Override
    @l
    public final Iterator iterator() {
        return new z(this.a, this.b, this.c, null);
    }

    @Override
    @l
    public String toString() {
        long v;
        StringBuilder stringBuilder0;
        if(Long.compare(this.c, 0L) > 0) {
            stringBuilder0 = new StringBuilder();
            stringBuilder0.append(H0.g0(this.a));
            stringBuilder0.append("..");
            stringBuilder0.append(H0.g0(this.b));
            stringBuilder0.append(" step ");
            v = this.c;
        }
        else {
            stringBuilder0 = new StringBuilder();
            stringBuilder0.append(H0.g0(this.a));
            stringBuilder0.append(" downTo ");
            stringBuilder0.append(H0.g0(this.b));
            stringBuilder0.append(" step ");
            v = -this.c;
        }
        stringBuilder0.append(v);
        return stringBuilder0.toString();
    }
}

