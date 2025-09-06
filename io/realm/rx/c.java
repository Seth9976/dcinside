package io.realm.rx;

import android.os.Looper;
import io.reactivex.B;
import io.reactivex.D;
import io.reactivex.J;
import io.reactivex.K;
import io.reactivex.b;
import io.reactivex.l;
import io.reactivex.n;
import io.reactivex.o;
import io.realm.E;
import io.realm.F0;
import io.realm.G;
import io.realm.P0;
import io.realm.Q0;
import io.realm.RealmQuery;
import io.realm.T0;
import io.realm.X0;
import io.realm.d1;
import io.realm.e1;
import io.realm.g1;
import io.realm.q0;
import io.realm.v0;
import io.realm.w0;
import java.util.IdentityHashMap;
import java.util.Map;

public class c implements d {
    class i extends ThreadLocal {
        final c a;

        protected r a() {
            return new r(null);
        }

        @Override
        protected Object initialValue() {
            return this.a();
        }
    }

    class j extends ThreadLocal {
        final c a;

        protected r a() {
            return new r(null);
        }

        @Override
        protected Object initialValue() {
            return this.a();
        }
    }

    class k extends ThreadLocal {
        final c a;

        protected r a() {
            return new r(null);
        }

        @Override
        protected Object initialValue() {
            return this.a();
        }
    }

    static class r {
        private final Map a;

        private r() {
            this.a = new IdentityHashMap();
        }

        r(i c$i0) {
        }

        public void a(Object object0) {
            Integer integer0 = (Integer)this.a.get(object0);
            if(integer0 == null) {
                this.a.put(object0, 1);
                return;
            }
            this.a.put(object0, ((int)(((int)integer0) + 1)));
        }

        public void b(Object object0) {
            Integer integer0 = (Integer)this.a.get(object0);
            if(integer0 == null) {
                throw new IllegalStateException("Object does not have any references: " + object0);
            }
            if(((int)integer0) > 1) {
                this.a.put(object0, ((int)(((int)integer0) - 1)));
                return;
            }
            if(((int)integer0) != 1) {
                throw new IllegalStateException("Invalid reference count: " + integer0);
            }
            this.a.remove(object0);
        }
    }

    private final boolean a;
    private ThreadLocal b;
    private ThreadLocal c;
    private ThreadLocal d;
    private static final b e;

    static {
        c.e = b.e;
    }

    public c(boolean z) {
        this.b = new i(this);
        this.c = new j(this);
        this.d = new k(this);
        this.a = z;
    }

    @Override  // io.realm.rx.d
    public l a(E e0, T0 t00) {
        class io.realm.rx.c.c implements o {
            final T0 a;
            final Q0 b;
            final c c;

            io.realm.rx.c.c(T0 t00, Q0 q00) {
                this.a = t00;
                this.b = q00;
                super();
            }

            @Override  // io.reactivex.o
            public void a(n n0) {
                class a implements P0 {
                    final n a;
                    final io.realm.rx.c.c b;

                    a(n n0) {
                        this.a = n0;
                        super();
                    }

                    @Override  // io.realm.P0
                    public void M(Object object0) {
                        this.a(((T0)object0));
                    }

                    public void a(T0 t00) {
                        if(!t00.s()) {
                            this.a.onComplete();
                            return;
                        }
                        if(!this.a.isCancelled()) {
                            n n0 = this.a;
                            if(c.this.a) {
                                t00 = t00.p();
                            }
                            n0.onNext(t00);
                        }
                    }
                }


                class io.realm.rx.c.c.b implements Runnable {
                    final E a;
                    final P0 b;
                    final io.realm.rx.c.c c;

                    io.realm.rx.c.c.b(E e0, P0 p00) {
                        this.a = e0;
                        this.b = p00;
                        super();
                    }

                    @Override
                    public void run() {
                        if(!this.a.isClosed()) {
                            io.realm.rx.c.c.this.a.B(this.b);
                            this.a.close();
                        }
                        ((r)c.this.c.get()).b(io.realm.rx.c.c.this.a);
                    }
                }

                if(!this.a.s()) {
                    return;
                }
                E e0 = E.p2(this.b);
                ((r)c.this.c.get()).a(this.a);
                a c$c$a0 = new a(this, n0);
                this.a.j(c$c$a0);
                n0.d(io.reactivex.disposables.d.f(new io.realm.rx.c.c.b(this, e0, c$c$a0)));
                n0.onNext((c.this.a ? this.a.p() : this.a));
            }
        }

        if(e0.x0()) {
            return l.x3(t00);
        }
        Q0 q00 = e0.T();
        J j0 = this.u();
        return l.y1(new io.realm.rx.c.c(this, t00, q00), c.e).n6(j0).U7(j0);
    }

    @Override  // io.realm.rx.d
    public l b(E e0, g1 g10) {
        class p implements o {
            final g1 a;
            final Q0 b;
            final c c;

            p(g1 g10, Q0 q00) {
                this.a = g10;
                this.b = q00;
                super();
            }

            @Override  // io.reactivex.o
            public void a(n n0) {
                class io.realm.rx.c.p.a implements P0 {
                    final n a;
                    final p b;

                    io.realm.rx.c.p.a(n n0) {
                        this.a = n0;
                        super();
                    }

                    @Override  // io.realm.P0
                    public void M(Object object0) {
                        this.a(((g1)object0));
                    }

                    public void a(g1 g10) {
                        if(!this.a.isCancelled()) {
                            n n0 = this.a;
                            if(c.this.a) {
                                g10 = g10.A();
                            }
                            n0.onNext(g10);
                        }
                    }
                }


                class io.realm.rx.c.p.b implements Runnable {
                    final E a;
                    final P0 b;
                    final p c;

                    io.realm.rx.c.p.b(E e0, P0 p00) {
                        this.a = e0;
                        this.b = p00;
                        super();
                    }

                    @Override
                    public void run() {
                        if(!this.a.isClosed()) {
                            p.this.a.F(this.b);
                            this.a.close();
                        }
                        ((r)c.this.b.get()).b(p.this.a);
                    }
                }

                if(!this.a.s()) {
                    return;
                }
                E e0 = E.p2(this.b);
                ((r)c.this.b.get()).a(this.a);
                io.realm.rx.c.p.a c$p$a0 = new io.realm.rx.c.p.a(this, n0);
                this.a.l(c$p$a0);
                n0.d(io.reactivex.disposables.d.f(new io.realm.rx.c.p.b(this, e0, c$p$a0)));
                n0.onNext((c.this.a ? this.a.A() : this.a));
            }
        }

        if(e0.x0()) {
            return l.x3(g10);
        }
        Q0 q00 = e0.T();
        J j0 = this.u();
        return l.y1(new p(this, g10, q00), c.e).n6(j0).U7(j0);
    }

    @Override  // io.realm.rx.d
    public l c(E e0, G g0) {
        class g implements o {
            final E a;
            final Q0 b;
            final G c;
            final c d;

            g(E e0, Q0 q00, G g0) {
                this.a = e0;
                this.b = q00;
                this.c = g0;
                super();
            }

            @Override  // io.reactivex.o
            public void a(n n0) {
                class io.realm.rx.c.g.a implements P0 {
                    final n a;
                    final g b;

                    io.realm.rx.c.g.a(n n0) {
                        this.a = n0;
                        super();
                    }

                    @Override  // io.realm.P0
                    public void M(Object object0) {
                        this.a(((G)object0));
                    }

                    public void a(G g0) {
                        if(!this.a.isCancelled()) {
                            n n0 = this.a;
                            if(c.this.a) {
                                g0 = (G)d1.C5(g0);
                            }
                            n0.onNext(g0);
                        }
                    }
                }


                class io.realm.rx.c.g.b implements Runnable {
                    final E a;
                    final P0 b;
                    final g c;

                    io.realm.rx.c.g.b(E e0, P0 p00) {
                        this.a = e0;
                        this.b = p00;
                        super();
                    }

                    @Override
                    public void run() {
                        if(!this.a.isClosed()) {
                            d1.N5(g.this.c, this.b);
                            this.a.close();
                        }
                        ((r)c.this.d.get()).b(g.this.c);
                    }
                }

                if(this.a.isClosed()) {
                    return;
                }
                E e0 = E.p2(this.b);
                ((r)c.this.d.get()).a(this.c);
                io.realm.rx.c.g.a c$g$a0 = new io.realm.rx.c.g.a(this, n0);
                d1.s5(this.c, c$g$a0);
                n0.d(io.reactivex.disposables.d.f(new io.realm.rx.c.g.b(this, e0, c$g$a0)));
                n0.onNext((c.this.a ? ((G)d1.C5(this.c)) : this.c));
            }
        }

        if(e0.x0()) {
            return l.x3(g0);
        }
        Q0 q00 = e0.T();
        J j0 = this.u();
        return l.y1(new g(this, e0, q00, g0), c.e).n6(j0).U7(j0);
    }

    @Override  // io.realm.rx.d
    public l d(F0 f00, T0 t00) {
        class io.realm.rx.c.a implements o {
            final T0 a;
            final Q0 b;
            final c c;

            io.realm.rx.c.a(T0 t00, Q0 q00) {
                this.a = t00;
                this.b = q00;
                super();
            }

            @Override  // io.reactivex.o
            public void a(n n0) {
                class io.realm.rx.c.a.a implements P0 {
                    final n a;
                    final io.realm.rx.c.a b;

                    io.realm.rx.c.a.a(n n0) {
                        this.a = n0;
                        super();
                    }

                    @Override  // io.realm.P0
                    public void M(Object object0) {
                        this.a(((T0)object0));
                    }

                    public void a(T0 t00) {
                        if(!t00.s()) {
                            this.a.onComplete();
                            return;
                        }
                        if(!this.a.isCancelled()) {
                            n n0 = this.a;
                            if(c.this.a) {
                                t00 = t00.p();
                            }
                            n0.onNext(t00);
                        }
                    }
                }


                class io.realm.rx.c.a.b implements Runnable {
                    final F0 a;
                    final P0 b;
                    final io.realm.rx.c.a c;

                    io.realm.rx.c.a.b(F0 f00, P0 p00) {
                        this.a = f00;
                        this.b = p00;
                        super();
                    }

                    @Override
                    public void run() {
                        if(!this.a.isClosed()) {
                            io.realm.rx.c.a.this.a.B(this.b);
                            this.a.close();
                        }
                        ((r)c.this.c.get()).b(io.realm.rx.c.a.this.a);
                    }
                }

                if(!this.a.s()) {
                    return;
                }
                F0 f00 = F0.k4(this.b);
                ((r)c.this.c.get()).a(this.a);
                io.realm.rx.c.a.a c$a$a0 = new io.realm.rx.c.a.a(this, n0);
                this.a.j(c$a$a0);
                n0.d(io.reactivex.disposables.d.f(new io.realm.rx.c.a.b(this, f00, c$a$a0)));
                n0.onNext((c.this.a ? this.a.p() : this.a));
            }
        }

        if(f00.x0()) {
            return l.x3(t00);
        }
        Q0 q00 = f00.T();
        J j0 = this.u();
        return l.y1(new io.realm.rx.c.a(this, t00, q00), c.e).n6(j0).U7(j0);
    }

    @Override  // io.realm.rx.d
    public l e(E e0) {
        class m implements o {
            final Q0 a;
            final c b;

            m(Q0 q00) {
                this.a = q00;
                super();
            }

            @Override  // io.reactivex.o
            public void a(n n0) throws Exception {
                class io.realm.rx.c.m.a implements P0 {
                    final n a;
                    final m b;

                    io.realm.rx.c.m.a(n n0) {
                        this.a = n0;
                        super();
                    }

                    @Override  // io.realm.P0
                    public void M(Object object0) {
                        this.a(((E)object0));
                    }

                    public void a(E e0) {
                        if(!this.a.isCancelled()) {
                            n n0 = this.a;
                            if(c.this.a) {
                                e0 = e0.o2();
                            }
                            n0.onNext(e0);
                        }
                    }
                }


                class io.realm.rx.c.m.b implements Runnable {
                    final E a;
                    final P0 b;
                    final m c;

                    io.realm.rx.c.m.b(E e0, P0 p00) {
                        this.a = e0;
                        this.b = p00;
                        super();
                    }

                    @Override
                    public void run() {
                        if(!this.a.isClosed()) {
                            this.a.C2(this.b);
                            this.a.close();
                        }
                    }
                }

                E e0 = E.p2(this.a);
                io.realm.rx.c.m.a c$m$a0 = new io.realm.rx.c.m.a(this, n0);
                e0.j1(c$m$a0);
                n0.d(io.reactivex.disposables.d.f(new io.realm.rx.c.m.b(this, e0, c$m$a0)));
                if(c.this.a) {
                    e0 = e0.o2();
                }
                n0.onNext(e0);
            }
        }

        if(e0.x0()) {
            return l.x3(e0);
        }
        Q0 q00 = e0.T();
        J j0 = this.u();
        return l.y1(new m(this, q00), c.e).n6(j0).U7(j0);
    }

    @Override
    public boolean equals(Object object0) {
        return object0 instanceof c;
    }

    @Override  // io.realm.rx.d
    public l f(F0 f00) {
        class io.realm.rx.c.l implements o {
            final Q0 a;
            final c b;

            io.realm.rx.c.l(Q0 q00) {
                this.a = q00;
                super();
            }

            @Override  // io.reactivex.o
            public void a(n n0) throws Exception {
                class io.realm.rx.c.l.a implements P0 {
                    final n a;
                    final io.realm.rx.c.l b;

                    io.realm.rx.c.l.a(n n0) {
                        this.a = n0;
                        super();
                    }

                    @Override  // io.realm.P0
                    public void M(Object object0) {
                        this.a(((F0)object0));
                    }

                    public void a(F0 f00) {
                        if(!this.a.isCancelled()) {
                            n n0 = this.a;
                            if(c.this.a) {
                                f00 = f00.d4();
                            }
                            n0.onNext(f00);
                        }
                    }
                }


                class io.realm.rx.c.l.b implements Runnable {
                    final F0 a;
                    final P0 b;
                    final io.realm.rx.c.l c;

                    io.realm.rx.c.l.b(F0 f00, P0 p00) {
                        this.a = f00;
                        this.b = p00;
                        super();
                    }

                    @Override
                    public void run() {
                        if(!this.a.isClosed()) {
                            this.a.z4(this.b);
                            this.a.close();
                        }
                    }
                }

                F0 f00 = F0.k4(this.a);
                io.realm.rx.c.l.a c$l$a0 = new io.realm.rx.c.l.a(this, n0);
                f00.l1(c$l$a0);
                n0.d(io.reactivex.disposables.d.f(new io.realm.rx.c.l.b(this, f00, c$l$a0)));
                if(c.this.a) {
                    f00 = f00.d4();
                }
                n0.onNext(f00);
            }
        }

        if(f00.x0()) {
            return l.x3(f00);
        }
        Q0 q00 = f00.T();
        J j0 = this.u();
        return l.y1(new io.realm.rx.c.l(this, q00), c.e).n6(j0).U7(j0);
    }

    @Override  // io.realm.rx.d
    public l g(F0 f00, g1 g10) {
        class io.realm.rx.c.n implements o {
            final g1 a;
            final Q0 b;
            final c c;

            io.realm.rx.c.n(g1 g10, Q0 q00) {
                this.a = g10;
                this.b = q00;
                super();
            }

            @Override  // io.reactivex.o
            public void a(n n0) {
                class io.realm.rx.c.n.a implements P0 {
                    final n a;
                    final io.realm.rx.c.n b;

                    io.realm.rx.c.n.a(n n0) {
                        this.a = n0;
                        super();
                    }

                    @Override  // io.realm.P0
                    public void M(Object object0) {
                        this.a(((g1)object0));
                    }

                    public void a(g1 g10) {
                        if(!this.a.isCancelled()) {
                            n n0 = this.a;
                            if(c.this.a) {
                                g10 = g10.A();
                            }
                            n0.onNext(g10);
                        }
                    }
                }


                class io.realm.rx.c.n.b implements Runnable {
                    final F0 a;
                    final P0 b;
                    final io.realm.rx.c.n c;

                    io.realm.rx.c.n.b(F0 f00, P0 p00) {
                        this.a = f00;
                        this.b = p00;
                        super();
                    }

                    @Override
                    public void run() {
                        if(!this.a.isClosed()) {
                            io.realm.rx.c.n.this.a.F(this.b);
                            this.a.close();
                        }
                        ((r)c.this.b.get()).b(io.realm.rx.c.n.this.a);
                    }
                }

                if(!this.a.s()) {
                    return;
                }
                F0 f00 = F0.k4(this.b);
                ((r)c.this.b.get()).a(this.a);
                io.realm.rx.c.n.a c$n$a0 = new io.realm.rx.c.n.a(this, n0);
                this.a.l(c$n$a0);
                n0.d(io.reactivex.disposables.d.f(new io.realm.rx.c.n.b(this, f00, c$n$a0)));
                n0.onNext((c.this.a ? this.a.A() : this.a));
            }
        }

        if(f00.x0()) {
            return l.x3(g10);
        }
        Q0 q00 = f00.T();
        J j0 = this.u();
        return l.y1(new io.realm.rx.c.n(this, g10, q00), c.e).n6(j0).U7(j0);
    }

    @Override  // io.realm.rx.d
    public l h(F0 f00, X0 x00) {
        class e implements o {
            final F0 a;
            final Q0 b;
            final X0 c;
            final c d;

            e(F0 f00, Q0 q00, X0 x00) {
                this.a = f00;
                this.b = q00;
                this.c = x00;
                super();
            }

            @Override  // io.reactivex.o
            public void a(n n0) {
                class io.realm.rx.c.e.a implements P0 {
                    final n a;
                    final e b;

                    io.realm.rx.c.e.a(n n0) {
                        this.a = n0;
                        super();
                    }

                    @Override  // io.realm.P0
                    public void M(Object object0) {
                        this.a(((X0)object0));
                    }

                    public void a(X0 x00) {
                        if(!this.a.isCancelled()) {
                            n n0 = this.a;
                            if(c.this.a) {
                                x00 = d1.C5(x00);
                            }
                            n0.onNext(x00);
                        }
                    }
                }


                class io.realm.rx.c.e.b implements Runnable {
                    final F0 a;
                    final P0 b;
                    final e c;

                    io.realm.rx.c.e.b(F0 f00, P0 p00) {
                        this.a = f00;
                        this.b = p00;
                        super();
                    }

                    @Override
                    public void run() {
                        if(!this.a.isClosed()) {
                            d1.N5(e.this.c, this.b);
                            this.a.close();
                        }
                        ((r)c.this.d.get()).b(e.this.c);
                    }
                }

                if(this.a.isClosed()) {
                    return;
                }
                F0 f00 = F0.k4(this.b);
                ((r)c.this.d.get()).a(this.c);
                io.realm.rx.c.e.a c$e$a0 = new io.realm.rx.c.e.a(this, n0);
                d1.s5(this.c, c$e$a0);
                n0.d(io.reactivex.disposables.d.f(new io.realm.rx.c.e.b(this, f00, c$e$a0)));
                n0.onNext((c.this.a ? d1.C5(this.c) : this.c));
            }
        }

        if(f00.x0()) {
            return l.x3(x00);
        }
        Q0 q00 = f00.T();
        J j0 = this.u();
        return l.y1(new e(this, f00, q00, x00), c.e).n6(j0).U7(j0);
    }

    @Override
    public int hashCode() {
        return 37;
    }

    @Override  // io.realm.rx.d
    public K i(F0 f00, RealmQuery realmQuery0) {
        throw new RuntimeException("RealmQuery not supported yet.");
    }

    @Override  // io.realm.rx.d
    public B j(F0 f00, T0 t00) {
        class io.realm.rx.c.b implements io.reactivex.E {
            final T0 a;
            final Q0 b;
            final c c;

            io.realm.rx.c.b(T0 t00, Q0 q00) {
                this.a = t00;
                this.b = q00;
                super();
            }

            @Override  // io.reactivex.E
            public void a(D d0) {
                class io.realm.rx.c.b.a implements w0 {
                    final D a;
                    final io.realm.rx.c.b b;

                    io.realm.rx.c.b.a(D d0) {
                        this.a = d0;
                        super();
                    }

                    @Override  // io.realm.w0
                    public void a(Object object0, v0 v00) {
                        this.b(((T0)object0), v00);
                    }

                    public void b(T0 t00, v0 v00) {
                        if(!t00.s()) {
                            this.a.onComplete();
                            return;
                        }
                        if(!this.a.a()) {
                            D d0 = this.a;
                            if(c.this.a) {
                                t00 = t00.p();
                            }
                            d0.onNext(new io.realm.rx.a(t00, v00));
                        }
                    }
                }


                class io.realm.rx.c.b.b implements Runnable {
                    final F0 a;
                    final w0 b;
                    final io.realm.rx.c.b c;

                    io.realm.rx.c.b.b(F0 f00, w0 w00) {
                        this.a = f00;
                        this.b = w00;
                        super();
                    }

                    @Override
                    public void run() {
                        if(!this.a.isClosed()) {
                            io.realm.rx.c.b.this.a.A(this.b);
                            this.a.close();
                        }
                        ((r)c.this.c.get()).b(io.realm.rx.c.b.this.a);
                    }
                }

                if(!this.a.s()) {
                    return;
                }
                F0 f00 = F0.k4(this.b);
                ((r)c.this.c.get()).a(this.a);
                io.realm.rx.c.b.a c$b$a0 = new io.realm.rx.c.b.a(this, d0);
                this.a.i(c$b$a0);
                d0.d(io.reactivex.disposables.d.f(new io.realm.rx.c.b.b(this, f00, c$b$a0)));
                d0.onNext(new io.realm.rx.a((c.this.a ? this.a.p() : this.a), null));
            }
        }

        if(f00.x0()) {
            return B.m3(new io.realm.rx.a(t00, null));
        }
        Q0 q00 = f00.T();
        J j0 = this.u();
        return B.r1(new io.realm.rx.c.b(this, t00, q00)).J5(j0).n7(j0);
    }

    @Override  // io.realm.rx.d
    public B k(E e0, G g0) {
        class h implements io.reactivex.E {
            final G a;
            final Q0 b;
            final c c;

            h(G g0, Q0 q00) {
                this.a = g0;
                this.b = q00;
                super();
            }

            @Override  // io.reactivex.E
            public void a(D d0) {
                class io.realm.rx.c.h.a implements e1 {
                    final D a;
                    final h b;

                    io.realm.rx.c.h.a(D d0) {
                        this.a = d0;
                        super();
                    }

                    @Override  // io.realm.e1
                    public void a(X0 x00, q0 q00) {
                        this.b(((G)x00), q00);
                    }

                    public void b(G g0, q0 q00) {
                        if(!this.a.a()) {
                            D d0 = this.a;
                            if(c.this.a) {
                                g0 = (G)d1.C5(g0);
                            }
                            d0.onNext(new io.realm.rx.b(g0, q00));
                        }
                    }
                }


                class io.realm.rx.c.h.b implements Runnable {
                    final E a;
                    final e1 b;
                    final h c;

                    io.realm.rx.c.h.b(E e0, e1 e10) {
                        this.a = e0;
                        this.b = e10;
                        super();
                    }

                    @Override
                    public void run() {
                        if(!this.a.isClosed()) {
                            d1.O5(h.this.a, this.b);
                            this.a.close();
                        }
                        ((r)c.this.d.get()).b(h.this.a);
                    }
                }

                if(!d1.I5(this.a)) {
                    return;
                }
                E e0 = E.p2(this.b);
                ((r)c.this.d.get()).a(this.a);
                io.realm.rx.c.h.a c$h$a0 = new io.realm.rx.c.h.a(this, d0);
                this.a.u5(c$h$a0);
                d0.d(io.reactivex.disposables.d.f(new io.realm.rx.c.h.b(this, e0, c$h$a0)));
                d0.onNext(new io.realm.rx.b((c.this.a ? ((G)d1.C5(this.a)) : this.a), null));
            }
        }

        if(e0.x0()) {
            return B.m3(new io.realm.rx.b(g0, null));
        }
        Q0 q00 = e0.T();
        J j0 = this.u();
        return B.r1(new h(this, g0, q00)).J5(j0).n7(j0);
    }

    @Override  // io.realm.rx.d
    public K l(E e0, RealmQuery realmQuery0) {
        throw new RuntimeException("RealmQuery not supported yet.");
    }

    @Override  // io.realm.rx.d
    public B m(E e0, T0 t00) {
        class io.realm.rx.c.d implements io.reactivex.E {
            final T0 a;
            final Q0 b;
            final c c;

            io.realm.rx.c.d(T0 t00, Q0 q00) {
                this.a = t00;
                this.b = q00;
                super();
            }

            @Override  // io.reactivex.E
            public void a(D d0) {
                class io.realm.rx.c.d.a implements w0 {
                    final D a;
                    final io.realm.rx.c.d b;

                    io.realm.rx.c.d.a(D d0) {
                        this.a = d0;
                        super();
                    }

                    @Override  // io.realm.w0
                    public void a(Object object0, v0 v00) {
                        this.b(((T0)object0), v00);
                    }

                    public void b(T0 t00, v0 v00) {
                        if(!t00.s()) {
                            this.a.onComplete();
                            return;
                        }
                        if(!this.a.a()) {
                            D d0 = this.a;
                            if(c.this.a) {
                                t00 = t00.p();
                            }
                            d0.onNext(new io.realm.rx.a(t00, v00));
                        }
                    }
                }


                class io.realm.rx.c.d.b implements Runnable {
                    final E a;
                    final w0 b;
                    final io.realm.rx.c.d c;

                    io.realm.rx.c.d.b(E e0, w0 w00) {
                        this.a = e0;
                        this.b = w00;
                        super();
                    }

                    @Override
                    public void run() {
                        if(!this.a.isClosed()) {
                            io.realm.rx.c.d.this.a.A(this.b);
                            this.a.close();
                        }
                        ((r)c.this.c.get()).b(io.realm.rx.c.d.this.a);
                    }
                }

                if(!this.a.s()) {
                    return;
                }
                E e0 = E.p2(this.b);
                ((r)c.this.c.get()).a(this.a);
                io.realm.rx.c.d.a c$d$a0 = new io.realm.rx.c.d.a(this, d0);
                this.a.i(c$d$a0);
                d0.d(io.reactivex.disposables.d.f(new io.realm.rx.c.d.b(this, e0, c$d$a0)));
                d0.onNext(new io.realm.rx.a((c.this.a ? this.a.p() : this.a), null));
            }
        }

        if(e0.x0()) {
            return B.m3(new io.realm.rx.a(t00, null));
        }
        Q0 q00 = e0.T();
        J j0 = this.u();
        return B.r1(new io.realm.rx.c.d(this, t00, q00)).J5(j0).n7(j0);
    }

    @Override  // io.realm.rx.d
    public B n(E e0, g1 g10) {
        class q implements io.reactivex.E {
            final g1 a;
            final Q0 b;
            final c c;

            q(g1 g10, Q0 q00) {
                this.a = g10;
                this.b = q00;
                super();
            }

            @Override  // io.reactivex.E
            public void a(D d0) {
                class io.realm.rx.c.q.a implements w0 {
                    final D a;
                    final q b;

                    io.realm.rx.c.q.a(D d0) {
                        this.a = d0;
                        super();
                    }

                    @Override  // io.realm.w0
                    public void a(Object object0, v0 v00) {
                        this.b(((g1)object0), v00);
                    }

                    public void b(g1 g10, v0 v00) {
                        if(!this.a.a()) {
                            D d0 = this.a;
                            if(c.this.a) {
                                g10 = g10.A();
                            }
                            d0.onNext(new io.realm.rx.a(g10, v00));
                        }
                    }
                }


                class io.realm.rx.c.q.b implements Runnable {
                    final E a;
                    final w0 b;
                    final q c;

                    io.realm.rx.c.q.b(E e0, w0 w00) {
                        this.a = e0;
                        this.b = w00;
                        super();
                    }

                    @Override
                    public void run() {
                        if(!this.a.isClosed()) {
                            q.this.a.E(this.b);
                            this.a.close();
                        }
                        ((r)c.this.b.get()).b(q.this.a);
                    }
                }

                if(!this.a.s()) {
                    return;
                }
                E e0 = E.p2(this.b);
                ((r)c.this.b.get()).a(this.a);
                io.realm.rx.c.q.a c$q$a0 = new io.realm.rx.c.q.a(this, d0);
                this.a.k(c$q$a0);
                d0.d(io.reactivex.disposables.d.f(new io.realm.rx.c.q.b(this, e0, c$q$a0)));
                d0.onNext(new io.realm.rx.a((c.this.a ? this.a.A() : this.a), null));
            }
        }

        if(e0.x0()) {
            return B.m3(new io.realm.rx.a(g10, null));
        }
        Q0 q00 = e0.T();
        J j0 = this.u();
        return B.r1(new q(this, g10, q00)).J5(j0).n7(j0);
    }

    @Override  // io.realm.rx.d
    public B o(F0 f00, g1 g10) {
        class io.realm.rx.c.o implements io.reactivex.E {
            final g1 a;
            final Q0 b;
            final c c;

            io.realm.rx.c.o(g1 g10, Q0 q00) {
                this.a = g10;
                this.b = q00;
                super();
            }

            @Override  // io.reactivex.E
            public void a(D d0) {
                class io.realm.rx.c.o.a implements w0 {
                    final D a;
                    final io.realm.rx.c.o b;

                    io.realm.rx.c.o.a(D d0) {
                        this.a = d0;
                        super();
                    }

                    @Override  // io.realm.w0
                    public void a(Object object0, v0 v00) {
                        this.b(((g1)object0), v00);
                    }

                    public void b(g1 g10, v0 v00) {
                        if(!this.a.a()) {
                            g1 g11 = c.this.a ? io.realm.rx.c.o.this.a.A() : io.realm.rx.c.o.this.a;
                            this.a.onNext(new io.realm.rx.a(g11, v00));
                        }
                    }
                }


                class io.realm.rx.c.o.b implements Runnable {
                    final F0 a;
                    final w0 b;
                    final io.realm.rx.c.o c;

                    io.realm.rx.c.o.b(F0 f00, w0 w00) {
                        this.a = f00;
                        this.b = w00;
                        super();
                    }

                    @Override
                    public void run() {
                        if(!this.a.isClosed()) {
                            io.realm.rx.c.o.this.a.E(this.b);
                            this.a.close();
                        }
                        ((r)c.this.b.get()).b(io.realm.rx.c.o.this.a);
                    }
                }

                if(!this.a.s()) {
                    return;
                }
                F0 f00 = F0.k4(this.b);
                ((r)c.this.b.get()).a(this.a);
                io.realm.rx.c.o.a c$o$a0 = new io.realm.rx.c.o.a(this, d0);
                this.a.k(c$o$a0);
                d0.d(io.reactivex.disposables.d.f(new io.realm.rx.c.o.b(this, f00, c$o$a0)));
                d0.onNext(new io.realm.rx.a((c.this.a ? this.a.A() : this.a), null));
            }
        }

        if(f00.x0()) {
            return B.m3(new io.realm.rx.a(g10, null));
        }
        Q0 q00 = f00.T();
        J j0 = this.u();
        return B.r1(new io.realm.rx.c.o(this, g10, q00)).J5(j0).n7(j0);
    }

    @Override  // io.realm.rx.d
    public B p(F0 f00, X0 x00) {
        class f implements io.reactivex.E {
            final X0 a;
            final Q0 b;
            final c c;

            f(X0 x00, Q0 q00) {
                this.a = x00;
                this.b = q00;
                super();
            }

            @Override  // io.reactivex.E
            public void a(D d0) {
                class io.realm.rx.c.f.a implements e1 {
                    final D a;
                    final f b;

                    io.realm.rx.c.f.a(D d0) {
                        this.a = d0;
                        super();
                    }

                    @Override  // io.realm.e1
                    public void a(X0 x00, q0 q00) {
                        if(!this.a.a()) {
                            D d0 = this.a;
                            if(c.this.a) {
                                x00 = d1.C5(x00);
                            }
                            d0.onNext(new io.realm.rx.b(x00, q00));
                        }
                    }
                }


                class io.realm.rx.c.f.b implements Runnable {
                    final F0 a;
                    final e1 b;
                    final f c;

                    io.realm.rx.c.f.b(F0 f00, e1 e10) {
                        this.a = f00;
                        this.b = e10;
                        super();
                    }

                    @Override
                    public void run() {
                        if(!this.a.isClosed()) {
                            d1.O5(f.this.a, this.b);
                            this.a.close();
                        }
                        ((r)c.this.d.get()).b(f.this.a);
                    }
                }

                if(!d1.I5(this.a)) {
                    return;
                }
                F0 f00 = F0.k4(this.b);
                ((r)c.this.d.get()).a(this.a);
                io.realm.rx.c.f.a c$f$a0 = new io.realm.rx.c.f.a(this, d0);
                d1.t5(this.a, c$f$a0);
                d0.d(io.reactivex.disposables.d.f(new io.realm.rx.c.f.b(this, f00, c$f$a0)));
                d0.onNext(new io.realm.rx.b((c.this.a ? d1.C5(this.a) : this.a), null));
            }
        }

        if(f00.x0()) {
            return B.m3(new io.realm.rx.b(x00, null));
        }
        Q0 q00 = f00.T();
        J j0 = this.u();
        return B.r1(new f(this, x00, q00)).J5(j0).n7(j0);
    }

    private J u() {
        Looper looper0 = Looper.myLooper();
        if(looper0 == null) {
            throw new IllegalStateException("No looper found");
        }
        return io.reactivex.android.schedulers.b.a(looper0);
    }
}

