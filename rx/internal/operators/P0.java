package rx.internal.operators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import rx.exceptions.c;
import rx.functions.o;
import rx.functions.p;
import rx.g.a;
import rx.g;
import rx.n;

public final class p0 implements o, a {
    static final class rx.internal.operators.p0.a implements p {
        private static final rx.internal.operators.p0.a a;

        static {
            rx.internal.operators.p0.a.a = new rx.internal.operators.p0.a();
        }

        public Collection a(Object object0) {
            return new ArrayList();
        }

        @Override  // rx.functions.p
        public Object b(Object object0) {
            return this.a(object0);
        }

        static rx.internal.operators.p0.a c() {
            return rx.internal.operators.p0.a.a;
        }
    }

    static final class b extends u {
        private final p o;
        private final p p;
        private final p q;

        b(n n0, Map map0, p p0, p p1, p p2) {
            super(n0);
            this.h = map0;
            this.g = true;
            this.o = p0;
            this.p = p1;
            this.q = p2;
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            if(this.n) {
                return;
            }
            try {
                Object object1 = this.o.b(object0);
                Object object2 = this.p.b(object0);
                Collection collection0 = (Collection)((Map)this.h).get(object1);
                if(collection0 == null) {
                    collection0 = (Collection)this.q.b(object1);
                    ((Map)this.h).put(object1, collection0);
                }
                collection0.add(object2);
                return;
            }
            catch(Throwable throwable0) {
            }
            c.e(throwable0);
            this.l();
            this.onError(throwable0);
        }

        @Override  // rx.n
        public void onStart() {
            this.v(0x7FFFFFFFFFFFFFFFL);
        }
    }

    private final p a;
    private final p b;
    private final o c;
    private final p d;
    private final g e;

    public p0(g g0, p p0, p p1) {
        this(g0, p0, p1, null, rx.internal.operators.p0.a.c());
    }

    public p0(g g0, p p0, p p1, o o0) {
        this(g0, p0, p1, o0, rx.internal.operators.p0.a.c());
    }

    public p0(g g0, p p0, p p1, o o0, p p2) {
        this.e = g0;
        this.a = p0;
        this.b = p1;
        this.c = o0 == null ? this : o0;
        this.d = p2;
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
            map0 = (Map)this.c.call();
        }
        catch(Throwable throwable0) {
            c.e(throwable0);
            n0.onError(throwable0);
            return;
        }
        new b(n0, map0, this.a, this.b, this.d).Y(this.e);
    }

    @Override  // rx.functions.o
    public Object call() {
        return this.a();
    }
}

