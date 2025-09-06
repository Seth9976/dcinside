package androidx.compose.foundation.lazy.layout;

import A3.a;
import A3.o;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.l;
import kotlin.ranges.s;
import kotlinx.coroutines.O;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import y4.m;

@s0({"SMAP\nLazyNearestItemsRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyNearestItemsRange.kt\nandroidx/compose/foundation/lazy/layout/LazyNearestItemsRangeKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,89:1\n67#2,3:90\n66#2:93\n83#2,3:110\n1114#3,3:94\n1117#3,3:107\n1114#3,6:113\n480#4,4:97\n485#4:106\n122#5,5:101\n*S KotlinDebug\n*F\n+ 1 LazyNearestItemsRange.kt\nandroidx/compose/foundation/lazy/layout/LazyNearestItemsRangeKt\n*L\n47#1:90,3\n47#1:93\n59#1:110,3\n47#1:94,3\n47#1:107,3\n59#1:113,6\n48#1:97,4\n48#1:106\n48#1:101,5\n*E\n"})
public final class LazyNearestItemsRangeKt {
    private static final l b(int v, int v1, int v2) {
        int v3 = v / v1 * v1;
        return s.W1(Math.max(v3 - v2, 0), v3 + v1 + v2);
    }

    @ExperimentalFoundationApi
    @Composable
    @y4.l
    public static final State c(@y4.l a a0, @y4.l a a1, @y4.l a a2, @m Composer composer0, int v) {
        MutableState mutableState1;
        L.p(a0, "firstVisibleItemIndex");
        L.p(a1, "slidingWindowSize");
        L.p(a2, "extraItemCount");
        composer0.V(0x199D35E1);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x199D35E1, v, -1, "androidx.compose.foundation.lazy.layout.rememberLazyNearestItemsRangeState (LazyNearestItemsRange.kt:41)");
        }
        composer0.V(0x607FB4C4);
        boolean z = composer0.t(a0);
        boolean z1 = composer0.t(a1);
        boolean z2 = composer0.t(a2);
        MutableState mutableState0 = composer0.W();
        if((z | z1 | z2) != 0 || mutableState0 == Composer.a.a()) {
            Snapshot snapshot0 = Snapshot.e.a();
            try {
                Snapshot snapshot1 = snapshot0.p();
                try {
                    mutableState1 = SnapshotStateKt__SnapshotStateKt.g(LazyNearestItemsRangeKt.b(((Number)a0.invoke()).intValue(), ((Number)a1.invoke()).intValue(), ((Number)a2.invoke()).intValue()), null, 2, null);
                }
                catch(Throwable throwable0) {
                    snapshot0.w(snapshot1);
                    throw throwable0;
                }
                snapshot0.w(snapshot1);
            }
            finally {
                snapshot0.d();
            }
            composer0.O(mutableState1);
            mutableState0 = mutableState1;
        }
        composer0.g0();
        Object[] arr_object = {a0, a1, a2, mutableState0};
        composer0.V(0xDE219177);
        boolean z3 = false;
        for(int v1 = 0; v1 < 4; ++v1) {
            z3 |= composer0.t(arr_object[v1]);
        }
        androidx.compose.foundation.lazy.layout.LazyNearestItemsRangeKt.rememberLazyNearestItemsRangeState.1.1 lazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$10 = composer0.W();
        if(z3 || lazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$10 == Composer.a.a()) {
            lazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$10 = new o(a0, a1, a2, mutableState0, null) {
                int k;
                final a l;
                final a m;
                final a n;
                final MutableState o;

                {
                    this.l = a0;
                    this.m = a1;
                    this.n = a2;
                    this.o = mutableState0;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @y4.l
                public final d create(@m Object object0, @y4.l d d0) {
                    return new androidx.compose.foundation.lazy.layout.LazyNearestItemsRangeKt.rememberLazyNearestItemsRangeState.1.1(this.l, this.m, this.n, this.o, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@y4.l O o0, @m d d0) {
                    return ((androidx.compose.foundation.lazy.layout.LazyNearestItemsRangeKt.rememberLazyNearestItemsRangeState.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@y4.l Object object0) {
                    Object object1 = b.l();
                    switch(this.k) {
                        case 0: {
                            f0.n(object0);
                            i i0 = SnapshotStateKt.v(new a(this.m, this.n) {
                                final a e;
                                final a f;
                                final a g;

                                {
                                    this.e = a0;
                                    this.f = a1;
                                    this.g = a2;
                                    super(0);
                                }

                                @y4.l
                                public final l b() {
                                    return LazyNearestItemsRangeKt.b(((Number)this.e.invoke()).intValue(), ((Number)this.f.invoke()).intValue(), ((Number)this.g.invoke()).intValue());
                                }

                                @Override  // A3.a
                                public Object invoke() {
                                    return this.b();
                                }
                            });
                            androidx.compose.foundation.lazy.layout.LazyNearestItemsRangeKt.rememberLazyNearestItemsRangeState.1.1.2 lazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1$20 = new j() {
                                @m
                                public final Object a(@y4.l l l0, @y4.l d d0) {
                                    this.a.setValue(l0);
                                    return S0.a;
                                }

                                @Override  // kotlinx.coroutines.flow.j
                                public Object emit(Object object0, d d0) {
                                    return this.a(((l)object0), d0);
                                }
                            };
                            this.k = 1;
                            return i0.collect(lazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1$20, this) == object1 ? object1 : S0.a;
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
            composer0.O(lazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$10);
        }
        composer0.g0();
        EffectsKt.g(mutableState0, lazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$10, composer0, 0x40);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return mutableState0;
    }
}

