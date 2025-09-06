package com.facebook.common.references;

import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class b extends com.facebook.common.references.a {
    private static final String m = "DefaultCloseableReference";

    private b(i i0, @h d a$d0, @h Throwable throwable0) {
        super(i0, a$d0, throwable0);
    }

    b(Object object0, com.facebook.common.references.h h0, d a$d0, @h Throwable throwable0) {
        super(object0, h0, a$d0, throwable0, true);
    }

    @Override  // com.facebook.common.references.a
    public com.facebook.common.references.a b() {
        com.facebook.common.internal.n.o(this.q());
        return this.d == null ? new b(this.b, this.c, null) : new b(this.b, this.c, new Throwable());
    }

    @Override  // com.facebook.common.references.a
    public Object clone() throws CloneNotSupportedException {
        return this.b();
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            __monitor_enter(this);
            if(!this.a) {
                __monitor_exit(this);
                Object object0 = this.b.h();
                x0.a.q0("DefaultCloseableReference", "Finalized without closing: %x %x (type = %s)", new Object[]{System.identityHashCode(this), System.identityHashCode(this.b), (object0 == null ? null : object0.getClass().getName())});
                d a$d0 = this.c;
                if(a$d0 != null) {
                    a$d0.b(this.b, this.d);
                }
                this.close();
                goto label_9;
            }
            goto label_11;
        }
        catch(Throwable throwable0) {
            super.finalize();
            throw throwable0;
        }
    label_9:
        super.finalize();
        return;
        try {
        label_11:
            __monitor_exit(this);
        }
        catch(Throwable throwable0) {
            super.finalize();
            throw throwable0;
        }
        super.finalize();
    }
}

