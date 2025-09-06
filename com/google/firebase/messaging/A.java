package com.google.firebase.messaging;

import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;
import com.google.firebase.encoders.f;
import java.io.IOException;

public final class a implements d2.a {
    static final class com.google.firebase.messaging.a.a implements e {
        static final com.google.firebase.messaging.a.a a;
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
        private static final d n;
        private static final d o;
        private static final d p;

        static {
            com.google.firebase.messaging.a.a.a = new com.google.firebase.messaging.a.a();
            com.google.firebase.messaging.a.a.b = d.a("projectNumber").b(com.google.firebase.encoders.proto.a.b().d(1).a()).a();
            com.google.firebase.messaging.a.a.c = d.a("messageId").b(com.google.firebase.encoders.proto.a.b().d(2).a()).a();
            com.google.firebase.messaging.a.a.d = d.a("instanceId").b(com.google.firebase.encoders.proto.a.b().d(3).a()).a();
            com.google.firebase.messaging.a.a.e = d.a("messageType").b(com.google.firebase.encoders.proto.a.b().d(4).a()).a();
            com.google.firebase.messaging.a.a.f = d.a("sdkPlatform").b(com.google.firebase.encoders.proto.a.b().d(5).a()).a();
            com.google.firebase.messaging.a.a.g = d.a("packageName").b(com.google.firebase.encoders.proto.a.b().d(6).a()).a();
            com.google.firebase.messaging.a.a.h = d.a("collapseKey").b(com.google.firebase.encoders.proto.a.b().d(7).a()).a();
            com.google.firebase.messaging.a.a.i = d.a("priority").b(com.google.firebase.encoders.proto.a.b().d(8).a()).a();
            com.google.firebase.messaging.a.a.j = d.a("ttl").b(com.google.firebase.encoders.proto.a.b().d(9).a()).a();
            com.google.firebase.messaging.a.a.k = d.a("topic").b(com.google.firebase.encoders.proto.a.b().d(10).a()).a();
            com.google.firebase.messaging.a.a.l = d.a("bulkId").b(com.google.firebase.encoders.proto.a.b().d(11).a()).a();
            com.google.firebase.messaging.a.a.m = d.a("event").b(com.google.firebase.encoders.proto.a.b().d(12).a()).a();
            com.google.firebase.messaging.a.a.n = d.a("analyticsLabel").b(com.google.firebase.encoders.proto.a.b().d(13).a()).a();
            com.google.firebase.messaging.a.a.o = d.a("campaignId").b(com.google.firebase.encoders.proto.a.b().d(14).a()).a();
            com.google.firebase.messaging.a.a.p = d.a("composerLabel").b(com.google.firebase.encoders.proto.a.b().d(15).a()).a();
        }

        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException {
            this.b(((com.google.firebase.messaging.reporting.a)object0), ((f)object1));
        }

        public void b(com.google.firebase.messaging.reporting.a a0, f f0) throws IOException {
            f0.i(com.google.firebase.messaging.a.a.b, a0.m());
            f0.q(com.google.firebase.messaging.a.a.c, a0.i());
            f0.q(com.google.firebase.messaging.a.a.d, a0.h());
            f0.q(com.google.firebase.messaging.a.a.e, a0.j());
            f0.q(com.google.firebase.messaging.a.a.f, a0.n());
            f0.q(com.google.firebase.messaging.a.a.g, a0.k());
            f0.q(com.google.firebase.messaging.a.a.h, a0.d());
            f0.j(com.google.firebase.messaging.a.a.i, a0.l());
            f0.j(com.google.firebase.messaging.a.a.j, a0.p());
            f0.q(com.google.firebase.messaging.a.a.k, a0.o());
            f0.i(com.google.firebase.messaging.a.a.l, a0.b());
            f0.q(com.google.firebase.messaging.a.a.m, a0.g());
            f0.q(com.google.firebase.messaging.a.a.n, a0.a());
            f0.i(com.google.firebase.messaging.a.a.o, a0.c());
            f0.q(com.google.firebase.messaging.a.a.p, a0.e());
        }
    }

    static final class b implements e {
        static final b a;
        private static final d b;

        static {
            b.a = new b();
            b.b = d.a("messagingClientEvent").b(com.google.firebase.encoders.proto.a.b().d(1).a()).a();
        }

        // 检测为 Lambda 实现
        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException [...]

        public void b(com.google.firebase.messaging.reporting.b b0, f f0) throws IOException {
            com.google.firebase.messaging.reporting.a a0 = b0.c();
            f0.q(b.b, a0);
        }
    }

    static final class c implements e {
        static final c a;
        private static final d b;

        static {
            c.a = new c();
            c.b = d.d("messagingClientEventExtension");
        }

        // 检测为 Lambda 实现
        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException [...]

        public void b(T t0, f f0) throws IOException {
            com.google.firebase.messaging.reporting.b b0 = t0.c();
            f0.q(c.b, b0);
        }
    }

    public static final int a = 2;
    public static final d2.a b;

    static {
        a.b = new a();
    }

    @Override  // d2.a
    public void a(d2.b b0) {
        b0.b(T.class, (Object object0, Object object1) -> this.b(((T)object0), ((f)object1)));
        b0.b(com.google.firebase.messaging.reporting.b.class, (Object object0, Object object1) -> this.b(((com.google.firebase.messaging.reporting.b)object0), ((f)object1)));
        b0.b(com.google.firebase.messaging.reporting.a.class, com.google.firebase.messaging.a.a.a);
    }
}

