package com.google.firebase.remoteconfig.interop.rollouts;

import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;
import com.google.firebase.encoders.f;
import d2.b;
import java.io.IOException;

public final class a implements d2.a {
    static final class com.google.firebase.remoteconfig.interop.rollouts.a.a implements e {
        static final com.google.firebase.remoteconfig.interop.rollouts.a.a a;
        private static final d b;
        private static final d c;
        private static final d d;
        private static final d e;
        private static final d f;

        static {
            com.google.firebase.remoteconfig.interop.rollouts.a.a.a = new com.google.firebase.remoteconfig.interop.rollouts.a.a();
            com.google.firebase.remoteconfig.interop.rollouts.a.a.b = d.d("rolloutId");
            com.google.firebase.remoteconfig.interop.rollouts.a.a.c = d.d("variantId");
            com.google.firebase.remoteconfig.interop.rollouts.a.a.d = d.d("parameterKey");
            com.google.firebase.remoteconfig.interop.rollouts.a.a.e = d.d("parameterValue");
            com.google.firebase.remoteconfig.interop.rollouts.a.a.f = d.d("templateVersion");
        }

        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException {
            this.b(((com.google.firebase.remoteconfig.interop.rollouts.d)object0), ((f)object1));
        }

        public void b(com.google.firebase.remoteconfig.interop.rollouts.d d0, f f0) throws IOException {
            String s = d0.f();
            f0.q(com.google.firebase.remoteconfig.interop.rollouts.a.a.b, s);
            String s1 = d0.h();
            f0.q(com.google.firebase.remoteconfig.interop.rollouts.a.a.c, s1);
            String s2 = d0.d();
            f0.q(com.google.firebase.remoteconfig.interop.rollouts.a.a.d, s2);
            String s3 = d0.e();
            f0.q(com.google.firebase.remoteconfig.interop.rollouts.a.a.e, s3);
            long v = d0.g();
            f0.i(com.google.firebase.remoteconfig.interop.rollouts.a.a.f, v);
        }
    }

    public static final int a = 2;
    public static final d2.a b;

    static {
        a.b = new a();
    }

    @Override  // d2.a
    public void a(b b0) {
        b0.b(com.google.firebase.remoteconfig.interop.rollouts.d.class, com.google.firebase.remoteconfig.interop.rollouts.a.a.a);
        b0.b(com.google.firebase.remoteconfig.interop.rollouts.b.class, com.google.firebase.remoteconfig.interop.rollouts.a.a.a);
    }
}

