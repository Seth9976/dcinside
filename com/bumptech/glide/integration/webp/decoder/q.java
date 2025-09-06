package com.bumptech.glide.integration.webp.decoder;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.i;
import com.bumptech.glide.m;
import com.bumptech.glide.n;
import com.bumptech.glide.request.target.e;
import com.bumptech.glide.request.transition.f;
import com.bumptech.glide.util.o;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

public class q {
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
        public void C(Object object0, f f0) {
            this.b(((Bitmap)object0), f0);
        }

        Bitmap a() {
            return this.g;
        }

        public void b(Bitmap bitmap0, f f0) {
            this.g = bitmap0;
            Message message0 = this.d.obtainMessage(1, this);
            this.d.sendMessageAtTime(message0, this.f);
        }
    }

    public interface b {
        void a();
    }

    class c implements Handler.Callback {
        final q a;
        static final int b = 1;
        static final int c = 2;

        @Override  // android.os.Handler$Callback
        public boolean handleMessage(Message message0) {
            int v = message0.what;
            if(v == 1) {
                q.this.o(((a)message0.obj));
                return true;
            }
            if(v == 2) {
                q.this.d.q(((a)message0.obj));
            }
            return false;
        }
    }

    interface d {
        void a();
    }

    static class com.bumptech.glide.integration.webp.decoder.q.e implements g {
        private final g c;
        private final int d;

        com.bumptech.glide.integration.webp.decoder.q.e(g g0, int v) {
            this.c = g0;
            this.d = v;
        }

        @Override  // com.bumptech.glide.load.g
        public void b(@NonNull MessageDigest messageDigest0) {
            messageDigest0.update(ByteBuffer.allocate(12).putInt(this.d).array());
            this.c.b(messageDigest0);
        }

        // 去混淆评级： 低(20)
        @Override  // com.bumptech.glide.load.g
        public boolean equals(Object object0) {
            return object0 instanceof com.bumptech.glide.integration.webp.decoder.q.e && this.c.equals(((com.bumptech.glide.integration.webp.decoder.q.e)object0).c) && this.d == ((com.bumptech.glide.integration.webp.decoder.q.e)object0).d;
        }

        @Override  // com.bumptech.glide.load.g
        public int hashCode() {
            return this.c.hashCode() * 0x1F + this.d;
        }
    }

    private final j a;
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
    public static final i t;

    static {
        q.t = i.g("com.bumptech.glide.integration.webp.decoder.WebpFrameLoader.CacheStrategy", p.d);
    }

    public q(com.bumptech.glide.c c0, j j0, int v, int v1, com.bumptech.glide.load.n n0, Bitmap bitmap0) {
        this(c0.h(), com.bumptech.glide.c.F(c0.j()), j0, null, q.k(com.bumptech.glide.c.F(c0.j()), v, v1), n0, bitmap0);
    }

    q(com.bumptech.glide.load.engine.bitmap_recycle.e e0, n n0, j j0, Handler handler0, m m0, com.bumptech.glide.load.n n1, Bitmap bitmap0) {
        this.c = new ArrayList();
        this.f = false;
        this.g = false;
        this.h = false;
        this.d = n0;
        if(handler0 == null) {
            handler0 = new Handler(Looper.getMainLooper(), new c(this));
        }
        this.e = e0;
        this.b = handler0;
        this.i = m0;
        this.a = j0;
        this.q(n1, bitmap0);
    }

    void a() {
        this.c.clear();
        this.p();
        this.u();
        a q$a0 = this.j;
        if(q$a0 != null) {
            this.d.q(q$a0);
            this.j = null;
        }
        a q$a1 = this.l;
        if(q$a1 != null) {
            this.d.q(q$a1);
            this.l = null;
        }
        a q$a2 = this.o;
        if(q$a2 != null) {
            this.d.q(q$a2);
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

    private g g(int v) {
        return new com.bumptech.glide.integration.webp.decoder.q.e(new com.bumptech.glide.signature.e(this.a), v);
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
        return n0.l().V0(((com.bumptech.glide.request.i)((com.bumptech.glide.request.i)com.bumptech.glide.request.i.Z0(com.bumptech.glide.load.engine.j.b).S0(true)).I0(true)).w0(v, v1));
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
            a q$a0 = this.o;
            if(q$a0 != null) {
                this.o = null;
                this.o(q$a0);
                return;
            }
            this.g = true;
            int v = this.a.m();
            long v1 = SystemClock.uptimeMillis();
            this.a.j();
            int v2 = this.a.g();
            this.l = new a(this.b, v2, v1 + ((long)v));
            com.bumptech.glide.request.i i0 = (com.bumptech.glide.request.i)com.bumptech.glide.request.i.r1(this.g(v2)).I0(this.a.t().e());
            this.i.V0(i0).y1(this.a).n1(this.l);
        }
    }

    void o(a q$a0) {
        d q$d0 = this.p;
        if(q$d0 != null) {
            q$d0.a();
        }
        this.g = false;
        if(this.k) {
            this.b.obtainMessage(2, q$a0).sendToTarget();
            return;
        }
        if(!this.f) {
            if(this.h) {
                this.b.obtainMessage(2, q$a0).sendToTarget();
                return;
            }
            this.o = q$a0;
            return;
        }
        if(q$a0.a() != null) {
            this.p();
            a q$a1 = this.j;
            this.j = q$a0;
            for(int v = this.c.size() - 1; v >= 0; --v) {
                try {
                    b q$b0 = (b)this.c.get(v);
                    if(q$b0 != null) {
                        q$b0.a();
                    }
                }
                catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                    indexOutOfBoundsException0.printStackTrace();
                }
            }
            if(q$a1 != null) {
                this.b.obtainMessage(2, q$a1).sendToTarget();
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
        this.i = this.i.V0(new com.bumptech.glide.request.i().L0(n0));
        this.q = o.i(bitmap0);
        this.r = bitmap0.getWidth();
        this.s = bitmap0.getHeight();
    }

    void r() {
        com.bumptech.glide.util.m.b(!this.f, "Can\'t restart a running animation");
        this.h = true;
        a q$a0 = this.o;
        if(q$a0 != null) {
            this.d.q(q$a0);
            this.o = null;
        }
    }

    void s(@Nullable d q$d0) {
        this.p = q$d0;
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

    void v(b q$b0) {
        if(this.k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if(this.c.contains(q$b0)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        this.c.add(q$b0);
        if(this.c.isEmpty()) {
            this.t();
        }
    }

    void w(b q$b0) {
        this.c.remove(q$b0);
        if(this.c.isEmpty()) {
            this.u();
        }
    }
}

