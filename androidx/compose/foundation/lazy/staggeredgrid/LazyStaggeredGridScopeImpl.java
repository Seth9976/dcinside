package androidx.compose.foundation.lazy.staggeredgrid;

import A3.p;
import A3.q;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nLazyStaggeredGridScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridScope.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"})
public final class LazyStaggeredGridScopeImpl implements LazyStaggeredGridScope {
    @l
    private final MutableIntervalList a;

    public LazyStaggeredGridScopeImpl() {
        this.a = new MutableIntervalList();
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope
    public void a(@m Object object0, @m Object object1, @m StaggeredGridItemSpan staggeredGridItemSpan0, @l p p0) {
        L.p(p0, "content");
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScopeImpl.item.3.1 lazyStaggeredGridScopeImpl$item$3$10 = null;
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScopeImpl.item.1.1 lazyStaggeredGridScopeImpl$item$1$10 = object0 == null ? null : new Function1() {
            final Object e;

            {
                this.e = object0;
                super(1);
            }

            @l
            public final Object a(int v) {
                return this.e;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).intValue());
            }
        };
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScopeImpl.item.2 lazyStaggeredGridScopeImpl$item$20 = new Function1() {
            final Object e;

            {
                this.e = object0;
                super(1);
            }

            @m
            public final Object a(int v) {
                return this.e;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).intValue());
            }
        };
        if(staggeredGridItemSpan0 != null) {
            lazyStaggeredGridScopeImpl$item$3$10 = new Function1() {
                final StaggeredGridItemSpan e;

                {
                    this.e = staggeredGridItemSpan0;
                    super(1);
                }

                @l
                public final StaggeredGridItemSpan a(int v) {
                    return this.e;
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((Number)object0).intValue());
                }
            };
        }
        this.b(1, lazyStaggeredGridScopeImpl$item$1$10, lazyStaggeredGridScopeImpl$item$20, lazyStaggeredGridScopeImpl$item$3$10, ComposableLambdaKt.c(1700162468, true, new q() {
            final p e;

            {
                this.e = p0;
                super(4);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                this.a(((LazyStaggeredGridItemScope)object0), ((Number)object1).intValue(), ((Composer)object2), ((Number)object3).intValue());
                return S0.a;
            }

            @Composable
            public final void a(@l LazyStaggeredGridItemScope lazyStaggeredGridItemScope0, int v, @m Composer composer0, int v1) {
                L.p(lazyStaggeredGridItemScope0, "$this$items");
                if((v1 & 14) == 0) {
                    v1 |= (composer0.t(lazyStaggeredGridItemScope0) ? 4 : 2);
                }
                if((v1 & 651) == 130 && composer0.c()) {
                    composer0.m();
                    return;
                }
                if(ComposerKt.g0()) {
                    ComposerKt.w0(1700162468, v1, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScopeImpl.item.<anonymous> (LazyStaggeredGridScope.kt:38)");
                }
                this.e.invoke(lazyStaggeredGridItemScope0, composer0, ((int)(v1 & 14)));
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }
        }));
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope
    public void b(int v, @m Function1 function10, @l Function1 function11, @m Function1 function12, @l q q0) {
        L.p(function11, "contentType");
        L.p(q0, "itemContent");
        LazyStaggeredGridIntervalContent lazyStaggeredGridIntervalContent0 = new LazyStaggeredGridIntervalContent(function10, function11, function12, q0);
        this.a.b(v, lazyStaggeredGridIntervalContent0);
    }

    @l
    public final MutableIntervalList c() {
        return this.a;
    }
}

