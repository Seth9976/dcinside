package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.auto.value.AutoValue.Builder;
import com.google.auto.value.AutoValue;

@AutoValue
abstract class e {
    @AutoValue.Builder
    static abstract class a {
        abstract e a();

        abstract a b(int arg1);

        abstract a c(long arg1);

        abstract a d(int arg1);

        abstract a e(int arg1);

        abstract a f(long arg1);
    }

    private static final long a = 0xA00000L;
    private static final int b = 200;
    private static final int c = 10000;
    private static final long d = 604800000L;
    private static final int e = 0x14000;
    static final e f;

    static {
        e.f = e.a().f(0xA00000L).d(200).b(10000).c(604800000L).e(0x14000).a();
    }

    static a a() {
        return new b();
    }

    abstract int b();

    abstract long c();

    abstract int d();

    abstract int e();

    abstract long f();

    a g() {
        return e.a().f(this.f()).d(this.d()).b(this.b()).c(this.c()).e(this.e());
    }
}

