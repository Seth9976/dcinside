package J0;

import I0.d;
import android.util.SparseArray;
import androidx.annotation.VisibleForTesting;
import com.facebook.imagepipeline.image.e;
import com.facebook.imagepipeline.image.f;
import com.facebook.imagepipeline.image.g;
import com.facebook.imagepipeline.image.q;
import com.facebook.imageutils.c;
import java.util.Map;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.n;

public final class b implements d {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @VisibleForTesting
        @m
        @n
        public final com.facebook.common.references.a c(@m com.facebook.common.references.a a0) {
            try {
                if(com.facebook.common.references.a.s(a0)) {
                    L.m(a0);
                    if(a0.n() instanceof g) {
                        Object object0 = a0.n();
                        L.n(object0, "null cannot be cast to non-null type com.facebook.imagepipeline.image.CloseableStaticBitmap");
                        return ((g)object0).N();
                    }
                }
                return null;
            }
            finally {
                com.facebook.common.references.a.j(a0);
            }
        }

        private final com.facebook.common.references.a d(com.facebook.common.references.a a0) {
            g g0 = f.c(a0, q.d, 0);
            L.o(g0, "of(...)");
            return com.facebook.common.references.a.t(g0);
        }

        private final int e(com.facebook.common.references.a a0) {
            if(!com.facebook.common.references.a.s(a0)) {
                return 0;
            }
            L.m(a0);
            return this.f(((e)a0.n()));
        }

        private final int f(e e0) {
            return e0 instanceof com.facebook.imagepipeline.image.d ? c.l(((com.facebook.imagepipeline.image.d)e0).D3()) : 0;
        }
    }

    @l
    private final com.facebook.imagepipeline.animated.impl.c a;
    private final boolean b;
    @p3.a("this")
    @l
    private final SparseArray c;
    @p3.a("this")
    @m
    private com.facebook.common.references.a d;
    @l
    public static final a e;
    @l
    private static final Class f;

    static {
        b.e = new a(null);
        b.f = b.class;
    }

    public b(@l com.facebook.imagepipeline.animated.impl.c c0, boolean z) {
        L.p(c0, "animatedFrameCache");
        super();
        this.a = c0;
        this.b = z;
        this.c = new SparseArray();
    }

    @Override  // I0.d
    public boolean A() {
        return false;
    }

    @Override  // I0.d
    public void B(int v, @l com.facebook.common.references.a a0, int v1) {
        com.facebook.common.references.a a1;
        synchronized(this) {
            L.p(a0, "bitmapReference");
            this.c(v);
            try {
                a1 = b.e.d(a0);
                if(a1 != null) {
                    com.facebook.common.references.a.j(this.d);
                    this.d = this.a.a(v, a1);
                }
            }
            finally {
                com.facebook.common.references.a.j(a1);
            }
        }
    }

    @Override  // I0.d
    @m
    public com.facebook.common.references.a C(int v) {
        synchronized(this) {
            com.facebook.common.references.a a0 = com.facebook.common.references.a.e(this.d);
            return b.e.c(a0);
        }
    }

    @Override  // I0.d
    public boolean D(int v) {
        synchronized(this) {
            return this.a.b(v);
        }
    }

    @Override  // I0.d
    @m
    public com.facebook.common.references.a E(int v) {
        synchronized(this) {
            com.facebook.common.references.a a0 = this.a.c(v);
            return b.e.c(a0);
        }
    }

    @Override  // I0.d
    public void F(int v, @l com.facebook.common.references.a a0, int v1) {
        synchronized(this) {
            L.p(a0, "bitmapReference");
            com.facebook.common.references.a a1 = null;
            try {
                a1 = b.e.d(a0);
                if(a1 != null) {
                    com.facebook.common.references.a a2 = this.a.a(v, a1);
                    if(com.facebook.common.references.a.s(a2)) {
                        com.facebook.common.references.a.j(((com.facebook.common.references.a)this.c.get(v)));
                        this.c.put(v, a2);
                        x0.a.W(b.f, "cachePreparedFrame(%d) cached. Pending frames: %s", v, this.c);
                    }
                    goto label_16;
                }
                goto label_19;
            }
            catch(Throwable throwable0) {
                com.facebook.common.references.a.j(a1);
                throw throwable0;
            }
        label_16:
            com.facebook.common.references.a.j(a1);
            return;
        label_19:
            com.facebook.common.references.a.j(null);
        }
    }

    @Override  // I0.d
    public boolean G(@l Map map0) {
        L.p(map0, "frameBitmaps");
        return true;
    }

    @Override  // I0.d
    public void H(@m I0.d.b d$b0) {
    }

    @Override  // I0.d
    @m
    public com.facebook.common.references.a I(int v, int v1, int v2) {
        synchronized(this) {
            if(!this.b) {
                return null;
            }
            com.facebook.common.references.a a0 = this.a.d();
            return b.e.c(a0);
        }
    }

    @VisibleForTesting
    @m
    @n
    public static final com.facebook.common.references.a a(@m com.facebook.common.references.a a0) {
        return b.e.c(a0);
    }

    private final int b() {
        synchronized(this) {
            int v1 = this.c.size();
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                com.facebook.common.references.a a0 = (com.facebook.common.references.a)this.c.valueAt(v2);
                v3 += b.e.e(a0);
            }
            return v3;
        }
    }

    private final void c(int v) {
        synchronized(this) {
            com.facebook.common.references.a a0 = (com.facebook.common.references.a)this.c.get(v);
            if(a0 != null) {
                this.c.delete(v);
                com.facebook.common.references.a.j(a0);
                x0.a.W(b.f, "removePreparedReference(%d) removed. Pending frames: %s", v, this.c);
            }
        }
    }

    @Override  // I0.d
    public void clear() {
        synchronized(this) {
            com.facebook.common.references.a.j(this.d);
            this.d = null;
            int v1 = this.c.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                com.facebook.common.references.a.j(((com.facebook.common.references.a)this.c.valueAt(v2)));
            }
            this.c.clear();
        }
    }

    @Override  // I0.d
    public int z() {
        synchronized(this) {
            int v1 = b.e.e(this.d);
            int v2 = this.b();
            return v1 + v2;
        }
    }
}

