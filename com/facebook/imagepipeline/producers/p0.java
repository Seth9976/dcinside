package com.facebook.imagepipeline.producers;

import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.j;
import com.facebook.imagepipeline.common.g;
import com.facebook.imagepipeline.image.l;
import com.facebook.imagepipeline.transcoder.c;
import com.facebook.imagepipeline.transcoder.d;
import com.facebook.imagepipeline.transcoder.e;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import jeb.synthetic.FIN;
import jeb.synthetic.TWR;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class p0 implements h0 {
    class com.facebook.imagepipeline.producers.p0.a extends u {
        private final boolean i;
        private final d j;
        private final j0 k;
        private boolean l;
        private final H m;
        final p0 n;

        com.facebook.imagepipeline.producers.p0.a(com.facebook.imagepipeline.producers.n n0, j0 j00, boolean z, d d0) {
            class com.facebook.imagepipeline.producers.p0.a.a implements com.facebook.imagepipeline.producers.H.d {
                final p0 a;
                final com.facebook.imagepipeline.producers.p0.a b;

                com.facebook.imagepipeline.producers.p0.a.a(p0 p00) {
                    this.a = p00;
                    super();
                }

                @Override  // com.facebook.imagepipeline.producers.H$d
                public void a(@h l l0, int v) {
                    if(l0 != null) {
                        c c0 = (c)com.facebook.common.internal.n.i(com.facebook.imagepipeline.producers.p0.a.this.j.createImageTranscoder(l0.n(), com.facebook.imagepipeline.producers.p0.a.this.i));
                        com.facebook.imagepipeline.producers.p0.a.this.x(l0, v, c0);
                        return;
                    }
                    com.facebook.imagepipeline.producers.p0.a.this.q().b(null, v);
                }
            }


            class b extends f {
                final p0 a;
                final com.facebook.imagepipeline.producers.n b;
                final com.facebook.imagepipeline.producers.p0.a c;

                b(p0 p00, com.facebook.imagepipeline.producers.n n0) {
                    this.a = p00;
                    this.b = n0;
                    super();
                }

                @Override  // com.facebook.imagepipeline.producers.f
                public void a() {
                    if(com.facebook.imagepipeline.producers.p0.a.this.k.s()) {
                        com.facebook.imagepipeline.producers.p0.a.this.m.h();
                    }
                }

                @Override  // com.facebook.imagepipeline.producers.f
                public void b() {
                    com.facebook.imagepipeline.producers.p0.a.this.m.c();
                    com.facebook.imagepipeline.producers.p0.a.this.l = true;
                    this.b.a();
                }
            }

            super(n0);
            this.l = false;
            this.k = j00;
            Boolean boolean0 = j00.b().w();
            if(boolean0 != null) {
                z = boolean0.booleanValue();
            }
            this.i = z;
            this.j = d0;
            this.m = new H(p00.a, new com.facebook.imagepipeline.producers.p0.a.a(this, p00), 100);
            j00.n(new b(this, p00, n0));
        }

        @h
        private Map A(l l0, @h g g0, @h com.facebook.imagepipeline.transcoder.b b0, @h String s) {
            if(!this.k.i().f(this.k, "ResizeAndRotateProducer")) {
                return null;
            }
            String s1 = l0.getWidth() + "x" + l0.getHeight();
            HashMap hashMap0 = new HashMap();
            hashMap0.put("Image format", String.valueOf(l0.n()));
            hashMap0.put("Original size", s1);
            hashMap0.put("Requested size", (g0 == null ? "Unspecified" : g0.a + "x" + g0.b));
            hashMap0.put("queueTime", String.valueOf(this.m.f()));
            hashMap0.put("Transcoder id", s);
            hashMap0.put("Transcoding result", String.valueOf(b0));
            return j.a(hashMap0);
        }

        @h
        private l B(l l0) {
            com.facebook.imagepipeline.common.h h0 = this.k.b().x();
            return h0.k() || !h0.j() ? l0 : this.z(l0, h0.i());
        }

        @h
        private l C(l l0) {
            if(!this.k.b().x().f()) {
                switch(l0.k3()) {
                    case -1: 
                    case 0: {
                        break;
                    }
                    default: {
                        return this.z(l0, 0);
                    }
                }
            }
            return l0;
        }

        protected void D(@h l l0, int v) {
            if(this.l) {
                return;
            }
            boolean z = com.facebook.imagepipeline.producers.c.e(v);
            if(l0 == null) {
                if(z) {
                    this.q().b(null, 1);
                }
                return;
            }
            X0.c c0 = l0.n();
            com.facebook.common.util.g g0 = p0.h(this.k.b(), l0, ((c)com.facebook.common.internal.n.i(this.j.createImageTranscoder(c0, this.i))));
            if(!z && g0 == com.facebook.common.util.g.c) {
                return;
            }
            if(g0 != com.facebook.common.util.g.a) {
                this.y(l0, v, c0);
                return;
            }
            if(!this.m.k(l0, v)) {
                return;
            }
            if(z || this.k.s()) {
                this.m.h();
            }
        }

        @Override  // com.facebook.imagepipeline.producers.c
        protected void i(@h Object object0, int v) {
            this.D(((l)object0), v);
        }

        private void x(l l0, int v, c c0) {
            l l2;
            int v1;
            com.facebook.common.references.a a0;
            this.k.i().b(this.k, "ResizeAndRotateProducer");
            com.facebook.imagepipeline.request.d d0 = this.k.b();
            com.facebook.common.memory.l l1 = p0.this.b.b();
            Map map0 = null;
            try {
                com.facebook.imagepipeline.transcoder.b b0 = c0.c(l0, l1, d0.x(), d0.v(), null, 85, l0.j());
                if(b0.a() == 2) {
                    throw new RuntimeException("Error while transcoding the image");
                }
                map0 = this.A(l0, d0.v(), b0, c0.a());
                a0 = com.facebook.common.references.a.t(l1.a());
                v1 = FIN.finallyOpen$NT();
                l2 = new l(a0);
                l2.u0(X0.b.b);
            }
            catch(Exception exception0) {
                goto label_28;
            }
            catch(Throwable throwable0) {
                goto label_34;
            }
            try {
                l2.T();
                this.k.i().j(this.k, "ResizeAndRotateProducer", map0);
                if(b0.a() != 1) {
                    v |= 16;
                }
                this.q().b(l2, v);
                goto label_22;
            }
            catch(Throwable throwable1) {
                try {
                    try {
                        l.c(l2);
                        FIN.finallyExec$NT(v1);
                        throw throwable1;
                    label_22:
                        l.c(l2);
                        FIN.finallyCodeBegin$NT(v1);
                        com.facebook.common.references.a.j(a0);
                        FIN.finallyCodeEnd$NT(v1);
                        goto label_36;
                    }
                    catch(Exception exception0) {
                    }
                label_28:
                    this.k.i().k(this.k, "ResizeAndRotateProducer", exception0, map0);
                    if(com.facebook.imagepipeline.producers.c.e(v)) {
                        this.q().onFailure(exception0);
                    }
                }
                catch(Throwable throwable0) {
                    goto label_34;
                }
            }
            l1.close();
            return;
        label_34:
            TWR.safeClose$NT(l1, throwable0);
            throw throwable0;
        label_36:
            l1.close();
        }

        private void y(l l0, int v, X0.c c0) {
            this.q().b((c0 == X0.b.b || c0 == X0.b.l ? this.C(l0) : this.B(l0)), v);
        }

        @h
        private l z(l l0, int v) {
            l l1 = l.b(l0);
            if(l1 != null) {
                l1.x0(v);
            }
            return l1;
        }
    }

    private final Executor a;
    private final com.facebook.common.memory.j b;
    private final h0 c;
    private final boolean d;
    private final d e;
    private static final String f = "ResizeAndRotateProducer";
    private static final String g = "Image format";
    private static final String h = "Original size";
    private static final String i = "Requested size";
    private static final String j = "Transcoding result";
    private static final String k = "Transcoder id";
    @VisibleForTesting
    static final int l = 100;

    public p0(Executor executor0, com.facebook.common.memory.j j0, h0 h00, boolean z, d d0) {
        this.a = (Executor)com.facebook.common.internal.n.i(executor0);
        this.b = (com.facebook.common.memory.j)com.facebook.common.internal.n.i(j0);
        this.c = (h0)com.facebook.common.internal.n.i(h00);
        this.e = (d)com.facebook.common.internal.n.i(d0);
        this.d = z;
    }

    @Override  // com.facebook.imagepipeline.producers.h0
    public void a(com.facebook.imagepipeline.producers.n n0, j0 j00) {
        com.facebook.imagepipeline.producers.p0.a p0$a0 = new com.facebook.imagepipeline.producers.p0.a(this, n0, j00, this.d, this.e);
        this.c.a(p0$a0, j00);
    }

    // 去混淆评级： 低(30)
    private static boolean f(com.facebook.imagepipeline.common.h h0, l l0) {
        return !h0.f() && (e.f(h0, l0) != 0 || p0.g(h0, l0));
    }

    private static boolean g(com.facebook.imagepipeline.common.h h0, l l0) {
        if(h0.j() && !h0.f()) {
            Integer integer0 = l0.A0();
            return e.h.contains(integer0);
        }
        l0.h0(0);
        return false;
    }

    private static com.facebook.common.util.g h(com.facebook.imagepipeline.request.d d0, l l0, c c0) {
        if(l0 != null && l0.n() != X0.c.d) {
            if(!c0.b(l0.n())) {
                return com.facebook.common.util.g.b;
            }
            return p0.f(d0.x(), l0) || c0.d(l0, d0.x(), d0.v()) ? com.facebook.common.util.g.h(true) : com.facebook.common.util.g.h(false);
        }
        return com.facebook.common.util.g.c;
    }
}

