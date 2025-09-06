package com.dcinside.app.util.otp;

import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import z3.j;

@s0({"SMAP\nTotpCounter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TotpCounter.kt\ncom/dcinside/app/util/otp/TotpCounter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"})
public final class k {
    @s0({"SMAP\nTotpCounter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TotpCounter.kt\ncom/dcinside/app/util/otp/TotpCounter$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        private final void b(long v) {
            if(v < 0L) {
                throw new IllegalArgumentException(("Negative time: " + v).toString());
            }
        }
    }

    private final long a;
    private final long b;
    @l
    public static final a c;

    static {
        k.c = new a(null);
    }

    @j
    public k(long v) {
        this(v, 0L, 2, null);
    }

    @j
    public k(long v, long v1) {
        if(v < 1L) {
            throw new IllegalArgumentException(("Time step must be positive: " + v).toString());
        }
        k.c.b(v1);
        this.a = v;
        this.b = v1;
    }

    public k(long v, long v1, int v2, w w0) {
        if((v2 & 2) != 0) {
            v1 = 0L;
        }
        this(v, v1);
    }

    public final long a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    public final long c(long v) {
        k.c.b(v);
        long v1 = v - this.b;
        return v1 < 0L ? (v1 - (this.a - 1L)) / this.a : v1 / this.a;
    }

    public final long d(long v) {
        return this.b + v * this.a;
    }
}

