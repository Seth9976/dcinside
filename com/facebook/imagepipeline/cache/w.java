package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.e;
import k1.n.a;
import k1.n;

@n(a.a)
public class w {
    public static y a(B b0, x x0) {
        class com.facebook.imagepipeline.cache.w.a implements D {
            final x a;

            com.facebook.imagepipeline.cache.w.a(x x0) {
            }

            @Override  // com.facebook.imagepipeline.cache.D
            public void a(Object object0) {
                this.d(((e)object0));
            }

            @Override  // com.facebook.imagepipeline.cache.D
            public void b(Object object0) {
                this.e(((e)object0));
            }

            @Override  // com.facebook.imagepipeline.cache.D
            public void c(Object object0) {
                this.f(((e)object0));
            }

            public void d(e e0) {
                this.a.l(e0);
            }

            public void e(e e0) {
                this.a.i(e0);
            }

            public void f(e e0) {
                this.a.g(e0);
            }
        }

        x0.f(b0);
        return new y(b0, new com.facebook.imagepipeline.cache.w.a(x0));
    }
}

