package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.e;
import k1.n.a;
import k1.n;

@n(a.a)
public class z {
    public static y a(B b0, x x0) {
        class com.facebook.imagepipeline.cache.z.a implements D {
            final x a;

            com.facebook.imagepipeline.cache.z.a(x x0) {
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
                this.a.j(e0);
            }

            public void e(e e0) {
                this.a.a(e0);
            }

            public void f(e e0) {
                this.a.e(e0);
            }
        }

        x0.m(b0);
        return new y(b0, new com.facebook.imagepipeline.cache.z.a(x0));
    }
}

