package J0;

import I0.d.b;
import I0.d;
import android.graphics.Bitmap;
import java.util.Map;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class c implements d {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    private int a;
    @m
    private b b;
    @p3.a("this")
    @m
    private com.facebook.common.references.a c;
    @l
    public static final a d = null;
    private static final int e = -1;

    static {
        c.d = new a(null);
    }

    public c() {
        this.a = -1;
    }

    @Override  // I0.d
    public boolean A() {
        return false;
    }

    @Override  // I0.d
    public void B(int v, @l com.facebook.common.references.a a0, int v1) {
        synchronized(this) {
            L.p(a0, "bitmapReference");
            if(this.c != null && L.g(a0.n(), (this.c == null ? null : ((Bitmap)this.c.n())))) {
                return;
            }
            com.facebook.common.references.a.j(this.c);
            int v3 = this.a;
            if(v3 != -1) {
                b d$b0 = this.b;
                if(d$b0 != null) {
                    d$b0.a(this, v3);
                }
            }
            this.c = com.facebook.common.references.a.e(a0);
            b d$b1 = this.b;
            if(d$b1 != null) {
                d$b1.b(this, v);
            }
            this.a = v;
        }
    }

    @Override  // I0.d
    @m
    public com.facebook.common.references.a C(int v) {
        synchronized(this) {
            return com.facebook.common.references.a.e(this.c);
        }
    }

    @Override  // I0.d
    public boolean D(int v) {
        synchronized(this) {
            return v == this.a && com.facebook.common.references.a.s(this.c);
        }
    }

    @Override  // I0.d
    @m
    public com.facebook.common.references.a E(int v) {
        synchronized(this) {
            return this.a == v ? com.facebook.common.references.a.e(this.c) : null;
        }
    }

    @Override  // I0.d
    public void F(int v, @l com.facebook.common.references.a a0, int v1) {
        L.p(a0, "bitmapReference");
    }

    @Override  // I0.d
    public boolean G(@l Map map0) {
        return I0.d.a.b(this, map0);
    }

    @Override  // I0.d
    public void H(@m b d$b0) {
        this.b = d$b0;
    }

    @Override  // I0.d
    @m
    public com.facebook.common.references.a I(int v, int v1, int v2) {
        com.facebook.common.references.a a0;
        synchronized(this) {
            try {
                a0 = com.facebook.common.references.a.e(this.c);
            }
            catch(Throwable throwable0) {
                this.a();
                throw throwable0;
            }
        }
        this.a();
        return a0;
    }

    private final void a() {
        synchronized(this) {
            int v1 = this.a;
            if(v1 != -1) {
                b d$b0 = this.b;
                if(d$b0 != null) {
                    d$b0.a(this, v1);
                }
            }
            com.facebook.common.references.a.j(this.c);
            this.c = null;
            this.a = -1;
        }
    }

    @Override  // I0.d
    public void clear() {
        synchronized(this) {
            this.a();
        }
    }

    @Override  // I0.d
    public int z() {
        int v1;
        synchronized(this) {
            com.facebook.common.references.a a0 = this.c;
            if(a0 == null) {
                v1 = 0;
            }
            else {
                L.m(a0);
                v1 = com.facebook.imageutils.c.l(((Bitmap)a0.n()));
            }
            return v1;
        }
    }
}

