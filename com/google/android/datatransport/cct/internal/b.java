package com.google.android.datatransport.cct.internal;

import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;
import com.google.firebase.encoders.f;
import d2.a;
import java.io.IOException;
import java.util.List;

public final class b implements a {
    static final class com.google.android.datatransport.cct.internal.b.a implements e {
        static final com.google.android.datatransport.cct.internal.b.a a;
        private static final d b;
        private static final d c;
        private static final d d;
        private static final d e;
        private static final d f;
        private static final d g;
        private static final d h;
        private static final d i;
        private static final d j;
        private static final d k;
        private static final d l;
        private static final d m;

        static {
            com.google.android.datatransport.cct.internal.b.a.a = new com.google.android.datatransport.cct.internal.b.a();
            com.google.android.datatransport.cct.internal.b.a.b = d.d("sdkVersion");
            com.google.android.datatransport.cct.internal.b.a.c = d.d("model");
            com.google.android.datatransport.cct.internal.b.a.d = d.d("hardware");
            com.google.android.datatransport.cct.internal.b.a.e = d.d("device");
            com.google.android.datatransport.cct.internal.b.a.f = d.d("product");
            com.google.android.datatransport.cct.internal.b.a.g = d.d("osBuild");
            com.google.android.datatransport.cct.internal.b.a.h = d.d("manufacturer");
            com.google.android.datatransport.cct.internal.b.a.i = d.d("fingerprint");
            com.google.android.datatransport.cct.internal.b.a.j = d.d("locale");
            com.google.android.datatransport.cct.internal.b.a.k = d.d("country");
            com.google.android.datatransport.cct.internal.b.a.l = d.d("mccMnc");
            com.google.android.datatransport.cct.internal.b.a.m = d.d("applicationBuild");
        }

        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException {
            this.b(((com.google.android.datatransport.cct.internal.a)object0), ((f)object1));
        }

        public void b(com.google.android.datatransport.cct.internal.a a0, f f0) throws IOException {
            Integer integer0 = a0.m();
            f0.q(com.google.android.datatransport.cct.internal.b.a.b, integer0);
            String s = a0.j();
            f0.q(com.google.android.datatransport.cct.internal.b.a.c, s);
            String s1 = a0.f();
            f0.q(com.google.android.datatransport.cct.internal.b.a.d, s1);
            String s2 = a0.d();
            f0.q(com.google.android.datatransport.cct.internal.b.a.e, s2);
            String s3 = a0.l();
            f0.q(com.google.android.datatransport.cct.internal.b.a.f, s3);
            String s4 = a0.k();
            f0.q(com.google.android.datatransport.cct.internal.b.a.g, s4);
            String s5 = a0.h();
            f0.q(com.google.android.datatransport.cct.internal.b.a.h, s5);
            String s6 = a0.e();
            f0.q(com.google.android.datatransport.cct.internal.b.a.i, s6);
            String s7 = a0.g();
            f0.q(com.google.android.datatransport.cct.internal.b.a.j, s7);
            String s8 = a0.c();
            f0.q(com.google.android.datatransport.cct.internal.b.a.k, s8);
            String s9 = a0.i();
            f0.q(com.google.android.datatransport.cct.internal.b.a.l, s9);
            String s10 = a0.b();
            f0.q(com.google.android.datatransport.cct.internal.b.a.m, s10);
        }
    }

    static final class com.google.android.datatransport.cct.internal.b.b implements e {
        static final com.google.android.datatransport.cct.internal.b.b a;
        private static final d b;

        static {
            com.google.android.datatransport.cct.internal.b.b.a = new com.google.android.datatransport.cct.internal.b.b();
            com.google.android.datatransport.cct.internal.b.b.b = d.d("logRequest");
        }

        // 检测为 Lambda 实现
        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException [...]

        public void b(n n0, f f0) throws IOException {
            List list0 = n0.c();
            f0.q(com.google.android.datatransport.cct.internal.b.b.b, list0);
        }
    }

    static final class c implements e {
        static final c a;
        private static final d b;
        private static final d c;

        static {
            c.a = new c();
            c.b = d.d("clientType");
            c.c = d.d("androidClientInfo");
        }

        // 检测为 Lambda 实现
        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException [...]

        public void b(o o0, f f0) throws IOException {
            com.google.android.datatransport.cct.internal.o.b o$b0 = o0.c();
            f0.q(c.b, o$b0);
            com.google.android.datatransport.cct.internal.a a0 = o0.b();
            f0.q(c.c, a0);
        }
    }

    static final class com.google.android.datatransport.cct.internal.b.d implements e {
        static final com.google.android.datatransport.cct.internal.b.d a;
        private static final d b;
        private static final d c;

        static {
            com.google.android.datatransport.cct.internal.b.d.a = new com.google.android.datatransport.cct.internal.b.d();
            com.google.android.datatransport.cct.internal.b.d.b = d.d("privacyContext");
            com.google.android.datatransport.cct.internal.b.d.c = d.d("productIdOrigin");
        }

        // 检测为 Lambda 实现
        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException [...]

        public void b(p p0, f f0) throws IOException {
            s s0 = p0.b();
            f0.q(com.google.android.datatransport.cct.internal.b.d.b, s0);
            com.google.android.datatransport.cct.internal.p.b p$b0 = p0.c();
            f0.q(com.google.android.datatransport.cct.internal.b.d.c, p$b0);
        }
    }

    static final class com.google.android.datatransport.cct.internal.b.e implements e {
        static final com.google.android.datatransport.cct.internal.b.e a;
        private static final d b;
        private static final d c;

        static {
            com.google.android.datatransport.cct.internal.b.e.a = new com.google.android.datatransport.cct.internal.b.e();
            com.google.android.datatransport.cct.internal.b.e.b = d.d("clearBlob");
            com.google.android.datatransport.cct.internal.b.e.c = d.d("encryptedBlob");
        }

        // 检测为 Lambda 实现
        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException [...]

        public void b(q q0, f f0) throws IOException {
            byte[] arr_b = q0.b();
            f0.q(com.google.android.datatransport.cct.internal.b.e.b, arr_b);
            byte[] arr_b1 = q0.c();
            f0.q(com.google.android.datatransport.cct.internal.b.e.c, arr_b1);
        }
    }

    static final class com.google.android.datatransport.cct.internal.b.f implements e {
        static final com.google.android.datatransport.cct.internal.b.f a;
        private static final d b;

        static {
            com.google.android.datatransport.cct.internal.b.f.a = new com.google.android.datatransport.cct.internal.b.f();
            com.google.android.datatransport.cct.internal.b.f.b = d.d("originAssociatedProductId");
        }

        // 检测为 Lambda 实现
        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException [...]

        public void b(r r0, f f0) throws IOException {
            Integer integer0 = r0.b();
            f0.q(com.google.android.datatransport.cct.internal.b.f.b, integer0);
        }
    }

    static final class g implements e {
        static final g a;
        private static final d b;

        static {
            g.a = new g();
            g.b = d.d("prequest");
        }

        // 检测为 Lambda 实现
        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException [...]

        public void b(s s0, f f0) throws IOException {
            r r0 = s0.b();
            f0.q(g.b, r0);
        }
    }

    static final class h implements e {
        static final h a;
        private static final d b;
        private static final d c;
        private static final d d;
        private static final d e;
        private static final d f;
        private static final d g;
        private static final d h;
        private static final d i;
        private static final d j;

        static {
            h.a = new h();
            h.b = d.d("eventTimeMs");
            h.c = d.d("eventCode");
            h.d = d.d("complianceData");
            h.e = d.d("eventUptimeMs");
            h.f = d.d("sourceExtension");
            h.g = d.d("sourceExtensionJsonProto3");
            h.h = d.d("timezoneOffsetSeconds");
            h.i = d.d("networkConnectionInfo");
            h.j = d.d("experimentIds");
        }

        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException {
            this.b(((t)object0), ((f)object1));
        }

        public void b(t t0, f f0) throws IOException {
            long v = t0.d();
            f0.i(h.b, v);
            Integer integer0 = t0.c();
            f0.q(h.c, integer0);
            p p0 = t0.b();
            f0.q(h.d, p0);
            long v1 = t0.e();
            f0.i(h.e, v1);
            byte[] arr_b = t0.h();
            f0.q(h.f, arr_b);
            String s = t0.i();
            f0.q(h.g, s);
            long v2 = t0.j();
            f0.i(h.h, v2);
            w w0 = t0.g();
            f0.q(h.i, w0);
            q q0 = t0.f();
            f0.q(h.j, q0);
        }
    }

    static final class i implements e {
        static final i a;
        private static final d b;
        private static final d c;
        private static final d d;
        private static final d e;
        private static final d f;
        private static final d g;
        private static final d h;

        static {
            i.a = new i();
            i.b = d.d("requestTimeMs");
            i.c = d.d("requestUptimeMs");
            i.d = d.d("clientInfo");
            i.e = d.d("logSource");
            i.f = d.d("logSourceName");
            i.g = d.d("logEvent");
            i.h = d.d("qosTier");
        }

        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException {
            this.b(((u)object0), ((f)object1));
        }

        public void b(u u0, f f0) throws IOException {
            long v = u0.g();
            f0.i(i.b, v);
            long v1 = u0.h();
            f0.i(i.c, v1);
            o o0 = u0.b();
            f0.q(i.d, o0);
            Integer integer0 = u0.d();
            f0.q(i.e, integer0);
            String s = u0.e();
            f0.q(i.f, s);
            List list0 = u0.c();
            f0.q(i.g, list0);
            x x0 = u0.f();
            f0.q(i.h, x0);
        }
    }

    static final class j implements e {
        static final j a;
        private static final d b;
        private static final d c;

        static {
            j.a = new j();
            j.b = d.d("networkType");
            j.c = d.d("mobileSubtype");
        }

        // 检测为 Lambda 实现
        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException [...]

        public void b(w w0, f f0) throws IOException {
            com.google.android.datatransport.cct.internal.w.c w$c0 = w0.c();
            f0.q(j.b, w$c0);
            com.google.android.datatransport.cct.internal.w.b w$b0 = w0.b();
            f0.q(j.c, w$b0);
        }
    }

    public static final int a = 2;
    public static final a b;

    static {
        b.b = new b();
    }

    @Override  // d2.a
    public void a(d2.b b0) {
        b0.b(n.class, (Object object0, Object object1) -> this.b(((n)object0), ((f)object1)));
        b0.b(com.google.android.datatransport.cct.internal.d.class, (Object object0, Object object1) -> this.b(((n)object0), ((f)object1)));
        b0.b(u.class, i.a);
        b0.b(k.class, i.a);
        b0.b(o.class, (Object object0, Object object1) -> this.b(((o)object0), ((f)object1)));
        b0.b(com.google.android.datatransport.cct.internal.e.class, (Object object0, Object object1) -> this.b(((o)object0), ((f)object1)));
        b0.b(com.google.android.datatransport.cct.internal.a.class, com.google.android.datatransport.cct.internal.b.a.a);
        b0.b(com.google.android.datatransport.cct.internal.c.class, com.google.android.datatransport.cct.internal.b.a.a);
        b0.b(t.class, h.a);
        b0.b(com.google.android.datatransport.cct.internal.j.class, h.a);
        b0.b(p.class, (Object object0, Object object1) -> this.b(((p)object0), ((f)object1)));
        b0.b(com.google.android.datatransport.cct.internal.f.class, (Object object0, Object object1) -> this.b(((p)object0), ((f)object1)));
        b0.b(s.class, (Object object0, Object object1) -> this.b(((s)object0), ((f)object1)));
        b0.b(com.google.android.datatransport.cct.internal.i.class, (Object object0, Object object1) -> this.b(((s)object0), ((f)object1)));
        b0.b(r.class, (Object object0, Object object1) -> this.b(((r)object0), ((f)object1)));
        b0.b(com.google.android.datatransport.cct.internal.h.class, (Object object0, Object object1) -> this.b(((r)object0), ((f)object1)));
        b0.b(w.class, (Object object0, Object object1) -> this.b(((w)object0), ((f)object1)));
        b0.b(m.class, (Object object0, Object object1) -> this.b(((w)object0), ((f)object1)));
        b0.b(q.class, (Object object0, Object object1) -> this.b(((q)object0), ((f)object1)));
        b0.b(com.google.android.datatransport.cct.internal.g.class, (Object object0, Object object1) -> this.b(((q)object0), ((f)object1)));
    }
}

