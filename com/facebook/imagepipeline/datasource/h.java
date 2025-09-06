package com.facebook.imagepipeline.datasource;

import com.facebook.imagepipeline.producers.h0;
import com.facebook.imagepipeline.producers.q0;
import f1.e;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import p3.d;
import y4.l;
import z3.n;

@d
public final class h extends a {
    public static final class com.facebook.imagepipeline.datasource.h.a {
        private com.facebook.imagepipeline.datasource.h.a() {
        }

        public com.facebook.imagepipeline.datasource.h.a(w w0) {
        }

        @l
        @n
        public final com.facebook.datasource.d a(@l h0 h00, @l q0 q00, @l e e0) {
            L.p(h00, "producer");
            L.p(q00, "settableProducerContext");
            L.p(e0, "listener");
            return new h(h00, q00, e0, null);
        }
    }

    @l
    public static final com.facebook.imagepipeline.datasource.h.a k;

    static {
        h.k = new com.facebook.imagepipeline.datasource.h.a(null);
    }

    private h(h0 h00, q0 q00, e e0) {
        super(h00, q00, e0);
    }

    public h(h0 h00, q0 q00, e e0, w w0) {
        this(h00, q00, e0);
    }

    @l
    @n
    public static final com.facebook.datasource.d H(@l h0 h00, @l q0 q00, @l e e0) {
        return h.k.a(h00, q00, e0);
    }
}

