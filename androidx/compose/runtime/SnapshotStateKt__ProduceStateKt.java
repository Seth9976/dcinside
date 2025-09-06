package androidx.compose.runtime;

import A3.o;
import java.util.Arrays;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nProduceState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProduceState.kt\nandroidx/compose/runtime/SnapshotStateKt__ProduceStateKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,224:1\n25#2:225\n25#2:232\n25#2:239\n25#2:246\n25#2:253\n1114#3,6:226\n1114#3,6:233\n1114#3,6:240\n1114#3,6:247\n1114#3,6:254\n*S KotlinDebug\n*F\n+ 1 ProduceState.kt\nandroidx/compose/runtime/SnapshotStateKt__ProduceStateKt\n*L\n82#1:225\n115#1:232\n149#1:239\n184#1:246\n217#1:253\n82#1:226,6\n115#1:233,6\n149#1:240,6\n184#1:247,6\n217#1:254,6\n*E\n"})
final class SnapshotStateKt__ProduceStateKt {
    @Composable
    @l
    public static final State a(Object object0, @l o o0, @m Composer composer0, int v) {
        L.p(o0, "producer");
        composer0.V(0x9F8503);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x9F8503, v, -1, "androidx.compose.runtime.produceState (ProduceState.kt:77)");
        }
        composer0.V(0xE2A708A4);
        MutableState mutableState0 = composer0.W();
        if(mutableState0 == Composer.a.a()) {
            mutableState0 = SnapshotStateKt__SnapshotStateKt.g(object0, null, 2, null);
            composer0.O(mutableState0);
        }
        composer0.g0();
        androidx.compose.runtime.SnapshotStateKt__ProduceStateKt.produceState.1 snapshotStateKt__ProduceStateKt$produceState$10 = new o(o0, mutableState0, null) {
            int k;
            private Object l;
            final o m;
            final MutableState n;

            {
                this.m = o0;
                this.n = mutableState0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.runtime.SnapshotStateKt__ProduceStateKt.produceState.1(this.m, this.n, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((androidx.compose.runtime.SnapshotStateKt__ProduceStateKt.produceState.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        g g0 = ((O)this.l).getCoroutineContext();
                        ProduceStateScopeImpl produceStateScopeImpl0 = new ProduceStateScopeImpl(this.n, g0);
                        this.k = 1;
                        return this.m.invoke(produceStateScopeImpl0, this) == object1 ? object1 : S0.a;
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
        };
        EffectsKt.g(S0.a, snapshotStateKt__ProduceStateKt$produceState$10, composer0, 70);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return mutableState0;
    }

    @Composable
    @l
    public static final State b(Object object0, @m Object object1, @l o o0, @m Composer composer0, int v) {
        L.p(o0, "producer");
        composer0.V(0x8D10F463);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x8D10F463, v, -1, "androidx.compose.runtime.produceState (ProduceState.kt:109)");
        }
        composer0.V(0xE2A708A4);
        MutableState mutableState0 = composer0.W();
        if(mutableState0 == Composer.a.a()) {
            mutableState0 = SnapshotStateKt__SnapshotStateKt.g(object0, null, 2, null);
            composer0.O(mutableState0);
        }
        composer0.g0();
        EffectsKt.g(object1, new o(o0, mutableState0, null) {
            int k;
            private Object l;
            final o m;
            final MutableState n;

            {
                this.m = o0;
                this.n = mutableState0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.runtime.SnapshotStateKt__ProduceStateKt.produceState.2(this.m, this.n, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((androidx.compose.runtime.SnapshotStateKt__ProduceStateKt.produceState.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        g g0 = ((O)this.l).getCoroutineContext();
                        ProduceStateScopeImpl produceStateScopeImpl0 = new ProduceStateScopeImpl(this.n, g0);
                        this.k = 1;
                        return this.m.invoke(produceStateScopeImpl0, this) == object1 ? object1 : S0.a;
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
        }, composer0, 72);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return mutableState0;
    }

    @Composable
    @l
    public static final State c(Object object0, @m Object object1, @m Object object2, @l o o0, @m Composer composer0, int v) {
        L.p(o0, "producer");
        composer0.V(-1703169085);
        if(ComposerKt.g0()) {
            ComposerKt.w0(-1703169085, v, -1, "androidx.compose.runtime.produceState (ProduceState.kt:142)");
        }
        composer0.V(0xE2A708A4);
        MutableState mutableState0 = composer0.W();
        if(mutableState0 == Composer.a.a()) {
            mutableState0 = SnapshotStateKt__SnapshotStateKt.g(object0, null, 2, null);
            composer0.O(mutableState0);
        }
        composer0.g0();
        EffectsKt.h(object1, object2, new o(o0, mutableState0, null) {
            int k;
            private Object l;
            final o m;
            final MutableState n;

            {
                this.m = o0;
                this.n = mutableState0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.runtime.SnapshotStateKt__ProduceStateKt.produceState.3(this.m, this.n, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((androidx.compose.runtime.SnapshotStateKt__ProduceStateKt.produceState.3)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        g g0 = ((O)this.l).getCoroutineContext();
                        ProduceStateScopeImpl produceStateScopeImpl0 = new ProduceStateScopeImpl(this.n, g0);
                        this.k = 1;
                        return this.m.invoke(produceStateScopeImpl0, this) == object1 ? object1 : S0.a;
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
        }, composer0, 584);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return mutableState0;
    }

    @Composable
    @l
    public static final State d(Object object0, @m Object object1, @m Object object2, @m Object object3, @l o o0, @m Composer composer0, int v) {
        L.p(o0, "producer");
        composer0.V(1807205155);
        if(ComposerKt.g0()) {
            ComposerKt.w0(1807205155, v, -1, "androidx.compose.runtime.produceState (ProduceState.kt:176)");
        }
        composer0.V(0xE2A708A4);
        MutableState mutableState0 = composer0.W();
        if(mutableState0 == Composer.a.a()) {
            mutableState0 = SnapshotStateKt__SnapshotStateKt.g(object0, null, 2, null);
            composer0.O(mutableState0);
        }
        composer0.g0();
        EffectsKt.i(object1, object2, object3, new o(o0, mutableState0, null) {
            int k;
            private Object l;
            final o m;
            final MutableState n;

            {
                this.m = o0;
                this.n = mutableState0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.runtime.SnapshotStateKt__ProduceStateKt.produceState.4(this.m, this.n, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((androidx.compose.runtime.SnapshotStateKt__ProduceStateKt.produceState.4)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        g g0 = ((O)this.l).getCoroutineContext();
                        ProduceStateScopeImpl produceStateScopeImpl0 = new ProduceStateScopeImpl(this.n, g0);
                        this.k = 1;
                        return this.m.invoke(produceStateScopeImpl0, this) == object1 ? object1 : S0.a;
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
        }, composer0, 4680);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return mutableState0;
    }

    @Composable
    @l
    public static final State e(Object object0, @l Object[] arr_object, @l o o0, @m Composer composer0, int v) {
        L.p(arr_object, "keys");
        L.p(o0, "producer");
        composer0.V(490154582);
        if(ComposerKt.g0()) {
            ComposerKt.w0(490154582, v, -1, "androidx.compose.runtime.produceState (ProduceState.kt:211)");
        }
        composer0.V(0xE2A708A4);
        MutableState mutableState0 = composer0.W();
        if(mutableState0 == Composer.a.a()) {
            mutableState0 = SnapshotStateKt__SnapshotStateKt.g(object0, null, 2, null);
            composer0.O(mutableState0);
        }
        composer0.g0();
        EffectsKt.j(Arrays.copyOf(arr_object, arr_object.length), new o(o0, mutableState0, null) {
            int k;
            private Object l;
            final o m;
            final MutableState n;

            {
                this.m = o0;
                this.n = mutableState0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.runtime.SnapshotStateKt__ProduceStateKt.produceState.5(this.m, this.n, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((androidx.compose.runtime.SnapshotStateKt__ProduceStateKt.produceState.5)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        g g0 = ((O)this.l).getCoroutineContext();
                        ProduceStateScopeImpl produceStateScopeImpl0 = new ProduceStateScopeImpl(this.n, g0);
                        this.k = 1;
                        return this.m.invoke(produceStateScopeImpl0, this) == object1 ? object1 : S0.a;
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
        }, composer0, 72);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return mutableState0;
    }
}

