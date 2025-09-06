package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.internal.n;

public class v {
    static class a {
    }

    public static class b {
        private long a;
        private long b;

        public b() {
            this.a = 60L;
            this.b = n.j;
        }

        @NonNull
        public v c() {
            return new v(this, null);
        }

        public long d() {
            return this.a;
        }

        public long e() {
            return this.b;
        }

        @NonNull
        public b f(long v) throws IllegalArgumentException {
            if(v < 0L) {
                throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", v));
            }
            this.a = v;
            return this;
        }

        @NonNull
        public b g(long v) {
            if(v < 0L) {
                throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + v + " is an invalid argument");
            }
            this.b = v;
            return this;
        }
    }

    private final long a;
    private final long b;

    private v(b v$b0) {
        this.a = v$b0.a;
        this.b = v$b0.b;
    }

    v(b v$b0, a v$a0) {
        this(v$b0);
    }

    public long a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }

    @NonNull
    public b c() {
        b v$b0 = new b();
        v$b0.f(this.a());
        v$b0.g(this.b());
        return v$b0;
    }
}

