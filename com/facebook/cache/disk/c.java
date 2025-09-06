package com.facebook.cache.disk;

import k1.n.a;
import k1.n;

@n(a.a)
public class c implements j {
    @Override  // com.facebook.cache.disk.j
    public i get() {
        class com.facebook.cache.disk.c.a implements i {
            final c a;

            public int b(com.facebook.cache.disk.f.c f$c0, com.facebook.cache.disk.f.c f$c1) {
                long v = f$c0.getTimestamp();
                long v1 = f$c1.getTimestamp();
                if(v < v1) {
                    return -1;
                }
                return v1 == v ? 0 : 1;
            }

            @Override
            public int compare(Object object0, Object object1) {
                return this.b(((com.facebook.cache.disk.f.c)object0), ((com.facebook.cache.disk.f.c)object1));
            }
        }

        return new com.facebook.cache.disk.c.a(this);
    }
}

