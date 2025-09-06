package androidx.compose.foundation.lazy;

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
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nLazyListItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListItemProvider.kt\nandroidx/compose/foundation/lazy/LazyListItemProviderKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,103:1\n36#2:104\n50#2:111\n49#2:112\n1114#3,6:105\n1114#3,6:113\n*S KotlinDebug\n*F\n+ 1 LazyListItemProvider.kt\nandroidx/compose/foundation/lazy/LazyListItemProviderKt\n*L\n46#1:104\n51#1:111\n51#1:112\n46#1:105,6\n51#1:113,6\n*E\n"})
public final class LazyListItemProviderKt {
    private static final int a = 30;
    private static final int b = 100;

    @ExperimentalFoundationApi
    @Composable
    @l
    public static final LazyListItemProvider a(@l LazyListState lazyListState0, @l Function1 function10, @m Composer composer0, int v) {
        L.p(lazyListState0, "state");
        L.p(function10, "content");
        composer0.V(0x739A4A8B);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x739A4A8B, v, -1, "androidx.compose.foundation.lazy.rememberLazyListItemProvider (LazyListItemProvider.kt:39)");
        }
        State state0 = SnapshotStateKt.t(function10, composer0, v >> 3 & 14);
        composer0.V(0x44FAF204);
        boolean z = composer0.t(lazyListState0);
        androidx.compose.foundation.lazy.LazyListItemProviderKt.rememberLazyListItemProvider.nearestItemsRangeState.1.1 lazyListItemProviderKt$rememberLazyListItemProvider$nearestItemsRangeState$1$10 = composer0.W();
        if(z || lazyListItemProviderKt$rememberLazyListItemProvider$nearestItemsRangeState$1$10 == Composer.a.a()) {
            lazyListItemProviderKt$rememberLazyListItemProvider$nearestItemsRangeState$1$10 = new a(lazyListState0) {
                final LazyListState e;

                {
                    this.e = lazyListState0;
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
            composer0.O(lazyListItemProviderKt$rememberLazyListItemProvider$nearestItemsRangeState$1$10);
        }
        composer0.g0();
        State state1 = LazyNearestItemsRangeKt.c(lazyListItemProviderKt$rememberLazyListItemProvider$nearestItemsRangeState$1$10, androidx.compose.foundation.lazy.LazyListItemProviderKt.rememberLazyListItemProvider.nearestItemsRangeState.2.e, androidx.compose.foundation.lazy.LazyListItemProviderKt.rememberLazyListItemProvider.nearestItemsRangeState.3.e, composer0, 0x1B0);
        composer0.V(0x1E7B2B64);
        boolean z1 = composer0.t(state1);
        boolean z2 = composer0.t(lazyListState0);
        androidx.compose.foundation.lazy.LazyListItemProviderKt.rememberLazyListItemProvider.1.1 lazyListItemProviderKt$rememberLazyListItemProvider$1$10 = composer0.W();
        if(z1 || z2 || lazyListItemProviderKt$rememberLazyListItemProvider$1$10 == Composer.a.a()) {
            lazyListItemProviderKt$rememberLazyListItemProvider$1$10 = new Object() {
                private final LazyLayoutItemProvider a;

                {
                    State state0 = SnapshotStateKt.c(new androidx.compose.foundation.lazy.LazyListItemProviderKt.rememberLazyListItemProvider.1.itemProviderState.1(state0, state1, new LazyItemScopeImpl(), lazyListState0));  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
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
                    composer0.V(-203667997);
                    if(ComposerKt.g0()) {
                        ComposerKt.w0(-203667997, v1, -1, "androidx.compose.foundation.lazy.rememberLazyListItemProvider.<anonymous>.<no name provided>.Item (LazyListItemProvider.kt:-1)");
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

                @Override  // androidx.compose.foundation.lazy.LazyListItemProvider
                @l
                public LazyItemScopeImpl d() {
                    return ((LazyListItemProviderImpl)SnapshotStateKt.c(new androidx.compose.foundation.lazy.LazyListItemProviderKt.rememberLazyListItemProvider.1.itemProviderState.1(state0, state1, new LazyItemScopeImpl(), lazyListState0)).getValue()).d();
                }

                @Override  // androidx.compose.foundation.lazy.LazyListItemProvider
                @l
                public List e() {
                    return ((LazyListItemProviderImpl)SnapshotStateKt.c(new androidx.compose.foundation.lazy.LazyListItemProviderKt.rememberLazyListItemProvider.1.itemProviderState.1(state0, state1, new LazyItemScopeImpl(), lazyListState0)).getValue()).e();
                }

                @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
                public int getItemCount() {
                    return this.a.getItemCount();
                }
            };
            composer0.O(lazyListItemProviderKt$rememberLazyListItemProvider$1$10);
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return lazyListItemProviderKt$rememberLazyListItemProvider$1$10;

        final class androidx.compose.foundation.lazy.LazyListItemProviderKt.rememberLazyListItemProvider.1.itemProviderState.1 extends N implements a {
            final State e;
            final State f;
            final LazyItemScopeImpl g;
            final LazyListState h;

            androidx.compose.foundation.lazy.LazyListItemProviderKt.rememberLazyListItemProvider.1.itemProviderState.1(State state0, State state1, LazyItemScopeImpl lazyItemScopeImpl0, LazyListState lazyListState0) {
                this.e = state0;
                this.f = state1;
                this.g = lazyItemScopeImpl0;
                this.h = lazyListState0;
                super(0);
            }

            @l
            public final LazyListItemProviderImpl b() {
                LazyListScopeImpl lazyListScopeImpl0 = new LazyListScopeImpl();
                ((Function1)this.e.getValue()).invoke(lazyListScopeImpl0);
                return new LazyListItemProviderImpl(lazyListScopeImpl0.g(), ((kotlin.ranges.l)this.f.getValue()), lazyListScopeImpl0.f(), this.g, this.h);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        final class androidx.compose.foundation.lazy.LazyListItemProviderKt.rememberLazyListItemProvider.nearestItemsRangeState.2 extends N implements a {
            public static final androidx.compose.foundation.lazy.LazyListItemProviderKt.rememberLazyListItemProvider.nearestItemsRangeState.2 e;

            static {
                androidx.compose.foundation.lazy.LazyListItemProviderKt.rememberLazyListItemProvider.nearestItemsRangeState.2.e = new androidx.compose.foundation.lazy.LazyListItemProviderKt.rememberLazyListItemProvider.nearestItemsRangeState.2();
            }

            androidx.compose.foundation.lazy.LazyListItemProviderKt.rememberLazyListItemProvider.nearestItemsRangeState.2() {
                super(0);
            }

            @l
            public final Integer b() {
                return 30;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        final class androidx.compose.foundation.lazy.LazyListItemProviderKt.rememberLazyListItemProvider.nearestItemsRangeState.3 extends N implements a {
            public static final androidx.compose.foundation.lazy.LazyListItemProviderKt.rememberLazyListItemProvider.nearestItemsRangeState.3 e;

            static {
                androidx.compose.foundation.lazy.LazyListItemProviderKt.rememberLazyListItemProvider.nearestItemsRangeState.3.e = new androidx.compose.foundation.lazy.LazyListItemProviderKt.rememberLazyListItemProvider.nearestItemsRangeState.3();
            }

            androidx.compose.foundation.lazy.LazyListItemProviderKt.rememberLazyListItemProvider.nearestItemsRangeState.3() {
                super(0);
            }

            @l
            public final Integer b() {
                return 100;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

    }
}

