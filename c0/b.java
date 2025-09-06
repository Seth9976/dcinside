package C0;

import S0.c;
import S0.e;
import S0.j;
import S0.k;
import S0.l;
import S0.q;
import S0.u;
import S0.v;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.time.d;
import com.facebook.drawee.drawable.x;
import com.facebook.imagepipeline.image.o;
import java.io.Closeable;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class b extends S0.a implements k, q, u, x, Closeable {
    private final d c;
    private final l d;
    private final j e;
    @h
    private j f;
    private final boolean g;

    public b(d d0, l l0, j j0) {
        this(d0, l0, j0, true);
    }

    public b(d d0, l l0, j j0, boolean z) {
        this.f = null;
        this.c = d0;
        this.d = l0;
        this.e = j0;
        this.g = z;
    }

    @VisibleForTesting
    public void L(l l0, long v) {
        l0.k0(true);
        l0.j0(v);
        this.T(l0, v.e);
    }

    public void Q() {
        this.d.O();
    }

    private void R(l l0, e e0) {
        l0.a0(e0);
        this.e.a(l0, e0);
        j j0 = this.f;
        if(j0 != null) {
            j0.a(l0, e0);
        }
    }

    private void T(l l0, v v0) {
        this.e.b(l0, v0);
        j j0 = this.f;
        if(j0 != null) {
            j0.b(l0, v0);
        }
    }

    @Override  // S0.a
    public void a(String s, @h Object object0) {
        this.w(s, ((o)object0));
    }

    @Override  // S0.a
    public void b(String s, @h Throwable throwable0, @h S0.b.a b$a0) {
        long v = this.c.now();
        this.d.Y(b$a0);
        this.d.R(v);
        this.d.T(s);
        this.d.X(throwable0);
        this.R(this.d, e.h);
        this.x(this.d, v);
    }

    @Override  // S0.a
    public void c(String s, @h S0.b.a b$a0) {
        long v = this.c.now();
        l l0 = this.d;
        l0.Y(b$a0);
        l0.T(s);
        this.R(l0, e.j);
        if(this.g) {
            this.x(l0, v);
        }
    }

    @Override
    public void close() {
        this.Q();
    }

    @Override  // S0.a
    public void e(String s, @h Object object0, @h S0.b.a b$a0) {
        this.t(s, ((o)object0), b$a0);
    }

    @Override  // com.facebook.drawee.drawable.x
    public void i(boolean z) {
        if(z) {
            long v = this.c.now();
            this.L(this.d, v);
            return;
        }
        long v1 = this.c.now();
        this.x(this.d, v1);
    }

    @Override  // S0.q
    public void j(String s, Object object0, c c0) {
        this.v(s, ((o)object0), c0);
    }

    @Override  // S0.a
    public void k(@h Object object0) {
        l l0 = this.d;
        e e0 = e.i;
        l0.a0(e0);
        this.e.a(l0, e0);
        j j0 = this.f;
        if(j0 != null) {
            j0.a(l0, e0);
        }
    }

    @Override  // S0.u
    public void n(boolean z) {
        this.i(z);
    }

    @Override  // S0.k
    public void o(@h j j0) {
        this.f = j0;
    }

    @Override  // com.facebook.drawee.drawable.x
    public void onDraw() {
    }

    @Override  // S0.a
    public void p(String s, @h Object object0, @h S0.b.a b$a0) {
        long v = this.c.now();
        l l0 = this.d;
        l0.P();
        l0.V(v);
        l0.T(s);
        l0.Q(object0);
        l0.Y(b$a0);
        this.R(l0, e.e);
        if(this.g) {
            this.L(l0, v);
        }
    }

    public void t(String s, @h o o0, @h S0.b.a b$a0) {
        long v = this.c.now();
        this.d.Y(b$a0);
        this.d.S(v);
        this.d.c0(v);
        this.d.T(s);
        this.d.Z(o0);
        this.R(this.d, e.g);
    }

    public void v(String s, o o0, c c0) {
        this.d.T(s);
        this.d.W(c0);
    }

    public void w(String s, @h o o0) {
        long v = this.c.now();
        this.d.U(v);
        this.d.T(s);
        this.d.Z(o0);
        this.R(this.d, e.f);
    }

    @VisibleForTesting
    private void x(l l0, long v) {
        l0.k0(false);
        l0.e0(v);
        this.T(l0, v.f);
    }
}

