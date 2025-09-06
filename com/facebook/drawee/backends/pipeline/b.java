package com.facebook.drawee.backends.pipeline;

import S0.g;
import com.facebook.common.internal.i;
import com.facebook.common.internal.q;
import com.facebook.common.internal.r;
import java.util.ArrayList;
import java.util.List;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class b {
    public static final class com.facebook.drawee.backends.pipeline.b.a {
        @h
        private List a;
        @h
        private q b;
        @h
        private com.facebook.drawee.backends.pipeline.h c;
        @h
        private g d;

        public com.facebook.drawee.backends.pipeline.b.a e(c1.a a0) {
            if(this.a == null) {
                this.a = new ArrayList();
            }
            this.a.add(a0);
            return this;
        }

        public b f() {
            return new b(this, null);
        }

        public com.facebook.drawee.backends.pipeline.b.a g(q q0) {
            com.facebook.common.internal.n.i(q0);
            this.b = q0;
            return this;
        }

        public com.facebook.drawee.backends.pipeline.b.a h(boolean z) {
            return this.g(r.a(Boolean.valueOf(z)));
        }

        public com.facebook.drawee.backends.pipeline.b.a i(@h g g0) {
            this.d = g0;
            return this;
        }

        public com.facebook.drawee.backends.pipeline.b.a j(com.facebook.drawee.backends.pipeline.h h0) {
            this.c = h0;
            return this;
        }
    }

    @h
    private final i a;
    @h
    private final com.facebook.drawee.backends.pipeline.h b;
    private final q c;
    @h
    private final g d;

    private b(com.facebook.drawee.backends.pipeline.b.a b$a0) {
        this.a = b$a0.a == null ? null : i.a(b$a0.a);
        this.c = b$a0.b == null ? r.a(Boolean.FALSE) : b$a0.b;
        this.b = b$a0.c;
        this.d = b$a0.d;
    }

    b(com.facebook.drawee.backends.pipeline.b.a b$a0, c c0) {
        this(b$a0);
    }

    @h
    public i a() {
        return this.a;
    }

    public q b() {
        return this.c;
    }

    @h
    public g c() {
        return this.d;
    }

    @h
    public com.facebook.drawee.backends.pipeline.h d() {
        return this.b;
    }

    public static com.facebook.drawee.backends.pipeline.b.a e() {
        return new com.facebook.drawee.backends.pipeline.b.a();
    }
}

