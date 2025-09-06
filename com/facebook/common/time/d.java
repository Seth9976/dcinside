package com.facebook.common.time;

import com.facebook.common.internal.f;
import java.util.concurrent.TimeUnit;
import k1.n.a;
import k1.n;
import p3.d;

@n(a.a)
@d
public interface com.facebook.common.time.d {
    public static final class com.facebook.common.time.d.a implements com.facebook.common.time.d {
        private final com.facebook.common.time.a a;
        private long b;

        private com.facebook.common.time.d.a(com.facebook.common.time.a a0) {
            this.a = a0;
            this.b = a0.now();
        }

        com.facebook.common.time.d.a(com.facebook.common.time.a a0, e e0) {
            this(a0);
        }

        @Override  // com.facebook.common.time.d
        public long now() {
            long v = Math.max(this.b, this.a.now());
            this.b = v;
            return v;
        }

        @Override  // com.facebook.common.time.d
        public long nowNanos() {
            return TimeUnit.MILLISECONDS.toNanos(this.now());
        }
    }

    @f
    long now();

    @f
    long nowNanos();
}

