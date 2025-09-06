package androidx.compose.foundation.lazy.grid;

import A3.o;
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
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nLazyGridScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridScopeImpl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1#2:77\n*E\n"})
public final class LazyGridScopeImpl implements LazyGridScope {
    @l
    private final MutableIntervalList a;
    private boolean b;
    @l
    private final o c;

    public LazyGridScopeImpl() {
        this.a = new MutableIntervalList();
        this.c = androidx.compose.foundation.lazy.grid.LazyGridScopeImpl.DefaultSpan.1.e;

        final class androidx.compose.foundation.lazy.grid.LazyGridScopeImpl.DefaultSpan.1 extends N implements o {
            public static final androidx.compose.foundation.lazy.grid.LazyGridScopeImpl.DefaultSpan.1 e;

            static {
                androidx.compose.foundation.lazy.grid.LazyGridScopeImpl.DefaultSpan.1.e = new androidx.compose.foundation.lazy.grid.LazyGridScopeImpl.DefaultSpan.1();
            }

            androidx.compose.foundation.lazy.grid.LazyGridScopeImpl.DefaultSpan.1() {
                super(2);
            }

            public final long a(@l LazyGridItemSpanScope lazyGridItemSpanScope0, int v) {
                L.p(lazyGridItemSpanScope0, "$this$null");
                return 1L;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return GridItemSpan.a(this.a(((LazyGridItemSpanScope)object0), ((Number)object1).intValue()));
            }
        }

    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridScope
    public void a(int v, @m Function1 function10, @m o o0, @l Function1 function11, @l q q0) {
        L.p(function11, "contentType");
        L.p(q0, "itemContent");
        this.a.b(v, new LazyGridIntervalContent(function10, (o0 == null ? this.c : o0), function11, q0));
        if(o0 != null) {
            this.b = true;
        }
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridScope
    public void b(@m Object object0, @m Function1 function10, @m Object object1, @l p p0) {
        L.p(p0, "content");
        MutableIntervalList mutableIntervalList0 = this.a;
        androidx.compose.foundation.lazy.grid.LazyGridScopeImpl.item.1.1 lazyGridScopeImpl$item$1$10 = object0 == null ? null : new Function1() {
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
        o o0 = function10 == null ? this.c : new o() {
            final Function1 e;

            {
                this.e = function10;
                super(2);
            }

            public final long a(@l LazyGridItemSpanScope lazyGridItemSpanScope0, int v) {
                L.p(lazyGridItemSpanScope0, "$this$null");
                return ((GridItemSpan)this.e.invoke(lazyGridItemSpanScope0)).i();
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return GridItemSpan.a(this.a(((LazyGridItemSpanScope)object0), ((Number)object1).intValue()));
            }
        };
        mutableIntervalList0.b(1, new LazyGridIntervalContent(lazyGridScopeImpl$item$1$10, o0, new Function1() {
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
        }, ComposableLambdaKt.c(-1504808184, true, new q() {
            final p e;

            {
                this.e = p0;
                super(4);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                this.a(((LazyGridItemScope)object0), ((Number)object1).intValue(), ((Composer)object2), ((Number)object3).intValue());
                return S0.a;
            }

            @Composable
            public final void a(@l LazyGridItemScope lazyGridItemScope0, int v, @m Composer composer0, int v1) {
                L.p(lazyGridItemScope0, "$this$$receiver");
                if((v1 & 14) == 0) {
                    v1 |= (composer0.t(lazyGridItemScope0) ? 4 : 2);
                }
                if((v1 & 651) == 130 && composer0.c()) {
                    composer0.m();
                    return;
                }
                if(ComposerKt.g0()) {
                    ComposerKt.w0(-1504808184, v1, -1, "androidx.compose.foundation.lazy.grid.LazyGridScopeImpl.item.<anonymous> (LazyGridScopeImpl.kt:42)");
                }
                this.e.invoke(lazyGridItemScope0, composer0, ((int)(v1 & 14)));
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }
        })));
        if(function10 != null) {
            this.b = true;
        }
    }

    public final boolean c() {
        return this.b;
    }

    @l
    public final MutableIntervalList d() {
        return this.a;
    }

    public final void e(boolean z) {
        this.b = z;
    }
}

