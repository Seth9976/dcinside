package com.google.android.datatransport.runtime;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue.Builder;
import com.google.auto.value.AutoValue;
import j..util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

@AutoValue
public abstract class j {
    @AutoValue.Builder
    public static abstract class a {
        public final a a(String s, int v) {
            this.e().put(s, String.valueOf(v));
            return this;
        }

        public final a b(String s, long v) {
            this.e().put(s, String.valueOf(v));
            return this;
        }

        public final a c(String s, String s1) {
            this.e().put(s, s1);
            return this;
        }

        public abstract j d();

        protected abstract Map e();

        protected abstract a f(Map arg1);

        public abstract a g(Integer arg1);

        public abstract a h(i arg1);

        public abstract a i(long arg1);

        public abstract a j(byte[] arg1);

        public abstract a k(byte[] arg1);

        public abstract a l(Integer arg1);

        public abstract a m(String arg1);

        public abstract a n(String arg1);

        public abstract a o(long arg1);
    }

    public static a a() {
        return new b().f(new HashMap());
    }

    public final String b(String s) {
        String s1 = (String)this.c().get(s);
        return s1 == null ? "" : s1;
    }

    protected abstract Map c();

    @Nullable
    public abstract Integer d();

    public abstract i e();

    public abstract long f();

    @Nullable
    public abstract byte[] g();

    @Nullable
    public abstract byte[] h();

    public final int i(String s) {
        String s1 = (String)this.c().get(s);
        return s1 == null ? 0 : ((int)Integer.valueOf(s1));
    }

    public final long j(String s) {
        String s1 = (String)this.c().get(s);
        return s1 == null ? 0L : ((long)Long.valueOf(s1));
    }

    public final Map k() {
        return DesugarCollections.unmodifiableMap(this.c());
    }

    public final String l(String s, String s1) {
        String s2 = (String)this.c().get(s);
        return s2 == null ? s1 : s2;
    }

    @Deprecated
    public byte[] m() {
        return this.e().a();
    }

    @Nullable
    public abstract Integer n();

    @Nullable
    public abstract String o();

    public abstract String p();

    public abstract long q();

    public a r() {
        return new b().n(this.p()).g(this.d()).l(this.n()).m(this.o()).j(this.g()).k(this.h()).h(this.e()).i(this.f()).o(this.q()).f(new HashMap(this.c()));
    }
}

