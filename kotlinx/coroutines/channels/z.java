package kotlinx.coroutines.channels;

import A3.o;
import A3.p;
import kotlin.S0;
import kotlin.c0;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.v0;
import kotlin.k;
import kotlinx.coroutines.selects.i;
import kotlinx.coroutines.selects.j;
import y4.l;
import y4.m;

final class z extends a {
    @l
    private d e;

    public z(@l g g0, @l kotlinx.coroutines.channels.l l0, @l o o0) {
        super(g0, l0, false);
        this.e = b.b(o0, this, this);
    }

    @Override  // kotlinx.coroutines.channels.m
    public boolean G(@m Throwable throwable0) {
        boolean z = super.G(throwable0);
        this.start();
        return z;
    }

    @Override  // kotlinx.coroutines.channels.m
    @m
    public Object I(Object object0, @l d d0) {
        this.start();
        Object object1 = super.I(object0, d0);
        return object1 == b.l() ? object1 : S0.a;
    }

    public static void S1() {
    }

    private final void T1(kotlinx.coroutines.selects.m m0, Object object0) {
        this.t1();
        super.d().c().invoke(this, m0, object0);
    }

    @Override  // kotlinx.coroutines.channels.m
    @l
    public i d() {
        final class kotlinx.coroutines.channels.z.a extends H implements p {
            public static final kotlinx.coroutines.channels.z.a a;

            static {
                kotlinx.coroutines.channels.z.a.a = new kotlinx.coroutines.channels.z.a();
            }

            kotlinx.coroutines.channels.z.a() {
                super(3, z.class, "onSendRegFunction", "onSendRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
            }

            public final void a(@l z z0, @l kotlinx.coroutines.selects.m m0, @m Object object0) {
                z0.T1(m0, object0);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                this.a(((z)object0), ((kotlinx.coroutines.selects.m)object1), object2);
                return S0.a;
            }
        }

        L.n(kotlinx.coroutines.channels.z.a.a, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \'clauseObject\')] kotlin.Any, @[ParameterName(name = \'select\')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \'param\')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        return new j(this, ((p)v0.q(kotlinx.coroutines.channels.z.a.a, 3)), super.d().b(), null, 8, null);
    }

    @Override  // kotlinx.coroutines.channels.m
    @l
    public Object l(Object object0) {
        this.start();
        return super.l(object0);
    }

    @Override  // kotlinx.coroutines.channels.m
    @k(level = kotlin.m.b, message = "Deprecated in the favour of \'trySend\' method", replaceWith = @c0(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(Object object0) {
        this.start();
        return super.offer(object0);
    }

    @Override  // kotlinx.coroutines.Q0
    protected void t1() {
        M3.a.d(this.e, this);
    }
}

