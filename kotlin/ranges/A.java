package kotlin.ranges;

import java.util.Iterator;
import kotlin.collections.t;
import kotlin.internal.n;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public class a implements B3.a, Iterable {
    public static final class kotlin.ranges.a.a {
        private kotlin.ranges.a.a() {
        }

        public kotlin.ranges.a.a(w w0) {
        }

        @l
        public final a a(char c, char c1, int v) {
            return new a(c, c1, v);
        }
    }

    private final char a;
    private final char b;
    private final int c;
    @l
    public static final kotlin.ranges.a.a d;

    static {
        a.d = new kotlin.ranges.a.a(null);
    }

    public a(char c, char c1, int v) {
        switch(v) {
            case 0x80000000: {
                throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            }
            case 0: {
                throw new IllegalArgumentException("Step must be non-zero.");
            }
            default: {
                this.a = c;
                this.b = (char)n.c(c, c1, v);
                this.c = v;
            }
        }
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof a && (this.isEmpty() && ((a)object0).isEmpty() || this.a == ((a)object0).a && this.b == ((a)object0).b && this.c == ((a)object0).c);
    }

    public final char g() {
        return this.a;
    }

    public final char h() {
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
        return this.c <= 0 ? L.t(this.a, this.b) < 0 : L.t(this.a, this.b) > 0;
    }

    @Override
    public Iterator iterator() {
        return this.j();
    }

    @l
    public t j() {
        return new b(this.a, this.b, this.c);
    }

    @Override
    @l
    public String toString() {
        int v;
        StringBuilder stringBuilder0;
        if(this.c > 0) {
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

