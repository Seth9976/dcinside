package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.e;
import com.facebook.imagepipeline.cache.B;
import com.facebook.imagepipeline.cache.n;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class g extends i {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    public static final a g = null;
    @l
    public static final String h = "BitmapMemoryCacheGetProducer";
    @l
    private static final String i = "pipe_ui";

    static {
        g.g = new a(null);
    }

    public g(@l B b0, @l n n0, @l h0 h00) {
        L.p(b0, "memoryCache");
        L.p(n0, "cacheKeyFactory");
        L.p(h00, "inputProducer");
        super(b0, n0, h00);
    }

    @Override  // com.facebook.imagepipeline.producers.i
    @l
    protected String d() {
        return "pipe_ui";
    }

    @Override  // com.facebook.imagepipeline.producers.i
    @l
    protected String e() {
        return "BitmapMemoryCacheGetProducer";
    }

    @Override  // com.facebook.imagepipeline.producers.i
    @l
    protected com.facebook.imagepipeline.producers.n g(@l com.facebook.imagepipeline.producers.n n0, @l e e0, boolean z) {
        L.p(n0, "consumer");
        L.p(e0, "cacheKey");
        return n0;
    }
}

