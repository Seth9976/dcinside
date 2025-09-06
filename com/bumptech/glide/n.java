package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import com.bumptech.glide.manager.j;
import com.bumptech.glide.manager.k;
import com.bumptech.glide.manager.p;
import com.bumptech.glide.manager.q;
import com.bumptech.glide.manager.t;
import com.bumptech.glide.request.e;
import com.bumptech.glide.request.h;
import com.bumptech.glide.request.target.f;
import com.bumptech.glide.util.o;
import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class n implements ComponentCallbacks2, i, k {
    class a implements Runnable {
        final n a;

        @Override
        public void run() {
            n.this.c.b(n.this);
        }
    }

    static class b extends f {
        b(@NonNull View view0) {
            super(view0);
        }

        @Override  // com.bumptech.glide.request.target.p
        public void C(@NonNull Object object0, @Nullable com.bumptech.glide.request.transition.f f0) {
        }

        @Override  // com.bumptech.glide.request.target.p
        public void F(@Nullable Drawable drawable0) {
        }

        @Override  // com.bumptech.glide.request.target.f
        protected void f(@Nullable Drawable drawable0) {
        }
    }

    class c implements com.bumptech.glide.manager.b.a {
        @GuardedBy("RequestManager.this")
        private final q a;
        final n b;

        c(@NonNull q q0) {
            this.a = q0;
        }

        @Override  // com.bumptech.glide.manager.b$a
        public void a(boolean z) {
            if(z) {
                synchronized(n.this) {
                    this.a.g();
                }
            }
        }
    }

    protected final com.bumptech.glide.c a;
    protected final Context b;
    final j c;
    @GuardedBy("this")
    private final q d;
    @GuardedBy("this")
    private final p e;
    @GuardedBy("this")
    private final t f;
    private final Runnable g;
    private final com.bumptech.glide.manager.b h;
    private final CopyOnWriteArrayList i;
    @GuardedBy("this")
    private com.bumptech.glide.request.i j;
    private boolean k;
    private boolean l;
    private static final com.bumptech.glide.request.i m;
    private static final com.bumptech.glide.request.i n;
    private static final com.bumptech.glide.request.i o;

    static {
        n.m = (com.bumptech.glide.request.i)com.bumptech.glide.request.i.Y0(Bitmap.class).l0();
        n.n = (com.bumptech.glide.request.i)com.bumptech.glide.request.i.Y0(com.bumptech.glide.load.resource.gif.c.class).l0();
        n.o = (com.bumptech.glide.request.i)((com.bumptech.glide.request.i)com.bumptech.glide.request.i.Z0(com.bumptech.glide.load.engine.j.c).z0(com.bumptech.glide.j.d)).I0(true);
    }

    public n(@NonNull com.bumptech.glide.c c0, @NonNull j j0, @NonNull p p0, @NonNull Context context0) {
        this(c0, j0, p0, new q(), c0.i(), context0);
    }

    n(com.bumptech.glide.c c0, j j0, p p0, q q0, com.bumptech.glide.manager.c c1, Context context0) {
        this.f = new t();
        a n$a0 = new a(this);
        this.g = n$a0;
        this.a = c0;
        this.c = j0;
        this.e = p0;
        this.d = q0;
        this.b = context0;
        com.bumptech.glide.manager.b b0 = c1.a(context0.getApplicationContext(), new c(this, q0));
        this.h = b0;
        c0.w(this);
        if(o.u()) {
            o.y(n$a0);
        }
        else {
            j0.b(this);
        }
        j0.b(b0);
        this.i = new CopyOnWriteArrayList(c0.k().c());
        this.Y(c0.k().d());
    }

    @CheckResult
    @NonNull
    public m H(@Nullable Bitmap bitmap0) {
        return this.m().t1(bitmap0);
    }

    @CheckResult
    @NonNull
    public m I(@Nullable Drawable drawable0) {
        return this.m().u1(drawable0);
    }

    @CheckResult
    @NonNull
    public m J(@Nullable Uri uri0) {
        return this.m().v1(uri0);
    }

    @CheckResult
    @NonNull
    public m K(@Nullable File file0) {
        return this.m().w1(file0);
    }

    @CheckResult
    @NonNull
    public m L(@DrawableRes @Nullable @RawRes Integer integer0) {
        return this.m().x1(integer0);
    }

    @CheckResult
    @NonNull
    public m M(@Nullable Object object0) {
        return this.m().y1(object0);
    }

    @CheckResult
    @NonNull
    public m N(@Nullable String s) {
        return this.m().z1(s);
    }

    @CheckResult
    @Deprecated
    public m O(@Nullable URL uRL0) {
        return this.m().A1(uRL0);
    }

    @CheckResult
    @NonNull
    public m P(@Nullable byte[] arr_b) {
        return this.m().B1(arr_b);
    }

    public void Q() {
        synchronized(this) {
            this.d.e();
        }
    }

    public void R() {
        synchronized(this) {
            this.Q();
            for(Object object0: this.e.a()) {
                ((n)object0).Q();
            }
        }
    }

    public void S() {
        synchronized(this) {
            this.d.f();
        }
    }

    public void T() {
        synchronized(this) {
            this.S();
            for(Object object0: this.e.a()) {
                ((n)object0).S();
            }
        }
    }

    public void U() {
        synchronized(this) {
            this.d.h();
        }
    }

    public void V() {
        synchronized(this) {
            o.b();
            this.U();
            for(Object object0: this.e.a()) {
                ((n)object0).U();
            }
        }
    }

    @NonNull
    public n W(@NonNull com.bumptech.glide.request.i i0) {
        synchronized(this) {
            this.Y(i0);
            return this;
        }
    }

    public void X(boolean z) {
        this.k = z;
    }

    protected void Y(@NonNull com.bumptech.glide.request.i i0) {
        synchronized(this) {
            this.j = (com.bumptech.glide.request.i)((com.bumptech.glide.request.i)i0.o()).k();
        }
    }

    void Z(@NonNull com.bumptech.glide.request.target.p p0, @NonNull e e0) {
        synchronized(this) {
            this.f.c(p0);
            this.d.i(e0);
        }
    }

    @Override  // com.bumptech.glide.i
    @CheckResult
    @Deprecated
    public Object a(@Nullable URL uRL0) {
        return this.O(uRL0);
    }

    boolean a0(@NonNull com.bumptech.glide.request.target.p p0) {
        synchronized(this) {
            e e0 = p0.z();
            if(e0 == null) {
                return true;
            }
            if(this.d.b(e0)) {
                this.f.d(p0);
                p0.E(null);
                return true;
            }
            return false;
        }
    }

    @Override  // com.bumptech.glide.i
    @CheckResult
    @NonNull
    public Object b(@Nullable File file0) {
        return this.K(file0);
    }

    private void b0(@NonNull com.bumptech.glide.request.target.p p0) {
        boolean z = this.a0(p0);
        e e0 = p0.z();
        if(!z && !this.a.x(p0) && e0 != null) {
            p0.E(null);
            e0.clear();
        }
    }

    @Override  // com.bumptech.glide.i
    @CheckResult
    @NonNull
    public Object c(@Nullable Drawable drawable0) {
        return this.I(drawable0);
    }

    private void c0(@NonNull com.bumptech.glide.request.i i0) {
        synchronized(this) {
            this.j = (com.bumptech.glide.request.i)this.j.j(i0);
        }
    }

    @Override  // com.bumptech.glide.i
    @CheckResult
    @NonNull
    public Object d(@Nullable Object object0) {
        return this.M(object0);
    }

    @Override  // com.bumptech.glide.i
    @CheckResult
    @NonNull
    public Object e(@Nullable Uri uri0) {
        return this.J(uri0);
    }

    @Override  // com.bumptech.glide.i
    @CheckResult
    @NonNull
    public Object f(@Nullable byte[] arr_b) {
        return this.P(arr_b);
    }

    @Override  // com.bumptech.glide.i
    @CheckResult
    @NonNull
    public Object g(@Nullable Bitmap bitmap0) {
        return this.H(bitmap0);
    }

    @Override  // com.bumptech.glide.i
    @CheckResult
    @NonNull
    public Object h(@DrawableRes @Nullable @RawRes Integer integer0) {
        return this.L(integer0);
    }

    public n i(h h0) {
        this.i.add(h0);
        return this;
    }

    @NonNull
    public n j(@NonNull com.bumptech.glide.request.i i0) {
        synchronized(this) {
            this.c0(i0);
            return this;
        }
    }

    @CheckResult
    @NonNull
    public m k(@NonNull Class class0) {
        return new m(this.a, this, class0, this.b);
    }

    @CheckResult
    @NonNull
    public m l() {
        return this.k(Bitmap.class).V0(n.m);
    }

    @Override  // com.bumptech.glide.i
    @CheckResult
    @NonNull
    public Object load(@Nullable String s) {
        return this.N(s);
    }

    @CheckResult
    @NonNull
    public m m() {
        return this.k(Drawable.class);
    }

    @CheckResult
    @NonNull
    public m n() {
        return this.k(File.class).V0(com.bumptech.glide.request.i.t1(true));
    }

    @CheckResult
    @NonNull
    public m o() {
        return this.k(com.bumptech.glide.load.resource.gif.c.class).V0(n.n);
    }

    @Override  // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration0) {
    }

    @Override  // com.bumptech.glide.manager.k
    public void onDestroy() {
        synchronized(this) {
            this.f.onDestroy();
            this.s();
            this.d.c();
            this.c.a(this);
            this.c.a(this.h);
            o.z(this.g);
            this.a.C(this);
        }
    }

    @Override  // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override  // com.bumptech.glide.manager.k
    public void onStart() {
        synchronized(this) {
            this.U();
            this.f.onStart();
        }
    }

    @Override  // com.bumptech.glide.manager.k
    public void onStop() {
        synchronized(this) {
            this.f.onStop();
            if(this.l) {
                this.s();
            }
            else {
                this.S();
            }
        }
    }

    @Override  // android.content.ComponentCallbacks2
    public void onTrimMemory(int v) {
        if(v == 60 && this.k) {
            this.R();
        }
    }

    public void p(@NonNull View view0) {
        this.q(new b(view0));
    }

    public void q(@Nullable com.bumptech.glide.request.target.p p0) {
        if(p0 == null) {
            return;
        }
        this.b0(p0);
    }

    @NonNull
    public n r() {
        synchronized(this) {
            this.l = true;
        }
        return this;
    }

    private void s() {
        synchronized(this) {
            for(Object object0: this.f.b()) {
                this.q(((com.bumptech.glide.request.target.p)object0));
            }
            this.f.a();
        }
    }

    @CheckResult
    @NonNull
    public m t(@Nullable Object object0) {
        return this.u().y1(object0);
    }

    @Override
    public String toString() {
        synchronized(this) {
        }
        return super.toString() + "{tracker=" + this.d + ", treeNode=" + this.e + "}";
    }

    @CheckResult
    @NonNull
    public m u() {
        return this.k(File.class).V0(n.o);
    }

    List v() {
        return this.i;
    }

    com.bumptech.glide.request.i w() {
        synchronized(this) {
        }
        return this.j;
    }

    @NonNull
    com.bumptech.glide.o x(Class class0) {
        return this.a.k().e(class0);
    }

    public boolean y() {
        synchronized(this) {
        }
        return this.d.d();
    }
}

