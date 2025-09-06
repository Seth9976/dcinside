package com.google.android.datatransport.runtime;

import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;
import com.google.firebase.encoders.f;
import java.io.IOException;

public final class a implements d2.a {
    static final class com.google.android.datatransport.runtime.a.a implements e {
        static final com.google.android.datatransport.runtime.a.a a;
        private static final d b;
        private static final d c;
        private static final d d;
        private static final d e;

        static {
            com.google.android.datatransport.runtime.a.a.a = new com.google.android.datatransport.runtime.a.a();
            com.google.android.datatransport.runtime.a.a.b = d.a("window").b(com.google.firebase.encoders.proto.a.b().d(1).a()).a();
            com.google.android.datatransport.runtime.a.a.c = d.a("logSourceMetrics").b(com.google.firebase.encoders.proto.a.b().d(2).a()).a();
            com.google.android.datatransport.runtime.a.a.d = d.a("globalMetrics").b(com.google.firebase.encoders.proto.a.b().d(3).a()).a();
            com.google.android.datatransport.runtime.a.a.e = d.a("appNamespace").b(com.google.firebase.encoders.proto.a.b().d(4).a()).a();
        }

        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException {
            this.b(((com.google.android.datatransport.runtime.firebase.transport.a)object0), ((f)object1));
        }

        public void b(com.google.android.datatransport.runtime.firebase.transport.a a0, f f0) throws IOException {
            f0.q(com.google.android.datatransport.runtime.a.a.b, a0.g());
            f0.q(com.google.android.datatransport.runtime.a.a.c, a0.e());
            f0.q(com.google.android.datatransport.runtime.a.a.d, a0.d());
            f0.q(com.google.android.datatransport.runtime.a.a.e, a0.a());
        }
    }

    static final class b implements e {
        static final b a;
        private static final d b;

        static {
            b.a = new b();
            b.b = d.a("storageMetrics").b(com.google.firebase.encoders.proto.a.b().d(1).a()).a();
        }

        // 检测为 Lambda 实现
        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException [...]

        public void b(com.google.android.datatransport.runtime.firebase.transport.b b0, f f0) throws IOException {
            com.google.android.datatransport.runtime.firebase.transport.e e0 = b0.c();
            f0.q(b.b, e0);
        }
    }

    static final class c implements e {
        static final c a;
        private static final d b;
        private static final d c;

        static {
            c.a = new c();
            c.b = d.a("eventsDroppedCount").b(com.google.firebase.encoders.proto.a.b().d(1).a()).a();
            c.c = d.a("reason").b(com.google.firebase.encoders.proto.a.b().d(3).a()).a();
        }

        // 检测为 Lambda 实现
        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException [...]

        public void b(com.google.android.datatransport.runtime.firebase.transport.c c0, f f0) throws IOException {
            f0.i(c.b, c0.b());
            f0.q(c.c, c0.c());
        }
    }

    static final class com.google.android.datatransport.runtime.a.d implements e {
        static final com.google.android.datatransport.runtime.a.d a;
        private static final d b;
        private static final d c;

        static {
            com.google.android.datatransport.runtime.a.d.a = new com.google.android.datatransport.runtime.a.d();
            com.google.android.datatransport.runtime.a.d.b = d.a("logSource").b(com.google.firebase.encoders.proto.a.b().d(1).a()).a();
            com.google.android.datatransport.runtime.a.d.c = d.a("logEventDropped").b(com.google.firebase.encoders.proto.a.b().d(2).a()).a();
        }

        // 检测为 Lambda 实现
        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException [...]

        public void b(com.google.android.datatransport.runtime.firebase.transport.d d0, f f0) throws IOException {
            f0.q(com.google.android.datatransport.runtime.a.d.b, d0.c());
            f0.q(com.google.android.datatransport.runtime.a.d.c, d0.b());
        }
    }

    static final class com.google.android.datatransport.runtime.a.e implements e {
        static final com.google.android.datatransport.runtime.a.e a;
        private static final d b;

        static {
            com.google.android.datatransport.runtime.a.e.a = new com.google.android.datatransport.runtime.a.e();
            com.google.android.datatransport.runtime.a.e.b = d.d("clientMetrics");
        }

        // 检测为 Lambda 实现
        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException [...]

        public void b(n n0, f f0) throws IOException {
            com.google.android.datatransport.runtime.firebase.transport.a a0 = n0.c();
            f0.q(com.google.android.datatransport.runtime.a.e.b, a0);
        }
    }

    static final class com.google.android.datatransport.runtime.a.f implements e {
        static final com.google.android.datatransport.runtime.a.f a;
        private static final d b;
        private static final d c;

        static {
            com.google.android.datatransport.runtime.a.f.a = new com.google.android.datatransport.runtime.a.f();
            com.google.android.datatransport.runtime.a.f.b = d.a("currentCacheSizeBytes").b(com.google.firebase.encoders.proto.a.b().d(1).a()).a();
            com.google.android.datatransport.runtime.a.f.c = d.a("maxCacheSizeBytes").b(com.google.firebase.encoders.proto.a.b().d(2).a()).a();
        }

        // 检测为 Lambda 实现
        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException [...]

        public void b(com.google.android.datatransport.runtime.firebase.transport.e e0, f f0) throws IOException {
            f0.i(com.google.android.datatransport.runtime.a.f.b, e0.a());
            f0.i(com.google.android.datatransport.runtime.a.f.c, e0.c());
        }
    }

    static final class g implements e {
        static final g a;
        private static final d b;
        private static final d c;

        static {
            g.a = new g();
            g.b = d.a("startMs").b(com.google.firebase.encoders.proto.a.b().d(1).a()).a();
            g.c = d.a("endMs").b(com.google.firebase.encoders.proto.a.b().d(2).a()).a();
        }

        // 检测为 Lambda 实现
        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException [...]

        public void b(com.google.android.datatransport.runtime.firebase.transport.f f0, f f1) throws IOException {
            f1.i(g.b, f0.c());
            f1.i(g.c, f0.b());
        }
    }

    public static final int a = 2;
    public static final d2.a b;

    static {
        a.b = new a();
    }

    @Override  // d2.a
    public void a(d2.b b0) {
        b0.b(n.class, (Object object0, Object object1) -> this.b(((n)object0), ((f)object1)));
        b0.b(com.google.android.datatransport.runtime.firebase.transport.a.class, com.google.android.datatransport.runtime.a.a.a);
        b0.b(com.google.android.datatransport.runtime.firebase.transport.f.class, (Object object0, Object object1) -> this.b(((com.google.android.datatransport.runtime.firebase.transport.f)object0), ((f)object1)));
        b0.b(com.google.android.datatransport.runtime.firebase.transport.d.class, (Object object0, Object object1) -> this.b(((com.google.android.datatransport.runtime.firebase.transport.d)object0), ((f)object1)));
        b0.b(com.google.android.datatransport.runtime.firebase.transport.c.class, (Object object0, Object object1) -> this.b(((com.google.android.datatransport.runtime.firebase.transport.c)object0), ((f)object1)));
        b0.b(com.google.android.datatransport.runtime.firebase.transport.b.class, (Object object0, Object object1) -> this.b(((com.google.android.datatransport.runtime.firebase.transport.b)object0), ((f)object1)));
        b0.b(com.google.android.datatransport.runtime.firebase.transport.e.class, (Object object0, Object object1) -> this.b(((com.google.android.datatransport.runtime.firebase.transport.e)object0), ((f)object1)));
    }
}

