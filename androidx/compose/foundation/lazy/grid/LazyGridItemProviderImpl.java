package androidx.compose.foundation.lazy.grid;

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
import java.util.Map;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@ExperimentalFoundationApi
final class LazyGridItemProviderImpl implements LazyGridItemProvider, LazyLayoutItemProvider {
    @l
    private final IntervalList a;
    private final boolean b;
    private final LazyLayoutItemProvider c;
    @l
    private final LazyGridSpanLayoutProvider d;

    public LazyGridItemProviderImpl(@l IntervalList intervalList0, boolean z, @l LazyGridState lazyGridState0, @l kotlin.ranges.l l0) {
        L.p(intervalList0, "intervals");
        L.p(lazyGridState0, "state");
        L.p(l0, "nearestItemsRange");
        super();
        this.a = intervalList0;
        this.b = z;
        this.c = LazyLayoutItemProviderKt.b(intervalList0, l0, ComposableLambdaKt.c(0x8B165E37, true, new q() {
            final LazyGridState e;

            {
                this.e = lazyGridState0;
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
                    ComposerKt.w0(0x8B165E37, v2, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.$$delegate_0.<anonymous> (LazyGridItemProvider.kt:89)");
                }
                int v3 = v - intervalList$Interval0.b();
                Function1 function10 = ((LazyGridIntervalContent)intervalList$Interval0.c()).getKey();
                LazyLayoutPinnableItemKt.a((function10 == null ? null : function10.invoke(v3)), v, this.e.t(), ComposableLambdaKt.b(composer0, 0xEFECD02B, true, new o(v3) {
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
                            ComposerKt.w0(0xEFECD02B, v, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.$$delegate_0.<anonymous>.<anonymous> (LazyGridItemProvider.kt:95)");
                        }
                        ((LazyGridIntervalContent)this.e.c()).a().T0(LazyGridItemScopeImpl.a, this.f, composer0, 6);
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
        this.d = new LazyGridSpanLayoutProvider(this);
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
        Composer composer1 = composer0.G(0x50C6AA44);
        int v2 = (v1 & 14) == 0 ? (composer1.z(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.t(this) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.c()) {
            if(ComposerKt.g0()) {
                ComposerKt.w0(0x50C6AA44, v2, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item (LazyGridItemProvider.kt:-1)");
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
                final LazyGridItemProviderImpl e;
                final int f;
                final int g;

                {
                    this.e = lazyGridItemProviderImpl0;
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

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
    public long b(@l LazyGridItemSpanScope lazyGridItemSpanScope0, int v) {
        L.p(lazyGridItemSpanScope0, "$this$getSpan");
        Interval intervalList$Interval0 = this.a.get(v);
        return ((GridItemSpan)((LazyGridIntervalContent)intervalList$Interval0.c()).b().invoke(lazyGridItemSpanScope0, ((int)(v - intervalList$Interval0.b())))).i();
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
    public boolean c() {
        return this.b;
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
    @l
    public LazyGridSpanLayoutProvider f() {
        return this.d;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getItemCount() {
        return this.c.getItemCount();
    }
}

