package rx.internal.util;

import java.util.List;
import java.util.concurrent.TimeUnit;
import rx.exceptions.g;
import rx.f;
import rx.functions.c;
import rx.functions.o;
import rx.functions.p;
import rx.functions.q;
import rx.internal.operators.t0;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public final class h extends Enum {
    static final class a implements q {
        final c a;

        public a(c c0) {
            this.a = c0;
        }

        @Override  // rx.functions.q
        public Object p(Object object0, Object object1) {
            this.a.p(object0, object1);
            return object0;
        }
    }

    static final class b implements p {
        final Object a;

        public b(Object object0) {
            this.a = object0;
        }

        // 去混淆评级： 低(20)
        public Boolean a(Object object0) {
            return object0 == this.a || object0 != null && object0.equals(this.a);
        }

        @Override  // rx.functions.p
        public Object b(Object object0) {
            return this.a(object0);
        }
    }

    static final class rx.internal.util.h.c implements rx.functions.b {
        public void a(Throwable throwable0) {
            throw new g(throwable0);
        }

        @Override  // rx.functions.b
        public void b(Object object0) {
            this.a(((Throwable)object0));
        }
    }

    static final class d implements p {
        final Class a;

        public d(Class class0) {
            this.a = class0;
        }

        public Boolean a(Object object0) {
            return Boolean.valueOf(this.a.isInstance(object0));
        }

        @Override  // rx.functions.p
        public Object b(Object object0) {
            return this.a(object0);
        }
    }

    static final class e implements p {
        public Throwable a(f f0) {
            return f0.g();
        }

        @Override  // rx.functions.p
        public Object b(Object object0) {
            return this.a(((f)object0));
        }
    }

    static final class rx.internal.util.h.f implements q {
        // 去混淆评级： 低(20)
        public Boolean a(Object object0, Object object1) {
            return object0 == object1 || object0 != null && object0.equals(object1);
        }

        @Override  // rx.functions.q
        public Object p(Object object0, Object object1) {
            return this.a(object0, object1);
        }
    }

    static final class rx.internal.util.h.g implements q {
        public Integer a(Integer integer0, Object object0) {
            return (int)(((int)integer0) + 1);
        }

        @Override  // rx.functions.q
        public Object p(Object object0, Object object1) {
            return this.a(((Integer)object0), object1);
        }
    }

    static final class rx.internal.util.h.h implements q {
        public Long a(Long long0, Object object0) {
            return (long)(((long)long0) + 1L);
        }

        @Override  // rx.functions.q
        public Object p(Object object0, Object object1) {
            return this.a(((Long)object0), object1);
        }
    }

    static final class i implements p {
        final p a;

        public i(p p0) {
            this.a = p0;
        }

        public rx.g a(rx.g g0) {
            rx.g g1 = g0.g3(h.d);
            return (rx.g)this.a.b(g1);
        }

        @Override  // rx.functions.p
        public Object b(Object object0) {
            return this.a(((rx.g)object0));
        }
    }

    static final class j implements o {
        private final rx.g a;
        private final int b;

        j(rx.g g0, int v) {
            this.a = g0;
            this.b = v;
        }

        public rx.observables.c a() {
            return this.a.z4(this.b);
        }

        @Override  // rx.functions.o
        public Object call() {
            return this.a();
        }
    }

    static final class k implements o {
        private final TimeUnit a;
        private final rx.g b;
        private final long c;
        private final rx.j d;

        k(rx.g g0, long v, TimeUnit timeUnit0, rx.j j0) {
            this.a = timeUnit0;
            this.b = g0;
            this.c = v;
            this.d = j0;
        }

        public rx.observables.c a() {
            return this.b.E4(this.c, this.a, this.d);
        }

        @Override  // rx.functions.o
        public Object call() {
            return this.a();
        }
    }

    static final class l implements o {
        private final rx.g a;

        l(rx.g g0) {
            this.a = g0;
        }

        public rx.observables.c a() {
            return this.a.y4();
        }

        @Override  // rx.functions.o
        public Object call() {
            return this.a();
        }
    }

    static final class m implements o {
        private final long a;
        private final TimeUnit b;
        private final rx.j c;
        private final int d;
        private final rx.g e;

        m(rx.g g0, int v, long v1, TimeUnit timeUnit0, rx.j j0) {
            this.a = v1;
            this.b = timeUnit0;
            this.c = j0;
            this.d = v;
            this.e = g0;
        }

        public rx.observables.c a() {
            return this.e.B4(this.d, this.a, this.b, this.c);
        }

        @Override  // rx.functions.o
        public Object call() {
            return this.a();
        }
    }

    static final class n implements p {
        final p a;

        public n(p p0) {
            this.a = p0;
        }

        public rx.g a(rx.g g0) {
            rx.g g1 = g0.g3(h.f);
            return (rx.g)this.a.b(g1);
        }

        @Override  // rx.functions.p
        public Object b(Object object0) {
            return this.a(((rx.g)object0));
        }
    }

    static final class rx.internal.util.h.o implements p {
        public Void a(Object object0) [...] // Inlined contents

        @Override  // rx.functions.p
        public Object b(Object object0) {
            return null;
        }
    }

    static final class rx.internal.util.h.p implements p {
        final p a;
        final rx.j b;

        public rx.internal.util.h.p(p p0, rx.j j0) {
            this.a = p0;
            this.b = j0;
        }

        public rx.g a(rx.g g0) {
            return ((rx.g)this.a.b(g0)).M3(this.b);
        }

        @Override  // rx.functions.p
        public Object b(Object object0) {
            return this.a(((rx.g)object0));
        }
    }

    static final class rx.internal.util.h.q implements p {
        public rx.g[] a(List list0) {
            return (rx.g[])list0.toArray(new rx.g[list0.size()]);
        }

        @Override  // rx.functions.p
        public Object b(Object object0) {
            return this.a(((List)object0));
        }
    }

    public static final rx.internal.util.h.h a;
    public static final rx.internal.util.h.f b;
    public static final rx.internal.util.h.q c;
    static final rx.internal.util.h.o d;
    public static final rx.internal.util.h.g e;
    static final e f;
    public static final rx.functions.b g;
    public static final rx.g.b h;
    private static final h[] i;

    static {
        h.i = new h[0];
        h.a = new rx.internal.util.h.h();
        h.b = new rx.internal.util.h.f();
        h.c = new rx.internal.util.h.q();
        h.d = new rx.internal.util.h.o();
        h.e = new rx.internal.util.h.g();
        h.f = new e();
        h.g = new rx.internal.util.h.c();
        h.h = new t0(rx.internal.util.s.b.a, true);
    }

    private h(String s, int v) {
        super(s, v);
    }

    public static q a(c c0) {
        return new a(c0);
    }

    public static p b(p p0) {
        return new i(p0);
    }

    public static p c(p p0, rx.j j0) {
        return new rx.internal.util.h.p(p0, j0);
    }

    public static o d(rx.g g0) {
        return new l(g0);
    }

    public static o e(rx.g g0, int v) {
        return new j(g0, v);
    }

    public static o f(rx.g g0, int v, long v1, TimeUnit timeUnit0, rx.j j0) {
        return new m(g0, v, v1, timeUnit0, j0);
    }

    public static o g(rx.g g0, long v, TimeUnit timeUnit0, rx.j j0) {
        return new k(g0, v, timeUnit0, j0);
    }

    public static p h(p p0) {
        return new n(p0);
    }

    public static p i(Object object0) {
        return new b(object0);
    }

    public static p j(Class class0) {
        return new d(class0);
    }

    public static h valueOf(String s) {
        return (h)Enum.valueOf(h.class, s);
    }

    public static h[] values() {
        return (h[])h.i.clone();
    }
}

