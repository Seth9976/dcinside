package androidx.compose.foundation.lazy.grid;

import A3.a;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyNearestItemsRangeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nLazyGridItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridItemProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemProviderKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,120:1\n36#2:121\n36#2:128\n1114#3,6:122\n1114#3,6:129\n*S KotlinDebug\n*F\n+ 1 LazyGridItemProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemProviderKt\n*L\n47#1:121\n54#1:128\n47#1:122,6\n54#1:129,6\n*E\n"})
public final class LazyGridItemProviderKt {
    private static final int a = 90;
    private static final int b = 200;

    @ExperimentalFoundationApi
    @Composable
    @l
    public static final LazyGridItemProvider a(@l LazyGridState lazyGridState0, @l Function1 function10, @m Composer composer0, int v) {
        L.p(lazyGridState0, "state");
        L.p(function10, "content");
        composer0.V(0x6D2612EF);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x6D2612EF, v, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridItemProvider (LazyGridItemProvider.kt:40)");
        }
        State state0 = SnapshotStateKt.t(function10, composer0, v >> 3 & 14);
        composer0.V(0x44FAF204);
        boolean z = composer0.t(lazyGridState0);
        androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt.rememberLazyGridItemProvider.nearestItemsRangeState.1.1 lazyGridItemProviderKt$rememberLazyGridItemProvider$nearestItemsRangeState$1$10 = composer0.W();
        if(z || lazyGridItemProviderKt$rememberLazyGridItemProvider$nearestItemsRangeState$1$10 == Composer.a.a()) {
            lazyGridItemProviderKt$rememberLazyGridItemProvider$nearestItemsRangeState$1$10 = new a(lazyGridState0) {
                final LazyGridState e;

                {
                    this.e = lazyGridState0;
                    super(0);
                }

                @l
                public final Integer b() {
                    return this.e.n();
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.b();
                }
            };
            composer0.O(lazyGridItemProviderKt$rememberLazyGridItemProvider$nearestItemsRangeState$1$10);
        }
        composer0.g0();
        State state1 = LazyNearestItemsRangeKt.c(lazyGridItemProviderKt$rememberLazyGridItemProvider$nearestItemsRangeState$1$10, androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt.rememberLazyGridItemProvider.nearestItemsRangeState.2.e, androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt.rememberLazyGridItemProvider.nearestItemsRangeState.3.e, composer0, 0x1B0);
        composer0.V(0x44FAF204);
        boolean z1 = composer0.t(state1);
        androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt.rememberLazyGridItemProvider.1.1 lazyGridItemProviderKt$rememberLazyGridItemProvider$1$10 = composer0.W();
        if(z1 || lazyGridItemProviderKt$rememberLazyGridItemProvider$1$10 == Composer.a.a()) {
            lazyGridItemProviderKt$rememberLazyGridItemProvider$1$10 = new Object() {
                private final LazyLayoutItemProvider a;

                {
                    State state0 = SnapshotStateKt.c(new androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt.rememberLazyGridItemProvider.1.itemProviderState.1(state0, lazyGridState0, state1));  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
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
                    composer0.V(125380152);
                    if(ComposerKt.g0()) {
                        ComposerKt.w0(125380152, v1, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridItemProvider.<anonymous>.<no name provided>.Item (LazyGridItemProvider.kt:-1)");
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

                @Override  // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
                public long b(@l LazyGridItemSpanScope lazyGridItemSpanScope0, int v) {
                    L.p(lazyGridItemSpanScope0, "$this$getSpan");
                    return ((LazyGridItemProvider)SnapshotStateKt.c(new androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt.rememberLazyGridItemProvider.1.itemProviderState.1(state0, lazyGridState0, state1)).getValue()).b(lazyGridItemSpanScope0, v);
                }

                @Override  // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
                public boolean c() {
                    return ((LazyGridItemProvider)SnapshotStateKt.c(new androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt.rememberLazyGridItemProvider.1.itemProviderState.1(state0, lazyGridState0, state1)).getValue()).c();
                }

                @Override  // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
                @l
                public LazyGridSpanLayoutProvider f() {
                    return ((LazyGridItemProvider)SnapshotStateKt.c(new androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt.rememberLazyGridItemProvider.1.itemProviderState.1(state0, lazyGridState0, state1)).getValue()).f();
                }

                @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
                public int getItemCount() {
                    return this.a.getItemCount();
                }
            };
            composer0.O(lazyGridItemProviderKt$rememberLazyGridItemProvider$1$10);
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return lazyGridItemProviderKt$rememberLazyGridItemProvider$1$10;

        final class androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt.rememberLazyGridItemProvider.1.itemProviderState.1 extends N implements a {
            final State e;
            final LazyGridState f;
            final State g;

            androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt.rememberLazyGridItemProvider.1.itemProviderState.1(State state0, LazyGridState lazyGridState0, State state1) {
                this.e = state0;
                this.f = lazyGridState0;
                this.g = state1;
                super(0);
            }

            @l
            public final LazyGridItemProviderImpl b() {
                LazyGridScopeImpl lazyGridScopeImpl0 = new LazyGridScopeImpl();
                ((Function1)this.e.getValue()).invoke(lazyGridScopeImpl0);
                kotlin.ranges.l l0 = (kotlin.ranges.l)this.g.getValue();
                return new LazyGridItemProviderImpl(lazyGridScopeImpl0.d(), lazyGridScopeImpl0.c(), this.f, l0);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        final class androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt.rememberLazyGridItemProvider.nearestItemsRangeState.2 extends N implements a {
            public static final androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt.rememberLazyGridItemProvider.nearestItemsRangeState.2 e;

            static {
                androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt.rememberLazyGridItemProvider.nearestItemsRangeState.2.e = new androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt.rememberLazyGridItemProvider.nearestItemsRangeState.2();
            }

            androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt.rememberLazyGridItemProvider.nearestItemsRangeState.2() {
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


        final class androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt.rememberLazyGridItemProvider.nearestItemsRangeState.3 extends N implements a {
            public static final androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt.rememberLazyGridItemProvider.nearestItemsRangeState.3 e;

            static {
                androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt.rememberLazyGridItemProvider.nearestItemsRangeState.3.e = new androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt.rememberLazyGridItemProvider.nearestItemsRangeState.3();
            }

            androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt.rememberLazyGridItemProvider.nearestItemsRangeState.3() {
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

