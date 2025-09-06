package com.facebook.imagepipeline.image;

import com.facebook.imagepipeline.animated.base.e;
import com.facebook.imagepipeline.animated.base.g;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class c extends i {
    @h
    private g e;
    private boolean f;

    public c(g g0) {
        this(g0, true);
    }

    public c(g g0, boolean z) {
        this.e = g0;
        this.f = z;
    }

    @h
    public g L() {
        synchronized(this) {
        }
        return this.e;
    }

    @Override  // com.facebook.imagepipeline.image.a
    public boolean V3() {
        return this.f;
    }

    @Override  // com.facebook.imagepipeline.image.e
    public void close() {
        g g0;
        synchronized(this) {
            g0 = this.e;
            if(g0 == null) {
                return;
            }
            this.e = null;
        }
        g0.a();
    }

    @Override  // com.facebook.imagepipeline.image.e
    public int getHeight() {
        synchronized(this) {
            return this.e == null ? 0 : this.e.f().getHeight();
        }
    }

    @Override  // com.facebook.imagepipeline.image.e
    public int getWidth() {
        synchronized(this) {
            return this.e == null ? 0 : this.e.f().getWidth();
        }
    }

    @Override  // com.facebook.imagepipeline.image.e
    public boolean isClosed() {
        synchronized(this) {
        }
        return this.e == null;
    }

    @h
    public e x() {
        synchronized(this) {
            return this.e == null ? null : this.e.f();
        }
    }

    @Override  // com.facebook.imagepipeline.image.e
    public int z() {
        synchronized(this) {
            return this.e == null ? 0 : this.e.f().z();
        }
    }
}

