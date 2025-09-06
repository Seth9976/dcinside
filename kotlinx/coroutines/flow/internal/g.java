package kotlinx.coroutines.flow.internal;

import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.M0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.channels.B;
import kotlinx.coroutines.channels.D;
import kotlinx.coroutines.channels.F;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

public final class g extends e {
    @l
    private final i d;
    private final int e;

    public g(@l i i0, int v, @l kotlin.coroutines.g g0, int v1, @l kotlinx.coroutines.channels.i i1) {
        super(g0, v1, i1);
        this.d = i0;
        this.e = v;
    }

    public g(i i0, int v, kotlin.coroutines.g g0, int v1, kotlinx.coroutines.channels.i i1, int v2, w w0) {
        if((v2 & 4) != 0) {
            g0 = kotlin.coroutines.i.a;
        }
        if((v2 & 16) != 0) {
            i1 = kotlinx.coroutines.channels.i.a;
        }
        this(i0, v, g0, ((v2 & 8) == 0 ? v1 : -2), i1);
    }

    @Override  // kotlinx.coroutines.flow.internal.e
    @l
    protected String f() {
        return "concurrency=" + this.e;
    }

    @Override  // kotlinx.coroutines.flow.internal.e
    @m
    protected Object h(@l D d0, @l d d1) {
        static final class a implements j {
            final I0 a;
            final kotlinx.coroutines.sync.d b;
            final D c;
            final y d;

            a(I0 i00, kotlinx.coroutines.sync.d d0, D d1, y y0) {
                this.a = i00;
                this.b = d0;
                this.c = d1;
                this.d = y0;
                super();
            }

            @m
            public final Object a(@l i i0, @l d d0) {
                @f(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
                static final class kotlinx.coroutines.flow.internal.g.a.a extends o implements A3.o {
                    int k;
                    final i l;
                    final y m;
                    final kotlinx.coroutines.sync.d n;

                    kotlinx.coroutines.flow.internal.g.a.a(i i0, y y0, kotlinx.coroutines.sync.d d0, d d1) {
                        this.l = i0;
                        this.m = y0;
                        this.n = d0;
                        super(2, d1);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new kotlinx.coroutines.flow.internal.g.a.a(this.l, this.m, this.n, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((kotlinx.coroutines.flow.internal.g.a.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        Object object1 = b.l();
                        switch(this.k) {
                            case 0: {
                                f0.n(object0);
                                try {
                                    this.k = 1;
                                    if(this.l.collect(this.m, this) == object1) {
                                        return object1;
                                    label_7:
                                        f0.n(object0);
                                    }
                                    break;
                                }
                                catch(Throwable throwable0) {
                                    this.n.release();
                                    throw throwable0;
                                }
                            }
                            case 1: {
                                goto label_7;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        this.n.release();
                        return S0.a;
                    }
                }


                @f(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2", f = "Merge.kt", i = {0, 0}, l = {62}, m = "emit", n = {"this", "inner"}, s = {"L$0", "L$1"})
                static final class kotlinx.coroutines.flow.internal.g.a.b extends kotlin.coroutines.jvm.internal.d {
                    Object k;
                    Object l;
                    Object m;
                    final a n;
                    int o;

                    kotlinx.coroutines.flow.internal.g.a.b(a g$a0, d d0) {
                        this.n = g$a0;
                        super(d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.m = object0;
                        this.o |= 0x80000000;
                        return this.n.a(null, this);
                    }
                }

                a g$a0;
                kotlinx.coroutines.flow.internal.g.a.b g$a$b0;
                if(d0 instanceof kotlinx.coroutines.flow.internal.g.a.b) {
                    g$a$b0 = (kotlinx.coroutines.flow.internal.g.a.b)d0;
                    int v = g$a$b0.o;
                    if((v & 0x80000000) == 0) {
                        g$a$b0 = new kotlinx.coroutines.flow.internal.g.a.b(this, d0);
                    }
                    else {
                        g$a$b0.o = v ^ 0x80000000;
                    }
                }
                else {
                    g$a$b0 = new kotlinx.coroutines.flow.internal.g.a.b(this, d0);
                }
                Object object0 = g$a$b0.m;
                Object object1 = b.l();
                switch(g$a$b0.o) {
                    case 0: {
                        f0.n(object0);
                        I0 i00 = this.a;
                        if(i00 != null) {
                            M0.A(i00);
                        }
                        g$a$b0.k = this;
                        g$a$b0.l = i0;
                        g$a$b0.o = 1;
                        if(this.b.g(g$a$b0) == object1) {
                            return object1;
                        }
                        g$a0 = this;
                        break;
                    }
                    case 1: {
                        i0 = (i)g$a$b0.l;
                        g$a0 = (a)g$a$b0.k;
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                kotlinx.coroutines.flow.internal.g.a.a g$a$a0 = new kotlinx.coroutines.flow.internal.g.a.a(i0, g$a0.d, g$a0.b, null);
                k.f(g$a0.c, null, null, g$a$a0, 3, null);
                return S0.a;
            }

            @Override  // kotlinx.coroutines.flow.j
            public Object emit(Object object0, d d0) {
                return this.a(((i)object0), d0);
            }
        }

        kotlinx.coroutines.sync.d d2 = kotlinx.coroutines.sync.f.b(this.e, 0, 2, null);
        y y0 = new y(d0);
        a g$a0 = new a(((I0)d1.getContext().get(I0.B8)), d2, d0, y0);
        Object object0 = this.d.collect(g$a0, d1);
        return object0 == b.l() ? object0 : S0.a;
    }

    @Override  // kotlinx.coroutines.flow.internal.e
    @l
    protected e i(@l kotlin.coroutines.g g0, int v, @l kotlinx.coroutines.channels.i i0) {
        return new g(this.d, this.e, g0, v, i0);
    }

    @Override  // kotlinx.coroutines.flow.internal.e
    @l
    public F m(@l O o0) {
        A3.o o1 = this.k();
        return B.c(o0, this.a, this.b, o1);
    }
}

