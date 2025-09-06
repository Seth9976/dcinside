package com.facebook.drawee.drawable;

import S0.r;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class g extends com.facebook.drawee.drawable.a {
    @VisibleForTesting
    public static final int A = 2;
    private final Drawable[] i;
    private final boolean j;
    private final int k;
    private final int l;
    @VisibleForTesting
    int m;
    @VisibleForTesting
    int n;
    @VisibleForTesting
    long o;
    @VisibleForTesting
    int[] p;
    @VisibleForTesting
    int[] q;
    @VisibleForTesting
    int r;
    @VisibleForTesting
    boolean[] s;
    @VisibleForTesting
    int t;
    @h
    private r u;
    private boolean v;
    private boolean w;
    private boolean x;
    @VisibleForTesting
    public static final int y = 0;
    @VisibleForTesting
    public static final int z = 1;

    public g(Drawable[] arr_drawable) {
        this(arr_drawable, false, -1);
    }

    public g(Drawable[] arr_drawable, boolean z, int v) {
        super(arr_drawable);
        boolean z1 = true;
        this.x = true;
        int v1 = 0;
        if(arr_drawable.length < 1) {
            z1 = false;
        }
        com.facebook.common.internal.n.p(z1, "At least one layer required!");
        this.i = arr_drawable;
        this.p = new int[arr_drawable.length];
        this.q = new int[arr_drawable.length];
        this.r = 0xFF;
        this.s = new boolean[arr_drawable.length];
        this.t = 0;
        this.j = z;
        if(z) {
            v1 = 0xFF;
        }
        this.k = v1;
        this.l = v;
        this.C();
    }

    private void A() {
        if(!this.w) {
            return;
        }
        if(this.m == 2 && this.s[this.l]) {
            r r0 = this.u;
            if(r0 != null) {
                r0.c();
            }
            this.w = false;
        }
    }

    public void B() {
        this.C();
        this.invalidateSelf();
    }

    private void C() {
        this.m = 2;
        Arrays.fill(this.p, this.k);
        this.p[0] = 0xFF;
        Arrays.fill(this.q, this.k);
        this.q[0] = 0xFF;
        Arrays.fill(this.s, this.j);
        this.s[0] = true;
    }

    public void D(boolean z) {
        this.x = z;
    }

    public void E(@h r r0) {
        this.u = r0;
    }

    public void F(int v) {
        this.n = v;
        if(this.m == 1) {
            this.m = 0;
        }
    }

    public void G(int v) {
        this.s[v] = true;
        this.q[v] = 0xFF;
        if(v == this.l) {
            this.w = true;
        }
        this.invalidateSelf();
    }

    private boolean H(float f) {
        boolean z = true;
        for(int v = 0; v < this.i.length; ++v) {
            boolean z1 = this.s[v];
            int[] arr_v = this.q;
            int v1 = (int)(((float)this.p[v]) + ((float)((z1 ? 1 : -1) * 0xFF)) * f);
            arr_v[v] = v1;
            if(v1 < 0) {
                arr_v[v] = 0;
            }
            if(arr_v[v] > 0xFF) {
                arr_v[v] = 0xFF;
            }
            if(z1 && arr_v[v] < 0xFF) {
                z = false;
            }
            if(!z1 && arr_v[v] > 0) {
                z = false;
            }
        }
        return z;
    }

    @Override  // com.facebook.drawee.drawable.a
    public void draw(Canvas canvas0) {
        boolean z1;
        int v = 2;
        boolean z = true;
        switch(this.m) {
            case 0: {
                System.arraycopy(this.q, 0, this.p, 0, this.i.length);
                this.o = this.s();
                z1 = this.H((this.n == 0 ? 1.0f : 0.0f));
                this.z();
                if(!z1) {
                    v = 1;
                }
                this.m = v;
                z = z1;
                break;
            }
            case 1: {
                com.facebook.common.internal.n.o(this.n > 0);
                z1 = this.H(((float)(this.s() - this.o)) / ((float)this.n));
                if(!z1) {
                    v = 1;
                }
                this.m = v;
                z = z1;
            }
        }
        for(int v1 = 0; true; ++v1) {
            Drawable[] arr_drawable = this.i;
            if(v1 >= arr_drawable.length) {
                break;
            }
            this.g(canvas0, arr_drawable[v1], ((int)Math.ceil(((double)(this.q[v1] * this.r)) / 255.0)));
        }
        if(z) {
            this.y();
            this.A();
            return;
        }
        this.invalidateSelf();
    }

    public void f() {
        ++this.t;
    }

    private void g(Canvas canvas0, Drawable drawable0, int v) {
        if(drawable0 != null && v > 0) {
            ++this.t;
            if(this.x) {
                drawable0.mutate();
            }
            drawable0.setAlpha(v);
            --this.t;
            drawable0.draw(canvas0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.r;
    }

    public void i() {
        --this.t;
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if(this.t == 0) {
            super.invalidateSelf();
        }
    }

    public void j() {
        this.m = 0;
        Arrays.fill(this.s, true);
        this.invalidateSelf();
    }

    public void k(int v) {
        this.m = 0;
        this.s[v] = true;
        this.invalidateSelf();
    }

    public void l() {
        this.m = 0;
        Arrays.fill(this.s, false);
        this.invalidateSelf();
    }

    public void m(int v) {
        this.m = 0;
        this.s[v] = false;
        this.invalidateSelf();
    }

    public void o(int v) {
        this.m = 0;
        Arrays.fill(this.s, false);
        this.s[v] = true;
        this.invalidateSelf();
    }

    public void p(int v) {
        this.m = 0;
        Arrays.fill(this.s, 0, v + 1, true);
        Arrays.fill(this.s, v + 1, this.i.length, false);
        this.invalidateSelf();
    }

    public void r() {
        this.m = 2;
        for(int v = 0; v < this.i.length; ++v) {
            this.q[v] = this.s[v] ? 0xFF : 0;
        }
        this.invalidateSelf();
    }

    protected long s() {
        return SystemClock.uptimeMillis();
    }

    @Override  // com.facebook.drawee.drawable.a
    public void setAlpha(int v) {
        if(this.r != v) {
            this.r = v;
            this.invalidateSelf();
        }
    }

    public int t() {
        return this.n;
    }

    @VisibleForTesting
    public int u() {
        return this.m;
    }

    public void v(int v) {
        this.s[v] = false;
        this.q[v] = 0;
        this.invalidateSelf();
    }

    public boolean w() {
        return this.j;
    }

    public boolean x(int v) {
        return this.s[v];
    }

    private void y() {
        if(!this.v) {
            return;
        }
        this.v = false;
        r r0 = this.u;
        if(r0 != null) {
            r0.a();
        }
    }

    private void z() {
        if(this.v) {
            return;
        }
        if(this.l < 0 || (this.l >= this.s.length || !this.s[this.l])) {
            return;
        }
        this.v = true;
        r r0 = this.u;
        if(r0 != null) {
            r0.b();
        }
    }
}

