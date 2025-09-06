package kotlin.ranges;

import B3.a;
import java.util.Iterator;
import kotlin.collections.U;
import kotlin.internal.n;
import kotlin.jvm.internal.w;
import y4.l;

public class m implements a, Iterable {
    public static final class kotlin.ranges.m.a {
        private kotlin.ranges.m.a() {
        }

        public kotlin.ranges.m.a(w w0) {
        }

        @l
        public final m a(long v, long v1, long v2) {
            return new m(v, v1, v2);
        }
    }

    private final long a;
    private final long b;
    private final long c;
    @l
    public static final kotlin.ranges.m.a d;

    static {
        m.d = new kotlin.ranges.m.a(null);
    }

    public m(long v, long v1, long v2) {
        if(v2 == 0L) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if(v2 == 0x8000000000000000L) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.a = v;
        this.b = n.d(v, v1, v2);
        this.c = v2;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@y4.m Object object0) {
        return object0 instanceof m && (this.isEmpty() && ((m)object0).isEmpty() || this.a == ((m)object0).a && this.b == ((m)object0).b && this.c == ((m)object0).c);
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
        return this.isEmpty() ? -1 : ((int)(0x1FL * ((this.a ^ this.a >>> 0x20) * 0x1FL + (this.b ^ this.b >>> 0x20)) + (this.c ^ this.c >>> 0x20)));
    }

    public final long i() {
        return this.c;
    }

    public boolean isEmpty() {
        return Long.compare(this.c, 0L) <= 0 ? this.a < this.b : this.a > this.b;
    }

    @Override
    public Iterator iterator() {
        return this.j();
    }

    @l
    public U j() {
        return new kotlin.ranges.n(this.a, this.b, this.c);
    }

    @Override
    @l
    public String toString() {
        long v;
        StringBuilder stringBuilder0;
        if(Long.compare(this.c, 0L) > 0) {
            stringBuilder0 = new StringBuilder();
            stringBuilder0.append(this.a);
            stringBuilder0.append("..");
            stringBuilder0.append(this.b);
            stringBuilder0.append(" step ");
            v = this.c;
        }
        else {
            stringBuilder0 = new StringBuilder();
            stringBuilder0.append(this.a);
            stringBuilder0.append(" downTo ");
            stringBuilder0.append(this.b);
            stringBuilder0.append(" step ");
            v = -this.c;
        }
        stringBuilder0.append(v);
        return stringBuilder0.toString();
    }
}

