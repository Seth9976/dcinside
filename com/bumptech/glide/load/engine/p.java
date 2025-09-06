package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.g;
import com.bumptech.glide.util.m;

class p implements v {
    interface a {
        void c(g arg1, p arg2);
    }

    private final boolean a;
    private final boolean b;
    private final v c;
    private final a d;
    private final g e;
    private int f;
    private boolean g;

    p(v v0, boolean z, boolean z1, g g0, a p$a0) {
        this.c = (v)m.e(v0);
        this.a = z;
        this.b = z1;
        this.e = g0;
        this.d = (a)m.e(p$a0);
    }

    @Override  // com.bumptech.glide.load.engine.v
    @NonNull
    public Class a() {
        return this.c.a();
    }

    void b() {
        synchronized(this) {
            if(!this.g) {
                ++this.f;
                return;
            }
        }
        throw new IllegalStateException("Cannot acquire a recycled resource");
    }

    v c() {
        return this.c;
    }

    boolean d() {
        return this.a;
    }

    void e() {
        synchronized(this) {
            int v1 = this.f;
            if(v1 > 0) {
                boolean z = true;
                this.f = v1 - 1;
                if(v1 - 1 != 0) {
                    z = false;
                }
                if(z) {
                    this.d.c(this.e, this);
                }
                return;
            }
        }
        throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
    }

    @Override  // com.bumptech.glide.load.engine.v
    @NonNull
    public Object get() {
        return this.c.get();
    }

    @Override  // com.bumptech.glide.load.engine.v
    public int getSize() {
        return this.c.getSize();
    }

    @Override  // com.bumptech.glide.load.engine.v
    public void recycle() {
        synchronized(this) {
            if(this.f <= 0) {
                if(this.g) {
                    throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
                }
                this.g = true;
                if(this.b) {
                    this.c.recycle();
                }
                return;
            }
        }
        throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
    }

    @Override
    public String toString() {
        synchronized(this) {
        }
        return "EngineResource{isMemoryCacheable=" + this.a + ", listener=" + this.d + ", key=" + this.e + ", acquired=" + this.f + ", isRecycled=" + this.g + ", resource=" + this.c + '}';
    }
}

