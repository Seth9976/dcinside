package com.unity3d.services.core.extensions;

import A3.o;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.X;
import kotlinx.coroutines.k;
import kotlinx.coroutines.sync.a;
import kotlinx.coroutines.sync.c;
import y4.l;
import y4.m;

@s0({"SMAP\nCoroutineExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExtensions.kt\ncom/unity3d/services/core/extensions/CoroutineExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n14#1,6:48\n1#2:54\n*S KotlinDebug\n*F\n+ 1 CoroutineExtensions.kt\ncom/unity3d/services/core/extensions/CoroutineExtensionsKt\n*L\n24#1:48,6\n*E\n"})
public final class CoroutineExtensionsKt {
    @l
    private static final LinkedHashMap deferreds;
    @l
    private static final a mutex;

    static {
        CoroutineExtensionsKt.deferreds = new CoroutineExtensionsKt.deferreds.1();
        CoroutineExtensionsKt.mutex = c.b(false, 1, null);
    }

    @l
    public static final LinkedHashMap getDeferreds() {
        return CoroutineExtensionsKt.deferreds;
    }

    @l
    public static final a getMutex() {
        return CoroutineExtensionsKt.mutex;
    }

    @m
    public static final Object memoize(@l Object object0, @l Function1 function10, @l d d0) {
        return P.g(new o(object0, function10, null) {
            final Function1 $action;
            final Object $key;
            private Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;

            {
                this.$key = object0;
                this.$action = function10;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new com.unity3d.services.core.extensions.CoroutineExtensionsKt.memoize.2(this.$key, this.$action, d0);
                d1.L$0 = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.services.core.extensions.CoroutineExtensionsKt.memoize.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                X x0;
                Object object3;
                Function1 function10;
                a a0;
                O o0;
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        o0 = (O)this.L$0;
                        a0 = CoroutineExtensionsKt.getMutex();
                        Object object2 = this.$key;
                        function10 = this.$action;
                        this.L$0 = o0;
                        this.L$1 = a0;
                        this.L$2 = object2;
                        this.L$3 = function10;
                        this.label = 1;
                        if(a0.h(null, this) == object1) {
                            return object1;
                        }
                        object3 = object2;
                        break;
                    }
                    case 1: {
                        function10 = (Function1)this.L$3;
                        object3 = this.L$2;
                        a0 = (a)this.L$1;
                        o0 = (O)this.L$0;
                        f0.n(object0);
                        break;
                    }
                    case 2: {
                        f0.n(object0);
                        return object0;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                try {
                    LinkedHashMap linkedHashMap0 = CoroutineExtensionsKt.getDeferreds();
                    x0 = linkedHashMap0.get(object3);
                    if(x0 == null) {
                        x0 = k.b(o0, null, null, new o(null) {
                            final Function1 $action;
                            int label;

                            {
                                this.$action = function10;
                                super(2, d0);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final d create(@m Object object0, @l d d0) {
                                return new com.unity3d.services.core.extensions.CoroutineExtensionsKt.memoize.2.deferred.1.1.1(this.$action, d0);
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                return this.invoke(((O)object0), ((d)object1));
                            }

                            @m
                            public final Object invoke(@l O o0, @m d d0) {
                                return ((com.unity3d.services.core.extensions.CoroutineExtensionsKt.memoize.2.deferred.1.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                Object object1 = b.l();
                                switch(this.label) {
                                    case 0: {
                                        f0.n(object0);
                                        this.label = 1;
                                        object0 = this.$action.invoke(this);
                                        return object0 == object1 ? object1 : object0;
                                    }
                                    case 1: {
                                        f0.n(object0);
                                        return object0;
                                    }
                                    default: {
                                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                    }
                                }
                            }

                            @m
                            public final Object invokeSuspend$$forInline(@l Object object0) {
                                return this.$action.invoke(this);
                            }
                        }, 3, null);
                        linkedHashMap0.put(object3, x0);
                    }
                }
                finally {
                    a0.i(null);
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
                object0 = x0.o(this);
                return object0 == object1 ? object1 : object0;
            }

            @m
            public final Object invokeSuspend$$forInline(@l Object object0) {
                X x0;
                O o0 = (O)this.L$0;
                a a0 = CoroutineExtensionsKt.getMutex();
                Object object1 = this.$key;
                Function1 function10 = this.$action;
                a0.h(null, this);
                try {
                    LinkedHashMap linkedHashMap0 = CoroutineExtensionsKt.getDeferreds();
                    x0 = linkedHashMap0.get(object1);
                    if(x0 == null) {
                        x0 = k.b(o0, null, null, new com.unity3d.services.core.extensions.CoroutineExtensionsKt.memoize.2.deferred.1.1.1(function10, null), 3, null);
                        linkedHashMap0.put(object1, x0);
                    }
                }
                finally {
                    a0.i(null);
                }
                return x0.o(this);
            }
        }, d0);
    }

    private static final Object memoize$$forInline(Object object0, Function1 function10, d d0) {
        return P.g(new com.unity3d.services.core.extensions.CoroutineExtensionsKt.memoize.2(object0, function10, null), d0);
    }

    @l
    public static final Object runReturnSuspendCatching(@l A3.a a0) {
        Object object0;
        L.p(a0, "block");
        try {
            object0 = e0.b(a0.invoke());
        }
        catch(CancellationException cancellationException0) {
            throw cancellationException0;
        }
        catch(Throwable throwable0) {
            object0 = e0.b(f0.a(throwable0));
        }
        if(e0.j(object0)) {
            return object0;
        }
        Throwable throwable1 = e0.e(object0);
        return throwable1 == null ? object0 : e0.b(f0.a(throwable1));
    }

    @l
    public static final Object runSuspendCatching(@l A3.a a0) {
        L.p(a0, "block");
        try {
            return e0.b(a0.invoke());
        }
        catch(CancellationException cancellationException0) {
            throw cancellationException0;
        }
        catch(Throwable throwable0) {
            return e0.b(f0.a(throwable0));
        }
    }
}

