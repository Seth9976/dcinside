package com.bumptech.glide.request;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

public final class b implements e, f {
    private final Object a;
    @Nullable
    private final f b;
    private volatile e c;
    private volatile e d;
    @GuardedBy("requestLock")
    private a e;
    @GuardedBy("requestLock")
    private a f;

    public b(Object object0, @Nullable f f0) {
        this.e = a.d;
        this.f = a.d;
        this.a = object0;
        this.b = f0;
    }

    @Override  // com.bumptech.glide.request.f, com.bumptech.glide.request.e
    public boolean a() {
        synchronized(this.a) {
            return this.c.a() || this.d.a();
        }
    }

    @Override  // com.bumptech.glide.request.f
    public void b(e e0) {
        synchronized(this.a) {
            if(e0.equals(this.c)) {
                this.e = a.e;
            }
            else if(e0.equals(this.d)) {
                this.f = a.e;
            }
            f f0 = this.b;
            if(f0 != null) {
                f0.b(this);
            }
        }
    }

    @Override  // com.bumptech.glide.request.f
    public boolean c(e e0) {
        synchronized(this.a) {
            return this.m() && this.k(e0);
        }
    }

    @Override  // com.bumptech.glide.request.e
    public void clear() {
        synchronized(this.a) {
            a f$a0 = a.d;
            this.e = f$a0;
            this.c.clear();
            if(this.f != f$a0) {
                this.f = f$a0;
                this.d.clear();
            }
        }
    }

    @Override  // com.bumptech.glide.request.f
    public boolean d(e e0) {
        synchronized(this.a) {
        }
        return this.n();
    }

    @Override  // com.bumptech.glide.request.e
    public boolean e() {
        synchronized(this.a) {
        }
        return this.e == a.e || this.f == a.e;
    }

    @Override  // com.bumptech.glide.request.e
    public boolean f() {
        synchronized(this.a) {
        }
        return this.e == a.d && this.f == a.d;
    }

    // 去混淆评级： 低(30)
    @Override  // com.bumptech.glide.request.e
    public boolean g(e e0) {
        return e0 instanceof b && this.c.g(((b)e0).c) && this.d.g(((b)e0).d);
    }

    @Override  // com.bumptech.glide.request.f
    public f getRoot() {
        synchronized(this.a) {
            f f0 = this.b;
            return f0 == null ? this : f0.getRoot();
        }
    }

    @Override  // com.bumptech.glide.request.f
    public void h(e e0) {
        synchronized(this.a) {
            if(!e0.equals(this.d)) {
                this.e = a.f;
                a f$a0 = a.b;
                if(this.f != f$a0) {
                    this.f = f$a0;
                    this.d.i();
                }
                return;
            }
            this.f = a.f;
            f f0 = this.b;
            if(f0 != null) {
                f0.h(this);
            }
        }
    }

    @Override  // com.bumptech.glide.request.e
    public void i() {
        synchronized(this.a) {
            a f$a0 = a.b;
            if(this.e != f$a0) {
                this.e = f$a0;
                this.c.i();
            }
        }
    }

    @Override  // com.bumptech.glide.request.e
    public boolean isRunning() {
        synchronized(this.a) {
        }
        return this.e == a.b || this.f == a.b;
    }

    @Override  // com.bumptech.glide.request.f
    public boolean j(e e0) {
        synchronized(this.a) {
            return this.l() && e0.equals(this.c);
        }
    }

    // 去混淆评级： 低(20)
    @GuardedBy("requestLock")
    private boolean k(e e0) {
        return this.e == a.f ? e0.equals(this.d) && (this.f == a.e || this.f == a.f) : e0.equals(this.c);
    }

    @GuardedBy("requestLock")
    private boolean l() {
        return this.b == null || this.b.j(this);
    }

    @GuardedBy("requestLock")
    private boolean m() {
        return this.b == null || this.b.c(this);
    }

    @GuardedBy("requestLock")
    private boolean n() {
        return this.b == null || this.b.d(this);
    }

    public void o(e e0, e e1) {
        this.c = e0;
        this.d = e1;
    }

    @Override  // com.bumptech.glide.request.e
    public void pause() {
        synchronized(this.a) {
            a f$a0 = a.b;
            if(this.e == f$a0) {
                this.e = a.c;
                this.c.pause();
            }
            if(this.f == f$a0) {
                this.f = a.c;
                this.d.pause();
            }
        }
    }
}

