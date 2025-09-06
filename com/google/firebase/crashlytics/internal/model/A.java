package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;
import com.google.firebase.encoders.f;
import java.io.IOException;
import java.util.List;

public final class a implements d2.a {
    static final class com.google.firebase.crashlytics.internal.model.a.a implements e {
        static final com.google.firebase.crashlytics.internal.model.a.a a;
        private static final d b;
        private static final d c;
        private static final d d;

        static {
            com.google.firebase.crashlytics.internal.model.a.a.a = new com.google.firebase.crashlytics.internal.model.a.a();
            com.google.firebase.crashlytics.internal.model.a.a.b = d.d("arch");
            com.google.firebase.crashlytics.internal.model.a.a.c = d.d("libraryName");
            com.google.firebase.crashlytics.internal.model.a.a.d = d.d("buildId");
        }

        // 检测为 Lambda 实现
        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException [...]

        public void b(com.google.firebase.crashlytics.internal.model.F.a.a f$a$a0, f f0) throws IOException {
            String s = f$a$a0.b();
            f0.q(com.google.firebase.crashlytics.internal.model.a.a.b, s);
            String s1 = f$a$a0.d();
            f0.q(com.google.firebase.crashlytics.internal.model.a.a.c, s1);
            String s2 = f$a$a0.c();
            f0.q(com.google.firebase.crashlytics.internal.model.a.a.d, s2);
        }
    }

    static final class b implements e {
        static final b a;
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
            b.a = new b();
            b.b = d.d("pid");
            b.c = d.d("processName");
            b.d = d.d("reasonCode");
            b.e = d.d("importance");
            b.f = d.d("pss");
            b.g = d.d("rss");
            b.h = d.d("timestamp");
            b.i = d.d("traceFile");
            b.j = d.d("buildIdMappingForArch");
        }

        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException {
            this.b(((com.google.firebase.crashlytics.internal.model.F.a)object0), ((f)object1));
        }

        public void b(com.google.firebase.crashlytics.internal.model.F.a f$a0, f f0) throws IOException {
            int v = f$a0.d();
            f0.j(b.b, v);
            String s = f$a0.e();
            f0.q(b.c, s);
            int v1 = f$a0.g();
            f0.j(b.d, v1);
            int v2 = f$a0.c();
            f0.j(b.e, v2);
            long v3 = f$a0.f();
            f0.i(b.f, v3);
            long v4 = f$a0.h();
            f0.i(b.g, v4);
            long v5 = f$a0.i();
            f0.i(b.h, v5);
            String s1 = f$a0.j();
            f0.q(b.i, s1);
            List list0 = f$a0.b();
            f0.q(b.j, list0);
        }
    }

    static final class c implements e {
        static final c a;
        private static final d b;
        private static final d c;

        static {
            c.a = new c();
            c.b = d.d("key");
            c.c = d.d("value");
        }

        // 检测为 Lambda 实现
        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException [...]

        public void b(com.google.firebase.crashlytics.internal.model.F.d f$d0, f f0) throws IOException {
            String s = f$d0.b();
            f0.q(c.b, s);
            String s1 = f$d0.c();
            f0.q(c.c, s1);
        }
    }

    static final class com.google.firebase.crashlytics.internal.model.a.d implements e {
        static final com.google.firebase.crashlytics.internal.model.a.d a;
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
            com.google.firebase.crashlytics.internal.model.a.d.a = new com.google.firebase.crashlytics.internal.model.a.d();
            com.google.firebase.crashlytics.internal.model.a.d.b = d.d("sdkVersion");
            com.google.firebase.crashlytics.internal.model.a.d.c = d.d("gmpAppId");
            com.google.firebase.crashlytics.internal.model.a.d.d = d.d("platform");
            com.google.firebase.crashlytics.internal.model.a.d.e = d.d("installationUuid");
            com.google.firebase.crashlytics.internal.model.a.d.f = d.d("firebaseInstallationId");
            com.google.firebase.crashlytics.internal.model.a.d.g = d.d("firebaseAuthenticationToken");
            com.google.firebase.crashlytics.internal.model.a.d.h = d.d("appQualitySessionId");
            com.google.firebase.crashlytics.internal.model.a.d.i = d.d("buildVersion");
            com.google.firebase.crashlytics.internal.model.a.d.j = d.d("displayVersion");
            com.google.firebase.crashlytics.internal.model.a.d.k = d.d("session");
            com.google.firebase.crashlytics.internal.model.a.d.l = d.d("ndkPayload");
            com.google.firebase.crashlytics.internal.model.a.d.m = d.d("appExitInfo");
        }

        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException {
            this.b(((F)object0), ((f)object1));
        }

        public void b(F f0, f f1) throws IOException {
            String s = f0.m();
            f1.q(com.google.firebase.crashlytics.internal.model.a.d.b, s);
            String s1 = f0.i();
            f1.q(com.google.firebase.crashlytics.internal.model.a.d.c, s1);
            int v = f0.l();
            f1.j(com.google.firebase.crashlytics.internal.model.a.d.d, v);
            String s2 = f0.j();
            f1.q(com.google.firebase.crashlytics.internal.model.a.d.e, s2);
            String s3 = f0.h();
            f1.q(com.google.firebase.crashlytics.internal.model.a.d.f, s3);
            String s4 = f0.g();
            f1.q(com.google.firebase.crashlytics.internal.model.a.d.g, s4);
            String s5 = f0.d();
            f1.q(com.google.firebase.crashlytics.internal.model.a.d.h, s5);
            String s6 = f0.e();
            f1.q(com.google.firebase.crashlytics.internal.model.a.d.i, s6);
            String s7 = f0.f();
            f1.q(com.google.firebase.crashlytics.internal.model.a.d.j, s7);
            com.google.firebase.crashlytics.internal.model.F.f f$f0 = f0.n();
            f1.q(com.google.firebase.crashlytics.internal.model.a.d.k, f$f0);
            com.google.firebase.crashlytics.internal.model.F.e f$e0 = f0.k();
            f1.q(com.google.firebase.crashlytics.internal.model.a.d.l, f$e0);
            com.google.firebase.crashlytics.internal.model.F.a f$a0 = f0.c();
            f1.q(com.google.firebase.crashlytics.internal.model.a.d.m, f$a0);
        }
    }

    static final class com.google.firebase.crashlytics.internal.model.a.e implements e {
        static final com.google.firebase.crashlytics.internal.model.a.e a;
        private static final d b;
        private static final d c;

        static {
            com.google.firebase.crashlytics.internal.model.a.e.a = new com.google.firebase.crashlytics.internal.model.a.e();
            com.google.firebase.crashlytics.internal.model.a.e.b = d.d("files");
            com.google.firebase.crashlytics.internal.model.a.e.c = d.d("orgId");
        }

        // 检测为 Lambda 实现
        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException [...]

        public void b(com.google.firebase.crashlytics.internal.model.F.e f$e0, f f0) throws IOException {
            List list0 = f$e0.b();
            f0.q(com.google.firebase.crashlytics.internal.model.a.e.b, list0);
            String s = f$e0.c();
            f0.q(com.google.firebase.crashlytics.internal.model.a.e.c, s);
        }
    }

    static final class com.google.firebase.crashlytics.internal.model.a.f implements e {
        static final com.google.firebase.crashlytics.internal.model.a.f a;
        private static final d b;
        private static final d c;

        static {
            com.google.firebase.crashlytics.internal.model.a.f.a = new com.google.firebase.crashlytics.internal.model.a.f();
            com.google.firebase.crashlytics.internal.model.a.f.b = d.d("filename");
            com.google.firebase.crashlytics.internal.model.a.f.c = d.d("contents");
        }

        // 检测为 Lambda 实现
        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException [...]

        public void b(com.google.firebase.crashlytics.internal.model.F.e.b f$e$b0, f f0) throws IOException {
            String s = f$e$b0.c();
            f0.q(com.google.firebase.crashlytics.internal.model.a.f.b, s);
            byte[] arr_b = f$e$b0.b();
            f0.q(com.google.firebase.crashlytics.internal.model.a.f.c, arr_b);
        }
    }

    static final class g implements e {
        static final g a;
        private static final d b;
        private static final d c;
        private static final d d;
        private static final d e;
        private static final d f;
        private static final d g;
        private static final d h;

        static {
            g.a = new g();
            g.b = d.d("identifier");
            g.c = d.d("version");
            g.d = d.d("displayVersion");
            g.e = d.d("organization");
            g.f = d.d("installationUuid");
            g.g = d.d("developmentPlatform");
            g.h = d.d("developmentPlatformVersion");
        }

        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException {
            this.b(((com.google.firebase.crashlytics.internal.model.F.f.a)object0), ((f)object1));
        }

        public void b(com.google.firebase.crashlytics.internal.model.F.f.a f$f$a0, f f0) throws IOException {
            String s = f$f$a0.e();
            f0.q(g.b, s);
            String s1 = f$f$a0.h();
            f0.q(g.c, s1);
            String s2 = f$f$a0.d();
            f0.q(g.d, s2);
            com.google.firebase.crashlytics.internal.model.F.f.a.b f$f$a$b0 = f$f$a0.g();
            f0.q(g.e, f$f$a$b0);
            String s3 = f$f$a0.f();
            f0.q(g.f, s3);
            String s4 = f$f$a0.b();
            f0.q(g.g, s4);
            String s5 = f$f$a0.c();
            f0.q(g.h, s5);
        }
    }

    static final class h implements e {
        static final h a;
        private static final d b;

        static {
            h.a = new h();
            h.b = d.d("clsId");
        }

        // 检测为 Lambda 实现
        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException [...]

        public void b(com.google.firebase.crashlytics.internal.model.F.f.a.b f$f$a$b0, f f0) throws IOException {
            String s = f$f$a$b0.b();
            f0.q(h.b, s);
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
        private static final d i;
        private static final d j;

        static {
            i.a = new i();
            i.b = d.d("arch");
            i.c = d.d("model");
            i.d = d.d("cores");
            i.e = d.d("ram");
            i.f = d.d("diskSpace");
            i.g = d.d("simulator");
            i.h = d.d("state");
            i.i = d.d("manufacturer");
            i.j = d.d("modelClass");
        }

        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException {
            this.b(((com.google.firebase.crashlytics.internal.model.F.f.c)object0), ((f)object1));
        }

        public void b(com.google.firebase.crashlytics.internal.model.F.f.c f$f$c0, f f0) throws IOException {
            int v = f$f$c0.b();
            f0.j(i.b, v);
            String s = f$f$c0.f();
            f0.q(i.c, s);
            int v1 = f$f$c0.c();
            f0.j(i.d, v1);
            long v2 = f$f$c0.h();
            f0.i(i.e, v2);
            long v3 = f$f$c0.d();
            f0.i(i.f, v3);
            boolean z = f$f$c0.j();
            f0.h(i.g, z);
            int v4 = f$f$c0.i();
            f0.j(i.h, v4);
            String s1 = f$f$c0.e();
            f0.q(i.i, s1);
            String s2 = f$f$c0.g();
            f0.q(i.j, s2);
        }
    }

    static final class j implements e {
        static final j a;
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
            j.a = new j();
            j.b = d.d("generator");
            j.c = d.d("identifier");
            j.d = d.d("appQualitySessionId");
            j.e = d.d("startedAt");
            j.f = d.d("endedAt");
            j.g = d.d("crashed");
            j.h = d.d("app");
            j.i = d.d("user");
            j.j = d.d("os");
            j.k = d.d("device");
            j.l = d.d("events");
            j.m = d.d("generatorType");
        }

        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException {
            this.b(((com.google.firebase.crashlytics.internal.model.F.f)object0), ((f)object1));
        }

        public void b(com.google.firebase.crashlytics.internal.model.F.f f$f0, f f0) throws IOException {
            String s = f$f0.g();
            f0.q(j.b, s);
            byte[] arr_b = f$f0.j();
            f0.q(j.c, arr_b);
            String s1 = f$f0.c();
            f0.q(j.d, s1);
            long v = f$f0.l();
            f0.i(j.e, v);
            Long long0 = f$f0.e();
            f0.q(j.f, long0);
            boolean z = f$f0.n();
            f0.h(j.g, z);
            com.google.firebase.crashlytics.internal.model.F.f.a f$f$a0 = f$f0.b();
            f0.q(j.h, f$f$a0);
            com.google.firebase.crashlytics.internal.model.F.f.f f$f$f0 = f$f0.m();
            f0.q(j.i, f$f$f0);
            com.google.firebase.crashlytics.internal.model.F.f.e f$f$e0 = f$f0.k();
            f0.q(j.j, f$f$e0);
            com.google.firebase.crashlytics.internal.model.F.f.c f$f$c0 = f$f0.d();
            f0.q(j.k, f$f$c0);
            List list0 = f$f0.f();
            f0.q(j.l, list0);
            int v1 = f$f0.h();
            f0.j(j.m, v1);
        }
    }

    static final class k implements e {
        static final k a;
        private static final d b;
        private static final d c;
        private static final d d;
        private static final d e;
        private static final d f;
        private static final d g;
        private static final d h;

        static {
            k.a = new k();
            k.b = d.d("execution");
            k.c = d.d("customAttributes");
            k.d = d.d("internalKeys");
            k.e = d.d("background");
            k.f = d.d("currentProcessDetails");
            k.g = d.d("appProcessDetails");
            k.h = d.d("uiOrientation");
        }

        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException {
            this.b(((com.google.firebase.crashlytics.internal.model.F.f.d.a)object0), ((f)object1));
        }

        public void b(com.google.firebase.crashlytics.internal.model.F.f.d.a f$f$d$a0, f f0) throws IOException {
            com.google.firebase.crashlytics.internal.model.F.f.d.a.b f$f$d$a$b0 = f$f$d$a0.f();
            f0.q(k.b, f$f$d$a$b0);
            List list0 = f$f$d$a0.e();
            f0.q(k.c, list0);
            List list1 = f$f$d$a0.g();
            f0.q(k.d, list1);
            Boolean boolean0 = f$f$d$a0.c();
            f0.q(k.e, boolean0);
            com.google.firebase.crashlytics.internal.model.F.f.d.a.c f$f$d$a$c0 = f$f$d$a0.d();
            f0.q(k.f, f$f$d$a$c0);
            List list2 = f$f$d$a0.b();
            f0.q(k.g, list2);
            int v = f$f$d$a0.h();
            f0.j(k.h, v);
        }
    }

    static final class l implements e {
        static final l a;
        private static final d b;
        private static final d c;
        private static final d d;
        private static final d e;

        static {
            l.a = new l();
            l.b = d.d("baseAddress");
            l.c = d.d("size");
            l.d = d.d("name");
            l.e = d.d("uuid");
        }

        // 检测为 Lambda 实现
        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException [...]

        public void b(com.google.firebase.crashlytics.internal.model.F.f.d.a.b.a f$f$d$a$b$a0, f f0) throws IOException {
            long v = f$f$d$a$b$a0.b();
            f0.i(l.b, v);
            long v1 = f$f$d$a$b$a0.d();
            f0.i(l.c, v1);
            String s = f$f$d$a$b$a0.c();
            f0.q(l.d, s);
            byte[] arr_b = f$f$d$a$b$a0.f();
            f0.q(l.e, arr_b);
        }
    }

    static final class m implements e {
        static final m a;
        private static final d b;
        private static final d c;
        private static final d d;
        private static final d e;
        private static final d f;

        static {
            m.a = new m();
            m.b = d.d("threads");
            m.c = d.d("exception");
            m.d = d.d("appExitInfo");
            m.e = d.d("signal");
            m.f = d.d("binaries");
        }

        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException {
            this.b(((com.google.firebase.crashlytics.internal.model.F.f.d.a.b)object0), ((f)object1));
        }

        public void b(com.google.firebase.crashlytics.internal.model.F.f.d.a.b f$f$d$a$b0, f f0) throws IOException {
            List list0 = f$f$d$a$b0.f();
            f0.q(m.b, list0);
            com.google.firebase.crashlytics.internal.model.F.f.d.a.b.c f$f$d$a$b$c0 = f$f$d$a$b0.d();
            f0.q(m.c, f$f$d$a$b$c0);
            com.google.firebase.crashlytics.internal.model.F.a f$a0 = f$f$d$a$b0.b();
            f0.q(m.d, f$a0);
            com.google.firebase.crashlytics.internal.model.F.f.d.a.b.d f$f$d$a$b$d0 = f$f$d$a$b0.e();
            f0.q(m.e, f$f$d$a$b$d0);
            List list1 = f$f$d$a$b0.c();
            f0.q(m.f, list1);
        }
    }

    static final class n implements e {
        static final n a;
        private static final d b;
        private static final d c;
        private static final d d;
        private static final d e;
        private static final d f;

        static {
            n.a = new n();
            n.b = d.d("type");
            n.c = d.d("reason");
            n.d = d.d("frames");
            n.e = d.d("causedBy");
            n.f = d.d("overflowCount");
        }

        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException {
            this.b(((com.google.firebase.crashlytics.internal.model.F.f.d.a.b.c)object0), ((f)object1));
        }

        public void b(com.google.firebase.crashlytics.internal.model.F.f.d.a.b.c f$f$d$a$b$c0, f f0) throws IOException {
            String s = f$f$d$a$b$c0.f();
            f0.q(n.b, s);
            String s1 = f$f$d$a$b$c0.e();
            f0.q(n.c, s1);
            List list0 = f$f$d$a$b$c0.c();
            f0.q(n.d, list0);
            com.google.firebase.crashlytics.internal.model.F.f.d.a.b.c f$f$d$a$b$c1 = f$f$d$a$b$c0.b();
            f0.q(n.e, f$f$d$a$b$c1);
            int v = f$f$d$a$b$c0.d();
            f0.j(n.f, v);
        }
    }

    static final class o implements e {
        static final o a;
        private static final d b;
        private static final d c;
        private static final d d;

        static {
            o.a = new o();
            o.b = d.d("name");
            o.c = d.d("code");
            o.d = d.d("address");
        }

        // 检测为 Lambda 实现
        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException [...]

        public void b(com.google.firebase.crashlytics.internal.model.F.f.d.a.b.d f$f$d$a$b$d0, f f0) throws IOException {
            String s = f$f$d$a$b$d0.d();
            f0.q(o.b, s);
            String s1 = f$f$d$a$b$d0.c();
            f0.q(o.c, s1);
            long v = f$f$d$a$b$d0.b();
            f0.i(o.d, v);
        }
    }

    static final class p implements e {
        static final p a;
        private static final d b;
        private static final d c;
        private static final d d;

        static {
            p.a = new p();
            p.b = d.d("name");
            p.c = d.d("importance");
            p.d = d.d("frames");
        }

        // 检测为 Lambda 实现
        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException [...]

        public void b(com.google.firebase.crashlytics.internal.model.F.f.d.a.b.e f$f$d$a$b$e0, f f0) throws IOException {
            String s = f$f$d$a$b$e0.d();
            f0.q(p.b, s);
            int v = f$f$d$a$b$e0.c();
            f0.j(p.c, v);
            List list0 = f$f$d$a$b$e0.b();
            f0.q(p.d, list0);
        }
    }

    static final class q implements e {
        static final q a;
        private static final d b;
        private static final d c;
        private static final d d;
        private static final d e;
        private static final d f;

        static {
            q.a = new q();
            q.b = d.d("pc");
            q.c = d.d("symbol");
            q.d = d.d("file");
            q.e = d.d("offset");
            q.f = d.d("importance");
        }

        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException {
            this.b(((com.google.firebase.crashlytics.internal.model.F.f.d.a.b.e.b)object0), ((f)object1));
        }

        public void b(com.google.firebase.crashlytics.internal.model.F.f.d.a.b.e.b f$f$d$a$b$e$b0, f f0) throws IOException {
            long v = f$f$d$a$b$e$b0.e();
            f0.i(q.b, v);
            String s = f$f$d$a$b$e$b0.f();
            f0.q(q.c, s);
            String s1 = f$f$d$a$b$e$b0.b();
            f0.q(q.d, s1);
            long v1 = f$f$d$a$b$e$b0.d();
            f0.i(q.e, v1);
            int v2 = f$f$d$a$b$e$b0.c();
            f0.j(q.f, v2);
        }
    }

    static final class r implements e {
        static final r a;
        private static final d b;
        private static final d c;
        private static final d d;
        private static final d e;

        static {
            r.a = new r();
            r.b = d.d("processName");
            r.c = d.d("pid");
            r.d = d.d("importance");
            r.e = d.d("defaultProcess");
        }

        // 检测为 Lambda 实现
        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException [...]

        public void b(com.google.firebase.crashlytics.internal.model.F.f.d.a.c f$f$d$a$c0, f f0) throws IOException {
            String s = f$f$d$a$c0.d();
            f0.q(r.b, s);
            int v = f$f$d$a$c0.c();
            f0.j(r.c, v);
            int v1 = f$f$d$a$c0.b();
            f0.j(r.d, v1);
            boolean z = f$f$d$a$c0.e();
            f0.h(r.e, z);
        }
    }

    static final class s implements e {
        static final s a;
        private static final d b;
        private static final d c;
        private static final d d;
        private static final d e;
        private static final d f;
        private static final d g;

        static {
            s.a = new s();
            s.b = d.d("batteryLevel");
            s.c = d.d("batteryVelocity");
            s.d = d.d("proximityOn");
            s.e = d.d("orientation");
            s.f = d.d("ramUsed");
            s.g = d.d("diskUsed");
        }

        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException {
            this.b(((com.google.firebase.crashlytics.internal.model.F.f.d.c)object0), ((f)object1));
        }

        public void b(com.google.firebase.crashlytics.internal.model.F.f.d.c f$f$d$c0, f f0) throws IOException {
            Double double0 = f$f$d$c0.b();
            f0.q(s.b, double0);
            int v = f$f$d$c0.c();
            f0.j(s.c, v);
            boolean z = f$f$d$c0.g();
            f0.h(s.d, z);
            int v1 = f$f$d$c0.e();
            f0.j(s.e, v1);
            long v2 = f$f$d$c0.f();
            f0.i(s.f, v2);
            long v3 = f$f$d$c0.d();
            f0.i(s.g, v3);
        }
    }

    static final class t implements e {
        static final t a;
        private static final d b;
        private static final d c;
        private static final d d;
        private static final d e;
        private static final d f;
        private static final d g;

        static {
            t.a = new t();
            t.b = d.d("timestamp");
            t.c = d.d("type");
            t.d = d.d("app");
            t.e = d.d("device");
            t.f = d.d("log");
            t.g = d.d("rollouts");
        }

        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException {
            this.b(((com.google.firebase.crashlytics.internal.model.F.f.d)object0), ((f)object1));
        }

        public void b(com.google.firebase.crashlytics.internal.model.F.f.d f$f$d0, f f0) throws IOException {
            long v = f$f$d0.f();
            f0.i(t.b, v);
            String s = f$f$d0.g();
            f0.q(t.c, s);
            com.google.firebase.crashlytics.internal.model.F.f.d.a f$f$d$a0 = f$f$d0.b();
            f0.q(t.d, f$f$d$a0);
            com.google.firebase.crashlytics.internal.model.F.f.d.c f$f$d$c0 = f$f$d0.c();
            f0.q(t.e, f$f$d$c0);
            com.google.firebase.crashlytics.internal.model.F.f.d.d f$f$d$d0 = f$f$d0.d();
            f0.q(t.f, f$f$d$d0);
            com.google.firebase.crashlytics.internal.model.F.f.d.f f$f$d$f0 = f$f$d0.e();
            f0.q(t.g, f$f$d$f0);
        }
    }

    static final class u implements e {
        static final u a;
        private static final d b;

        static {
            u.a = new u();
            u.b = d.d("content");
        }

        // 检测为 Lambda 实现
        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException [...]

        public void b(com.google.firebase.crashlytics.internal.model.F.f.d.d f$f$d$d0, f f0) throws IOException {
            String s = f$f$d$d0.b();
            f0.q(u.b, s);
        }
    }

    static final class v implements e {
        static final v a;
        private static final d b;
        private static final d c;
        private static final d d;
        private static final d e;

        static {
            v.a = new v();
            v.b = d.d("rolloutVariant");
            v.c = d.d("parameterKey");
            v.d = d.d("parameterValue");
            v.e = d.d("templateVersion");
        }

        // 检测为 Lambda 实现
        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException [...]

        public void b(com.google.firebase.crashlytics.internal.model.F.f.d.e f$f$d$e0, f f0) throws IOException {
            com.google.firebase.crashlytics.internal.model.F.f.d.e.b f$f$d$e$b0 = f$f$d$e0.d();
            f0.q(v.b, f$f$d$e$b0);
            String s = f$f$d$e0.b();
            f0.q(v.c, s);
            String s1 = f$f$d$e0.c();
            f0.q(v.d, s1);
            long v = f$f$d$e0.e();
            f0.i(v.e, v);
        }
    }

    static final class w implements e {
        static final w a;
        private static final d b;
        private static final d c;

        static {
            w.a = new w();
            w.b = d.d("rolloutId");
            w.c = d.d("variantId");
        }

        // 检测为 Lambda 实现
        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException [...]

        public void b(com.google.firebase.crashlytics.internal.model.F.f.d.e.b f$f$d$e$b0, f f0) throws IOException {
            String s = f$f$d$e$b0.b();
            f0.q(w.b, s);
            String s1 = f$f$d$e$b0.c();
            f0.q(w.c, s1);
        }
    }

    static final class x implements e {
        static final x a;
        private static final d b;

        static {
            x.a = new x();
            x.b = d.d("assignments");
        }

        // 检测为 Lambda 实现
        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException [...]

        public void b(com.google.firebase.crashlytics.internal.model.F.f.d.f f$f$d$f0, f f0) throws IOException {
            List list0 = f$f$d$f0.b();
            f0.q(x.b, list0);
        }
    }

    static final class y implements e {
        static final y a;
        private static final d b;
        private static final d c;
        private static final d d;
        private static final d e;

        static {
            y.a = new y();
            y.b = d.d("platform");
            y.c = d.d("version");
            y.d = d.d("buildVersion");
            y.e = d.d("jailbroken");
        }

        // 检测为 Lambda 实现
        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException [...]

        public void b(com.google.firebase.crashlytics.internal.model.F.f.e f$f$e0, f f0) throws IOException {
            int v = f$f$e0.c();
            f0.j(y.b, v);
            String s = f$f$e0.d();
            f0.q(y.c, s);
            String s1 = f$f$e0.b();
            f0.q(y.d, s1);
            boolean z = f$f$e0.e();
            f0.h(y.e, z);
        }
    }

    static final class z implements e {
        static final z a;
        private static final d b;

        static {
            z.a = new z();
            z.b = d.d("identifier");
        }

        // 检测为 Lambda 实现
        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException [...]

        public void b(com.google.firebase.crashlytics.internal.model.F.f.f f$f$f0, f f0) throws IOException {
            String s = f$f$f0.b();
            f0.q(z.b, s);
        }
    }

    public static final int a = 2;
    public static final d2.a b;

    static {
        a.b = new a();
    }

    @Override  // d2.a
    public void a(d2.b b0) {
        b0.b(F.class, com.google.firebase.crashlytics.internal.model.a.d.a);
        b0.b(com.google.firebase.crashlytics.internal.model.b.class, com.google.firebase.crashlytics.internal.model.a.d.a);
        b0.b(com.google.firebase.crashlytics.internal.model.F.f.class, j.a);
        b0.b(com.google.firebase.crashlytics.internal.model.h.class, j.a);
        b0.b(com.google.firebase.crashlytics.internal.model.F.f.a.class, g.a);
        b0.b(com.google.firebase.crashlytics.internal.model.i.class, g.a);
        b0.b(com.google.firebase.crashlytics.internal.model.F.f.a.b.class, (Object object0, Object object1) -> this.b(((com.google.firebase.crashlytics.internal.model.F.f.a.b)object0), ((f)object1)));
        b0.b(com.google.firebase.crashlytics.internal.model.j.class, (Object object0, Object object1) -> this.b(((com.google.firebase.crashlytics.internal.model.F.f.a.b)object0), ((f)object1)));
        b0.b(com.google.firebase.crashlytics.internal.model.F.f.f.class, (Object object0, Object object1) -> this.b(((com.google.firebase.crashlytics.internal.model.F.f.f)object0), ((f)object1)));
        b0.b(A.class, (Object object0, Object object1) -> this.b(((com.google.firebase.crashlytics.internal.model.F.f.f)object0), ((f)object1)));
        b0.b(com.google.firebase.crashlytics.internal.model.F.f.e.class, (Object object0, Object object1) -> this.b(((com.google.firebase.crashlytics.internal.model.F.f.e)object0), ((f)object1)));
        b0.b(com.google.firebase.crashlytics.internal.model.z.class, (Object object0, Object object1) -> this.b(((com.google.firebase.crashlytics.internal.model.F.f.e)object0), ((f)object1)));
        b0.b(com.google.firebase.crashlytics.internal.model.F.f.c.class, i.a);
        b0.b(com.google.firebase.crashlytics.internal.model.k.class, i.a);
        b0.b(com.google.firebase.crashlytics.internal.model.F.f.d.class, t.a);
        b0.b(com.google.firebase.crashlytics.internal.model.l.class, t.a);
        b0.b(com.google.firebase.crashlytics.internal.model.F.f.d.a.class, k.a);
        b0.b(com.google.firebase.crashlytics.internal.model.m.class, k.a);
        b0.b(com.google.firebase.crashlytics.internal.model.F.f.d.a.b.class, m.a);
        b0.b(com.google.firebase.crashlytics.internal.model.n.class, m.a);
        b0.b(com.google.firebase.crashlytics.internal.model.F.f.d.a.b.e.class, (Object object0, Object object1) -> this.b(((com.google.firebase.crashlytics.internal.model.F.f.d.a.b.e)object0), ((f)object1)));
        b0.b(com.google.firebase.crashlytics.internal.model.r.class, (Object object0, Object object1) -> this.b(((com.google.firebase.crashlytics.internal.model.F.f.d.a.b.e)object0), ((f)object1)));
        b0.b(com.google.firebase.crashlytics.internal.model.F.f.d.a.b.e.b.class, q.a);
        b0.b(com.google.firebase.crashlytics.internal.model.s.class, q.a);
        b0.b(com.google.firebase.crashlytics.internal.model.F.f.d.a.b.c.class, n.a);
        b0.b(com.google.firebase.crashlytics.internal.model.p.class, n.a);
        b0.b(com.google.firebase.crashlytics.internal.model.F.a.class, b.a);
        b0.b(com.google.firebase.crashlytics.internal.model.c.class, b.a);
        b0.b(com.google.firebase.crashlytics.internal.model.F.a.a.class, (Object object0, Object object1) -> this.b(((com.google.firebase.crashlytics.internal.model.F.a.a)object0), ((f)object1)));
        b0.b(com.google.firebase.crashlytics.internal.model.d.class, (Object object0, Object object1) -> this.b(((com.google.firebase.crashlytics.internal.model.F.a.a)object0), ((f)object1)));
        b0.b(com.google.firebase.crashlytics.internal.model.F.f.d.a.b.d.class, (Object object0, Object object1) -> this.b(((com.google.firebase.crashlytics.internal.model.F.f.d.a.b.d)object0), ((f)object1)));
        b0.b(com.google.firebase.crashlytics.internal.model.q.class, (Object object0, Object object1) -> this.b(((com.google.firebase.crashlytics.internal.model.F.f.d.a.b.d)object0), ((f)object1)));
        b0.b(com.google.firebase.crashlytics.internal.model.F.f.d.a.b.a.class, (Object object0, Object object1) -> this.b(((com.google.firebase.crashlytics.internal.model.F.f.d.a.b.a)object0), ((f)object1)));
        b0.b(com.google.firebase.crashlytics.internal.model.o.class, (Object object0, Object object1) -> this.b(((com.google.firebase.crashlytics.internal.model.F.f.d.a.b.a)object0), ((f)object1)));
        b0.b(com.google.firebase.crashlytics.internal.model.F.d.class, (Object object0, Object object1) -> this.b(((com.google.firebase.crashlytics.internal.model.F.d)object0), ((f)object1)));
        b0.b(com.google.firebase.crashlytics.internal.model.e.class, (Object object0, Object object1) -> this.b(((com.google.firebase.crashlytics.internal.model.F.d)object0), ((f)object1)));
        b0.b(com.google.firebase.crashlytics.internal.model.F.f.d.a.c.class, (Object object0, Object object1) -> this.b(((com.google.firebase.crashlytics.internal.model.F.f.d.a.c)object0), ((f)object1)));
        b0.b(com.google.firebase.crashlytics.internal.model.t.class, (Object object0, Object object1) -> this.b(((com.google.firebase.crashlytics.internal.model.F.f.d.a.c)object0), ((f)object1)));
        b0.b(com.google.firebase.crashlytics.internal.model.F.f.d.c.class, s.a);
        b0.b(com.google.firebase.crashlytics.internal.model.u.class, s.a);
        b0.b(com.google.firebase.crashlytics.internal.model.F.f.d.d.class, (Object object0, Object object1) -> this.b(((com.google.firebase.crashlytics.internal.model.F.f.d.d)object0), ((f)object1)));
        b0.b(com.google.firebase.crashlytics.internal.model.v.class, (Object object0, Object object1) -> this.b(((com.google.firebase.crashlytics.internal.model.F.f.d.d)object0), ((f)object1)));
        b0.b(com.google.firebase.crashlytics.internal.model.F.f.d.f.class, (Object object0, Object object1) -> this.b(((com.google.firebase.crashlytics.internal.model.F.f.d.f)object0), ((f)object1)));
        b0.b(com.google.firebase.crashlytics.internal.model.y.class, (Object object0, Object object1) -> this.b(((com.google.firebase.crashlytics.internal.model.F.f.d.f)object0), ((f)object1)));
        b0.b(com.google.firebase.crashlytics.internal.model.F.f.d.e.class, (Object object0, Object object1) -> this.b(((com.google.firebase.crashlytics.internal.model.F.f.d.e)object0), ((f)object1)));
        b0.b(com.google.firebase.crashlytics.internal.model.w.class, (Object object0, Object object1) -> this.b(((com.google.firebase.crashlytics.internal.model.F.f.d.e)object0), ((f)object1)));
        b0.b(com.google.firebase.crashlytics.internal.model.F.f.d.e.b.class, (Object object0, Object object1) -> this.b(((com.google.firebase.crashlytics.internal.model.F.f.d.e.b)object0), ((f)object1)));
        b0.b(com.google.firebase.crashlytics.internal.model.x.class, (Object object0, Object object1) -> this.b(((com.google.firebase.crashlytics.internal.model.F.f.d.e.b)object0), ((f)object1)));
        b0.b(com.google.firebase.crashlytics.internal.model.F.e.class, (Object object0, Object object1) -> this.b(((com.google.firebase.crashlytics.internal.model.F.e)object0), ((f)object1)));
        b0.b(com.google.firebase.crashlytics.internal.model.f.class, (Object object0, Object object1) -> this.b(((com.google.firebase.crashlytics.internal.model.F.e)object0), ((f)object1)));
        b0.b(com.google.firebase.crashlytics.internal.model.F.e.b.class, (Object object0, Object object1) -> this.b(((com.google.firebase.crashlytics.internal.model.F.e.b)object0), ((f)object1)));
        b0.b(com.google.firebase.crashlytics.internal.model.g.class, (Object object0, Object object1) -> this.b(((com.google.firebase.crashlytics.internal.model.F.e.b)object0), ((f)object1)));
    }
}

