package com.facebook.imagepipeline.core;

import android.util.Log;
import com.facebook.common.references.a.d;
import com.facebook.common.references.i;
import java.io.Closeable;
import k1.n.a;
import k1.n;
import k1.u;
import o3.h;

@n(a.a)
public class com.facebook.imagepipeline.core.a {
    private final d a;

    public com.facebook.imagepipeline.core.a(b1.a a0) {
        class com.facebook.imagepipeline.core.a.a implements d {
            final b1.a a;
            final com.facebook.imagepipeline.core.a b;

            com.facebook.imagepipeline.core.a.a(b1.a a1) {
                this.a = a1;
                super();
            }

            @Override  // com.facebook.common.references.a$d
            public boolean a() {
                return this.a.c();
            }

            @Override  // com.facebook.common.references.a$d
            public void b(i i0, @h Throwable throwable0) {
                this.a.b(i0, throwable0);
                Object object0 = i0.h();
                x0.a.q0("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", new Object[]{System.identityHashCode(this), System.identityHashCode(i0), (object0 == null ? "<value is null>" : object0.getClass().getName()), com.facebook.imagepipeline.core.a.d(throwable0)});
            }
        }

        this.a = new com.facebook.imagepipeline.core.a.a(this, a0);
    }

    public com.facebook.common.references.a b(@u @h Closeable closeable0) {
        return com.facebook.common.references.a.v(closeable0, this.a);
    }

    public com.facebook.common.references.a c(Object object0, com.facebook.common.references.h h0) {
        return com.facebook.common.references.a.x(object0, h0, this.a);
    }

    private static String d(@h Throwable throwable0) {
        return throwable0 == null ? "" : Log.getStackTraceString(throwable0);
    }
}

