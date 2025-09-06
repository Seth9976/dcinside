package com.facebook.cache.disk;

import androidx.annotation.VisibleForTesting;
import k1.n.a;
import k1.n;

@n(a.a)
public class l implements j {
    private final float a;
    private final float b;

    public l(float f, float f1) {
        this.a = f;
        this.b = f1;
    }

    @VisibleForTesting
    float a(c f$c0, long v) {
        long v1 = f$c0.getTimestamp();
        long v2 = f$c0.getSize();
        return this.a * ((float)(v - v1)) + this.b * ((float)v2);
    }

    @Override  // com.facebook.cache.disk.j
    public i get() {
        class com.facebook.cache.disk.l.a implements i {
            long a;
            final l b;

            com.facebook.cache.disk.l.a() {
                this.a = System.currentTimeMillis();
            }

            public int b(c f$c0, c f$c1) {
                float f = l.this.a(f$c0, this.a);
                float f1 = l.this.a(f$c1, this.a);
                if(f < f1) {
                    return 1;
                }
                return f1 == f ? 0 : -1;
            }

            @Override
            public int compare(Object object0, Object object1) {
                return this.b(((c)object0), ((c)object1));
            }
        }

        return new com.facebook.cache.disk.l.a(this);
    }
}

