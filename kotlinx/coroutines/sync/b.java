package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;
import kotlinx.coroutines.E0;
import kotlinx.coroutines.K;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.S;
import kotlinx.coroutines.k0;
import kotlinx.coroutines.o;
import kotlinx.coroutines.p;
import kotlinx.coroutines.r;
import kotlinx.coroutines.selects.i;
import kotlinx.coroutines.selects.j;
import kotlinx.coroutines.selects.n;
import kotlinx.coroutines.x0;
import kotlinx.coroutines.y1;
import y4.l;
import y4.m;
import z3.f;

@s0({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,305:1\n336#2,12:306\n1#3:318\n*S KotlinDebug\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl\n*L\n170#1:306,12\n*E\n"})
public class b extends e implements a {
    @s0({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl$CancellableContinuationWithOwner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,305:1\n1#2:306\n*E\n"})
    final class kotlinx.coroutines.sync.b.a implements o, y1 {
        @l
        @f
        public final p a;
        @m
        @f
        public final Object b;
        final b c;

        public kotlinx.coroutines.sync.b.a(@l p p0, @m Object object0) {
            this.a = p0;
            this.b = object0;
        }

        @Override  // kotlinx.coroutines.o
        public void B(Object object0, Function1 function10) {
            this.a(((S0)object0), function10);
        }

        @Override  // kotlinx.coroutines.o
        @E0
        public void E(@l Object object0) {
            this.a.E(object0);
        }

        @Override  // kotlinx.coroutines.o
        public Object H(Object object0, Object object1) {
            return this.e(((S0)object0), object1);
        }

        @Override  // kotlinx.coroutines.o
        public void K(@l Function1 function10) {
            this.a.K(function10);
        }

        @Override  // kotlinx.coroutines.o
        @E0
        @m
        public Object P(@l Throwable throwable0) {
            return this.a.P(throwable0);
        }

        @Override  // kotlinx.coroutines.o
        public Object U(Object object0, Object object1, Function1 function10) {
            return this.f(((S0)object0), object1, function10);
        }

        @Override  // kotlinx.coroutines.o
        public void X(K k0, Object object0) {
            this.b(k0, ((S0)object0));
        }

        public void a(@l S0 s00, @m Function1 function10) {
            static final class kotlinx.coroutines.sync.b.a.a extends N implements Function1 {
                final b e;
                final kotlinx.coroutines.sync.b.a f;

                kotlinx.coroutines.sync.b.a.a(b b0, kotlinx.coroutines.sync.b.a b$a0) {
                    this.e = b0;
                    this.f = b$a0;
                    super(1);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.invoke(((Throwable)object0));
                    return S0.a;
                }

                public final void invoke(@l Throwable throwable0) {
                    this.e.i(this.f.b);
                }
            }

            b.i.set(b.this, this.b);
            kotlinx.coroutines.sync.b.a.a b$a$a0 = new kotlinx.coroutines.sync.b.a.a(b.this, this);
            this.a.B(s00, b$a$a0);
        }

        @x0
        public void b(@l K k0, @l S0 s00) {
            this.a.X(k0, s00);
        }

        @Override  // kotlinx.coroutines.o
        public boolean c(@m Throwable throwable0) {
            return this.a.c(throwable0);
        }

        @Override  // kotlinx.coroutines.o
        @E0
        public void c0() {
            this.a.c0();
        }

        @Override  // kotlinx.coroutines.y1
        public void d(@l S s0, int v) {
            this.a.d(s0, v);
        }

        @E0
        @m
        public Object e(@l S0 s00, @m Object object0) {
            return this.a.H(s00, object0);
        }

        @m
        public Object f(@l S0 s00, @m Object object0, @m Function1 function10) {
            @s0({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl$CancellableContinuationWithOwner$tryResume$token$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,305:1\n1#2:306\n*E\n"})
            static final class kotlinx.coroutines.sync.b.a.b extends N implements Function1 {
                final b e;
                final kotlinx.coroutines.sync.b.a f;

                kotlinx.coroutines.sync.b.a.b(b b0, kotlinx.coroutines.sync.b.a b$a0) {
                    this.e = b0;
                    this.f = b$a0;
                    super(1);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.invoke(((Throwable)object0));
                    return S0.a;
                }

                public final void invoke(@l Throwable throwable0) {
                    b.i.set(this.e, this.f.b);
                    this.e.i(this.f.b);
                }
            }

            kotlinx.coroutines.sync.b.a.b b$a$b0 = new kotlinx.coroutines.sync.b.a.b(b.this, this);
            Object object1 = this.a.U(s00, object0, b$a$b0);
            if(object1 != null) {
                b.i.set(b.this, this.b);
            }
            return object1;
        }

        @Override  // kotlin.coroutines.d
        @l
        public g getContext() {
            return this.a.getContext();
        }

        @Override  // kotlinx.coroutines.o
        public boolean isActive() {
            return this.a.isActive();
        }

        @Override  // kotlinx.coroutines.o
        public boolean isCancelled() {
            return this.a.isCancelled();
        }

        @Override  // kotlinx.coroutines.o
        public boolean k() {
            return this.a.k();
        }

        @Override  // kotlin.coroutines.d
        public void resumeWith(@l Object object0) {
            this.a.resumeWith(object0);
        }

        @Override  // kotlinx.coroutines.o
        @x0
        public void u(@l K k0, @l Throwable throwable0) {
            this.a.u(k0, throwable0);
        }
    }

    @s0({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl$SelectInstanceWithOwner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,305:1\n1#2:306\n*E\n"})
    final class kotlinx.coroutines.sync.b.b implements n {
        @l
        @f
        public final n a;
        @m
        @f
        public final Object b;
        final b c;

        public kotlinx.coroutines.sync.b.b(@l n n0, @m Object object0) {
            this.a = n0;
            this.b = object0;
        }

        @Override  // kotlinx.coroutines.y1
        public void d(@l S s0, int v) {
            this.a.d(s0, v);
        }

        @Override  // kotlinx.coroutines.selects.m
        public void g(@m Object object0) {
            b.i.set(b.this, this.b);
            this.a.g(object0);
        }

        @Override  // kotlinx.coroutines.selects.m
        @l
        public g getContext() {
            return this.a.getContext();
        }

        @Override  // kotlinx.coroutines.selects.m
        public void h(@l k0 k00) {
            this.a.h(k00);
        }

        @Override  // kotlinx.coroutines.selects.m
        public boolean j(@l Object object0, @m Object object1) {
            boolean z = this.a.j(object0, object1);
            b b0 = b.this;
            if(z) {
                b.i.set(b0, this.b);
            }
            return z;
        }
    }

    @l
    private final A3.p h;
    private static final AtomicReferenceFieldUpdater i;
    private volatile Object owner$volatile;

    static {
        b.i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "owner$volatile");
    }

    public b(boolean z) {
        static final class kotlinx.coroutines.sync.b.e extends N implements A3.p {
            final b e;

            kotlinx.coroutines.sync.b.e(b b0) {
                this.e = b0;
                super(3);
            }

            @l
            public final Function1 a(@l kotlinx.coroutines.selects.m m0, @m Object object0, @m Object object1) {
                static final class kotlinx.coroutines.sync.b.e.a extends N implements Function1 {
                    final b e;
                    final Object f;

                    kotlinx.coroutines.sync.b.e.a(b b0, Object object0) {
                        this.e = b0;
                        this.f = object0;
                        super(1);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.invoke(((Throwable)object0));
                        return S0.a;
                    }

                    public final void invoke(@l Throwable throwable0) {
                        this.e.i(this.f);
                    }
                }

                return new kotlinx.coroutines.sync.b.e.a(this.e, object0);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((kotlinx.coroutines.selects.m)object0), object1, object2);
            }
        }

        super(1, ((int)z));
        this.owner$volatile = z ? null : c.a;
        this.h = new kotlinx.coroutines.sync.b.e(this);
    }

    public static final Object L(b b0, Object object0, d d0) {
        return b0.R(object0, d0);
    }

    public static void M() {
    }

    private final Object N() {
        return this.owner$volatile;
    }

    private final int P(Object object0) {
        Object object1;
        do {
            if(!this.c()) {
                return 0;
            }
            object1 = b.i.get(this);
        }
        while(object1 == c.a);
        return object1 == object0 ? 1 : 2;
    }

    static Object Q(b b0, Object object0, d d0) {
        if(b0.b(object0)) {
            return S0.a;
        }
        Object object1 = b0.R(object0, d0);
        return object1 == kotlin.coroutines.intrinsics.b.l() ? object1 : S0.a;
    }

    private final Object R(Object object0, d d0) {
        p p0 = r.b(kotlin.coroutines.intrinsics.b.e(d0));
        try {
            this.m(new kotlinx.coroutines.sync.b.a(this, p0, object0));
        }
        catch(Throwable throwable0) {
            p0.V();
            throw throwable0;
        }
        Object object1 = p0.x();
        if(object1 == kotlin.coroutines.intrinsics.b.l()) {
            h.c(d0);
        }
        return object1 == kotlin.coroutines.intrinsics.b.l() ? object1 : S0.a;
    }

    @m
    protected Object S(@m Object object0, @m Object object1) {
        if(L.g(object1, c.b)) {
            throw new IllegalStateException(("This mutex is already locked by the specified owner: " + object0).toString());
        }
        return this;
    }

    protected void T(@l kotlinx.coroutines.selects.m m0, @m Object object0) {
        if(object0 != null && this.d(object0)) {
            m0.g(c.b);
            return;
        }
        L.n(m0, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectInstanceInternal<*>");
        this.C(new kotlinx.coroutines.sync.b.b(this, ((n)m0), object0), object0);
    }

    private final void U(Object object0) {
        this.owner$volatile = object0;
    }

    private final int V(Object object0) {
    alab1:
        while(true) {
            if(this.a()) {
                b.i.set(this, object0);
                return 0;
            }
            if(object0 == null) {
                return 1;
            }
            switch(this.P(object0)) {
                case 1: {
                    return 2;
                }
                case 2: {
                    break alab1;
                }
            }
        }
        return 1;
    }

    @Override  // kotlinx.coroutines.sync.a
    public boolean b(@m Object object0) {
        switch(this.V(object0)) {
            case 0: {
                return true;
            }
            case 1: {
                return false;
            }
            case 2: {
                throw new IllegalStateException(("This mutex is already locked by the specified owner: " + object0).toString());
            }
            default: {
                throw new IllegalStateException("unexpected");
            }
        }
    }

    @Override  // kotlinx.coroutines.sync.a
    public boolean c() {
        return this.f() == 0;
    }

    @Override  // kotlinx.coroutines.sync.a
    public boolean d(@l Object object0) {
        return this.P(object0) == 1;
    }

    @Override  // kotlinx.coroutines.sync.a
    @l
    public i e() {
        final class kotlinx.coroutines.sync.b.c extends H implements A3.p {
            public static final kotlinx.coroutines.sync.b.c a;

            static {
                kotlinx.coroutines.sync.b.c.a = new kotlinx.coroutines.sync.b.c();
            }

            kotlinx.coroutines.sync.b.c() {
                super(3, b.class, "onLockRegFunction", "onLockRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
            }

            public final void a(@l b b0, @l kotlinx.coroutines.selects.m m0, @m Object object0) {
                b0.T(m0, object0);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                this.a(((b)object0), ((kotlinx.coroutines.selects.m)object1), object2);
                return S0.a;
            }
        }


        final class kotlinx.coroutines.sync.b.d extends H implements A3.p {
            public static final kotlinx.coroutines.sync.b.d a;

            static {
                kotlinx.coroutines.sync.b.d.a = new kotlinx.coroutines.sync.b.d();
            }

            kotlinx.coroutines.sync.b.d() {
                super(3, b.class, "onLockProcessResult", "onLockProcessResult(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
            }

            @m
            public final Object a(@l b b0, @m Object object0, @m Object object1) {
                return b0.S(object0, object1);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((b)object0), object1, object2);
            }
        }

        L.n(kotlinx.coroutines.sync.b.c.a, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \'clauseObject\')] kotlin.Any, @[ParameterName(name = \'select\')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \'param\')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        A3.p p0 = (A3.p)v0.q(kotlinx.coroutines.sync.b.c.a, 3);
        L.n(kotlinx.coroutines.sync.b.d.a, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \'clauseObject\')] kotlin.Any, @[ParameterName(name = \'param\')] kotlin.Any?, @[ParameterName(name = \'clauseResult\')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new j(this, p0, ((A3.p)v0.q(kotlinx.coroutines.sync.b.d.a, 3)), this.h);
    }

    @Override  // kotlinx.coroutines.sync.a
    @m
    public Object h(@m Object object0, @l d d0) {
        return b.Q(this, object0, d0);
    }

    @Override  // kotlinx.coroutines.sync.a
    public void i(@m Object object0) {
        while(this.c()) {
            Object object1 = b.i.get(this);
            if(object1 != c.a) {
                if(object1 != object0 && object0 != null) {
                    throw new IllegalStateException(("This mutex is locked by " + object1 + ", but " + object0 + " is expected").toString());
                }
                if(androidx.concurrent.futures.a.a(b.i, this, object1, c.a)) {
                    this.release();
                    return;
                }
                if(false) {
                    break;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    @Override
    @l
    public String toString() {
        return "Mutex@" + U.b(this) + "[isLocked=" + this.c() + ",owner=" + b.i.get(this) + ']';
    }
}

