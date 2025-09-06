package kotlinx.coroutines.selects;

import A3.p;
import kotlin.S0;
import kotlin.coroutines.g;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;
import kotlinx.coroutines.a0;
import y4.l;

@s0({"SMAP\nOnTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnTimeout.kt\nkotlinx/coroutines/selects/OnTimeout\n+ 2 Runnable.kt\nkotlinx/coroutines/RunnableKt\n*L\n1#1,62:1\n13#2:63\n*S KotlinDebug\n*F\n+ 1 OnTimeout.kt\nkotlinx/coroutines/selects/OnTimeout\n*L\n52#1:63\n*E\n"})
final class a {
    private final long a;

    public a(long v) {
        this.a = v;
    }

    @l
    public final e b() {
        final class b extends H implements p {
            public static final b a;

            static {
                b.a = new b();
            }

            b() {
                super(3, a.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
            }

            public final void a(@l a a0, @l m m0, @y4.m Object object0) {
                a0.d(m0, object0);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                this.a(((a)object0), ((m)object1), object2);
                return S0.a;
            }
        }

        L.n(b.a, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \'clauseObject\')] kotlin.Any, @[ParameterName(name = \'select\')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \'param\')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        return new f(this, ((p)v0.q(b.a, 3)), null, 4, null);
    }

    public static void c() {
    }

    private final void d(m m0, Object object0) {
        @s0({"SMAP\nRunnable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Runnable.kt\nkotlinx/coroutines/RunnableKt$Runnable$1\n+ 2 OnTimeout.kt\nkotlinx/coroutines/selects/OnTimeout\n*L\n1#1,14:1\n53#2,2:15\n*E\n"})
        public static final class kotlinx.coroutines.selects.a.a implements Runnable {
            final m a;
            final a b;

            public kotlinx.coroutines.selects.a.a(m m0, a a0) {
                this.a = m0;
                this.b = a0;
                super();
            }

            @Override
            public final void run() {
                this.a.j(this.b, S0.a);
            }
        }

        if(this.a <= 0L) {
            m0.g(S0.a);
            return;
        }
        kotlinx.coroutines.selects.a.a a$a0 = new kotlinx.coroutines.selects.a.a(m0, this);
        L.n(m0, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        kotlinx.coroutines.selects.l l0 = (kotlinx.coroutines.selects.l)m0;
        g g0 = m0.getContext();
        m0.h(a0.d(g0).Y(this.a, a$a0, g0));
    }
}

