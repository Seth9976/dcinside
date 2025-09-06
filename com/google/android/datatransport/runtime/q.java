package com.google.android.datatransport.runtime;

import com.google.android.datatransport.e;
import com.google.android.datatransport.f;
import com.google.android.datatransport.k;
import com.google.auto.value.AutoValue.Builder;
import com.google.auto.value.AutoValue;

@AutoValue
abstract class q {
    @AutoValue.Builder
    public static abstract class a {
        public abstract q a();

        abstract a b(e arg1);

        abstract a c(f arg1);

        public a d(f f0, e e0, k k0) {
            this.c(f0);
            this.b(e0);
            this.e(k0);
            return this;
        }

        abstract a e(k arg1);

        public abstract a f(r arg1);

        public abstract a g(String arg1);
    }

    public static a a() {
        return new b();
    }

    public abstract e b();

    abstract f c();

    public byte[] d() {
        return (byte[])this.e().apply(this.c().c());
    }

    abstract k e();

    public abstract r f();

    public abstract String g();
}

