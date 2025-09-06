package com.google.crypto.tink.internal;

import com.google.crypto.tink.monitoring.c;
import java.util.concurrent.atomic.AtomicReference;

public final class l {
    static class a {
    }

    static class b implements com.google.crypto.tink.monitoring.b {
        private b() {
        }

        b(a l$a0) {
        }

        @Override  // com.google.crypto.tink.monitoring.b
        public com.google.crypto.tink.monitoring.b.a a(c c0, String s, String s1) {
            return k.a;
        }
    }

    private final AtomicReference a;
    private static final l b;
    private static final b c;

    static {
        l.b = new l();
        l.c = new b(null);
    }

    public l() {
        this.a = new AtomicReference();
    }

    public void a() {
        synchronized(this) {
            this.a.set(null);
        }
    }

    public com.google.crypto.tink.monitoring.b b() {
        com.google.crypto.tink.monitoring.b b0 = (com.google.crypto.tink.monitoring.b)this.a.get();
        return b0 == null ? l.c : b0;
    }

    public static l c() {
        return l.b;
    }

    public void d(com.google.crypto.tink.monitoring.b b0) {
        synchronized(this) {
            if(this.a.get() == null) {
                this.a.set(b0);
                return;
            }
        }
        throw new IllegalStateException("a monitoring client has already been registered");
    }
}

