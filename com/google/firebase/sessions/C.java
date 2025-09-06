package com.google.firebase.sessions;

import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;
import com.google.firebase.encoders.f;
import d2.a;
import java.io.IOException;

public final class c implements a {
    static final class com.google.firebase.sessions.c.a implements e {
        static final com.google.firebase.sessions.c.a a;
        private static final d b;
        private static final d c;
        private static final d d;
        private static final d e;
        private static final d f;
        private static final d g;

        static {
            com.google.firebase.sessions.c.a.a = new com.google.firebase.sessions.c.a();
            com.google.firebase.sessions.c.a.b = d.d("packageName");
            com.google.firebase.sessions.c.a.c = d.d("versionName");
            com.google.firebase.sessions.c.a.d = d.d("appBuildVersion");
            com.google.firebase.sessions.c.a.e = d.d("deviceManufacturer");
            com.google.firebase.sessions.c.a.f = d.d("currentProcessDetails");
            com.google.firebase.sessions.c.a.g = d.d("appProcessDetails");
        }

        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException {
            this.b(((com.google.firebase.sessions.a)object0), ((f)object1));
        }

        public void b(com.google.firebase.sessions.a a0, f f0) throws IOException {
            f0.q(com.google.firebase.sessions.c.a.b, a0.m());
            f0.q(com.google.firebase.sessions.c.a.c, a0.n());
            f0.q(com.google.firebase.sessions.c.a.d, a0.i());
            f0.q(com.google.firebase.sessions.c.a.e, a0.l());
            f0.q(com.google.firebase.sessions.c.a.f, a0.k());
            f0.q(com.google.firebase.sessions.c.a.g, a0.j());
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

        static {
            b.a = new b();
            b.b = d.d("appId");
            b.c = d.d("deviceModel");
            b.d = d.d("sessionSdkVersion");
            b.e = d.d("osVersion");
            b.f = d.d("logEnvironment");
            b.g = d.d("androidAppInfo");
        }

        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException {
            this.b(((com.google.firebase.sessions.b)object0), ((f)object1));
        }

        public void b(com.google.firebase.sessions.b b0, f f0) throws IOException {
            f0.q(b.b, b0.j());
            f0.q(b.c, b0.k());
            f0.q(b.d, b0.n());
            f0.q(b.e, b0.m());
            f0.q(b.f, b0.l());
            f0.q(b.g, b0.i());
        }
    }

    static final class com.google.firebase.sessions.c.c implements e {
        static final com.google.firebase.sessions.c.c a;
        private static final d b;
        private static final d c;
        private static final d d;

        static {
            com.google.firebase.sessions.c.c.a = new com.google.firebase.sessions.c.c();
            com.google.firebase.sessions.c.c.b = d.d("performance");
            com.google.firebase.sessions.c.c.c = d.d("crashlytics");
            com.google.firebase.sessions.c.c.d = d.d("sessionSamplingRate");
        }

        // 检测为 Lambda 实现
        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException [...]

        public void b(com.google.firebase.sessions.f f0, f f1) throws IOException {
            f1.q(com.google.firebase.sessions.c.c.b, f0.g());
            f1.q(com.google.firebase.sessions.c.c.c, f0.f());
            f1.l(com.google.firebase.sessions.c.c.d, f0.h());
        }
    }

    static final class com.google.firebase.sessions.c.d implements e {
        static final com.google.firebase.sessions.c.d a;
        private static final d b;
        private static final d c;
        private static final d d;
        private static final d e;

        static {
            com.google.firebase.sessions.c.d.a = new com.google.firebase.sessions.c.d();
            com.google.firebase.sessions.c.d.b = d.d("processName");
            com.google.firebase.sessions.c.d.c = d.d("pid");
            com.google.firebase.sessions.c.d.d = d.d("importance");
            com.google.firebase.sessions.c.d.e = d.d("defaultProcess");
        }

        // 检测为 Lambda 实现
        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException [...]

        public void b(v v0, f f0) throws IOException {
            f0.q(com.google.firebase.sessions.c.d.b, v0.i());
            f0.j(com.google.firebase.sessions.c.d.c, v0.h());
            f0.j(com.google.firebase.sessions.c.d.d, v0.g());
            f0.h(com.google.firebase.sessions.c.d.e, v0.j());
        }
    }

    static final class com.google.firebase.sessions.c.e implements e {
        static final com.google.firebase.sessions.c.e a;
        private static final d b;
        private static final d c;
        private static final d d;

        static {
            com.google.firebase.sessions.c.e.a = new com.google.firebase.sessions.c.e();
            com.google.firebase.sessions.c.e.b = d.d("eventType");
            com.google.firebase.sessions.c.e.c = d.d("sessionData");
            com.google.firebase.sessions.c.e.d = d.d("applicationInfo");
        }

        // 检测为 Lambda 实现
        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException [...]

        public void b(C c0, f f0) throws IOException {
            f0.q(com.google.firebase.sessions.c.e.b, c0.g());
            f0.q(com.google.firebase.sessions.c.e.c, c0.h());
            f0.q(com.google.firebase.sessions.c.e.d, c0.f());
        }
    }

    static final class com.google.firebase.sessions.c.f implements e {
        static final com.google.firebase.sessions.c.f a;
        private static final d b;
        private static final d c;
        private static final d d;
        private static final d e;
        private static final d f;
        private static final d g;
        private static final d h;

        static {
            com.google.firebase.sessions.c.f.a = new com.google.firebase.sessions.c.f();
            com.google.firebase.sessions.c.f.b = d.d("sessionId");
            com.google.firebase.sessions.c.f.c = d.d("firstSessionId");
            com.google.firebase.sessions.c.f.d = d.d("sessionIndex");
            com.google.firebase.sessions.c.f.e = d.d("eventTimestampUs");
            com.google.firebase.sessions.c.f.f = d.d("dataCollectionStatus");
            com.google.firebase.sessions.c.f.g = d.d("firebaseInstallationId");
            com.google.firebase.sessions.c.f.h = d.d("firebaseAuthenticationToken");
        }

        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException {
            this.b(((H)object0), ((f)object1));
        }

        public void b(H h0, f f0) throws IOException {
            f0.q(com.google.firebase.sessions.c.f.b, h0.o());
            f0.q(com.google.firebase.sessions.c.f.c, h0.n());
            f0.j(com.google.firebase.sessions.c.f.d, h0.p());
            f0.i(com.google.firebase.sessions.c.f.e, h0.k());
            f0.q(com.google.firebase.sessions.c.f.f, h0.j());
            f0.q(com.google.firebase.sessions.c.f.g, h0.m());
            f0.q(com.google.firebase.sessions.c.f.h, h0.l());
        }
    }

    public static final int a = 2;
    public static final a b;

    static {
        c.b = new c();
    }

    @Override  // d2.a
    public void a(d2.b b0) {
        b0.b(C.class, (Object object0, Object object1) -> this.b(((C)object0), ((f)object1)));
        b0.b(H.class, com.google.firebase.sessions.c.f.a);
        b0.b(com.google.firebase.sessions.f.class, (Object object0, Object object1) -> this.b(((com.google.firebase.sessions.f)object0), ((f)object1)));
        b0.b(com.google.firebase.sessions.b.class, b.a);
        b0.b(com.google.firebase.sessions.a.class, com.google.firebase.sessions.c.a.a);
        b0.b(v.class, (Object object0, Object object1) -> this.b(((v)object0), ((f)object1)));
    }
}

