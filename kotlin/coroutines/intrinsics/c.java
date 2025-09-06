package kotlin.coroutines.intrinsics;

import A3.o;
import A3.p;
import kotlin.b0;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.i;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.j;
import kotlin.f0;
import kotlin.h0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;
import y4.l;
import y4.m;

@s0({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,269:1\n204#1,4:270\n225#1:274\n204#1,4:275\n225#1:279\n*S KotlinDebug\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n130#1:270,4\n130#1:274\n165#1:275,4\n165#1:279\n*E\n"})
class c {
    @h0(version = "1.3")
    private static final d a(d d0, Function1 function10) {
        public static final class a extends j {
            private int k;
            final Function1 l;

            public a(d d0, Function1 function10) {
                this.l = function10;
                L.n(d0, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            protected Object invokeSuspend(Object object0) {
                switch(this.k) {
                    case 0: {
                        this.k = 1;
                        f0.n(object0);
                        return this.l.invoke(this);
                    }
                    case 1: {
                        this.k = 2;
                        f0.n(object0);
                        return object0;
                    }
                    default: {
                        throw new IllegalStateException("This coroutine had already completed");
                    }
                }
            }
        }


        public static final class b extends kotlin.coroutines.jvm.internal.d {
            private int k;
            final Function1 l;

            public b(d d0, g g0, Function1 function10) {
                this.l = function10;
                L.n(d0, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                super(d0, g0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            protected Object invokeSuspend(Object object0) {
                switch(this.k) {
                    case 0: {
                        this.k = 1;
                        f0.n(object0);
                        return this.l.invoke(this);
                    }
                    case 1: {
                        this.k = 2;
                        f0.n(object0);
                        return object0;
                    }
                    default: {
                        throw new IllegalStateException("This coroutine had already completed");
                    }
                }
            }
        }

        g g0 = d0.getContext();
        return g0 == i.a ? new a(d0, function10) : new b(d0, g0, function10);
    }

    @h0(version = "1.3")
    @l
    public static d b(@l o o0, Object object0, @l d d0) {
        @s0({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1\n+ 2 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,222:1\n166#2:223\n*E\n"})
        public static final class e extends j {
            private int k;
            final o l;
            final Object m;

            public e(d d0, o o0, Object object0) {
                this.l = o0;
                this.m = object0;
                L.n(d0, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            protected Object invokeSuspend(Object object0) {
                switch(this.k) {
                    case 0: {
                        this.k = 1;
                        f0.n(object0);
                        L.n(this.l, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                        return ((o)v0.q(this.l, 2)).invoke(this.m, this);
                    }
                    case 1: {
                        this.k = 2;
                        f0.n(object0);
                        return object0;
                    }
                    default: {
                        throw new IllegalStateException("This coroutine had already completed");
                    }
                }
            }
        }


        @s0({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2\n+ 2 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,240:1\n166#2:241\n*E\n"})
        public static final class f extends kotlin.coroutines.jvm.internal.d {
            private int k;
            final o l;
            final Object m;

            public f(d d0, g g0, o o0, Object object0) {
                this.l = o0;
                this.m = object0;
                L.n(d0, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                super(d0, g0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            protected Object invokeSuspend(Object object0) {
                switch(this.k) {
                    case 0: {
                        this.k = 1;
                        f0.n(object0);
                        L.n(this.l, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                        return ((o)v0.q(this.l, 2)).invoke(this.m, this);
                    }
                    case 1: {
                        this.k = 2;
                        f0.n(object0);
                        return object0;
                    }
                    default: {
                        throw new IllegalStateException("This coroutine had already completed");
                    }
                }
            }
        }

        L.p(o0, "<this>");
        L.p(d0, "completion");
        d d1 = h.a(d0);
        if(o0 instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a)o0).create(object0, d1);
        }
        g g0 = d1.getContext();
        return g0 == i.a ? new e(d1, o0, object0) : new f(d1, g0, o0, object0);
    }

    @h0(version = "1.3")
    @l
    public static d c(@l Function1 function10, @l d d0) {
        @s0({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1\n+ 2 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,222:1\n131#2:223\n*E\n"})
        public static final class kotlin.coroutines.intrinsics.c.c extends j {
            private int k;
            final Function1 l;

            public kotlin.coroutines.intrinsics.c.c(d d0, Function1 function10) {
                this.l = function10;
                L.n(d0, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            protected Object invokeSuspend(Object object0) {
                switch(this.k) {
                    case 0: {
                        this.k = 1;
                        f0.n(object0);
                        L.n(this.l, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
                        return ((Function1)v0.q(this.l, 1)).invoke(this);
                    }
                    case 1: {
                        this.k = 2;
                        f0.n(object0);
                        return object0;
                    }
                    default: {
                        throw new IllegalStateException("This coroutine had already completed");
                    }
                }
            }
        }


        @s0({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2\n+ 2 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,240:1\n131#2:241\n*E\n"})
        public static final class kotlin.coroutines.intrinsics.c.d extends kotlin.coroutines.jvm.internal.d {
            private int k;
            final Function1 l;

            public kotlin.coroutines.intrinsics.c.d(d d0, g g0, Function1 function10) {
                this.l = function10;
                L.n(d0, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                super(d0, g0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            protected Object invokeSuspend(Object object0) {
                switch(this.k) {
                    case 0: {
                        this.k = 1;
                        f0.n(object0);
                        L.n(this.l, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
                        return ((Function1)v0.q(this.l, 1)).invoke(this);
                    }
                    case 1: {
                        this.k = 2;
                        f0.n(object0);
                        return object0;
                    }
                    default: {
                        throw new IllegalStateException("This coroutine had already completed");
                    }
                }
            }
        }

        L.p(function10, "<this>");
        L.p(d0, "completion");
        d d1 = h.a(d0);
        if(function10 instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a)function10).create(d1);
        }
        g g0 = d1.getContext();
        return g0 == i.a ? new kotlin.coroutines.intrinsics.c.c(d1, function10) : new kotlin.coroutines.intrinsics.c.d(d1, g0, function10);
    }

    private static final d d(d d0) {
        public static final class kotlin.coroutines.intrinsics.c.g extends j {
            kotlin.coroutines.intrinsics.c.g(d d0) {
                L.n(d0, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            protected Object invokeSuspend(Object object0) {
                f0.n(object0);
                return object0;
            }
        }


        public static final class kotlin.coroutines.intrinsics.c.h extends kotlin.coroutines.jvm.internal.d {
            kotlin.coroutines.intrinsics.c.h(d d0, g g0) {
                L.n(d0, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                super(d0, g0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            protected Object invokeSuspend(Object object0) {
                f0.n(object0);
                return object0;
            }
        }

        g g0 = d0.getContext();
        return g0 == i.a ? new kotlin.coroutines.intrinsics.c.g(d0) : new kotlin.coroutines.intrinsics.c.h(d0, g0);
    }

    @h0(version = "1.3")
    @l
    public static d e(@l d d0) {
        L.p(d0, "<this>");
        kotlin.coroutines.jvm.internal.d d1 = d0 instanceof kotlin.coroutines.jvm.internal.d ? ((kotlin.coroutines.jvm.internal.d)d0) : null;
        if(d1 != null) {
            d d2 = d1.intercepted();
            return d2 == null ? d0 : d2;
        }
        return d0;
    }

    @h0(version = "1.3")
    @kotlin.internal.f
    private static final Object f(o o0, Object object0, d d0) {
        L.p(o0, "<this>");
        L.p(d0, "completion");
        return o0 instanceof kotlin.coroutines.jvm.internal.a ? ((o)v0.q(o0, 2)).invoke(object0, d0) : kotlin.coroutines.intrinsics.b.i(o0, object0, d0);
    }

    @kotlin.internal.f
    private static final Object g(p p0, Object object0, Object object1, d d0) {
        L.p(p0, "<this>");
        L.p(d0, "completion");
        return p0 instanceof kotlin.coroutines.jvm.internal.a ? ((p)v0.q(p0, 3)).invoke(object0, object1, d0) : kotlin.coroutines.intrinsics.b.j(p0, object0, object1, d0);
    }

    @h0(version = "1.3")
    @kotlin.internal.f
    private static final Object h(Function1 function10, d d0) {
        L.p(function10, "<this>");
        L.p(d0, "completion");
        return function10 instanceof kotlin.coroutines.jvm.internal.a ? ((Function1)v0.q(function10, 1)).invoke(d0) : kotlin.coroutines.intrinsics.b.k(function10, d0);
    }

    @b0
    @m
    public static Object i(@l o o0, Object object0, @l d d0) {
        L.p(o0, "<this>");
        L.p(d0, "completion");
        d d1 = c.d(h.a(d0));
        return ((o)v0.q(o0, 2)).invoke(object0, d1);
    }

    @b0
    @m
    public static Object j(@l p p0, Object object0, Object object1, @l d d0) {
        L.p(p0, "<this>");
        L.p(d0, "completion");
        d d1 = c.d(h.a(d0));
        return ((p)v0.q(p0, 3)).invoke(object0, object1, d1);
    }

    @b0
    @m
    public static Object k(@l Function1 function10, @l d d0) {
        L.p(function10, "<this>");
        L.p(d0, "completion");
        d d1 = c.d(h.a(d0));
        return ((Function1)v0.q(function10, 1)).invoke(d1);
    }
}

