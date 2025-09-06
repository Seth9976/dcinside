package androidx.compose.foundation.lazy.staggeredgrid;

import A3.a;
import A3.o;
import A3.q;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList.Interval;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.foundation.lazy.layout.LazyNearestItemsRangeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.Map;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nLazyStaggeredGridItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridItemProvider.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProviderKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,73:1\n36#2:74\n1114#3,6:75\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridItemProvider.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProviderKt\n*L\n46#1:74\n46#1:75,6\n*E\n"})
public final class LazyStaggeredGridItemProviderKt {
    @ExperimentalFoundationApi
    @Composable
    @l
    public static final LazyStaggeredGridItemProvider a(@l LazyStaggeredGridState lazyStaggeredGridState0, @l Function1 function10, @m Composer composer0, int v) {
        L.p(lazyStaggeredGridState0, "state");
        L.p(function10, "content");
        composer0.V(2039920307);
        if(ComposerKt.g0()) {
            ComposerKt.w0(2039920307, v, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridItemProvider (LazyStaggeredGridItemProvider.kt:35)");
        }
        State state0 = SnapshotStateKt.t(function10, composer0, v >> 3 & 14);
        State state1 = LazyNearestItemsRangeKt.c(new a(lazyStaggeredGridState0) {
            final LazyStaggeredGridState e;

            {
                this.e = lazyStaggeredGridState0;
                super(0);
            }

            @l
            public final Integer b() {
                return this.e.q();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProvider.nearestItemsRangeState.2.e, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProvider.nearestItemsRangeState.3.e, composer0, 0x1B0);
        composer0.V(0x44FAF204);
        boolean z = composer0.t(lazyStaggeredGridState0);
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProvider.1.1 lazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$1$10 = composer0.W();
        if(z || lazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$1$10 == Composer.a.a()) {
            lazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$1$10 = new Object() {
                private final LazyLayoutItemProvider a;

                {
                    State state0 = SnapshotStateKt.c(new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProvider.1.itemProviderState.1(state0, state1, lazyStaggeredGridState0));  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                    this.a = LazyLayoutItemProviderKt.a(state0);
                }

                @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
                @l
                public Object D(int v) {
                    return this.a.D(v);
                }

                @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
                @m
                public Object E(int v) {
                    return this.a.E(v);
                }

                @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
                @Composable
                public void F(int v, @m Composer composer0, int v1) {
                    composer0.V(0xF771298A);
                    if(ComposerKt.g0()) {
                        ComposerKt.w0(0xF771298A, v1, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridItemProvider.<anonymous>.<no name provided>.Item (LazyStaggeredGridItemProvider.kt:-1)");
                    }
                    this.a.F(v, composer0, v1 & 14);
                    if(ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    composer0.g0();
                }

                @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
                @l
                public Map G() {
                    return this.a.G();
                }

                @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider
                @l
                public LazyStaggeredGridSpanProvider a() {
                    return ((androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProvider.1.itemProviderState.1.1)SnapshotStateKt.c(new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProvider.1.itemProviderState.1(state0, state1, lazyStaggeredGridState0)).getValue()).a();
                }

                @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
                public int getItemCount() {
                    return this.a.getItemCount();
                }
            };
            composer0.O(lazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$1$10);
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return lazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$1$10;

        final class androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProvider.1.itemProviderState.1 extends N implements a {
            final State e;
            final State f;
            final LazyStaggeredGridState g;

            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProvider.1.itemProviderState.1(State state0, State state1, LazyStaggeredGridState lazyStaggeredGridState0) {
                this.e = state0;
                this.f = state1;
                this.g = lazyStaggeredGridState0;
                super(0);
            }

            @l
            public final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProvider.1.itemProviderState.1.1 b() {
                LazyStaggeredGridScopeImpl lazyStaggeredGridScopeImpl0 = new LazyStaggeredGridScopeImpl();
                ((Function1)this.e.getValue()).invoke(lazyStaggeredGridScopeImpl0);
                return new Object() {
                    private final LazyLayoutItemProvider a;
                    @l
                    private final LazyStaggeredGridSpanProvider b;

                    {
                        LazyStaggeredGridScopeImpl lazyStaggeredGridScopeImpl0 = this.f;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                        State state0 = this.g;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                        this.a = LazyLayoutItemProviderKt.b(lazyStaggeredGridScopeImpl0.c(), ((kotlin.ranges.l)state0.getValue()), ComposableLambdaKt.c(-364721306, true, new q() {
                            final LazyStaggeredGridState e;

                            {
                                this.e = lazyStaggeredGridState0;
                                super(4);
                            }

                            @Override  // A3.q
                            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                                this.a(((Interval)object0), ((Number)object1).intValue(), ((Composer)object2), ((Number)object3).intValue());
                                return S0.a;
                            }

                            @Composable
                            public final void a(@l Interval intervalList$Interval0, int v, @m Composer composer0, int v1) {
                                L.p(intervalList$Interval0, "interval");
                                int v2 = (v1 & 14) == 0 ? (composer0.t(intervalList$Interval0) ? 4 : 2) | v1 : v1;
                                if((v1 & 0x70) == 0) {
                                    v2 |= (composer0.z(v) ? 0x20 : 16);
                                }
                                if((v2 & 731) == 0x92 && composer0.c()) {
                                    composer0.m();
                                    return;
                                }
                                if(ComposerKt.g0()) {
                                    ComposerKt.w0(-364721306, v2, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridItemProvider.<anonymous>.<anonymous>.<no name provided>.$$delegate_0.<anonymous> (LazyStaggeredGridItemProvider.kt:51)");
                                }
                                int v3 = v - intervalList$Interval0.b();
                                Function1 function10 = ((LazyStaggeredGridIntervalContent)intervalList$Interval0.c()).getKey();
                                LazyLayoutPinnableItemKt.a((function10 == null ? null : function10.invoke(v3)), v, this.e.z(), ComposableLambdaKt.b(composer0, 1181040114, true, new o(v3) {
                                    final Interval e;
                                    final int f;

                                    {
                                        this.e = intervalList$Interval0;
                                        this.f = v;
                                        super(2);
                                    }

                                    @Composable
                                    public final void a(@m Composer composer0, int v) {
                                        if((v & 11) == 2 && composer0.c()) {
                                            composer0.m();
                                            return;
                                        }
                                        if(ComposerKt.g0()) {
                                            ComposerKt.w0(1181040114, v, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridItemProvider.<anonymous>.<anonymous>.<no name provided>.$$delegate_0.<anonymous>.<anonymous> (LazyStaggeredGridItemProvider.kt:57)");
                                        }
                                        ((LazyStaggeredGridIntervalContent)this.e.c()).a().T0(LazyStaggeredGridItemScopeImpl.a, this.f, composer0, 6);
                                        if(ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override  // A3.o
                                    public Object invoke(Object object0, Object object1) {
                                        this.a(((Composer)object0), ((Number)object1).intValue());
                                        return S0.a;
                                    }
                                }), composer0, v2 & 0x70 | 0xE08);
                                if(ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }
                        }));
                        this.b = new LazyStaggeredGridSpanProvider(lazyStaggeredGridScopeImpl0.c());
                    }

                    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
                    @l
                    public Object D(int v) {
                        return this.a.D(v);
                    }

                    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
                    @m
                    public Object E(int v) {
                        return this.a.E(v);
                    }

                    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
                    @Composable
                    public void F(int v, @m Composer composer0, int v1) {
                        composer0.V(0x455B6279);
                        if(ComposerKt.g0()) {
                            ComposerKt.w0(0x455B6279, v1, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridItemProvider.<anonymous>.<anonymous>.<no name provided>.Item (LazyStaggeredGridItemProvider.kt:-1)");
                        }
                        this.a.F(v, composer0, v1 & 14);
                        if(ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        composer0.g0();
                    }

                    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
                    @l
                    public Map G() {
                        return this.a.G();
                    }

                    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider
                    @l
                    public LazyStaggeredGridSpanProvider a() {
                        return this.b;
                    }

                    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
                    public int getItemCount() {
                        return this.a.getItemCount();
                    }
                };
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        final class androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProvider.nearestItemsRangeState.2 extends N implements a {
            public static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProvider.nearestItemsRangeState.2 e;

            static {
                androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProvider.nearestItemsRangeState.2.e = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProvider.nearestItemsRangeState.2();
            }

            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProvider.nearestItemsRangeState.2() {
                super(0);
            }

            @l
            public final Integer b() {
                return 90;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        final class androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProvider.nearestItemsRangeState.3 extends N implements a {
            public static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProvider.nearestItemsRangeState.3 e;

            static {
                androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProvider.nearestItemsRangeState.3.e = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProvider.nearestItemsRangeState.3();
            }

            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProvider.nearestItemsRangeState.3() {
                super(0);
            }

            @l
            public final Integer b() {
                return 200;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

    }
}

