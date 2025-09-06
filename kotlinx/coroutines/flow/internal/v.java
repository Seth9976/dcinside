package kotlinx.coroutines.flow.internal;

import A3.o;
import kotlin.S0;
import kotlin.coroutines.g.b;
import kotlin.coroutines.g;
import kotlin.coroutines.i;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.h;
import kotlin.e0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.M0;
import kotlinx.coroutines.flow.j;
import y4.l;
import y4.m;
import z3.f;

@s0({"SMAP\nSafeCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.kt\nkotlinx/coroutines/flow/internal/SafeCollector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
public final class v extends d implements e, j {
    @l
    @f
    public final j k;
    @l
    @f
    public final g l;
    @f
    public final int m;
    @m
    private g n;
    @m
    private kotlin.coroutines.d o;

    public v(@l j j0, @l g g0) {
        static final class a extends N implements o {
            public static final a e;

            static {
                a.e = new a();
            }

            a() {
                super(2);
            }

            @l
            public final Integer a(int v, @l b g$b0) {
                return (int)(v + 1);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((Number)object0).intValue(), ((b)object1));
            }
        }

        super(s.a, i.a);
        this.k = j0;
        this.l = g0;
        this.m = ((Number)g0.fold(0, a.e)).intValue();
    }

    private final void a(g g0, g g1, Object object0) {
        if(g1 instanceof n) {
            this.g(((n)g1), object0);
        }
        x.a(this, g0);
    }

    @Override  // kotlinx.coroutines.flow.j
    @m
    public Object emit(Object object0, @l kotlin.coroutines.d d0) {
        Object object1;
        try {
            object1 = this.f(d0, object0);
        }
        catch(Throwable throwable0) {
            this.n = new n(throwable0, d0.getContext());
            throw throwable0;
        }
        if(object1 == kotlin.coroutines.intrinsics.b.l()) {
            h.c(d0);
        }
        return object1 == kotlin.coroutines.intrinsics.b.l() ? object1 : S0.a;
    }

    private final Object f(kotlin.coroutines.d d0, Object object0) {
        g g0 = d0.getContext();
        M0.z(g0);
        g g1 = this.n;
        if(g1 != g0) {
            this.a(g0, g1, object0);
            this.n = g0;
        }
        this.o = d0;
        L.n(this.k, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        L.n(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object object1 = w.a.invoke(this.k, object0, this);
        if(!L.g(object1, kotlin.coroutines.intrinsics.b.l())) {
            this.o = null;
        }
        return object1;
    }

    private final void g(n n0, Object object0) {
        throw new IllegalStateException(kotlin.text.v.p(("\n            Flow exception transparency is violated:\n                Previous \'emit\' call has thrown exception " + n0.a + ", but then emission attempt of value \'" + object0 + "\' has been detected.\n                Emissions from \'catch\' blocks are prohibited in order to avoid unspecified behaviour, \'Flow.catch\' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ")).toString());
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.coroutines.jvm.internal.e, kotlin.coroutines.jvm.internal.a
    @m
    public e getCallerFrame() {
        return this.o instanceof e ? ((e)this.o) : null;
    }

    @Override  // kotlin.coroutines.jvm.internal.d
    @l
    public g getContext() {
        g g0 = this.n;
        return g0 == null ? i.a : g0;
    }

    @Override  // kotlin.coroutines.jvm.internal.e, kotlin.coroutines.jvm.internal.a
    @m
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override  // kotlin.coroutines.jvm.internal.a
    @l
    public Object invokeSuspend(@l Object object0) {
        Throwable throwable0 = e0.e(object0);
        if(throwable0 != null) {
            this.n = new n(throwable0, this.getContext());
        }
        kotlin.coroutines.d d0 = this.o;
        if(d0 != null) {
            d0.resumeWith(object0);
        }
        return kotlin.coroutines.intrinsics.b.l();
    }

    @Override  // kotlin.coroutines.jvm.internal.d
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}

