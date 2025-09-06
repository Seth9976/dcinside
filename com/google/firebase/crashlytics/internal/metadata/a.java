package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;
import com.google.firebase.encoders.f;
import d2.b;
import java.io.IOException;

public final class a implements d2.a {
    static final class com.google.firebase.crashlytics.internal.metadata.a.a implements e {
        static final com.google.firebase.crashlytics.internal.metadata.a.a a;
        private static final d b;
        private static final d c;
        private static final d d;
        private static final d e;
        private static final d f;

        static {
            com.google.firebase.crashlytics.internal.metadata.a.a.a = new com.google.firebase.crashlytics.internal.metadata.a.a();
            com.google.firebase.crashlytics.internal.metadata.a.a.b = d.d("rolloutId");
            com.google.firebase.crashlytics.internal.metadata.a.a.c = d.d("parameterKey");
            com.google.firebase.crashlytics.internal.metadata.a.a.d = d.d("parameterValue");
            com.google.firebase.crashlytics.internal.metadata.a.a.e = d.d("variantId");
            com.google.firebase.crashlytics.internal.metadata.a.a.f = d.d("templateVersion");
        }

        @Override  // com.google.firebase.encoders.b
        public void a(Object object0, Object object1) throws IOException {
            this.b(((i)object0), ((f)object1));
        }

        public void b(i i0, f f0) throws IOException {
            String s = i0.e();
            f0.q(com.google.firebase.crashlytics.internal.metadata.a.a.b, s);
            String s1 = i0.c();
            f0.q(com.google.firebase.crashlytics.internal.metadata.a.a.c, s1);
            String s2 = i0.d();
            f0.q(com.google.firebase.crashlytics.internal.metadata.a.a.d, s2);
            String s3 = i0.g();
            f0.q(com.google.firebase.crashlytics.internal.metadata.a.a.e, s3);
            long v = i0.f();
            f0.i(com.google.firebase.crashlytics.internal.metadata.a.a.f, v);
        }
    }

    public static final int a = 2;
    public static final d2.a b;

    static {
        a.b = new a();
    }

    @Override  // d2.a
    public void a(b b0) {
        b0.b(i.class, com.google.firebase.crashlytics.internal.metadata.a.a.a);
        b0.b(com.google.firebase.crashlytics.internal.metadata.b.class, com.google.firebase.crashlytics.internal.metadata.a.a.a);
    }
}

