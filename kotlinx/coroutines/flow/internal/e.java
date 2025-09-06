package kotlinx.coroutines.flow.internal;

import java.util.ArrayList;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.E0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.Q;
import kotlinx.coroutines.U;
import kotlinx.coroutines.channels.B;
import kotlinx.coroutines.channels.D;
import kotlinx.coroutines.channels.F;
import kotlinx.coroutines.channels.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import y4.l;
import y4.m;
import z3.f;

@s0({"SMAP\nChannelFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlow\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,241:1\n1#2:242\n*E\n"})
@E0
public abstract class e implements r {
    @l
    @f
    public final g a;
    @f
    public final int b;
    @l
    @f
    public final i c;

    public e(@l g g0, int v, @l i i0) {
        this.a = g0;
        this.b = v;
        this.c = i0;
    }

    @Override  // kotlinx.coroutines.flow.internal.r
    @l
    public kotlinx.coroutines.flow.i c(@l g g0, int v, @l i i0) {
        g g1 = g0.plus(this.a);
        if(i0 == i.a) {
            int v1 = this.b;
            if(v1 != -3) {
                if(v == -3) {
                    v = v1;
                }
                else if(v1 != -2) {
                    if(v == -2) {
                        v = v1;
                    }
                    else {
                        v += v1;
                        if(v < 0) {
                            v = 0x7FFFFFFF;
                        }
                    }
                }
            }
            i0 = this.c;
        }
        return !L.g(g1, this.a) || v != this.b || i0 != this.c ? this.i(g1, v, i0) : this;
    }

    @Override  // kotlinx.coroutines.flow.i
    @m
    public Object collect(@l j j0, @l d d0) {
        return e.g(this, j0, d0);
    }

    @m
    protected String f() {
        return null;
    }

    static Object g(e e0, j j0, d d0) {
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", i = {}, l = {0x77}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements A3.o {
            int k;
            private Object l;
            final j m;
            final e n;

            a(j j0, e e0, d d0) {
                this.m = j0;
                this.n = e0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new a(this.m, this.n, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((a)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        F f0 = this.n.m(((O)this.l));
                        this.k = 1;
                        return k.l0(this.m, f0, this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        Object object0 = P.g(new a(j0, e0, null), d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    @m
    protected abstract Object h(@l D arg1, @l d arg2);

    @l
    protected abstract e i(@l g arg1, int arg2, @l i arg3);

    @m
    public kotlinx.coroutines.flow.i j() {
        return null;
    }

    @l
    public final A3.o k() {
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
        static final class kotlinx.coroutines.flow.internal.e.b extends o implements A3.o {
            int k;
            Object l;
            final e m;

            kotlinx.coroutines.flow.internal.e.b(e e0, d d0) {
                this.m = e0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new kotlinx.coroutines.flow.internal.e.b(this.m, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((D)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l D d0, @m d d1) {
                return ((kotlinx.coroutines.flow.internal.e.b)this.create(d0, d1)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        this.k = 1;
                        return this.m.h(((D)this.l), this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        return new kotlinx.coroutines.flow.internal.e.b(this, null);
    }

    public final int l() {
        return this.b == -3 ? -2 : this.b;
    }

    @l
    public F m(@l O o0) {
        int v = this.l();
        A3.o o1 = this.k();
        return B.h(o0, this.a, v, this.c, Q.c, null, o1, 16, null);
    }

    @Override
    @l
    public String toString() {
        ArrayList arrayList0 = new ArrayList(4);
        String s = this.f();
        if(s != null) {
            arrayList0.add(s);
        }
        if(this.a != kotlin.coroutines.i.a) {
            arrayList0.add("context=" + this.a);
        }
        if(this.b != -3) {
            arrayList0.add("capacity=" + this.b);
        }
        if(this.c != i.a) {
            arrayList0.add("onBufferOverflow=" + this.c);
        }
        return U.a(this) + '[' + u.m3(arrayList0, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}

