package j$.time.format;

import j..time.LocalDate;
import j..time.b;
import j..time.chrono.h;
import j..time.temporal.q;
import j..util.Objects;

final class p extends j {
    private final LocalDate g;
    static final LocalDate h;

    static {
        p.h = LocalDate.c0(2000, 1, 1);
    }

    private p(q q0, int v, int v1, LocalDate localDate0, int v2) {
        super(q0, v, v1, F.NOT_NEGATIVE, v2);
        this.g = localDate0;
    }

    p(q q0, LocalDate localDate0) {
        this(q0, 2, 2, localDate0, 0);
        if(localDate0 == null) {
            if(!q0.l().i(0L)) {
                throw new IllegalArgumentException("The base value must be within the range of the field");
            }
            if(j.f[2] > 0x7FFFFFFFL) {
                throw new b("Unable to add printer-parser as the range exceeds the capacity of an int");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
            }
        }
    }

    p(q q0, LocalDate localDate0, int v) {
        this(q0, 2, 2, localDate0, v);
    }

    @Override  // j$.time.format.j
    final long b(y y0, long v) {
        long v1 = Math.abs(v);
        int v2 = this.g == null ? 0 : h.p(y0.d()).o(this.g).n(this.a);
        long[] arr_v = j.f;
        if(v >= ((long)v2)) {
            long v3 = arr_v[this.b];
            return v >= ((long)v2) + v3 ? v1 % arr_v[this.c] : v1 % v3;
        }
        return v1 % arr_v[this.c];
    }

    @Override  // j$.time.format.j
    final boolean c(w w0) {
        return w0.l() ? super.c(w0) : false;
    }

    @Override  // j$.time.format.j
    final int d(w w0, long v, int v1, int v2) {
        int v3;
        LocalDate localDate0 = this.g;
        if(localDate0 == null) {
            v3 = 0;
        }
        else {
            v3 = w0.h().o(localDate0).n(this.a);
            w0.a(new o(this, w0, v, v1, v2));
        }
        int v4 = this.b;
        if(v2 - v1 == v4 && v >= 0L) {
            long v5 = j.f[v4];
            long v6 = ((long)v3) - ((long)v3) % v5;
            v = v3 <= 0 ? v6 - v : v6 + v;
            if(v < ((long)v3)) {
                v += v5;
            }
        }
        return w0.o(this.a, v, v1, v2);
    }

    @Override  // j$.time.format.j
    final j e() {
        return this.e == -1 ? this : new p(this.a, this.b, this.c, this.g, -1);
    }

    @Override  // j$.time.format.j
    final j f(int v) {
        return new p(this.a, this.b, this.c, this.g, this.e + v);
    }

    @Override  // j$.time.format.j
    public final String toString() {
        LocalDate localDate0 = this.g;
        if(localDate0 == null) {
            localDate0 = Objects.requireNonNull(0, "defaultObj");
        }
        return "ReducedValue(" + this.a + "," + this.b + "," + this.c + "," + localDate0 + ")";
    }
}

