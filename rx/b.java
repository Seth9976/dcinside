package rx;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.functions.m;
import rx.functions.o;
import rx.functions.p;
import rx.internal.operators.q;
import rx.internal.operators.r;
import rx.internal.util.s;
import rx.plugins.c;
import rx.subscriptions.e;
import rx.subscriptions.f;

public class b {
    public interface J extends rx.functions.b {
    }

    public interface K extends p {
    }

    public interface L extends p {
    }

    static final class k implements J {
        public void a(d d0) {
            d0.a(f.e());
            d0.d();
        }

        @Override  // rx.functions.b
        public void b(Object object0) {
            this.a(((d)object0));
        }
    }

    static final class v implements J {
        public void a(d d0) {
            d0.a(f.e());
        }

        @Override  // rx.functions.b
        public void b(Object object0) {
            this.a(((d)object0));
        }
    }

    private final J a;
    static final b b;
    static final b c;

    static {
        b.b = new b(new k(), false);
        b.c = new b(new v(), false);
    }

    protected b(J b$J0) {
        this.a = c.F(b$J0);
    }

    protected b(J b$J0, boolean z) {
        if(z) {
            b$J0 = c.F(b$J0);
        }
        this.a = b$J0;
    }

    public final b A(rx.functions.b b0) {
        return this.z(b0, m.a(), m.a(), m.a(), m.a());
    }

    public static b A0(long v, TimeUnit timeUnit0, j j0) {
        static final class rx.b.c implements J {
            final j a;
            final long b;
            final TimeUnit c;

            rx.b.c(j j0, long v, TimeUnit timeUnit0) {
                this.a = j0;
                this.b = v;
                this.c = timeUnit0;
                super();
            }

            public void a(d d0) {
                class a implements rx.functions.a {
                    final d a;
                    final rx.j.a b;
                    final rx.b.c c;

                    a(d d0, rx.j.a j$a0) {
                        this.a = d0;
                        this.b = j$a0;
                        super();
                    }

                    @Override  // rx.functions.a
                    public void call() {
                        try {
                            this.a.d();
                        }
                        finally {
                            this.b.l();
                        }
                    }
                }

                rx.subscriptions.c c0 = new rx.subscriptions.c();
                d0.a(c0);
                if(!c0.j()) {
                    rx.j.a j$a0 = this.a.a();
                    c0.b(j$a0);
                    j$a0.d(new a(this, d0, j$a0), this.b, this.c);
                }
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((d)object0));
            }
        }

        b.g0(timeUnit0);
        b.g0(j0);
        return b.p(new rx.b.c(j0, v, timeUnit0));
    }

    public final b B(rx.functions.a a0) {
        class l implements rx.functions.b {
            final rx.functions.a a;
            final b b;

            l(rx.functions.a a0) {
                this.a = a0;
                super();
            }

            public void a(Throwable throwable0) {
                this.a.call();
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((Throwable)object0));
            }
        }

        return this.z(m.a(), new l(this, a0), a0, m.a(), m.a());
    }

    public final Object B0(p p0) {
        return p0.b(this);
    }

    public final b C(rx.functions.a a0) {
        return this.z(m.a(), m.a(), m.a(), m.a(), a0);
    }

    static NullPointerException C0(Throwable throwable0) {
        NullPointerException nullPointerException0 = new NullPointerException("Actually not, but can\'t pass out an exception otherwise...");
        nullPointerException0.initCause(throwable0);
        return nullPointerException0;
    }

    public static b D(Throwable throwable0) {
        static final class G implements J {
            final Throwable a;

            G(Throwable throwable0) {
                this.a = throwable0;
                super();
            }

            public void a(d d0) {
                d0.a(f.e());
                d0.onError(this.a);
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((d)object0));
            }
        }

        b.g0(throwable0);
        return b.p(new G(throwable0));
    }

    public final g D0() {
        class z implements rx.g.a {
            final b a;

            public void a(n n0) {
                b.this.H0(n0);
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((n)object0));
            }
        }

        return g.M6(new z(this));
    }

    public static b E(o o0) {
        static final class F implements J {
            final o a;

            F(o o0) {
                this.a = o0;
                super();
            }

            public void a(d d0) {
                d0.a(f.e());
                try {
                    throwable0 = (Throwable)this.a.call();
                }
                catch(Throwable throwable0) {
                }
                if(throwable0 == null) {
                    throwable0 = new NullPointerException("The error supplied is null");
                }
                d0.onError(throwable0);
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((d)object0));
            }
        }

        b.g0(o0);
        return b.p(new F(o0));
    }

    public final rx.k E0(o o0) {
        class A implements t {
            final o a;
            final b b;

            A(o o0) {
                this.a = o0;
                super();
            }

            public void a(rx.m m0) {
                class rx.b.A.a implements d {
                    final rx.m a;
                    final A b;

                    rx.b.A.a(rx.m m0) {
                        this.a = m0;
                        super();
                    }

                    @Override  // rx.d
                    public void a(rx.o o0) {
                        this.a.c(o0);
                    }

                    @Override  // rx.d
                    public void d() {
                        Object object0;
                        try {
                            object0 = A.this.a.call();
                        }
                        catch(Throwable throwable0) {
                            this.a.onError(throwable0);
                            return;
                        }
                        if(object0 == null) {
                            NullPointerException nullPointerException0 = new NullPointerException("The value supplied is null");
                            this.a.onError(nullPointerException0);
                            return;
                        }
                        this.a.e(object0);
                    }

                    @Override  // rx.d
                    public void onError(Throwable throwable0) {
                        this.a.onError(throwable0);
                    }
                }

                rx.b.A.a b$A$a0 = new rx.b.A.a(this, m0);
                b.this.G0(b$A$a0);
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((rx.m)object0));
            }
        }

        b.g0(o0);
        return rx.k.n(new A(this, o0));
    }

    public static b F(rx.functions.a a0) {
        static final class H implements J {
            final rx.functions.a a;

            H(rx.functions.a a0) {
                this.a = a0;
                super();
            }

            public void a(d d0) {
                rx.subscriptions.a a0 = new rx.subscriptions.a();
                d0.a(a0);
                try {
                    this.a.call();
                }
                catch(Throwable throwable0) {
                    if(!a0.j()) {
                        d0.onError(throwable0);
                    }
                    return;
                }
                if(!a0.j()) {
                    d0.d();
                }
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((d)object0));
            }
        }

        b.g0(a0);
        return b.p(new H(a0));
    }

    public final rx.k F0(Object object0) {
        class B implements o {
            final Object a;
            final b b;

            B(Object object0) {
                this.a = object0;
                super();
            }

            @Override  // rx.functions.o
            public Object call() {
                return this.a;
            }
        }

        b.g0(object0);
        return this.E0(new B(this, object0));
    }

    public static b G(Callable callable0) {
        static final class I implements J {
            final Callable a;

            I(Callable callable0) {
                this.a = callable0;
                super();
            }

            public void a(d d0) {
                rx.subscriptions.a a0 = new rx.subscriptions.a();
                d0.a(a0);
                try {
                    this.a.call();
                }
                catch(Throwable throwable0) {
                    if(!a0.j()) {
                        d0.onError(throwable0);
                    }
                    return;
                }
                if(!a0.j()) {
                    d0.d();
                }
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((d)object0));
            }
        }

        b.g0(callable0);
        return b.p(new I(callable0));
    }

    public final void G0(d d0) {
        b.g0(d0);
        try {
            c.D(this, this.a).b(d0);
        }
        catch(NullPointerException nullPointerException0) {
            throw nullPointerException0;
        }
        catch(Throwable throwable0) {
            rx.exceptions.c.e(throwable0);
            Throwable throwable1 = c.B(throwable0);
            c.I(throwable1);
            throw b.C0(throwable1);
        }
    }

    public static b H(rx.functions.b b0) {
        return b.p(new rx.internal.operators.j(b0));
    }

    public final void H0(n n0) {
        this.I0(n0, true);
    }

    public static b I(Future future0) {
        b.g0(future0);
        return b.J(g.z2(future0));
    }

    private void I0(n n0, boolean z) {
        class x implements d {
            final n a;
            final b b;

            x(n n0) {
                this.a = n0;
                super();
            }

            @Override  // rx.d
            public void a(rx.o o0) {
                this.a.q(o0);
            }

            @Override  // rx.d
            public void d() {
                this.a.d();
            }

            @Override  // rx.d
            public void onError(Throwable throwable0) {
                this.a.onError(throwable0);
            }
        }

        b.g0(n0);
        try {
            if(z) {
                n0.onStart();
            }
            this.G0(new x(this, n0));
            c.N(n0);
            return;
        }
        catch(NullPointerException nullPointerException0) {
        }
        catch(Throwable throwable0) {
            goto label_10;
        }
        throw nullPointerException0;
    label_10:
        rx.exceptions.c.e(throwable0);
        Throwable throwable1 = c.L(throwable0);
        c.I(throwable1);
        throw b.C0(throwable1);
    }

    public static b J(g g0) {
        static final class rx.b.a implements J {
            final g a;

            rx.b.a(g g0) {
                this.a = g0;
                super();
            }

            public void a(d d0) {
                class rx.b.a.a extends n {
                    final d f;
                    final rx.b.a g;

                    rx.b.a.a(d d0) {
                        this.f = d0;
                        super();
                    }

                    @Override  // rx.h
                    public void d() {
                        this.f.d();
                    }

                    @Override  // rx.h
                    public void onError(Throwable throwable0) {
                        this.f.onError(throwable0);
                    }

                    @Override  // rx.h
                    public void onNext(Object object0) {
                    }
                }

                rx.b.a.a b$a$a0 = new rx.b.a.a(this, d0);
                d0.a(b$a$a0);
                this.a.N6(b$a$a0);
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((d)object0));
            }
        }

        b.g0(g0);
        return b.p(new rx.b.a(g0));
    }

    public final b J0(j j0) {
        class C implements J {
            final j a;
            final b b;

            C(j j0) {
                this.a = j0;
                super();
            }

            public void a(d d0) {
                class rx.b.C.a implements d {
                    final d a;
                    final C b;

                    rx.b.C.a(d d0) {
                        this.a = d0;
                        super();
                    }

                    @Override  // rx.d
                    public void a(rx.o o0) {
                        class rx.b.C.a.a implements rx.functions.a {
                            final rx.o a;
                            final rx.b.C.a b;

                            rx.b.C.a.a(rx.o o0) {
                                this.a = o0;
                                super();
                            }

                            @Override  // rx.functions.a
                            public void call() {
                                class rx.b.C.a.a.a implements rx.functions.a {
                                    final rx.j.a a;
                                    final rx.b.C.a.a b;

                                    rx.b.C.a.a.a(rx.j.a j$a0) {
                                        this.a = j$a0;
                                        super();
                                    }

                                    @Override  // rx.functions.a
                                    public void call() {
                                        try {
                                            rx.b.C.a.a.this.a.l();
                                        }
                                        finally {
                                            this.a.l();
                                        }
                                    }
                                }

                                rx.j.a j$a0 = C.this.a.a();
                                j$a0.c(new rx.b.C.a.a.a(this, j$a0));
                            }
                        }

                        rx.o o1 = f.a(new rx.b.C.a.a(this, o0));
                        this.a.a(o1);
                    }

                    @Override  // rx.d
                    public void d() {
                        this.a.d();
                    }

                    @Override  // rx.d
                    public void onError(Throwable throwable0) {
                        this.a.onError(throwable0);
                    }
                }

                rx.b.C.a b$C$a0 = new rx.b.C.a(this, d0);
                b.this.G0(b$C$a0);
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((d)object0));
            }
        }

        b.g0(j0);
        return b.p(new C(this, j0));
    }

    public static b K(rx.k k0) {
        static final class rx.b.b implements J {
            final rx.k a;

            rx.b.b(rx.k k0) {
                this.a = k0;
                super();
            }

            public void a(d d0) {
                class rx.b.b.a extends rx.m {
                    final d b;
                    final rx.b.b c;

                    rx.b.b.a(d d0) {
                        this.b = d0;
                        super();
                    }

                    @Override  // rx.m
                    public void e(Object object0) {
                        this.b.d();
                    }

                    @Override  // rx.m
                    public void onError(Throwable throwable0) {
                        this.b.onError(throwable0);
                    }
                }

                rx.b.b.a b$b$a0 = new rx.b.b.a(this, d0);
                d0.a(b$b$a0);
                this.a.j0(b$b$a0);
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((d)object0));
            }
        }

        b.g0(k0);
        return b.p(new rx.b.b(k0));
    }

    public static b K0(o o0, p p0, rx.functions.b b0) {
        return b.L0(o0, p0, b0, true);
    }

    public final Throwable L() {
        class rx.b.m implements d {
            final CountDownLatch a;
            final Throwable[] b;
            final b c;

            rx.b.m(CountDownLatch countDownLatch0, Throwable[] arr_throwable) {
                this.a = countDownLatch0;
                this.b = arr_throwable;
                super();
            }

            @Override  // rx.d
            public void a(rx.o o0) {
            }

            @Override  // rx.d
            public void d() {
                this.a.countDown();
            }

            @Override  // rx.d
            public void onError(Throwable throwable0) {
                this.b[0] = throwable0;
                this.a.countDown();
            }
        }

        CountDownLatch countDownLatch0 = new CountDownLatch(1);
        Throwable[] arr_throwable = new Throwable[1];
        this.G0(new rx.b.m(this, countDownLatch0, arr_throwable));
        if(countDownLatch0.getCount() == 0L) {
            return arr_throwable[0];
        }
        try {
            countDownLatch0.await();
            return arr_throwable[0];
        }
        catch(InterruptedException interruptedException0) {
            throw rx.exceptions.c.c(interruptedException0);
        }
    }

    public static b L0(o o0, p p0, rx.functions.b b0, boolean z) {
        static final class rx.b.d implements J {
            final o a;
            final p b;
            final rx.functions.b c;
            final boolean d;

            rx.b.d(o o0, p p0, rx.functions.b b0, boolean z) {
                this.a = o0;
                this.b = p0;
                this.c = b0;
                this.d = z;
                super();
            }

            public void a(d d0) {
                class rx.b.d.a implements d {
                    rx.o a;
                    final AtomicBoolean b;
                    final Object c;
                    final d d;
                    final rx.b.d e;

                    rx.b.d.a(AtomicBoolean atomicBoolean0, Object object0, d d0) {
                        this.b = atomicBoolean0;
                        this.c = object0;
                        this.d = d0;
                        super();
                    }

                    @Override  // rx.d
                    public void a(rx.o o0) {
                        class rx.b.d.a.a implements rx.functions.a {
                            final rx.b.d.a a;

                            @Override  // rx.functions.a
                            public void call() {
                                rx.b.d.a.this.b();
                            }
                        }

                        this.a = o0;
                        rx.o o1 = f.a(() -> {
                            rx.b.d.a.this.a.l();
                            if(rx.b.d.a.this.b.compareAndSet(false, true)) {
                                try {
                                    rx.b.d.this.c.b(rx.b.d.a.this.c);
                                }
                                catch(Throwable throwable0) {
                                    c.I(throwable0);
                                }
                            }
                        });
                        this.d.a(o1);
                    }

                    // 检测为 Lambda 实现
                    void b() [...]

                    @Override  // rx.d
                    public void d() {
                        if(rx.b.d.this.d && this.b.compareAndSet(false, true)) {
                            try {
                                rx.b.d.this.c.b(this.c);
                            }
                            catch(Throwable throwable0) {
                                this.d.onError(throwable0);
                                return;
                            }
                        }
                        this.d.d();
                        if(!rx.b.d.this.d) {
                            this.b();
                        }
                    }

                    @Override  // rx.d
                    public void onError(Throwable throwable0) {
                        if(rx.b.d.this.d && this.b.compareAndSet(false, true)) {
                            try {
                                rx.b.d.this.c.b(this.c);
                            }
                            catch(Throwable throwable1) {
                                throwable0 = new rx.exceptions.b(Arrays.asList(new Throwable[]{throwable0, throwable1}));
                            }
                        }
                        this.d.onError(throwable0);
                        if(!rx.b.d.this.d) {
                            this.b();
                        }
                    }
                }

                b b0;
                Object object0;
                try {
                    object0 = this.a.call();
                }
                catch(Throwable throwable0) {
                    d0.a(f.e());
                    d0.onError(throwable0);
                    return;
                }
                try {
                    b0 = (b)this.b.b(object0);
                }
                catch(Throwable throwable1) {
                    try {
                        this.c.b(object0);
                    }
                    catch(Throwable throwable2) {
                        rx.exceptions.c.e(throwable1);
                        rx.exceptions.c.e(throwable2);
                        d0.a(f.e());
                        d0.onError(new rx.exceptions.b(Arrays.asList(new Throwable[]{throwable1, throwable2})));
                        return;
                    }
                    rx.exceptions.c.e(throwable1);
                    d0.a(f.e());
                    d0.onError(throwable1);
                    return;
                }
                if(b0 == null) {
                    try {
                        this.c.b(object0);
                    }
                    catch(Throwable throwable3) {
                        rx.exceptions.c.e(throwable3);
                        d0.a(f.e());
                        d0.onError(new rx.exceptions.b(Arrays.asList(new Throwable[]{new NullPointerException("The completable supplied is null"), throwable3})));
                        return;
                    }
                    d0.a(f.e());
                    d0.onError(new NullPointerException("The completable supplied is null"));
                    return;
                }
                b0.G0(new rx.b.d.a(this, new AtomicBoolean(), object0, d0));
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((d)object0));
            }
        }

        b.g0(o0);
        b.g0(p0);
        b.g0(b0);
        return b.p(new rx.b.d(o0, p0, b0, z));
    }

    public final Throwable M(long v, TimeUnit timeUnit0) {
        class rx.b.n implements d {
            final CountDownLatch a;
            final Throwable[] b;
            final b c;

            rx.b.n(CountDownLatch countDownLatch0, Throwable[] arr_throwable) {
                this.a = countDownLatch0;
                this.b = arr_throwable;
                super();
            }

            @Override  // rx.d
            public void a(rx.o o0) {
            }

            @Override  // rx.d
            public void d() {
                this.a.countDown();
            }

            @Override  // rx.d
            public void onError(Throwable throwable0) {
                this.b[0] = throwable0;
                this.a.countDown();
            }
        }

        b.g0(timeUnit0);
        CountDownLatch countDownLatch0 = new CountDownLatch(1);
        Throwable[] arr_throwable = new Throwable[1];
        this.G0(new rx.b.n(this, countDownLatch0, arr_throwable));
        if(countDownLatch0.getCount() == 0L) {
            return arr_throwable[0];
        }
        try {
            if(countDownLatch0.await(v, timeUnit0)) {
                return arr_throwable[0];
            }
        }
        catch(InterruptedException interruptedException0) {
            throw rx.exceptions.c.c(interruptedException0);
        }
        rx.exceptions.c.c(new TimeoutException());
        return null;
    }

    public final b N(K b$K0) {
        class rx.b.o implements J {
            final K a;
            final b b;

            rx.b.o(K b$K0) {
                this.a = b$K0;
                super();
            }

            public void a(d d0) {
                try {
                    d d1 = (d)c.C(this.a).b(d0);
                    b.this.G0(d1);
                }
                catch(NullPointerException nullPointerException0) {
                    throw nullPointerException0;
                }
                catch(Throwable throwable0) {
                    throw b.C0(throwable0);
                }
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((d)object0));
            }
        }

        b.g0(b$K0);
        return b.p(new rx.b.o(this, b$K0));
    }

    public static b O(Iterable iterable0) {
        b.g0(iterable0);
        return b.p(new r(iterable0));
    }

    public static b P(g g0) {
        return b.S(g0, 0x7FFFFFFF, false);
    }

    public static b Q(g g0, int v) {
        return b.S(g0, v, false);
    }

    public static b R(b[] arr_b) {
        b.g0(arr_b);
        if(arr_b.length == 0) {
            return b.i();
        }
        return arr_b.length == 1 ? arr_b[0] : b.p(new rx.internal.operators.o(arr_b));
    }

    protected static b S(g g0, int v, boolean z) {
        b.g0(g0);
        if(v < 1) {
            throw new IllegalArgumentException("maxConcurrency > 0 required but it was " + v);
        }
        return b.p(new rx.internal.operators.n(g0, v, z));
    }

    public static b T(Iterable iterable0) {
        b.g0(iterable0);
        return b.p(new q(iterable0));
    }

    public static b U(g g0) {
        return b.S(g0, 0x7FFFFFFF, true);
    }

    public static b V(g g0, int v) {
        return b.S(g0, v, true);
    }

    public static b W(b[] arr_b) {
        b.g0(arr_b);
        return b.p(new rx.internal.operators.p(arr_b));
    }

    public final b X(b b0) {
        b.g0(b0);
        return b.R(new b[]{this, b0});
    }

    public static b Y() {
        J b$J0 = c.F(b.c.a);
        return b$J0 == b.c.a ? b.c : new b(b$J0, false);
    }

    public final b Z(j j0) {
        class rx.b.p implements J {
            final j a;
            final b b;

            rx.b.p(j j0) {
                this.a = j0;
                super();
            }

            public void a(d d0) {
                class rx.b.p.a implements d {
                    final rx.j.a a;
                    final d b;
                    final rx.internal.util.q c;
                    final rx.b.p d;

                    rx.b.p.a(rx.j.a j$a0, d d0, rx.internal.util.q q0) {
                        this.a = j$a0;
                        this.b = d0;
                        this.c = q0;
                        super();
                    }

                    @Override  // rx.d
                    public void a(rx.o o0) {
                        this.c.a(o0);
                    }

                    @Override  // rx.d
                    public void d() {
                        class rx.b.p.a.a implements rx.functions.a {
                            final rx.b.p.a a;

                            @Override  // rx.functions.a
                            public void call() {
                                try {
                                    rx.b.p.a.this.b.d();
                                }
                                finally {
                                    rx.b.p.a.this.c.l();
                                }
                            }
                        }

                        rx.b.p.a.a b$p$a$a0 = new rx.b.p.a.a(this);
                        this.a.c(b$p$a$a0);
                    }

                    @Override  // rx.d
                    public void onError(Throwable throwable0) {
                        class rx.b.p.a.b implements rx.functions.a {
                            final Throwable a;
                            final rx.b.p.a b;

                            rx.b.p.a.b(Throwable throwable0) {
                                this.a = throwable0;
                                super();
                            }

                            @Override  // rx.functions.a
                            public void call() {
                                try {
                                    rx.b.p.a.this.b.onError(this.a);
                                }
                                finally {
                                    rx.b.p.a.this.c.l();
                                }
                            }
                        }

                        rx.b.p.a.b b$p$a$b0 = new rx.b.p.a.b(this, throwable0);
                        this.a.c(b$p$a$b0);
                    }
                }

                rx.internal.util.q q0 = new rx.internal.util.q();
                rx.j.a j$a0 = this.a.a();
                q0.a(j$a0);
                d0.a(q0);
                rx.b.p.a b$p$a0 = new rx.b.p.a(this, j$a0, d0, q0);
                b.this.G0(b$p$a0);
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((d)object0));
            }
        }

        b.g0(j0);
        return b.p(new rx.b.p(this, j0));
    }

    public static b a(Iterable iterable0) {
        static final class D implements J {
            final Iterable a;

            D(Iterable iterable0) {
                this.a = iterable0;
                super();
            }

            public void a(d d0) {
                class rx.b.D.a implements d {
                    final AtomicBoolean a;
                    final rx.subscriptions.b b;
                    final d c;
                    final D d;

                    rx.b.D.a(AtomicBoolean atomicBoolean0, rx.subscriptions.b b0, d d0) {
                        this.a = atomicBoolean0;
                        this.b = b0;
                        this.c = d0;
                        super();
                    }

                    @Override  // rx.d
                    public void a(rx.o o0) {
                        this.b.a(o0);
                    }

                    @Override  // rx.d
                    public void d() {
                        if(this.a.compareAndSet(false, true)) {
                            this.b.l();
                            this.c.d();
                        }
                    }

                    @Override  // rx.d
                    public void onError(Throwable throwable0) {
                        if(this.a.compareAndSet(false, true)) {
                            this.b.l();
                            this.c.onError(throwable0);
                            return;
                        }
                        c.I(throwable0);
                    }
                }

                b b1;
                Iterator iterator0;
                rx.subscriptions.b b0 = new rx.subscriptions.b();
                d0.a(b0);
                try {
                    iterator0 = this.a.iterator();
                }
                catch(Throwable throwable0) {
                    d0.onError(throwable0);
                    return;
                }
                if(iterator0 == null) {
                    d0.onError(new NullPointerException("The iterator returned is null"));
                    return;
                }
                AtomicBoolean atomicBoolean0 = new AtomicBoolean();
                rx.b.D.a b$D$a0 = new rx.b.D.a(this, atomicBoolean0, b0, d0);
                boolean z = true;
                while(!atomicBoolean0.get() && !b0.j()) {
                    try {
                        if(!iterator0.hasNext()) {
                            goto label_23;
                        }
                        goto label_26;
                    }
                    catch(Throwable throwable1) {
                        if(atomicBoolean0.compareAndSet(false, true)) {
                            b0.l();
                            d0.onError(throwable1);
                            return;
                        }
                        c.I(throwable1);
                        return;
                    }
                label_23:
                    if(z) {
                        d0.d();
                    }
                    return;
                label_26:
                    if(!atomicBoolean0.get() && !b0.j()) {
                        try {
                            Object object0 = iterator0.next();
                            b1 = (b)object0;
                        }
                        catch(Throwable throwable2) {
                            if(atomicBoolean0.compareAndSet(false, true)) {
                                b0.l();
                                d0.onError(throwable2);
                                return;
                            }
                            c.I(throwable2);
                            return;
                        }
                        if(b1 == null) {
                            NullPointerException nullPointerException0 = new NullPointerException("One of the sources is null");
                            if(atomicBoolean0.compareAndSet(false, true)) {
                                b0.l();
                                d0.onError(nullPointerException0);
                                return;
                            }
                            c.I(nullPointerException0);
                            return;
                        }
                        if(!atomicBoolean0.get() && !b0.j()) {
                            b1.G0(b$D$a0);
                            z = false;
                            continue;
                        }
                        return;
                    }
                    return;
                }
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((d)object0));
            }
        }

        b.g0(iterable0);
        return b.p(new D(iterable0));
    }

    public final b a0() {
        return this.b0(s.b());
    }

    public static b b(b[] arr_b) {
        static final class w implements J {
            final b[] a;

            w(b[] arr_b) {
                this.a = arr_b;
                super();
            }

            public void a(d d0) {
                class rx.b.w.a implements d {
                    final AtomicBoolean a;
                    final rx.subscriptions.b b;
                    final d c;
                    final w d;

                    rx.b.w.a(AtomicBoolean atomicBoolean0, rx.subscriptions.b b0, d d0) {
                        this.a = atomicBoolean0;
                        this.b = b0;
                        this.c = d0;
                        super();
                    }

                    @Override  // rx.d
                    public void a(rx.o o0) {
                        this.b.a(o0);
                    }

                    @Override  // rx.d
                    public void d() {
                        if(this.a.compareAndSet(false, true)) {
                            this.b.l();
                            this.c.d();
                        }
                    }

                    @Override  // rx.d
                    public void onError(Throwable throwable0) {
                        if(this.a.compareAndSet(false, true)) {
                            this.b.l();
                            this.c.onError(throwable0);
                            return;
                        }
                        c.I(throwable0);
                    }
                }

                rx.subscriptions.b b0 = new rx.subscriptions.b();
                d0.a(b0);
                AtomicBoolean atomicBoolean0 = new AtomicBoolean();
                rx.b.w.a b$w$a0 = new rx.b.w.a(this, atomicBoolean0, b0, d0);
                b[] arr_b = this.a;
                for(int v = 0; v < arr_b.length; ++v) {
                    b b1 = arr_b[v];
                    if(b0.j()) {
                        return;
                    }
                    if(b1 == null) {
                        NullPointerException nullPointerException0 = new NullPointerException("One of the sources is null");
                        if(atomicBoolean0.compareAndSet(false, true)) {
                            b0.l();
                            d0.onError(nullPointerException0);
                            return;
                        }
                        c.I(nullPointerException0);
                        return;
                    }
                    if(atomicBoolean0.get() || b0.j()) {
                        break;
                    }
                    b1.G0(b$w$a0);
                }
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((d)object0));
            }
        }

        b.g0(arr_b);
        if(arr_b.length == 0) {
            return b.i();
        }
        return arr_b.length == 1 ? arr_b[0] : b.p(new w(arr_b));
    }

    public final b b0(p p0) {
        class rx.b.q implements J {
            final p a;
            final b b;

            rx.b.q(p p0) {
                this.a = p0;
                super();
            }

            public void a(d d0) {
                class rx.b.q.a implements d {
                    final d a;
                    final rx.b.q b;

                    rx.b.q.a(d d0) {
                        this.a = d0;
                        super();
                    }

                    @Override  // rx.d
                    public void a(rx.o o0) {
                        this.a.a(o0);
                    }

                    @Override  // rx.d
                    public void d() {
                        this.a.d();
                    }

                    @Override  // rx.d
                    public void onError(Throwable throwable0) {
                        boolean z;
                        try {
                            z = ((Boolean)rx.b.q.this.a.b(throwable0)).booleanValue();
                        }
                        catch(Throwable throwable1) {
                            z = false;
                            rx.exceptions.c.e(throwable1);
                            throwable0 = new rx.exceptions.b(Arrays.asList(new Throwable[]{throwable0, throwable1}));
                        }
                        if(z) {
                            this.a.d();
                            return;
                        }
                        this.a.onError(throwable0);
                    }
                }

                rx.b.q.a b$q$a0 = new rx.b.q.a(this, d0);
                b.this.G0(b$q$a0);
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((d)object0));
            }
        }

        b.g0(p0);
        return b.p(new rx.b.q(this, p0));
    }

    public final b c(b b0) {
        b.g0(b0);
        return b.b(new b[]{this, b0});
    }

    public final b c0(p p0) {
        class rx.b.r implements J {
            final p a;
            final b b;

            rx.b.r(p p0) {
                this.a = p0;
                super();
            }

            public void a(d d0) {
                class rx.b.r.a implements d {
                    final d a;
                    final e b;
                    final rx.b.r c;

                    rx.b.r.a(d d0, e e0) {
                        this.a = d0;
                        this.b = e0;
                        super();
                    }

                    @Override  // rx.d
                    public void a(rx.o o0) {
                        this.b.b(o0);
                    }

                    @Override  // rx.d
                    public void d() {
                        this.a.d();
                    }

                    @Override  // rx.d
                    public void onError(Throwable throwable0) {
                        class rx.b.r.a.a implements d {
                            final rx.b.r.a a;

                            @Override  // rx.d
                            public void a(rx.o o0) {
                                rx.b.r.a.this.b.b(o0);
                            }

                            @Override  // rx.d
                            public void d() {
                                rx.b.r.a.this.a.d();
                            }

                            @Override  // rx.d
                            public void onError(Throwable throwable0) {
                                rx.b.r.a.this.a.onError(throwable0);
                            }
                        }

                        b b0;
                        try {
                            b0 = (b)rx.b.r.this.a.b(throwable0);
                        }
                        catch(Throwable throwable1) {
                            rx.exceptions.b b1 = new rx.exceptions.b(Arrays.asList(new Throwable[]{throwable0, throwable1}));
                            this.a.onError(b1);
                            return;
                        }
                        if(b0 == null) {
                            rx.exceptions.b b2 = new rx.exceptions.b(Arrays.asList(new Throwable[]{throwable0, new NullPointerException("The completable returned is null")}));
                            this.a.onError(b2);
                            return;
                        }
                        b0.G0(new rx.b.r.a.a(this));
                    }
                }

                e e0 = new e();
                d0.a(e0);
                rx.b.r.a b$r$a0 = new rx.b.r.a(this, d0, e0);
                b.this.G0(b$r$a0);
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((d)object0));
            }
        }

        b.g0(p0);
        return b.p(new rx.b.r(this, p0));
    }

    public final b d(b b0) {
        return this.o(b0);
    }

    public final b d0() {
        return b.J(this.D0().k4());
    }

    public final g e(g g0) {
        b.g0(g0);
        return g0.C1(this.D0());
    }

    public final b e0(long v) {
        return b.J(this.D0().l4(v));
    }

    public final rx.k f(rx.k k0) {
        b.g0(k0);
        return k0.r(this.D0());
    }

    public final b f0(p p0) {
        b.g0(p0);
        return b.J(this.D0().o4(p0));
    }

    public final void g() {
        class rx.b.e implements d {
            final CountDownLatch a;
            final Throwable[] b;
            final b c;

            rx.b.e(CountDownLatch countDownLatch0, Throwable[] arr_throwable) {
                this.a = countDownLatch0;
                this.b = arr_throwable;
                super();
            }

            @Override  // rx.d
            public void a(rx.o o0) {
            }

            @Override  // rx.d
            public void d() {
                this.a.countDown();
            }

            @Override  // rx.d
            public void onError(Throwable throwable0) {
                this.b[0] = throwable0;
                this.a.countDown();
            }
        }

        Throwable throwable1;
        CountDownLatch countDownLatch0 = new CountDownLatch(1);
        Throwable[] arr_throwable = new Throwable[1];
        this.G0(new rx.b.e(this, countDownLatch0, arr_throwable));
        if(countDownLatch0.getCount() == 0L) {
            Throwable throwable0 = arr_throwable[0];
            if(throwable0 != null) {
                rx.exceptions.c.c(throwable0);
            }
            return;
        }
        try {
            countDownLatch0.await();
            throwable1 = arr_throwable[0];
        }
        catch(InterruptedException interruptedException0) {
            throw rx.exceptions.c.c(interruptedException0);
        }
        if(throwable1 != null) {
            rx.exceptions.c.c(throwable1);
        }
    }

    static Object g0(Object object0) {
        object0.getClass();
        return object0;
    }

    public final boolean h(long v, TimeUnit timeUnit0) {
        class rx.b.f implements d {
            final CountDownLatch a;
            final Throwable[] b;
            final b c;

            rx.b.f(CountDownLatch countDownLatch0, Throwable[] arr_throwable) {
                this.a = countDownLatch0;
                this.b = arr_throwable;
                super();
            }

            @Override  // rx.d
            public void a(rx.o o0) {
            }

            @Override  // rx.d
            public void d() {
                this.a.countDown();
            }

            @Override  // rx.d
            public void onError(Throwable throwable0) {
                this.b[0] = throwable0;
                this.a.countDown();
            }
        }

        boolean z;
        b.g0(timeUnit0);
        CountDownLatch countDownLatch0 = new CountDownLatch(1);
        Throwable[] arr_throwable = new Throwable[1];
        this.G0(new rx.b.f(this, countDownLatch0, arr_throwable));
        if(countDownLatch0.getCount() == 0L) {
            Throwable throwable0 = arr_throwable[0];
            if(throwable0 != null) {
                rx.exceptions.c.c(throwable0);
            }
            return true;
        }
        try {
            z = countDownLatch0.await(v, timeUnit0);
        }
        catch(InterruptedException interruptedException0) {
            throw rx.exceptions.c.c(interruptedException0);
        }
        if(z) {
            Throwable throwable1 = arr_throwable[0];
            if(throwable1 != null) {
                rx.exceptions.c.c(throwable1);
            }
        }
        return z;
    }

    public final b h0() {
        return b.J(this.D0().G4());
    }

    public static b i() {
        J b$J0 = c.F(b.b.a);
        return b$J0 == b.b.a ? b.b : new b(b$J0, false);
    }

    public final b i0(long v) {
        return b.J(this.D0().H4(v));
    }

    public final b j(L b$L0) {
        return (b)this.B0(b$L0);
    }

    public final b j0(rx.functions.q q0) {
        return b.J(this.D0().I4(q0));
    }

    public static b k(Iterable iterable0) {
        b.g0(iterable0);
        return b.p(new rx.internal.operators.m(iterable0));
    }

    public final b k0(p p0) {
        return b.J(this.D0().J4(p0));
    }

    public static b l(g g0) {
        return b.m(g0, 2);
    }

    public final b l0(b b0) {
        b.g0(b0);
        return b.n(new b[]{b0, this});
    }

    public static b m(g g0, int v) {
        b.g0(g0);
        if(v < 1) {
            throw new IllegalArgumentException("prefetch > 0 required but it was " + v);
        }
        return b.p(new rx.internal.operators.k(g0, v));
    }

    public final g m0(g g0) {
        b.g0(g0);
        return this.D0().s5(g0);
    }

    public static b n(b[] arr_b) {
        b.g0(arr_b);
        if(arr_b.length == 0) {
            return b.i();
        }
        return arr_b.length == 1 ? arr_b[0] : b.p(new rx.internal.operators.l(arr_b));
    }

    public final rx.o n0() {
        class rx.b.s implements d {
            final rx.subscriptions.c a;
            final b b;

            rx.b.s(rx.subscriptions.c c0) {
                this.a = c0;
                super();
            }

            @Override  // rx.d
            public void a(rx.o o0) {
                this.a.b(o0);
            }

            @Override  // rx.d
            public void d() {
                this.a.l();
            }

            @Override  // rx.d
            public void onError(Throwable throwable0) {
                c.I(throwable0);
                this.a.l();
                b.u(throwable0);
            }
        }

        rx.o o0 = new rx.subscriptions.c();
        this.G0(new rx.b.s(this, ((rx.subscriptions.c)o0)));
        return o0;
    }

    public final b o(b b0) {
        b.g0(b0);
        return b.n(new b[]{this, b0});
    }

    public final rx.o o0(rx.functions.a a0) {
        class rx.b.t implements d {
            boolean a;
            final rx.functions.a b;
            final rx.subscriptions.c c;
            final b d;

            rx.b.t(rx.functions.a a0, rx.subscriptions.c c0) {
                this.b = a0;
                this.c = c0;
                super();
            }

            @Override  // rx.d
            public void a(rx.o o0) {
                this.c.b(o0);
            }

            @Override  // rx.d
            public void d() {
                if(!this.a) {
                    try {
                        this.a = true;
                        this.b.call();
                    }
                    catch(Throwable throwable0) {
                        c.I(throwable0);
                        b.u(throwable0);
                    }
                    finally {
                        this.c.l();
                    }
                }
            }

            @Override  // rx.d
            public void onError(Throwable throwable0) {
                c.I(throwable0);
                this.c.l();
                b.u(throwable0);
            }
        }

        b.g0(a0);
        rx.o o0 = new rx.subscriptions.c();
        this.G0(new rx.b.t(this, a0, ((rx.subscriptions.c)o0)));
        return o0;
    }

    public static b p(J b$J0) {
        b.g0(b$J0);
        try {
            return new b(b$J0);
        }
        catch(NullPointerException nullPointerException0) {
            throw nullPointerException0;
        }
        catch(Throwable throwable0) {
            c.I(throwable0);
            throw b.C0(throwable0);
        }
    }

    public final rx.o p0(rx.functions.a a0, rx.functions.b b0) {
        class u implements d {
            boolean a;
            final rx.functions.a b;
            final rx.subscriptions.c c;
            final rx.functions.b d;
            final b e;

            u(rx.functions.a a0, rx.subscriptions.c c0, rx.functions.b b1) {
                this.b = a0;
                this.c = c0;
                this.d = b1;
                super();
            }

            @Override  // rx.d
            public void a(rx.o o0) {
                this.c.b(o0);
            }

            void b(Throwable throwable0) {
                try {
                    this.d.b(throwable0);
                }
                catch(Throwable throwable1) {
                    rx.exceptions.b b0 = new rx.exceptions.b(Arrays.asList(new Throwable[]{throwable0, throwable1}));
                    c.I(b0);
                    b.u(b0);
                }
                finally {
                    this.c.l();
                }
            }

            @Override  // rx.d
            public void d() {
                if(!this.a) {
                    try {
                        this.a = true;
                        this.b.call();
                    }
                    catch(Throwable throwable0) {
                        this.b(throwable0);
                        return;
                    }
                    this.c.l();
                }
            }

            @Override  // rx.d
            public void onError(Throwable throwable0) {
                if(!this.a) {
                    this.a = true;
                    this.b(throwable0);
                    return;
                }
                c.I(throwable0);
                b.u(throwable0);
            }
        }

        b.g0(a0);
        b.g0(b0);
        rx.o o0 = new rx.subscriptions.c();
        this.G0(new u(this, a0, ((rx.subscriptions.c)o0), b0));
        return o0;
    }

    public static b q(o o0) {
        static final class E implements J {
            final o a;

            E(o o0) {
                this.a = o0;
                super();
            }

            public void a(d d0) {
                b b0;
                try {
                    b0 = (b)this.a.call();
                }
                catch(Throwable throwable0) {
                    d0.a(f.e());
                    d0.onError(throwable0);
                    return;
                }
                if(b0 == null) {
                    d0.a(f.e());
                    d0.onError(new NullPointerException("The completable returned is null"));
                    return;
                }
                b0.G0(d0);
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((d)object0));
            }
        }

        b.g0(o0);
        return b.p(new E(o0));
    }

    public final void q0(d d0) {
        if(!(d0 instanceof rx.observers.d)) {
            d0 = new rx.observers.d(d0);
        }
        this.G0(d0);
    }

    public final b r(long v, TimeUnit timeUnit0) {
        return this.t(v, timeUnit0, rx.schedulers.c.a(), false);
    }

    public final void r0(n n0) {
        n0.onStart();
        if(!(n0 instanceof rx.observers.e)) {
            n0 = new rx.observers.e(n0);
        }
        this.I0(n0, false);
    }

    public final b s(long v, TimeUnit timeUnit0, j j0) {
        return this.t(v, timeUnit0, j0, false);
    }

    public final b s0(j j0) {
        class y implements J {
            final j a;
            final b b;

            y(j j0) {
                this.a = j0;
                super();
            }

            public void a(d d0) {
                class rx.b.y.a implements rx.functions.a {
                    final d a;
                    final rx.j.a b;
                    final y c;

                    rx.b.y.a(d d0, rx.j.a j$a0) {
                        this.a = d0;
                        this.b = j$a0;
                        super();
                    }

                    @Override  // rx.functions.a
                    public void call() {
                        try {
                            b.this.G0(this.a);
                        }
                        finally {
                            this.b.l();
                        }
                    }
                }

                rx.j.a j$a0 = this.a.a();
                j$a0.c(new rx.b.y.a(this, d0, j$a0));
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((d)object0));
            }
        }

        b.g0(j0);
        return b.p(new y(this, j0));
    }

    public final b t(long v, TimeUnit timeUnit0, j j0, boolean z) {
        class rx.b.g implements J {
            final j a;
            final long b;
            final TimeUnit c;
            final boolean d;
            final b e;

            rx.b.g(j j0, long v, TimeUnit timeUnit0, boolean z) {
                this.a = j0;
                this.b = v;
                this.c = timeUnit0;
                this.d = z;
                super();
            }

            public void a(d d0) {
                class rx.b.g.a implements d {
                    final rx.subscriptions.b a;
                    final rx.j.a b;
                    final d c;
                    final rx.b.g d;

                    rx.b.g.a(rx.subscriptions.b b0, rx.j.a j$a0, d d0) {
                        this.a = b0;
                        this.b = j$a0;
                        this.c = d0;
                        super();
                    }

                    @Override  // rx.d
                    public void a(rx.o o0) {
                        this.a.a(o0);
                        this.c.a(this.a);
                    }

                    @Override  // rx.d
                    public void d() {
                        class rx.b.g.a.a implements rx.functions.a {
                            final rx.b.g.a a;

                            @Override  // rx.functions.a
                            public void call() {
                                try {
                                    rx.b.g.a.this.c.d();
                                }
                                finally {
                                    rx.b.g.a.this.b.l();
                                }
                            }
                        }

                        rx.b.g.a.a b$g$a$a0 = new rx.b.g.a.a(this);
                        rx.o o0 = this.b.d(b$g$a$a0, rx.b.g.this.b, rx.b.g.this.c);
                        this.a.a(o0);
                    }

                    @Override  // rx.d
                    public void onError(Throwable throwable0) {
                        class rx.b.g.a.b implements rx.functions.a {
                            final Throwable a;
                            final rx.b.g.a b;

                            rx.b.g.a.b(Throwable throwable0) {
                                this.a = throwable0;
                                super();
                            }

                            @Override  // rx.functions.a
                            public void call() {
                                try {
                                    rx.b.g.a.this.c.onError(this.a);
                                }
                                finally {
                                    rx.b.g.a.this.b.l();
                                }
                            }
                        }

                        if(rx.b.g.this.d) {
                            rx.b.g.a.b b$g$a$b0 = new rx.b.g.a.b(this, throwable0);
                            rx.o o0 = this.b.d(b$g$a$b0, rx.b.g.this.b, rx.b.g.this.c);
                            this.a.a(o0);
                            return;
                        }
                        this.c.onError(throwable0);
                    }
                }

                rx.subscriptions.b b0 = new rx.subscriptions.b();
                rx.j.a j$a0 = this.a.a();
                b0.a(j$a0);
                rx.b.g.a b$g$a0 = new rx.b.g.a(this, b0, j$a0, d0);
                b.this.G0(b$g$a0);
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((d)object0));
            }
        }

        b.g0(timeUnit0);
        b.g0(j0);
        return b.p(new rx.b.g(this, j0, v, timeUnit0, z));
    }

    public final rx.observers.a t0() {
        rx.observers.a a0 = E4.a.x(0x7FFFFFFFFFFFFFFFL);
        this.r0(((n)a0));
        return a0;
    }

    static void u(Throwable throwable0) {
        Thread thread0 = Thread.currentThread();
        thread0.getUncaughtExceptionHandler().uncaughtException(thread0, throwable0);
    }

    public final b u0(long v, TimeUnit timeUnit0) {
        return this.y0(v, timeUnit0, rx.schedulers.c.a(), null);
    }

    public final b v(rx.functions.a a0) {
        return this.z(m.a(), m.a(), m.a(), a0, m.a());
    }

    public final b v0(long v, TimeUnit timeUnit0, b b0) {
        b.g0(b0);
        return this.y0(v, timeUnit0, rx.schedulers.c.a(), b0);
    }

    public final b w(rx.functions.a a0) {
        return this.z(m.a(), m.a(), a0, m.a(), m.a());
    }

    public final b w0(long v, TimeUnit timeUnit0, j j0) {
        return this.y0(v, timeUnit0, j0, null);
    }

    public final b x(rx.functions.b b0) {
        class h implements rx.functions.b {
            final rx.functions.b a;
            final b b;

            h(rx.functions.b b1) {
                this.a = b1;
                super();
            }

            public void a(Throwable throwable0) {
                rx.f f0 = rx.f.d(throwable0);
                this.a.b(f0);
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((Throwable)object0));
            }
        }


        class i implements rx.functions.a {
            final rx.functions.b a;
            final b b;

            i(rx.functions.b b1) {
                this.a = b1;
                super();
            }

            @Override  // rx.functions.a
            public void call() {
                rx.f f0 = rx.f.b();
                this.a.b(f0);
            }
        }

        if(b0 == null) {
            throw new IllegalArgumentException("onNotification is null");
        }
        return this.z(m.a(), new h(this, b0), new i(this, b0), m.a(), m.a());
    }

    public final b x0(long v, TimeUnit timeUnit0, j j0, b b0) {
        b.g0(b0);
        return this.y0(v, timeUnit0, j0, b0);
    }

    public final b y(rx.functions.b b0) {
        return this.z(m.a(), b0, m.a(), m.a(), m.a());
    }

    public final b y0(long v, TimeUnit timeUnit0, j j0, b b0) {
        b.g0(timeUnit0);
        b.g0(j0);
        return b.p(new rx.internal.operators.s(this, v, timeUnit0, j0, b0));
    }

    protected final b z(rx.functions.b b0, rx.functions.b b1, rx.functions.a a0, rx.functions.a a1, rx.functions.a a2) {
        class rx.b.j implements J {
            final rx.functions.a a;
            final rx.functions.a b;
            final rx.functions.b c;
            final rx.functions.b d;
            final rx.functions.a e;
            final b f;

            rx.b.j(rx.functions.a a0, rx.functions.a a1, rx.functions.b b1, rx.functions.b b2, rx.functions.a a2) {
                this.a = a0;
                this.b = a1;
                this.c = b1;
                this.d = b2;
                this.e = a2;
                super();
            }

            public void a(d d0) {
                class rx.b.j.a implements d {
                    final d a;
                    final rx.b.j b;

                    rx.b.j.a(d d0) {
                        this.a = d0;
                        super();
                    }

                    @Override  // rx.d
                    public void a(rx.o o0) {
                        class rx.b.j.a.a implements rx.functions.a {
                            final rx.o a;
                            final rx.b.j.a b;

                            rx.b.j.a.a(rx.o o0) {
                                this.a = o0;
                                super();
                            }

                            @Override  // rx.functions.a
                            public void call() {
                                try {
                                    rx.b.j.this.e.call();
                                }
                                catch(Throwable throwable0) {
                                    c.I(throwable0);
                                }
                                this.a.l();
                            }
                        }

                        try {
                            rx.b.j.this.d.b(o0);
                        }
                        catch(Throwable throwable0) {
                            o0.l();
                            this.a.a(f.e());
                            this.a.onError(throwable0);
                            return;
                        }
                        rx.o o1 = f.a(new rx.b.j.a.a(this, o0));
                        this.a.a(o1);
                    }

                    @Override  // rx.d
                    public void d() {
                        try {
                            rx.b.j.this.a.call();
                        }
                        catch(Throwable throwable0) {
                            this.a.onError(throwable0);
                            return;
                        }
                        this.a.d();
                        try {
                            rx.b.j.this.b.call();
                        }
                        catch(Throwable throwable1) {
                            c.I(throwable1);
                        }
                    }

                    @Override  // rx.d
                    public void onError(Throwable throwable0) {
                        try {
                            rx.b.j.this.c.b(throwable0);
                        }
                        catch(Throwable throwable1) {
                            throwable0 = new rx.exceptions.b(Arrays.asList(new Throwable[]{throwable0, throwable1}));
                        }
                        this.a.onError(throwable0);
                        try {
                            rx.b.j.this.b.call();
                        }
                        catch(Throwable throwable2) {
                            c.I(throwable2);
                        }
                    }
                }

                rx.b.j.a b$j$a0 = new rx.b.j.a(this, d0);
                b.this.G0(b$j$a0);
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((d)object0));
            }
        }

        b.g0(b0);
        b.g0(b1);
        b.g0(a0);
        b.g0(a1);
        b.g0(a2);
        return b.p(new rx.b.j(this, a0, a1, b1, b0, a2));
    }

    public static b z0(long v, TimeUnit timeUnit0) {
        return b.A0(v, timeUnit0, rx.schedulers.c.a());
    }
}

