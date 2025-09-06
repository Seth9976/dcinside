package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.engine.j;
import com.bumptech.glide.m;
import com.bumptech.glide.n;
import com.bumptech.glide.request.i;
import com.bumptech.glide.request.target.e;
import com.bumptech.glide.request.transition.f;
import com.bumptech.glide.util.o;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

class g {
    @VisibleForTesting
    static class a extends e {
        private final Handler d;
        final int e;
        private final long f;
        private Bitmap g;

        a(Handler handler0, int v, long v1) {
            this.d = handler0;
            this.e = v;
            this.f = v1;
        }

        @Override  // com.bumptech.glide.request.target.p
        public void B(@Nullable Drawable drawable0) {
            this.g = null;
        }

        @Override  // com.bumptech.glide.request.target.p
        public void C(@NonNull Object object0, @Nullable f f0) {
            this.b(((Bitmap)object0), f0);
        }

        Bitmap a() {
            return this.g;
        }

        public void b(@NonNull Bitmap bitmap0, @Nullable f f0) {
            this.g = bitmap0;
            Message message0 = this.d.obtainMessage(1, this);
            this.d.sendMessageAtTime(message0, this.f);
        }
    }

    public interface b {
        void a();
    }

    class c implements Handler.Callback {
        final g a;
        static final int b = 1;
        static final int c = 2;

        @Override  // android.os.Handler$Callback
        public boolean handleMessage(Message message0) {
            int v = message0.what;
            if(v == 1) {
                g.this.o(((a)message0.obj));
                return true;
            }
            if(v == 2) {
                g.this.d.q(((a)message0.obj));
            }
            return false;
        }
    }

    @VisibleForTesting
    interface d {
        void a();
    }

    private final com.bumptech.glide.gifdecoder.a a;
    private final Handler b;
    private final List c;
    final n d;
    private final com.bumptech.glide.load.engine.bitmap_recycle.e e;
    private boolean f;
    private boolean g;
    private boolean h;
    private m i;
    private a j;
    private boolean k;
    private a l;
    private Bitmap m;
    private com.bumptech.glide.load.n n;
    private a o;
    @Nullable
    private d p;
    private int q;
    private int r;
    private int s;

    g(com.bumptech.glide.c c0, com.bumptech.glide.gifdecoder.a a0, int v, int v1, com.bumptech.glide.load.n n0, Bitmap bitmap0) {
        this(c0.h(), com.bumptech.glide.c.F(c0.j()), a0, null, g.k(com.bumptech.glide.c.F(c0.j()), v, v1), n0, bitmap0);
    }

    g(com.bumptech.glide.load.engine.bitmap_recycle.e e0, n n0, com.bumptech.glide.gifdecoder.a a0, Handler handler0, m m0, com.bumptech.glide.load.n n1, Bitmap bitmap0) {
        this.c = new ArrayList();
        this.d = n0;
        if(handler0 == null) {
            handler0 = new Handler(Looper.getMainLooper(), new c(this));
        }
        this.e = e0;
        this.b = handler0;
        this.i = m0;
        this.a = a0;
        this.q(n1, bitmap0);
    }

    void a() {
        this.c.clear();
        this.p();
        this.u();
        a g$a0 = this.j;
        if(g$a0 != null) {
            this.d.q(g$a0);
            this.j = null;
        }
        a g$a1 = this.l;
        if(g$a1 != null) {
            this.d.q(g$a1);
            this.l = null;
        }
        a g$a2 = this.o;
        if(g$a2 != null) {
            this.d.q(g$a2);
            this.o = null;
        }
        this.a.clear();
        this.k = true;
    }

    ByteBuffer b() {
        return this.a.getData().asReadOnlyBuffer();
    }

    Bitmap c() {
        return this.j == null ? this.m : this.j.a();
    }

    int d() {
        return this.j == null ? -1 : this.j.e;
    }

    Bitmap e() {
        return this.m;
    }

    int f() {
        return this.a.b();
    }

    private static com.bumptech.glide.load.g g() {
        return new com.bumptech.glide.signature.e(Math.random());
    }

    com.bumptech.glide.load.n h() {
        return this.n;
    }

    int i() {
        return this.s;
    }

    int j() {
        return this.a.l();
    }

    private static m k(n n0, int v, int v1) {
        return n0.l().V0(((i)((i)i.Z0(j.b).S0(true)).I0(true)).w0(v, v1));
    }

    int l() {
        return this.a.h() + this.q;
    }

    int m() {
        return this.r;
    }

    private void n() {
        if(this.f && !this.g) {
            if(this.h) {
                com.bumptech.glide.util.m.b(this.o == null, "Pending target must be null when starting from the first frame");
                this.a.f();
                this.h = false;
            }
            a g$a0 = this.o;
            if(g$a0 != null) {
                this.o = null;
                this.o(g$a0);
                return;
            }
            this.g = true;
            int v = this.a.m();
            long v1 = SystemClock.uptimeMillis();
            this.a.j();
            int v2 = this.a.g();
            this.l = new a(this.b, v2, v1 + ((long)v));
            this.i.V0(i.r1(g.g())).y1(this.a).n1(this.l);
        }
    }

    @VisibleForTesting
    void o(a g$a0) {
        d g$d0 = this.p;
        if(g$d0 != null) {
            g$d0.a();
        }
        this.g = false;
        if(this.k) {
            this.b.obtainMessage(2, g$a0).sendToTarget();
            return;
        }
        if(!this.f) {
            if(this.h) {
                this.b.obtainMessage(2, g$a0).sendToTarget();
                return;
            }
            this.o = g$a0;
            return;
        }
        if(g$a0.a() != null) {
            this.p();
            a g$a1 = this.j;
            this.j = g$a0;
            for(int v = this.c.size() - 1; v >= 0; --v) {
                ((b)this.c.get(v)).a();
            }
            if(g$a1 != null) {
                this.b.obtainMessage(2, g$a1).sendToTarget();
            }
        }
        this.n();
    }

    private void p() {
        Bitmap bitmap0 = this.m;
        if(bitmap0 != null) {
            this.e.e(bitmap0);
            this.m = null;
        }
    }

    void q(com.bumptech.glide.load.n n0, Bitmap bitmap0) {
        this.n = (com.bumptech.glide.load.n)com.bumptech.glide.util.m.e(n0);
        this.m = (Bitmap)com.bumptech.glide.util.m.e(bitmap0);
        this.i = this.i.V0(new i().L0(n0));
        this.q = o.i(bitmap0);
        this.r = bitmap0.getWidth();
        this.s = bitmap0.getHeight();
    }

    void r() {
        com.bumptech.glide.util.m.b(!this.f, "Can\'t restart a running animation");
        this.h = true;
        a g$a0 = this.o;
        if(g$a0 != null) {
            this.d.q(g$a0);
            this.o = null;
        }
    }

    @VisibleForTesting
    void s(@Nullable d g$d0) {
        this.p = g$d0;
    }

    private void t() {
        if(this.f) {
            return;
        }
        this.f = true;
        this.k = false;
        this.n();
    }

    private void u() {
        this.f = false;
    }

    void v(b g$b0) {
        if(this.k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if(this.c.contains(g$b0)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        this.c.add(g$b0);
        if(this.c.isEmpty()) {
            this.t();
        }
    }

    void w(b g$b0) {
        this.c.remove(g$b0);
        if(this.c.isEmpty()) {
            this.u();
        }
    }
}

