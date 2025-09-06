package kotlin.ranges;

import B3.a;
import java.util.Iterator;
import kotlin.D0;
import kotlin.W0;
import kotlin.h0;
import kotlin.internal.r;
import kotlin.jvm.internal.w;
import kotlin.t;
import kotlin.y0;
import y4.l;
import y4.m;

@W0(markerClass = {t.class})
@h0(version = "1.5")
public class v implements a, Iterable {
    public static final class kotlin.ranges.v.a {
        private kotlin.ranges.v.a() {
        }

        public kotlin.ranges.v.a(w w0) {
        }

        @l
        public final v a(int v, int v1, int v2) {
            return new v(v, v1, v2, null);
        }
    }

    private final int a;
    private final int b;
    private final int c;
    @l
    public static final kotlin.ranges.v.a d;

    static {
        v.d = new kotlin.ranges.v.a(null);
    }

    private v(int v, int v1, int v2) {
        switch(v2) {
            case 0x80000000: {
                throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            }
            case 0: {
                throw new IllegalArgumentException("Step must be non-zero.");
            }
            default: {
                this.a = v;
                this.b = r.d(v, v1, v2);
                this.c = v2;
            }
        }
    }

    public v(int v, int v1, int v2, w w0) {
        this(v, v1, v2);
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof v && (this.isEmpty() && ((v)object0).isEmpty() || this.a == ((v)object0).a && this.b == ((v)object0).b && this.c == ((v)object0).c);
    }

    public final int g() {
        return this.a;
    }

    public final int h() {
        return this.b;
    }

    // 去混淆评级： 低(20)
    @Override
    public int hashCode() {
        return this.isEmpty() ? -1 : (this.a * 0x1F + this.b) * 0x1F + this.c;
    }

    public final int i() {
        return this.c;
    }

    public boolean isEmpty() {
        return this.c <= 0 ? y0.a(this.a, this.b) < 0 : y0.a(this.a, this.b) > 0;
    }

    @Override
    @l
    public final Iterator iterator() {
        return new kotlin.ranges.w(this.a, this.b, this.c, null);
    }

    @Override
    @l
    public String toString() {
        int v;
        StringBuilder stringBuilder0;
        if(this.c > 0) {
            stringBuilder0 = new StringBuilder();
            stringBuilder0.append(D0.g0(this.a));
            stringBuilder0.append("..");
            stringBuilder0.append(D0.g0(this.b));
            stringBuilder0.append(" step ");
            v = this.c;
        }
        else {
            stringBuilder0 = new StringBuilder();
            stringBuilder0.append(D0.g0(this.a));
            stringBuilder0.append(" downTo ");
            stringBuilder0.append(D0.g0(this.b));
            stringBuilder0.append(" step ");
            v = -this.c;
        }
        stringBuilder0.append(v);
        return stringBuilder0.toString();
    }
}

