package rx.internal.operators;

import java.util.Arrays;
import rx.exceptions.c;
import rx.functions.b;
import rx.functions.o;
import rx.functions.p;
import rx.k.t;
import rx.k;
import rx.m;

public final class a2 implements t {
    final o a;
    final p b;
    final b c;
    final boolean d;

    public a2(o o0, p p0, b b0, boolean z) {
        this.a = o0;
        this.b = p0;
        this.c = b0;
        this.d = z;
    }

    public void a(m m0) {
        class a extends m {
            final Object b;
            final m c;
            final a2 d;

            a(Object object0, m m0) {
                this.b = object0;
                this.c = m0;
                super();
            }

            @Override  // rx.m
            public void e(Object object0) {
                a2 a20 = a2.this;
                if(a20.d) {
                    try {
                        a20.c.b(this.b);
                    }
                    catch(Throwable throwable0) {
                        c.e(throwable0);
                        this.c.onError(throwable0);
                        return;
                    }
                }
                this.c.e(object0);
                a2 a21 = a2.this;
                if(!a21.d) {
                    try {
                        a21.c.b(this.b);
                    }
                    catch(Throwable throwable1) {
                        c.e(throwable1);
                        rx.plugins.c.I(throwable1);
                    }
                }
            }

            @Override  // rx.m
            public void onError(Throwable throwable0) {
                a2.this.c(this.c, this.b, throwable0);
            }
        }

        k k0;
        Object object0;
        try {
            object0 = this.a.call();
        }
        catch(Throwable throwable0) {
            c.e(throwable0);
            m0.onError(throwable0);
            return;
        }
        try {
            k0 = (k)this.b.b(object0);
        }
        catch(Throwable throwable1) {
            this.c(m0, object0, throwable1);
            return;
        }
        if(k0 == null) {
            this.c(m0, object0, new NullPointerException("The single"));
            return;
        }
        a a2$a0 = new a(this, object0, m0);
        m0.c(a2$a0);
        k0.j0(a2$a0);
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.a(((m)object0));
    }

    void c(m m0, Object object0, Throwable throwable0) {
        c.e(throwable0);
        if(this.d) {
            try {
                this.c.b(object0);
            }
            catch(Throwable throwable1) {
                c.e(throwable1);
                throwable0 = new rx.exceptions.b(Arrays.asList(new Throwable[]{throwable0, throwable1}));
            }
        }
        m0.onError(throwable0);
        if(!this.d) {
            try {
                this.c.b(object0);
            }
            catch(Throwable throwable2) {
                c.e(throwable2);
                rx.plugins.c.I(throwable2);
            }
        }
    }
}

