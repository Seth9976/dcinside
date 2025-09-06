package com.facebook.imagepipeline.cache;

import com.facebook.common.memory.e;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class o implements b {
    @Override  // com.facebook.imagepipeline.cache.b
    public q a(com.facebook.common.internal.q q0, e e0, com.facebook.imagepipeline.cache.B.a b$a0, boolean z, boolean z1, @h com.facebook.imagepipeline.cache.q.b q$b0) {
        class com.facebook.imagepipeline.cache.o.a implements H {
            final o a;

            @Override  // com.facebook.imagepipeline.cache.H
            public int a(Object object0) {
                return this.b(((com.facebook.imagepipeline.image.e)object0));
            }

            public int b(com.facebook.imagepipeline.image.e e0) {
                return e0.z();
            }
        }

        q q1 = new A(new com.facebook.imagepipeline.cache.o.a(this), b$a0, q0, q$b0, z, z1);
        e0.b(q1);
        return q1;
    }
}

