package com.bumptech.glide.request;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

public class l implements e, f {
    @Nullable
    private final f a;
    private final Object b;
    private volatile e c;
    private volatile e d;
    @GuardedBy("requestLock")
    private a e;
    @GuardedBy("requestLock")
    private a f;
    @GuardedBy("requestLock")
    private boolean g;

    public l(Object object0, @Nullable f f0) {
        this.e = a.d;
        this.f = a.d;
        this.b = object0;
        this.a = f0;
    }

    @Override  // com.bumptech.glide.request.f, com.bumptech.glide.request.e
    public boolean a() {
        synchronized(this.b) {
            return this.d.a() || this.c.a();
        }
    }

    @Override  // com.bumptech.glide.request.f
    public void b(e e0) {
        synchronized(this.b) {
            if(e0.equals(this.d)) {
                this.f = a.e;
                return;
            }
            this.e = a.e;
            f f0 = this.a;
            if(f0 != null) {
                f0.b(this);
            }
            if(!this.f.b()) {
                this.d.clear();
            }
        }
    }

    @Override  // com.bumptech.glide.request.f
    public boolean c(e e0) {
        synchronized(this.b) {
            return this.l() && e0.equals(this.c) && !this.a();
        }
    }

    @Override  // com.bumptech.glide.request.e
    public void clear() {
        synchronized(this.b) {
            this.g = false;
            this.e = a.d;
            this.f = a.d;
            this.d.clear();
            this.c.clear();
        }
    }

    @Override  // com.bumptech.glide.request.f
    public boolean d(e e0) {
        synchronized(this.b) {
            return this.m() && (e0.equals(this.c) || this.e != a.e);
        }
    }

    @Override  // com.bumptech.glide.request.e
    public boolean e() {
        synchronized(this.b) {
        }
        return this.e == a.e;
    }

    @Override  // com.bumptech.glide.request.e
    public boolean f() {
        synchronized(this.b) {
        }
        return this.e == a.d;
    }

    @Override  // com.bumptech.glide.request.e
    public boolean g(e e0) {
        if(e0 instanceof l) {
            if(this.c == null) {
                if(((l)e0).c == null) {
                    return this.d == null ? ((l)e0).d == null : this.d.g(((l)e0).d);
                }
            }
            else if(this.c.g(((l)e0).c)) {
                return this.d == null ? ((l)e0).d == null : this.d.g(((l)e0).d);
            }
        }
        return false;
    }

    @Override  // com.bumptech.glide.request.f
    public f getRoot() {
        synchronized(this.b) {
            f f0 = this.a;
            return f0 == null ? this : f0.getRoot();
        }
    }

    @Override  // com.bumptech.glide.request.f
    public void h(e e0) {
        synchronized(this.b) {
            if(!e0.equals(this.c)) {
                this.f = a.f;
                return;
            }
            this.e = a.f;
            f f0 = this.a;
            if(f0 != null) {
                f0.h(this);
            }
        }
    }

    @Override  // com.bumptech.glide.request.e
    public void i() {
        synchronized(this.b) {
            this.g = true;
            try {
                if(this.e != a.e) {
                    a f$a0 = a.b;
                    if(this.f != f$a0) {
                        this.f = f$a0;
                        this.d.i();
                    }
                }
                if(this.g) {
                    a f$a1 = a.b;
                    if(this.e != f$a1) {
                        this.e = f$a1;
                        this.c.i();
                    }
                }
            }
            finally {
                this.g = false;
            }
        }
    }

    @Override  // com.bumptech.glide.request.e
    public boolean isRunning() {
        synchronized(this.b) {
        }
        return this.e == a.b;
    }

    @Override  // com.bumptech.glide.request.f
    public boolean j(e e0) {
        synchronized(this.b) {
            return this.k() && e0.equals(this.c) && this.e != a.c;
        }
    }

    @GuardedBy("requestLock")
    private boolean k() {
        return this.a == null || this.a.j(this);
    }

    @GuardedBy("requestLock")
    private boolean l() {
        return this.a == null || this.a.c(this);
    }

    @GuardedBy("requestLock")
    private boolean m() {
        return this.a == null || this.a.d(this);
    }

    public void n(e e0, e e1) {
        this.c = e0;
        this.d = e1;
    }

    @Override  // com.bumptech.glide.request.e
    public void pause() {
        synchronized(this.b) {
            if(!this.f.b()) {
                this.f = a.c;
                this.d.pause();
            }
            if(!this.e.b()) {
                this.e = a.c;
                this.c.pause();
            }
        }
    }
}

