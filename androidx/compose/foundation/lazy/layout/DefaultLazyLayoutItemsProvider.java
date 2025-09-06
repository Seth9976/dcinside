package androidx.compose.foundation.lazy.layout;

import A3.o;
import A3.q;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import java.util.HashMap;
import java.util.Map;
import kotlin.S0;
import kotlin.collections.Y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@ExperimentalFoundationApi
@s0({"SMAP\nLazyLayoutItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemProvider.kt\nandroidx/compose/foundation/lazy/layout/DefaultLazyLayoutItemsProvider\n*L\n1#1,231:1\n135#1,3:232\n135#1,3:235\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemProvider.kt\nandroidx/compose/foundation/lazy/layout/DefaultLazyLayoutItemsProvider\n*L\n122#1:232,3\n127#1:235,3\n*E\n"})
final class DefaultLazyLayoutItemsProvider implements LazyLayoutItemProvider {
    @l
    private final q a;
    @l
    private final IntervalList b;
    @l
    private final Map c;

    public DefaultLazyLayoutItemsProvider(@l q q0, @l IntervalList intervalList0, @l kotlin.ranges.l l0) {
        L.p(q0, "itemContentProvider");
        L.p(intervalList0, "intervals");
        L.p(l0, "nearestItemsRange");
        super();
        this.a = q0;
        this.b = intervalList0;
        this.c = this.g(l0, intervalList0);
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @l
    public Object D(int v) {
        Interval intervalList$Interval0 = this.b.get(v);
        int v1 = intervalList$Interval0.b();
        Function1 function10 = ((LazyLayoutIntervalContent)intervalList$Interval0.c()).getKey();
        if(function10 != null) {
            Object object0 = function10.invoke(((int)(v - v1)));
            return object0 == null ? Lazy_androidKt.a(v) : object0;
        }
        return Lazy_androidKt.a(v);
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @m
    public Object E(int v) {
        Interval intervalList$Interval0 = this.b.get(v);
        return ((LazyLayoutIntervalContent)intervalList$Interval0.c()).getType().invoke(((int)(v - intervalList$Interval0.b())));
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @Composable
    public void F(int v, @m Composer composer0, int v1) {
        Composer composer1 = composer0.G(0x901429E8);
        int v2 = (v1 & 14) == 0 ? (composer1.z(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.t(this) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.c()) {
            if(ComposerKt.g0()) {
                ComposerKt.w0(0x901429E8, v2, -1, "androidx.compose.foundation.lazy.layout.DefaultLazyLayoutItemsProvider.Item (LazyLayoutItemProvider.kt:116)");
            }
            Interval intervalList$Interval0 = this.b.get(v);
            this.a.T0(intervalList$Interval0, v, composer1, ((int)(v2 << 3 & 0x70)));
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
                final DefaultLazyLayoutItemsProvider e;
                final int f;
                final int g;

                {
                    this.e = defaultLazyLayoutItemsProvider0;
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
        return this.c;
    }

    @ExperimentalFoundationApi
    private final Map g(kotlin.ranges.l l0, IntervalList intervalList0) {
        int v = l0.g();
        if(v < 0) {
            throw new IllegalStateException("Check failed.");
        }
        int v1 = Math.min(l0.h(), intervalList0.getSize() - 1);
        if(v1 < v) {
            return Y.z();
        }
        HashMap hashMap0 = new HashMap();
        intervalList0.a(v, v1, new Function1(v1, hashMap0) {
            final int e;
            final int f;
            final HashMap g;

            {
                this.e = v;
                this.f = v1;
                this.g = hashMap0;
                super(1);
            }

            public final void a(@l Interval intervalList$Interval0) {
                L.p(intervalList$Interval0, "it");
                if(((LazyLayoutIntervalContent)intervalList$Interval0.c()).getKey() != null) {
                    Function1 function10 = ((LazyLayoutIntervalContent)intervalList$Interval0.c()).getKey();
                    if(function10 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    int v = Math.max(this.e, intervalList$Interval0.b());
                    int v1 = Math.min(this.f, intervalList$Interval0.b() + intervalList$Interval0.a() - 1);
                    if(v <= v1) {
                        while(true) {
                            Object object0 = function10.invoke(((int)(v - intervalList$Interval0.b())));
                            this.g.put(object0, v);
                            if(v == v1) {
                                return;
                            }
                            ++v;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Interval)object0));
                return S0.a;
            }
        });
        return hashMap0;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getItemCount() {
        return this.b.getSize();
    }

    @l
    public final IntervalList h() {
        return this.b;
    }

    @l
    public final q i() {
        return this.a;
    }

    private final Object j(int v, o o0) {
        Interval intervalList$Interval0 = this.b.get(v);
        return o0.invoke(((int)(v - intervalList$Interval0.b())), intervalList$Interval0.c());
    }
}

