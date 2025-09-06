package com.facebook.common.references;

import k1.n.a;
import k1.n;

@n(a.a)
public class c extends com.facebook.common.references.a {
    private static final String m = "FinalizerCloseableReference";

    c(Object object0, h h0, d a$d0, @o3.h Throwable throwable0) {
        super(object0, h0, a$d0, throwable0, true);
    }

    @Override  // com.facebook.common.references.a
    public com.facebook.common.references.a b() [...] // Inlined contents

    @Override  // com.facebook.common.references.a
    public Object clone() throws CloneNotSupportedException {
        return this;
    }

    @Override  // com.facebook.common.references.a
    public void close() {
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            synchronized(this) {
                if(this.a) {
                    return;
                }
            }
            Object object0 = this.b.h();
            x0.a.q0("FinalizerCloseableReference", "Finalized without closing: %x %x (type = %s)", new Object[]{System.identityHashCode(this), System.identityHashCode(this.b), (object0 == null ? null : object0.getClass().getName())});
            this.b.e();
        }
        finally {
            super.finalize();
        }
    }
}

