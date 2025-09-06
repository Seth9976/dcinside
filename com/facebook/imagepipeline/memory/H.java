package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.facebook.imageutils.c;
import k1.n.a;
import k1.n;

@n(a.a)
public class h {
    @p3.a("this")
    private int a;
    @p3.a("this")
    private long b;
    private final int c;
    private final int d;
    private final com.facebook.common.references.h e;

    public h(int v, int v1) {
        class com.facebook.imagepipeline.memory.h.a implements com.facebook.common.references.h {
            final h a;

            @Override  // com.facebook.common.references.h
            public void a(Object object0) {
                this.b(((Bitmap)object0));
            }

            public void b(Bitmap bitmap0) {
                try {
                    h.this.a(bitmap0);
                }
                finally {
                    bitmap0.recycle();
                }
            }
        }

        boolean z = false;
        com.facebook.common.internal.n.d(Boolean.valueOf(v > 0));
        if(v1 > 0) {
            z = true;
        }
        com.facebook.common.internal.n.d(Boolean.valueOf(z));
        this.c = v;
        this.d = v1;
        this.e = new com.facebook.imagepipeline.memory.h.a(this);
    }

    public void a(Bitmap bitmap0) {
        synchronized(this) {
            int v1 = c.l(bitmap0);
            com.facebook.common.internal.n.e(this.a > 0, "No bitmaps registered.");
            com.facebook.common.internal.n.f(((long)v1) <= this.b, "Bitmap size bigger than the total registered size: %d, %d", new Object[]{v1, this.b});
            this.b -= (long)v1;
            --this.a;
        }
    }

    public int b() {
        synchronized(this) {
        }
        return this.a;
    }

    public int c() {
        synchronized(this) {
        }
        return this.c;
    }

    public int d() {
        synchronized(this) {
        }
        return this.d;
    }

    public com.facebook.common.references.h e() {
        return this.e;
    }

    public long f() {
        synchronized(this) {
        }
        return this.b;
    }

    public boolean g(Bitmap bitmap0) {
        synchronized(this) {
            int v1 = c.l(bitmap0);
            int v2 = this.a;
            if(v2 < this.c) {
                long v3 = this.b;
                if(v3 + ((long)v1) <= ((long)this.d)) {
                    this.a = v2 + 1;
                    this.b = v3 + ((long)v1);
                    return true;
                }
            }
            return false;
        }
    }
}

