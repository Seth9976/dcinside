package com.bumptech.glide.request;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.DrawableRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.k.d;
import com.bumptech.glide.load.engine.q;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.request.target.o;
import com.bumptech.glide.request.target.p;
import com.bumptech.glide.request.transition.g;
import com.bumptech.glide.util.i;
import com.bumptech.glide.util.pool.c;
import java.util.List;
import java.util.concurrent.Executor;

public final class k implements e, j, o {
    static enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED;

        private static a[] a() [...] // Inlined contents
    }

    @GuardedBy("requestLock")
    private int A;
    @GuardedBy("requestLock")
    private int B;
    @GuardedBy("requestLock")
    private boolean C;
    @Nullable
    private RuntimeException D;
    private static final String E = "GlideRequest";
    private static final String F = "Glide";
    private static final boolean G;
    private int a;
    @Nullable
    private final String b;
    private final c c;
    private final Object d;
    @Nullable
    private final h e;
    private final f f;
    private final Context g;
    private final com.bumptech.glide.e h;
    @Nullable
    private final Object i;
    private final Class j;
    private final com.bumptech.glide.request.a k;
    private final int l;
    private final int m;
    private final com.bumptech.glide.j n;
    private final p o;
    @Nullable
    private final List p;
    private final g q;
    private final Executor r;
    @GuardedBy("requestLock")
    private v s;
    @GuardedBy("requestLock")
    private d t;
    @GuardedBy("requestLock")
    private long u;
    private volatile com.bumptech.glide.load.engine.k v;
    @GuardedBy("requestLock")
    private a w;
    @GuardedBy("requestLock")
    @Nullable
    private Drawable x;
    @GuardedBy("requestLock")
    @Nullable
    private Drawable y;
    @GuardedBy("requestLock")
    @Nullable
    private Drawable z;

    static {
        k.G = Log.isLoggable("GlideRequest", 2);
    }

    private k(Context context0, com.bumptech.glide.e e0, @NonNull Object object0, @Nullable Object object1, Class class0, com.bumptech.glide.request.a a0, int v, int v1, com.bumptech.glide.j j0, p p0, @Nullable h h0, @Nullable List list0, f f0, com.bumptech.glide.load.engine.k k0, g g0, Executor executor0) {
        this.b = k.G ? String.valueOf(super.hashCode()) : null;
        this.c = c.a();
        this.d = object0;
        this.g = context0;
        this.h = e0;
        this.i = object1;
        this.j = class0;
        this.k = a0;
        this.l = v;
        this.m = v1;
        this.n = j0;
        this.o = p0;
        this.e = h0;
        this.p = list0;
        this.f = f0;
        this.v = k0;
        this.q = g0;
        this.r = executor0;
        this.w = a.a;
        if(this.D == null && e0.g().b(com.bumptech.glide.d.d.class)) {
            this.D = new RuntimeException("Glide request origin trace");
        }
    }

    @GuardedBy("requestLock")
    private void A(v v0, Object object0, com.bumptech.glide.load.a a0, boolean z) {
        boolean z3;
        boolean z1 = this.s();
        this.w = a.d;
        this.s = v0;
        if(this.h.h() <= 3) {
            Log.d("Glide", "Finished loading " + object0.getClass().getSimpleName() + " from " + a0 + " for " + this.i + " with size [" + this.A + "x" + this.B + "] in " + i.a(this.u) + " ms");
        }
        this.x();
        boolean z2 = true;
        this.C = true;
        try {
            List list0 = this.p;
            if(list0 == null) {
                z3 = false;
            }
            else {
                z3 = false;
                for(Object object1: list0) {
                    h h0 = (h)object1;
                    int v2 = z3 | h0.onResourceReady(object0, this.i, this.o, a0, z1);
                    z3 = h0 instanceof com.bumptech.glide.request.c ? ((com.bumptech.glide.request.c)h0).b(object0, this.i, this.o, a0, z1, z) | v2 : v2;
                }
            }
            if(this.e == null || !this.e.onResourceReady(object0, this.i, this.o, a0, z1)) {
                z2 = false;
            }
            if(!z3 && !z2) {
                com.bumptech.glide.request.transition.f f0 = this.q.a(a0, z1);
                this.o.C(object0, f0);
            }
        }
        finally {
            this.C = false;
        }
    }

    @GuardedBy("requestLock")
    private void B() {
        if(!this.l()) {
            return;
        }
        Drawable drawable0 = this.i == null ? this.q() : null;
        if(drawable0 == null) {
            drawable0 = this.p();
        }
        if(drawable0 == null) {
            drawable0 = this.r();
        }
        this.o.F(drawable0);
    }

    @Override  // com.bumptech.glide.request.e
    public boolean a() {
        synchronized(this.d) {
        }
        return this.w == a.d;
    }

    @Override  // com.bumptech.glide.request.j
    public void b(q q0) {
        this.z(q0, 5);
    }

    @Override  // com.bumptech.glide.request.j
    public void c(v v0, com.bumptech.glide.load.a a0, boolean z) {
        Object object1;
        Object object0;
        this.c.c();
        v v1 = null;
        try {
            object0 = this.d;
            __monitor_enter(object0);
        }
        catch(Throwable throwable0) {
            goto label_50;
        }
        try {
            this.t = null;
            if(v0 == null) {
                this.b(new q("Expected to receive a Resource<R> with an object of " + this.j + " inside, but instead got null."));
                __monitor_exit(object0);
                return;
            }
            object1 = v0.get();
            if(object1 != null) {
                Class class0 = object1.getClass();
                if(this.j.isAssignableFrom(class0)) {
                    if(this.m()) {
                        this.A(v0, object1, a0, z);
                        __monitor_exit(object0);
                        return;
                    }
                    goto label_17;
                }
            }
            goto label_22;
        }
        catch(Throwable throwable1) {
            goto label_47;
        }
        try {
        label_17:
            this.s = null;
            this.w = a.d;
            __monitor_exit(object0);
        }
        catch(Throwable throwable2) {
            goto label_42;
        }
        this.v.l(v0);
        return;
        try {
        label_22:
            this.s = null;
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("Expected to receive an object of ");
            stringBuilder0.append(this.j);
            stringBuilder0.append(" but instead got ");
            Class class1 = object1 == null ? "" : object1.getClass();
            stringBuilder0.append(class1);
            stringBuilder0.append("{");
            stringBuilder0.append(object1);
            stringBuilder0.append("} inside Resource{");
            stringBuilder0.append(v0);
            stringBuilder0.append("}.");
            stringBuilder0.append((object1 == null ? " To indicate failure return a null Resource object, rather than a Resource object containing null data." : ""));
            this.b(new q(stringBuilder0.toString()));
            __monitor_exit(object0);
            goto label_53;
        }
        catch(Throwable throwable2) {
        label_42:
            v1 = v0;
            throwable1 = throwable2;
            try {
                while(true) {
                    __monitor_exit(object0);
                    break;
                label_47:
                }
            }
            catch(Throwable throwable1) {
                goto label_47;
            }
        }
        try {
            throw throwable1;
        }
        catch(Throwable throwable0) {
        label_50:
            if(v1 != null) {
                this.v.l(v1);
            }
            throw throwable0;
        }
    label_53:
        this.v.l(v0);
    }

    @Override  // com.bumptech.glide.request.e
    public void clear() {
        v v1;
        synchronized(this.d) {
            this.j();
            this.c.c();
            a k$a0 = a.f;
            if(this.w == k$a0) {
                return;
            }
            this.n();
            v1 = this.s;
            if(v1 == null) {
                v1 = null;
            }
            else {
                this.s = null;
            }
            if(this.k()) {
                Drawable drawable0 = this.r();
                this.o.B(drawable0);
            }
            this.w = k$a0;
        }
        if(v1 != null) {
            this.v.l(v1);
        }
    }

    @Override  // com.bumptech.glide.request.target.o
    public void d(int v, int v1) {
        this.c.c();
        synchronized(this.d) {
            boolean z = k.G;
            if(z) {
                this.u("Got onSizeReady in " + i.a(this.u));
            }
            if(this.w != a.c) {
                return;
            }
            a k$a0 = a.b;
            this.w = k$a0;
            float f = this.k.S();
            this.A = k.v(v, f);
            this.B = k.v(v1, f);
            if(z) {
                this.u("finished setup for calling load in " + i.a(this.u));
            }
            this.t = this.v.g(this.h, this.i, this.k.R(), this.A, this.B, this.k.Q(), this.j, this.n, this.k.E(), this.k.U(), this.k.i0(), this.k.d0(), this.k.K(), this.k.b0(), this.k.W(), this.k.V(), this.k.J(), this, this.r);
            if(this.w != k$a0) {
                this.t = null;
            }
            if(z) {
                this.u("finished onSizeReady in " + i.a(this.u));
            }
        }
    }

    @Override  // com.bumptech.glide.request.e
    public boolean e() {
        synchronized(this.d) {
        }
        return this.w == a.d;
    }

    @Override  // com.bumptech.glide.request.e
    public boolean f() {
        synchronized(this.d) {
        }
        return this.w == a.f;
    }

    @Override  // com.bumptech.glide.request.e
    public boolean g(e e0) {
        List list0;
        if(!(e0 instanceof k)) {
            return false;
        }
        synchronized(this.d) {
        }
        synchronized(((k)e0).d) {
            list0 = ((k)e0).p;
        }
        return this.l == ((k)e0).l && this.m == ((k)e0).m && com.bumptech.glide.util.o.d(this.i, ((k)e0).i) && this.j.equals(((k)e0).j) && com.bumptech.glide.util.o.c(this.k, ((k)e0).k) && this.n == ((k)e0).n && (this.p == null ? 0 : this.p.size()) == (list0 == null ? 0 : list0.size());
    }

    @Override  // com.bumptech.glide.request.j
    public Object h() {
        this.c.c();
        return this.d;
    }

    @Override  // com.bumptech.glide.request.e
    public void i() {
        synchronized(this.d) {
            this.j();
            this.c.c();
            this.u = i.b();
            Object object1 = this.i;
            if(object1 == null) {
                if(com.bumptech.glide.util.o.x(this.l, this.m)) {
                    this.A = this.l;
                    this.B = this.m;
                }
                int v1 = this.q() == null ? 5 : 3;
                this.z(new q("Received null model"), v1);
                return;
            }
            a k$a0 = this.w;
            a k$a1 = a.b;
            if(k$a0 != k$a1) {
                if(k$a0 == a.d) {
                    this.c(this.s, com.bumptech.glide.load.a.e, false);
                    return;
                }
                this.o(object1);
                this.a = -1;
                a k$a2 = a.c;
                this.w = k$a2;
                if(com.bumptech.glide.util.o.x(this.l, this.m)) {
                    this.d(this.l, this.m);
                }
                else {
                    this.o.G(this);
                }
                if((this.w == k$a1 || this.w == k$a2) && this.l()) {
                    Drawable drawable0 = this.r();
                    this.o.D(drawable0);
                }
                if(k.G) {
                    this.u("finished run method in " + i.a(this.u));
                }
                return;
            }
        }
        throw new IllegalArgumentException("Cannot restart a running request");
    }

    @Override  // com.bumptech.glide.request.e
    public boolean isRunning() {
        synchronized(this.d) {
        }
        return this.w == a.b || this.w == a.c;
    }

    @GuardedBy("requestLock")
    private void j() {
        if(this.C) {
            throw new IllegalStateException("You can\'t start or clear loads in RequestListener or Target callbacks. If you\'re trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    @GuardedBy("requestLock")
    private boolean k() {
        return this.f == null || this.f.j(this);
    }

    @GuardedBy("requestLock")
    private boolean l() {
        return this.f == null || this.f.c(this);
    }

    @GuardedBy("requestLock")
    private boolean m() {
        return this.f == null || this.f.d(this);
    }

    @GuardedBy("requestLock")
    private void n() {
        this.j();
        this.c.c();
        this.o.A(this);
        d k$d0 = this.t;
        if(k$d0 != null) {
            k$d0.a();
            this.t = null;
        }
    }

    private void o(Object object0) {
        List list0 = this.p;
        if(list0 == null) {
            return;
        }
        for(Object object1: list0) {
            if(((h)object1) instanceof com.bumptech.glide.request.c) {
            }
        }
    }

    @GuardedBy("requestLock")
    private Drawable p() {
        if(this.x == null) {
            Drawable drawable0 = this.k.G();
            this.x = drawable0;
            if(drawable0 == null && this.k.F() > 0) {
                this.x = this.t(this.k.F());
            }
        }
        return this.x;
    }

    @Override  // com.bumptech.glide.request.e
    public void pause() {
        synchronized(this.d) {
            if(this.isRunning()) {
                this.clear();
            }
        }
    }

    @GuardedBy("requestLock")
    private Drawable q() {
        if(this.z == null) {
            Drawable drawable0 = this.k.H();
            this.z = drawable0;
            if(drawable0 == null && this.k.I() > 0) {
                this.z = this.t(this.k.I());
            }
        }
        return this.z;
    }

    @GuardedBy("requestLock")
    private Drawable r() {
        if(this.y == null) {
            Drawable drawable0 = this.k.N();
            this.y = drawable0;
            if(drawable0 == null && this.k.O() > 0) {
                this.y = this.t(this.k.O());
            }
        }
        return this.y;
    }

    @GuardedBy("requestLock")
    private boolean s() {
        return this.f == null || !this.f.getRoot().a();
    }

    @GuardedBy("requestLock")
    private Drawable t(@DrawableRes int v) {
        if(this.k.T() != null) {
            return com.bumptech.glide.load.resource.drawable.i.a(this.g, v, this.k.T());
        }
        Resources.Theme resources$Theme0 = this.g.getTheme();
        return com.bumptech.glide.load.resource.drawable.i.a(this.g, v, resources$Theme0);
    }

    @Override
    public String toString() {
        synchronized(this.d) {
        }
        return super.toString() + "[model=" + this.i + ", transcodeClass=" + this.j + "]";
    }

    private void u(String s) {
        Log.v("GlideRequest", s + " this: " + this.b);
    }

    private static int v(int v, float f) {
        return v == 0x80000000 ? 0x80000000 : Math.round(f * ((float)v));
    }

    @GuardedBy("requestLock")
    private void w() {
        f f0 = this.f;
        if(f0 != null) {
            f0.h(this);
        }
    }

    @GuardedBy("requestLock")
    private void x() {
        f f0 = this.f;
        if(f0 != null) {
            f0.b(this);
        }
    }

    public static k y(Context context0, com.bumptech.glide.e e0, Object object0, Object object1, Class class0, com.bumptech.glide.request.a a0, int v, int v1, com.bumptech.glide.j j0, p p0, h h0, @Nullable List list0, f f0, com.bumptech.glide.load.engine.k k0, g g0, Executor executor0) {
        return new k(context0, e0, object0, object1, class0, a0, v, v1, j0, p0, h0, list0, f0, k0, g0, executor0);
    }

    private void z(q q0, int v) {
        boolean z1;
        this.c.c();
        synchronized(this.d) {
            q0.l(this.D);
            int v2 = this.h.h();
            if(v2 <= v) {
                Log.w("Glide", "Load failed for [" + this.i + "] with dimensions [" + this.A + "x" + this.B + "]", q0);
                if(v2 <= 4) {
                    q0.h("Glide");
                }
            }
            this.t = null;
            this.w = a.e;
            this.w();
            boolean z = true;
            this.C = true;
            try {
                List list0 = this.p;
                if(list0 == null) {
                    z1 = false;
                }
                else {
                    z1 = false;
                    for(Object object1: list0) {
                        boolean z2 = this.s();
                        z1 |= ((h)object1).onLoadFailed(q0, this.i, this.o, z2);
                    }
                }
                h h0 = this.e;
                if(h0 == null) {
                    z = false;
                }
                else {
                    boolean z3 = this.s();
                    if(!h0.onLoadFailed(q0, this.i, this.o, z3)) {
                        z = false;
                    }
                }
                if(!z1 && !z) {
                    this.B();
                }
            }
            catch(Throwable throwable0) {
                this.C = false;
                throw throwable0;
            }
            this.C = false;
        }
    }
}

