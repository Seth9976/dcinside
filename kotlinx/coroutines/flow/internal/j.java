package kotlinx.coroutines.flow.internal;

import A3.p;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.Q;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

@s0({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/internal/ChannelFlowTransformLatest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,96:1\n1#2:97\n*E\n"})
public final class j extends h {
    @l
    private final p e;

    public j(@l p p0, @l i i0, @l g g0, int v, @l kotlinx.coroutines.channels.i i1) {
        super(i0, g0, v, i1);
        this.e = p0;
    }

    public j(p p0, i i0, g g0, int v, kotlinx.coroutines.channels.i i1, int v1, w w0) {
        if((v1 & 4) != 0) {
            g0 = kotlin.coroutines.i.a;
        }
        if((v1 & 16) != 0) {
            i1 = kotlinx.coroutines.channels.i.a;
        }
        this(p0, i0, g0, ((v1 & 8) == 0 ? v : -2), i1);
    }

    @Override  // kotlinx.coroutines.flow.internal.e
    @l
    protected e i(@l g g0, int v, @l kotlinx.coroutines.channels.i i0) {
        return new j(this.e, this.d, g0, v, i0);
    }

    @Override  // kotlinx.coroutines.flow.internal.h
    @m
    protected Object r(@l kotlinx.coroutines.flow.j j0, @l d d0) {
        @f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements A3.o {
            int k;
            private Object l;
            final j m;
            final kotlinx.coroutines.flow.j n;

            a(j j0, kotlinx.coroutines.flow.j j1, d d0) {
                this.m = j0;
                this.n = j1;
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
                static final class kotlinx.coroutines.flow.internal.j.a.a implements kotlinx.coroutines.flow.j {
                    final kotlin.jvm.internal.l0.h a;
                    final O b;
                    final j c;
                    final kotlinx.coroutines.flow.j d;

                    kotlinx.coroutines.flow.internal.j.a.a(kotlin.jvm.internal.l0.h l0$h0, O o0, j j0, kotlinx.coroutines.flow.j j1) {
                        this.a = l0$h0;
                        this.b = o0;
                        this.c = j0;
                        this.d = j1;
                        super();
                    }

                    @Override  // kotlinx.coroutines.flow.j
                    @m
                    public final Object emit(Object object0, @l d d0) {
                        @f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
                        static final class kotlinx.coroutines.flow.internal.j.a.a.a extends o implements A3.o {
                            int k;
                            final j l;
                            final kotlinx.coroutines.flow.j m;
                            final Object n;

                            kotlinx.coroutines.flow.internal.j.a.a.a(j j0, kotlinx.coroutines.flow.j j1, Object object0, d d0) {
                                this.l = j0;
                                this.m = j1;
                                this.n = object0;
                                super(2, d0);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final d create(@m Object object0, @l d d0) {
                                return new kotlinx.coroutines.flow.internal.j.a.a.a(this.l, this.m, this.n, d0);
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                return this.invoke(((O)object0), ((d)object1));
                            }

                            @m
                            public final Object invoke(@l O o0, @m d d0) {
                                return ((kotlinx.coroutines.flow.internal.j.a.a.a)this.create(o0, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                Object object1 = b.l();
                                switch(this.k) {
                                    case 0: {
                                        f0.n(object0);
                                        this.k = 1;
                                        return this.l.e.invoke(this.m, this.n, this) == object1 ? object1 : S0.a;
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


                        @f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", i = {0, 0}, l = {26}, m = "emit", n = {"this", "value"}, s = {"L$0", "L$1"})
                        static final class kotlinx.coroutines.flow.internal.j.a.a.b extends kotlin.coroutines.jvm.internal.d {
                            Object k;
                            Object l;
                            Object m;
                            Object n;
                            final kotlinx.coroutines.flow.internal.j.a.a o;
                            int p;

                            kotlinx.coroutines.flow.internal.j.a.a.b(kotlinx.coroutines.flow.internal.j.a.a j$a$a0, d d0) {
                                this.o = j$a$a0;
                                super(d0);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                this.n = object0;
                                this.p |= 0x80000000;
                                return this.o.emit(null, this);
                            }
                        }

                        kotlinx.coroutines.flow.internal.j.a.a j$a$a0;
                        kotlinx.coroutines.flow.internal.j.a.a.b j$a$a$b0;
                        if(d0 instanceof kotlinx.coroutines.flow.internal.j.a.a.b) {
                            j$a$a$b0 = (kotlinx.coroutines.flow.internal.j.a.a.b)d0;
                            int v = j$a$a$b0.p;
                            if((v & 0x80000000) == 0) {
                                j$a$a$b0 = new kotlinx.coroutines.flow.internal.j.a.a.b(this, d0);
                            }
                            else {
                                j$a$a$b0.p = v ^ 0x80000000;
                            }
                        }
                        else {
                            j$a$a$b0 = new kotlinx.coroutines.flow.internal.j.a.a.b(this, d0);
                        }
                        Object object1 = j$a$a$b0.n;
                        Object object2 = b.l();
                        switch(j$a$a$b0.p) {
                            case 0: {
                                f0.n(object1);
                                I0 i00 = (I0)this.a.a;
                                if(i00 != null) {
                                    i00.e(new kotlinx.coroutines.flow.internal.l());
                                    j$a$a$b0.k = this;
                                    j$a$a$b0.l = object0;
                                    j$a$a$b0.m = i00;
                                    j$a$a$b0.p = 1;
                                    if(i00.c1(j$a$a$b0) == object2) {
                                        return object2;
                                    }
                                }
                                j$a$a0 = this;
                                break;
                            }
                            case 1: {
                                I0 i01 = (I0)j$a$a$b0.m;
                                object0 = j$a$a$b0.l;
                                j$a$a0 = (kotlinx.coroutines.flow.internal.j.a.a)j$a$a$b0.k;
                                f0.n(object1);
                                break;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        kotlinx.coroutines.flow.internal.j.a.a.a j$a$a$a0 = new kotlinx.coroutines.flow.internal.j.a.a.a(j$a$a0.c, j$a$a0.d, object0, null);
                        j$a$a0.a.a = k.f(j$a$a0.b, null, Q.d, j$a$a$a0, 1, null);
                        return S0.a;
                    }
                }

                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        O o0 = (O)this.l;
                        kotlinx.coroutines.flow.internal.j.a.a j$a$a0 = new kotlinx.coroutines.flow.internal.j.a.a(new kotlin.jvm.internal.l0.h(), o0, this.m, this.n);
                        this.k = 1;
                        return this.m.d.collect(j$a$a0, this) == object1 ? object1 : S0.a;
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

        Object object0 = P.g(new a(this, j0, null), d0);
        return object0 == b.l() ? object0 : S0.a;
    }
}

