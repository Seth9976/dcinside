package kotlinx.coroutines.flow;

import A3.o;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import y4.l;
import y4.m;

final class q {
    @m
    public static final Object a(@l i i0, @l o o0, @l d d0) {
        @f(c = "kotlinx.coroutines.flow.FlowKt__CountKt", f = "Count.kt", i = {0}, l = {25}, m = "count", n = {"i"}, s = {"L$0"})
        static final class c extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            int m;

            c(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.l = object0;
                this.m |= 0x80000000;
                return k.Y(null, null, this);
            }
        }


        static final class kotlinx.coroutines.flow.q.d implements j {
            final o a;
            final kotlin.jvm.internal.l0.f b;

            kotlinx.coroutines.flow.q.d(o o0, kotlin.jvm.internal.l0.f l0$f0) {
                this.a = o0;
                this.b = l0$f0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.j
            @m
            public final Object emit(Object object0, @l d d0) {
                @f(c = "kotlinx.coroutines.flow.FlowKt__CountKt$count$4", f = "Count.kt", i = {0}, l = {26}, m = "emit", n = {"this"}, s = {"L$0"})
                static final class a extends kotlin.coroutines.jvm.internal.d {
                    Object k;
                    Object l;
                    final kotlinx.coroutines.flow.q.d m;
                    int n;

                    a(kotlinx.coroutines.flow.q.d q$d0, d d0) {
                        this.m = q$d0;
                        super(d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.l = object0;
                        this.n |= 0x80000000;
                        return this.m.emit(null, this);
                    }
                }

                kotlinx.coroutines.flow.q.d q$d0;
                a q$d$a0;
                if(d0 instanceof a) {
                    q$d$a0 = (a)d0;
                    int v = q$d$a0.n;
                    if((v & 0x80000000) == 0) {
                        q$d$a0 = new a(this, d0);
                    }
                    else {
                        q$d$a0.n = v ^ 0x80000000;
                    }
                }
                else {
                    q$d$a0 = new a(this, d0);
                }
                Object object1 = q$d$a0.l;
                Object object2 = b.l();
                switch(q$d$a0.n) {
                    case 0: {
                        f0.n(object1);
                        q$d$a0.k = this;
                        q$d$a0.n = 1;
                        object1 = this.a.invoke(object0, q$d$a0);
                        if(object1 == object2) {
                            return object2;
                        }
                        q$d0 = this;
                        break;
                    }
                    case 1: {
                        q$d0 = (kotlinx.coroutines.flow.q.d)q$d$a0.k;
                        f0.n(object1);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                if(((Boolean)object1).booleanValue()) {
                    ++q$d0.b.a;
                }
                return S0.a;
            }
        }

        c q$c0;
        if(d0 instanceof c) {
            q$c0 = (c)d0;
            int v = q$c0.m;
            if((v & 0x80000000) == 0) {
                q$c0 = new c(d0);
            }
            else {
                q$c0.m = v ^ 0x80000000;
            }
        }
        else {
            q$c0 = new c(d0);
        }
        Object object0 = q$c0.l;
        Object object1 = b.l();
        switch(q$c0.m) {
            case 0: {
                f0.n(object0);
                kotlin.jvm.internal.l0.f l0$f0 = new kotlin.jvm.internal.l0.f();
                kotlinx.coroutines.flow.q.d q$d0 = new kotlinx.coroutines.flow.q.d(o0, l0$f0);
                q$c0.k = l0$f0;
                q$c0.m = 1;
                return i0.collect(q$d0, q$c0) == object1 ? object1 : kotlin.coroutines.jvm.internal.b.f(l0$f0.a);
            }
            case 1: {
                kotlin.jvm.internal.l0.f l0$f1 = (kotlin.jvm.internal.l0.f)q$c0.k;
                f0.n(object0);
                return kotlin.coroutines.jvm.internal.b.f(l0$f1.a);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @m
    public static final Object b(@l i i0, @l d d0) {
        @f(c = "kotlinx.coroutines.flow.FlowKt__CountKt", f = "Count.kt", i = {0}, l = {13}, m = "count", n = {"i"}, s = {"L$0"})
        static final class kotlinx.coroutines.flow.q.a extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            int m;

            kotlinx.coroutines.flow.q.a(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.l = object0;
                this.m |= 0x80000000;
                return k.Z(null, this);
            }
        }


        static final class kotlinx.coroutines.flow.q.b implements j {
            final kotlin.jvm.internal.l0.f a;

            kotlinx.coroutines.flow.q.b(kotlin.jvm.internal.l0.f l0$f0) {
                this.a = l0$f0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.j
            @m
            public final Object emit(Object object0, @l d d0) {
                ++this.a.a;
                return S0.a;
            }
        }

        kotlinx.coroutines.flow.q.a q$a0;
        if(d0 instanceof kotlinx.coroutines.flow.q.a) {
            q$a0 = (kotlinx.coroutines.flow.q.a)d0;
            int v = q$a0.m;
            if((v & 0x80000000) == 0) {
                q$a0 = new kotlinx.coroutines.flow.q.a(d0);
            }
            else {
                q$a0.m = v ^ 0x80000000;
            }
        }
        else {
            q$a0 = new kotlinx.coroutines.flow.q.a(d0);
        }
        Object object0 = q$a0.l;
        Object object1 = b.l();
        switch(q$a0.m) {
            case 0: {
                f0.n(object0);
                kotlin.jvm.internal.l0.f l0$f0 = new kotlin.jvm.internal.l0.f();
                kotlinx.coroutines.flow.q.b q$b0 = new kotlinx.coroutines.flow.q.b(l0$f0);
                q$a0.k = l0$f0;
                q$a0.m = 1;
                return i0.collect(q$b0, q$a0) == object1 ? object1 : kotlin.coroutines.jvm.internal.b.f(l0$f0.a);
            }
            case 1: {
                kotlin.jvm.internal.l0.f l0$f1 = (kotlin.jvm.internal.l0.f)q$a0.k;
                f0.n(object0);
                return kotlin.coroutines.jvm.internal.b.f(l0$f1.a);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

