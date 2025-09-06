package com.bykv.vk.openvk.PjT.PjT.Zh.cr;

public abstract class a implements b {
    private com.bykv.vk.openvk.PjT.PjT.Zh.cr.b.a a;
    private e b;
    private com.bykv.vk.openvk.PjT.PjT.Zh.cr.b.b c;
    private g d;
    private d e;
    private c f;
    private f g;
    protected boolean h;

    public a() {
        this.h = false;
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.cr.b
    public void PjT(boolean z) {
        this.h = z;
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.cr.b
    public final void b(f b$f0) {
        this.g = b$f0;
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.cr.b
    public final void d(g b$g0) {
        this.d = b$g0;
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.cr.b
    public final void e(d b$d0) {
        this.e = b$d0;
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.cr.b
    public final void f(e b$e0) {
        this.b = b$e0;
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.cr.b
    public final void g(com.bykv.vk.openvk.PjT.PjT.Zh.cr.b.a b$a0) {
        this.a = b$a0;
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.cr.b
    public final void h(c b$c0) {
        this.f = b$c0;
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.cr.b
    public final void j(com.bykv.vk.openvk.PjT.PjT.Zh.cr.b.b b$b0) {
        this.c = b$b0;
    }

    public void k() {
        this.a = null;
        this.c = null;
        this.b = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }

    protected final void l(int v) {
        try {
            com.bykv.vk.openvk.PjT.PjT.Zh.cr.b.b b$b0 = this.c;
            if(b$b0 != null) {
                b$b0.PjT(this, v);
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    protected final void m(int v, int v1, int v2, int v3) {
        try {
            d b$d0 = this.e;
            if(b$d0 != null) {
                b$d0.PjT(this, v, v1, v2, v3);
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    protected final boolean n(int v, int v1) {
        try {
            if(this.f != null && this.f.PjT(this, v, v1)) {
                return true;
            }
        }
        catch(Throwable unused_ex) {
        }
        return false;
    }

    protected final void o() {
        try {
            e b$e0 = this.b;
            if(b$e0 != null) {
                b$e0.PjT(this);
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    protected final void p() {
        try {
            com.bykv.vk.openvk.PjT.PjT.Zh.cr.b.a b$a0 = this.a;
            if(b$a0 != null) {
                b$a0.Zh(this);
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    protected final boolean q(int v, int v1) {
        try {
            if(this.g != null && this.g.Zh(this, v, v1)) {
                return true;
            }
        }
        catch(Throwable unused_ex) {
        }
        return false;
    }

    protected final void r() {
        try {
            g b$g0 = this.d;
            if(b$g0 != null) {
                b$g0.ReZ(this);
            }
        }
        catch(Throwable unused_ex) {
        }
    }
}

