package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import androidx.core.util.Pools.Pool;
import com.bumptech.glide.util.m;
import com.bumptech.glide.util.pool.a.d;
import com.bumptech.glide.util.pool.a.f;
import com.bumptech.glide.util.pool.c;

final class u implements v, f {
    class a implements d {
        a() {
            super();
        }

        @Override  // com.bumptech.glide.util.pool.a$d
        public Object a() {
            return this.b();
        }

        public u b() {
            return new u();
        }
    }

    private final c a;
    private v b;
    private boolean c;
    private boolean d;
    private static final Pool e;

    static {
        u.e = com.bumptech.glide.util.pool.a.e(20, new a());
    }

    u() {
        this.a = c.a();
    }

    @Override  // com.bumptech.glide.load.engine.v
    @NonNull
    public Class a() {
        return this.b.a();
    }

    private void b(v v0) {
        this.d = false;
        this.c = true;
        this.b = v0;
    }

    @NonNull
    static u c(v v0) {
        u u0 = (u)m.e(((u)u.e.b()));
        u0.b(v0);
        return u0;
    }

    private void d() {
        this.b = null;
        u.e.a(this);
    }

    @Override  // com.bumptech.glide.util.pool.a$f
    @NonNull
    public c e() {
        return this.a;
    }

    void f() {
        synchronized(this) {
            this.a.c();
            if(this.c) {
                this.c = false;
                if(this.d) {
                    this.recycle();
                }
                return;
            }
        }
        throw new IllegalStateException("Already unlocked");
    }

    @Override  // com.bumptech.glide.load.engine.v
    @NonNull
    public Object get() {
        return this.b.get();
    }

    @Override  // com.bumptech.glide.load.engine.v
    public int getSize() {
        return this.b.getSize();
    }

    @Override  // com.bumptech.glide.load.engine.v
    public void recycle() {
        synchronized(this) {
            this.a.c();
            this.d = true;
            if(!this.c) {
                this.b.recycle();
                this.d();
            }
        }
    }
}

