package androidx.compose.runtime;

import A3.o;
import A3.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

@s0({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/RecomposerKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1408:1\n361#2,7:1409\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/RecomposerKt\n*L\n1400#1:1409,7\n*E\n"})
public final class RecomposerKt {
    private static final int a = 1000;
    @l
    private static final Object b;
    @l
    private static final Object c;

    static {
        RecomposerKt.b = new Object();
        RecomposerKt.c = new Object();
    }

    public static final boolean c(@l Map map0, Object object0, Object object1) {
        L.p(map0, "<this>");
        ArrayList arrayList0 = map0.get(object0);
        if(arrayList0 == null) {
            arrayList0 = new ArrayList();
            map0.put(object0, arrayList0);
        }
        return arrayList0.add(object1);
    }

    @m
    public static final Object d(@l Map map0, Object object0) {
        L.p(map0, "<this>");
        List list0 = (List)map0.get(object0);
        if(list0 != null) {
            Object object1 = u.M0(list0);
            if(list0.isEmpty()) {
                map0.remove(object0);
                return object1;
            }
            return object1;
        }
        return null;
    }

    @m
    public static final Object e(@l p p0, @l d d0) {
        return P.g(new o(p0, null) {
            int k;
            private Object l;
            final p m;

            {
                this.m = p0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.runtime.RecomposerKt.withRunningRecomposer.2(this.m, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((androidx.compose.runtime.RecomposerKt.withRunningRecomposer.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Recomposer recomposer0;
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        O o0 = (O)this.l;
                        recomposer0 = new Recomposer(o0.getCoroutineContext());
                        k.f(o0, null, null, new o(null) {
                            int k;
                            final Recomposer l;

                            {
                                this.l = recomposer0;
                                super(2, d0);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final d create(@m Object object0, @l d d0) {
                                return new androidx.compose.runtime.RecomposerKt.withRunningRecomposer.2.1(this.l, d0);
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                return this.invoke(((O)object0), ((d)object1));
                            }

                            @m
                            public final Object invoke(@l O o0, @m d d0) {
                                return ((androidx.compose.runtime.RecomposerKt.withRunningRecomposer.2.1)this.create(o0, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                Object object1 = b.l();
                                switch(this.k) {
                                    case 0: {
                                        f0.n(object0);
                                        this.k = 1;
                                        return this.l.M0(this) == object1 ? object1 : S0.a;
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
                        }, 3, null);
                        this.l = recomposer0;
                        this.k = 1;
                        object0 = this.m.invoke(o0, recomposer0, this);
                        if(object0 == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
                        recomposer0 = (Recomposer)this.l;
                        f0.n(object0);
                        break;
                    }
                    case 2: {
                        Object object2 = this.l;
                        f0.n(object0);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                recomposer0.k0();
                this.l = object0;
                this.k = 2;
                return recomposer0.x0(this) == object1 ? object1 : object0;
            }
        }, d0);
    }
}

