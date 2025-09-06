package androidx.compose.foundation.lazy;

import A3.o;
import A3.q;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList.Interval;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import java.util.Map;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@ExperimentalFoundationApi
final class LazyListItemProviderImpl implements LazyListItemProvider, LazyLayoutItemProvider {
    @l
    private final List a;
    @l
    private final LazyItemScopeImpl b;
    private final LazyLayoutItemProvider c;

    public LazyListItemProviderImpl(@l IntervalList intervalList0, @l kotlin.ranges.l l0, @l List list0, @l LazyItemScopeImpl lazyItemScopeImpl0, @l LazyListState lazyListState0) {
        L.p(intervalList0, "intervals");
        L.p(l0, "nearestItemsRange");
        L.p(list0, "headerIndexes");
        L.p(lazyItemScopeImpl0, "itemScope");
        L.p(lazyListState0, "state");
        super();
        this.a = list0;
        this.b = lazyItemScopeImpl0;
        this.c = LazyLayoutItemProviderKt.b(intervalList0, l0, ComposableLambdaKt.c(2070454083, true, new q(lazyItemScopeImpl0) {
            final LazyListState e;
            final LazyItemScopeImpl f;

            {
                this.e = lazyListState0;
                this.f = lazyItemScopeImpl0;
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
                    ComposerKt.w0(2070454083, v2, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.$$delegate_0.<anonymous> (LazyListItemProvider.kt:81)");
                }
                int v3 = v - intervalList$Interval0.b();
                Function1 function10 = ((LazyListIntervalContent)intervalList$Interval0.c()).getKey();
                LazyLayoutPinnableItemKt.a((function10 == null ? null : function10.invoke(v3)), v, this.e.t(), ComposableLambdaKt.b(composer0, 0x4827C4CF, true, new o(this.f, v3) {
                    final Interval e;
                    final LazyItemScopeImpl f;
                    final int g;

                    {
                        this.e = intervalList$Interval0;
                        this.f = lazyItemScopeImpl0;
                        this.g = v;
                        super(2);
                    }

                    @Composable
                    public final void a(@m Composer composer0, int v) {
                        if((v & 11) == 2 && composer0.c()) {
                            composer0.m();
                            return;
                        }
                        if(ComposerKt.g0()) {
                            ComposerKt.w0(0x4827C4CF, v, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.$$delegate_0.<anonymous>.<anonymous> (LazyListItemProvider.kt:87)");
                        }
                        ((LazyListIntervalContent)this.e.c()).a().T0(this.f, this.g, composer0, 0);
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
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @l
    public Object D(int v) {
        return this.c.D(v);
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @m
    public Object E(int v) {
        return this.c.E(v);
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @Composable
    public void F(int v, @m Composer composer0, int v1) {
        Composer composer1 = composer0.G(0x9DF23F16);
        int v2 = (v1 & 14) == 0 ? (composer1.z(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.t(this) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.c()) {
            if(ComposerKt.g0()) {
                ComposerKt.w0(0x9DF23F16, v2, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item (LazyListItemProvider.kt:-1)");
            }
            this.c.F(v, composer1, v2 & 14);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        else {
            composer1.m();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(v, v1) {
                final LazyListItemProviderImpl e;
                final int f;
                final int g;

                {
                    this.e = lazyListItemProviderImpl0;
                    this.f = v;
                    this.g = v1;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    this.e.F(this.f, composer0, (this.g | 1) & -920350135 | ((0x24924924 & (this.g | 1)) >> 1 | 306783378 & (this.g | 1)) | (306783378 & (this.g | 1)) << 1 & (0x24924924 & (this.g | 1)));
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @l
    public Map G() {
        return this.c.G();
    }

    @Override  // androidx.compose.foundation.lazy.LazyListItemProvider
    @l
    public LazyItemScopeImpl d() {
        return this.b;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListItemProvider
    @l
    public List e() {
        return this.a;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getItemCount() {
        return this.c.getItemCount();
    }
}

