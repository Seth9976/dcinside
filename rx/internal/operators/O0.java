package rx.internal.operators;

import java.util.HashMap;
import java.util.Map;
import rx.exceptions.c;
import rx.functions.o;
import rx.functions.p;
import rx.g.a;
import rx.g;
import rx.n;

public final class o0 implements o, a {
    static final class rx.internal.operators.o0.a extends u {
        final p o;
        final p p;

        rx.internal.operators.o0.a(n n0, Map map0, p p0, p p1) {
            super(n0);
            this.h = map0;
            this.g = true;
            this.o = p0;
            this.p = p1;
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            if(this.n) {
                return;
            }
            try {
                Object object1 = this.o.b(object0);
                Object object2 = this.p.b(object0);
                ((Map)this.h).put(object1, object2);
            }
            catch(Throwable throwable0) {
                c.e(throwable0);
                this.l();
                this.onError(throwable0);
            }
        }

        @Override  // rx.n
        public void onStart() {
            this.v(0x7FFFFFFFFFFFFFFFL);
        }
    }

    final g a;
    final p b;
    final p c;
    final o d;

    public o0(g g0, p p0, p p1) {
        this(g0, p0, p1, null);
    }

    public o0(g g0, p p0, p p1, o o0) {
        this.a = g0;
        this.b = p0;
        this.c = p1;
        if(o0 == null) {
            this.d = this;
            return;
        }
        this.d = o0;
    }

    public Map a() {
        return new HashMap();
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.c(((n)object0));
    }

    public void c(n n0) {
        Map map0;
        try {
            map0 = (Map)this.d.call();
        }
        catch(Throwable throwable0) {
            c.f(throwable0, n0);
            return;
        }
        new rx.internal.operators.o0.a(n0, map0, this.b, this.c).Y(this.a);
    }

    @Override  // rx.functions.o
    public Object call() {
        return this.a();
    }
}

