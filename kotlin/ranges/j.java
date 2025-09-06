package kotlin.ranges;

import B3.a;
import java.util.Iterator;
import kotlin.collections.T;
import kotlin.internal.n;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public class j implements a, Iterable {
    public static final class kotlin.ranges.j.a {
        private kotlin.ranges.j.a() {
        }

        public kotlin.ranges.j.a(w w0) {
        }

        @l
        public final j a(int v, int v1, int v2) {
            return new j(v, v1, v2);
        }
    }

    private final int a;
    private final int b;
    private final int c;
    @l
    public static final kotlin.ranges.j.a d;

    static {
        j.d = new kotlin.ranges.j.a(null);
    }

    public j(int v, int v1, int v2) {
        switch(v2) {
            case 0x80000000: {
                throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            }
            case 0: {
                throw new IllegalArgumentException("Step must be non-zero.");
            }
            default: {
                this.a = v;
                this.b = n.c(v, v1, v2);
                this.c = v2;
            }
        }
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof j && (this.isEmpty() && ((j)object0).isEmpty() || this.a == ((j)object0).a && this.b == ((j)object0).b && this.c == ((j)object0).c);
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
        return this.c <= 0 ? this.a < this.b : this.a > this.b;
    }

    @Override
    public Iterator iterator() {
        return this.j();
    }

    @l
    public T j() {
        return new k(this.a, this.b, this.c);
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

