package com.facebook.imagepipeline.multiuri;

import com.facebook.imagepipeline.request.d;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class com.facebook.imagepipeline.multiuri.a {
    public static final class com.facebook.imagepipeline.multiuri.a.a {
        @h
        private d a;
        @h
        private d b;
        @h
        private d[] c;

        private com.facebook.imagepipeline.multiuri.a.a() {
        }

        com.facebook.imagepipeline.multiuri.a.a(b b0) {
        }

        public com.facebook.imagepipeline.multiuri.a d() {
            return new com.facebook.imagepipeline.multiuri.a(this, null);
        }

        public com.facebook.imagepipeline.multiuri.a.a e(@h d d0) {
            this.b = d0;
            return this;
        }

        public com.facebook.imagepipeline.multiuri.a.a f(@h d[] arr_d) {
            this.c = arr_d;
            return this;
        }

        public com.facebook.imagepipeline.multiuri.a.a g(@h d d0) {
            this.a = d0;
            return this;
        }
    }

    @h
    private d a;
    @h
    private d[] b;
    @h
    private d c;

    private com.facebook.imagepipeline.multiuri.a(com.facebook.imagepipeline.multiuri.a.a a$a0) {
        this.a = a$a0.a;
        this.c = a$a0.b;
        this.b = a$a0.c;
    }

    com.facebook.imagepipeline.multiuri.a(com.facebook.imagepipeline.multiuri.a.a a$a0, b b0) {
        this(a$a0);
    }

    public static com.facebook.imagepipeline.multiuri.a.a a() {
        return new com.facebook.imagepipeline.multiuri.a.a(null);
    }

    @h
    public d b() {
        return this.c;
    }

    @h
    public d c() {
        return this.a;
    }

    @h
    public d[] d() {
        return this.b;
    }
}

