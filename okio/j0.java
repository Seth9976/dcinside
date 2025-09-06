package okio;

import java.util.Arrays;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.f;

@s0({"SMAP\nSegment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Segment.kt\nokio/Segment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n1#2:188\n*E\n"})
public final class j0 {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    @f
    public final byte[] a;
    @f
    public int b;
    @f
    public int c;
    @f
    public boolean d;
    @f
    public boolean e;
    @m
    @f
    public j0 f;
    @m
    @f
    public j0 g;
    @l
    public static final a h = null;
    public static final int i = 0x2000;
    public static final int j = 0x400;

    static {
        j0.h = new a(null);
    }

    public j0() {
        this.a = new byte[0x2000];
        this.e = true;
        this.d = false;
    }

    public j0(@l byte[] arr_b, int v, int v1, boolean z, boolean z1) {
        L.p(arr_b, "data");
        super();
        this.a = arr_b;
        this.b = v;
        this.c = v1;
        this.d = z;
        this.e = z1;
    }

    public final void a() {
        int v2;
        j0 j00 = this.g;
        if(j00 == this) {
            throw new IllegalStateException("cannot compact");
        }
        L.m(j00);
        if(!j00.e) {
            return;
        }
        int v = this.c - this.b;
        j0 j01 = this.g;
        L.m(j01);
        int v1 = 0x2000 - j01.c;
        j0 j02 = this.g;
        L.m(j02);
        if(j02.d) {
            v2 = 0;
        }
        else {
            j0 j03 = this.g;
            L.m(j03);
            v2 = j03.b;
        }
        if(v > v1 + v2) {
            return;
        }
        j0 j04 = this.g;
        L.m(j04);
        this.g(j04, v);
        this.b();
        k0.d(this);
    }

    @m
    public final j0 b() {
        j0 j00 = this.f == this ? null : this.f;
        j0 j01 = this.g;
        L.m(j01);
        j01.f = this.f;
        j0 j02 = this.f;
        L.m(j02);
        j02.g = this.g;
        this.f = null;
        this.g = null;
        return j00;
    }

    @l
    public final j0 c(@l j0 j00) {
        L.p(j00, "segment");
        j00.g = this;
        j00.f = this.f;
        j0 j01 = this.f;
        L.m(j01);
        j01.g = j00;
        this.f = j00;
        return j00;
    }

    @l
    public final j0 d() {
        this.d = true;
        return new j0(this.a, this.b, this.c, true, false);
    }

    @l
    public final j0 e(int v) {
        j0 j00;
        if(v <= 0 || v > this.c - this.b) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if(v >= 0x400) {
            j00 = this.d();
        }
        else {
            j00 = k0.e();
            kotlin.collections.l.E0(this.a, j00.a, 0, this.b, this.b + v, 2, null);
        }
        j00.c = j00.b + v;
        this.b += v;
        j0 j01 = this.g;
        L.m(j01);
        j01.c(j00);
        return j00;
    }

    @l
    public final j0 f() {
        byte[] arr_b = Arrays.copyOf(this.a, this.a.length);
        L.o(arr_b, "copyOf(this, size)");
        return new j0(arr_b, this.b, this.c, false, true);
    }

    public final void g(@l j0 j00, int v) {
        L.p(j00, "sink");
        if(!j00.e) {
            throw new IllegalStateException("only owner can write");
        }
        int v1 = j00.c;
        if(v1 + v > 0x2000) {
            if(j00.d) {
                throw new IllegalArgumentException();
            }
            int v2 = j00.b;
            if(v1 + v - v2 > 0x2000) {
                throw new IllegalArgumentException();
            }
            kotlin.collections.l.E0(j00.a, j00.a, 0, v2, v1, 2, null);
            j00.c -= j00.b;
            j00.b = 0;
        }
        kotlin.collections.l.v0(this.a, j00.a, j00.c, this.b, this.b + v);
        j00.c += v;
        this.b += v;
    }
}

