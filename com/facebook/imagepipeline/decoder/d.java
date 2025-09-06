package com.facebook.imagepipeline.decoder;

import X0.c.b;
import X0.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class d {
    public static final class com.facebook.imagepipeline.decoder.d.a {
        @h
        private Map a;
        @h
        private List b;

        public com.facebook.imagepipeline.decoder.d.a c(c c0, b c$b0, @h com.facebook.imagepipeline.decoder.c c1) {
            if(this.b == null) {
                this.b = new ArrayList();
            }
            this.b.add(c$b0);
            if(c1 != null) {
                this.e(c0, c1);
            }
            return this;
        }

        public d d() {
            return new d(this, null);
        }

        public com.facebook.imagepipeline.decoder.d.a e(c c0, com.facebook.imagepipeline.decoder.c c1) {
            if(this.a == null) {
                this.a = new HashMap();
            }
            this.a.put(c0, c1);
            return this;
        }
    }

    @h
    private final Map a;
    @h
    private final List b;

    private d(com.facebook.imagepipeline.decoder.d.a d$a0) {
        this.a = d$a0.a;
        this.b = d$a0.b;
    }

    d(com.facebook.imagepipeline.decoder.d.a d$a0, e e0) {
        this(d$a0);
    }

    @h
    public Map a() {
        return this.a;
    }

    @h
    public List b() {
        return this.b;
    }

    public static com.facebook.imagepipeline.decoder.d.a c() {
        return new com.facebook.imagepipeline.decoder.d.a();
    }
}

