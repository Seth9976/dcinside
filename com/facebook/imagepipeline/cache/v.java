package com.facebook.imagepipeline.cache;

import com.facebook.common.memory.e;
import com.facebook.common.memory.i;
import k1.n.a;
import k1.n;

@n(a.a)
public class v {
    public static q a(com.facebook.common.internal.q q0, e e0, com.facebook.imagepipeline.cache.B.a b$a0) {
        class com.facebook.imagepipeline.cache.v.a implements H {
            com.facebook.imagepipeline.cache.v.a() {
                super();
            }

            @Override  // com.facebook.imagepipeline.cache.H
            public int a(Object object0) {
                return this.b(((i)object0));
            }

            public int b(i i0) {
                return i0.size();
            }
        }

        q q1 = new A(new com.facebook.imagepipeline.cache.v.a(), b$a0, q0, null, false, false);
        e0.b(q1);
        return q1;
    }
}

