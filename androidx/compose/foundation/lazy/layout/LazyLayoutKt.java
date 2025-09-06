package androidx.compose.foundation.lazy.layout;

import A3.a;
import A3.o;
import A3.p;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.S0;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class LazyLayoutKt {
    private static final int a = 7;

    @ExperimentalFoundationApi
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void a(@l LazyLayoutItemProvider lazyLayoutItemProvider0, @m Modifier modifier0, @m LazyLayoutPrefetchState lazyLayoutPrefetchState0, @l o o0, @m Composer composer0, int v, int v1) {
        LazyLayoutPrefetchState lazyLayoutPrefetchState1;
        Modifier modifier1;
        int v2;
        L.p(lazyLayoutItemProvider0, "itemProvider");
        L.p(o0, "measurePolicy");
        Composer composer1 = composer0.G(0x32D52BD3);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.t(lazyLayoutItemProvider0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.t(modifier0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.t(lazyLayoutPrefetchState0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.Y(o0) ? 0x800 : 0x400);
        }
        if((v2 & 5851) != 1170 || !composer1.c()) {
            Modifier modifier2 = (v1 & 2) == 0 ? modifier0 : Modifier.m0;
            LazyLayoutPrefetchState lazyLayoutPrefetchState2 = (v1 & 4) == 0 ? lazyLayoutPrefetchState0 : null;
            if(ComposerKt.g0()) {
                ComposerKt.w0(0x32D52BD3, v2, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:41)");
            }
            LazySaveableStateHolderKt.a(ComposableLambdaKt.b(composer1, 0x500AAFAB, true, new p(lazyLayoutPrefetchState2, modifier2, o0, v2, SnapshotStateKt.t(lazyLayoutItemProvider0, composer1, v2 & 14)) {
                final LazyLayoutPrefetchState e;
                final Modifier f;
                final o g;
                final int h;
                final State i;

                {
                    this.e = lazyLayoutPrefetchState0;
                    this.f = modifier0;
                    this.g = o0;
                    this.h = v;
                    this.i = state0;
                    super(3);
                }

                @Composable
                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                public final void a(@l SaveableStateHolder saveableStateHolder0, @m Composer composer0, int v) {
                    L.p(saveableStateHolder0, "saveableStateHolder");
                    if(ComposerKt.g0()) {
                        ComposerKt.w0(0x500AAFAB, v, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:49)");
                    }
                    State state0 = this.i;
                    composer0.V(0xE2A708A4);
                    LazyLayoutItemContentFactory lazyLayoutItemContentFactory0 = composer0.W();
                    Companion composer$Companion0 = Composer.a;
                    if(lazyLayoutItemContentFactory0 == composer$Companion0.a()) {
                        lazyLayoutItemContentFactory0 = new LazyLayoutItemContentFactory(saveableStateHolder0, new a() {
                            final State e;

                            {
                                this.e = state0;
                                super(0);
                            }

                            @l
                            public final LazyLayoutItemProvider b() {
                                return (LazyLayoutItemProvider)this.e.getValue();
                            }

                            @Override  // A3.a
                            public Object invoke() {
                                return this.b();
                            }
                        });
                        composer0.O(lazyLayoutItemContentFactory0);
                    }
                    composer0.g0();
                    composer0.V(0xE2A708A4);
                    SubcomposeLayoutState subcomposeLayoutState0 = composer0.W();
                    if(subcomposeLayoutState0 == composer$Companion0.a()) {
                        subcomposeLayoutState0 = new SubcomposeLayoutState(new LazyLayoutItemReusePolicy(lazyLayoutItemContentFactory0));
                        composer0.O(subcomposeLayoutState0);
                    }
                    composer0.g0();
                    composer0.V(0xA52C86E0);
                    if(this.e != null) {
                        LazyLayoutPrefetcher_androidKt.a(this.e, lazyLayoutItemContentFactory0, subcomposeLayoutState0, composer0, this.h >> 6 & 14 | 0x40 | SubcomposeLayoutState.f << 6);
                    }
                    composer0.g0();
                    Modifier modifier0 = this.f;
                    o o0 = this.g;
                    composer0.V(0x1E7B2B64);
                    boolean z = composer0.t(lazyLayoutItemContentFactory0);
                    boolean z1 = composer0.t(o0);
                    androidx.compose.foundation.lazy.layout.LazyLayoutKt.LazyLayout.1.2.1 lazyLayoutKt$LazyLayout$1$2$10 = composer0.W();
                    if(z || z1 || lazyLayoutKt$LazyLayout$1$2$10 == composer$Companion0.a()) {
                        lazyLayoutKt$LazyLayout$1$2$10 = new o(o0) {
                            final LazyLayoutItemContentFactory e;
                            final o f;

                            {
                                this.e = lazyLayoutItemContentFactory0;
                                this.f = o0;
                                super(2);
                            }

                            @l
                            public final MeasureResult a(@l SubcomposeMeasureScope subcomposeMeasureScope0, long v) {
                                L.p(subcomposeMeasureScope0, "$this$null");
                                LazyLayoutMeasureScopeImpl lazyLayoutMeasureScopeImpl0 = new LazyLayoutMeasureScopeImpl(this.e, subcomposeMeasureScope0);
                                Constraints constraints0 = Constraints.b(v);
                                return (MeasureResult)this.f.invoke(lazyLayoutMeasureScopeImpl0, constraints0);
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                return this.a(((SubcomposeMeasureScope)object0), ((Constraints)object1).x());
                            }
                        };
                        composer0.O(lazyLayoutKt$LazyLayout$1$2$10);
                    }
                    composer0.g0();
                    SubcomposeLayoutKt.b(subcomposeLayoutState0, modifier0, lazyLayoutKt$LazyLayout$1$2$10, composer0, SubcomposeLayoutState.f | this.h & 0x70, 0);
                    if(ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override  // A3.p
                public Object invoke(Object object0, Object object1, Object object2) {
                    this.a(((SaveableStateHolder)object0), ((Composer)object1), ((Number)object2).intValue());
                    return S0.a;
                }
            }), composer1, 6);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            modifier1 = modifier2;
            lazyLayoutPrefetchState1 = lazyLayoutPrefetchState2;
        }
        else {
            composer1.m();
            modifier1 = modifier0;
            lazyLayoutPrefetchState1 = lazyLayoutPrefetchState0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(lazyLayoutItemProvider0, modifier1, lazyLayoutPrefetchState1, o0, v, v1) {
                final LazyLayoutItemProvider e;
                final Modifier f;
                final LazyLayoutPrefetchState g;
                final o h;
                final int i;
                final int j;

                {
                    this.e = lazyLayoutItemProvider0;
                    this.f = modifier0;
                    this.g = lazyLayoutPrefetchState0;
                    this.h = o0;
                    this.i = v;
                    this.j = v1;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    LazyLayoutKt.a(this.e, this.f, this.g, this.h, composer0, (this.i | 1) & -920350135 | ((0x24924924 & (this.i | 1)) >> 1 | 306783378 & (this.i | 1)) | (306783378 & (this.i | 1)) << 1 & (0x24924924 & (this.i | 1)), this.j);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }
}

