package androidx.compose.foundation.lazy;

import A3.p;
import A3.q;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class LazyListScopeImpl implements LazyListScope {
    @l
    private final MutableIntervalList a;
    @l
    private final IntervalList b;
    @m
    private List c;

    public LazyListScopeImpl() {
        MutableIntervalList mutableIntervalList0 = new MutableIntervalList();
        this.a = mutableIntervalList0;
        this.b = mutableIntervalList0;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListScope
    public void a(int v, @m Function1 function10, @l Function1 function11, @l q q0) {
        L.p(function11, "contentType");
        L.p(q0, "itemContent");
        LazyListIntervalContent lazyListIntervalContent0 = new LazyListIntervalContent(function10, function11, q0);
        this.a.b(v, lazyListIntervalContent0);
    }

    @Override  // androidx.compose.foundation.lazy.LazyListScope
    public void b(int v, Function1 function10, q q0) {
        LazyListScope.-CC.c(this, v, function10, q0);
    }

    @Override  // androidx.compose.foundation.lazy.LazyListScope
    public void c(Object object0, p p0) {
        LazyListScope.-CC.a(this, object0, p0);
    }

    @Override  // androidx.compose.foundation.lazy.LazyListScope
    public void d(@m Object object0, @m Object object1, @l p p0) {
        L.p(p0, "content");
        androidx.compose.foundation.lazy.LazyListScopeImpl.item.1 lazyListScopeImpl$item$10 = object0 == null ? null : new Function1() {
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
        this.a.b(1, new LazyListIntervalContent(lazyListScopeImpl$item$10, new Function1() {
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
        }, ComposableLambdaKt.c(0xD42EF786, true, new q() {
            final p e;

            {
                this.e = p0;
                super(4);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                this.a(((LazyItemScope)object0), ((Number)object1).intValue(), ((Composer)object2), ((Number)object3).intValue());
                return S0.a;
            }

            @Composable
            public final void a(@l LazyItemScope lazyItemScope0, int v, @m Composer composer0, int v1) {
                L.p(lazyItemScope0, "$this$$receiver");
                if((v1 & 14) == 0) {
                    v1 |= (composer0.t(lazyItemScope0) ? 4 : 2);
                }
                if((v1 & 651) == 130 && composer0.c()) {
                    composer0.m();
                    return;
                }
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0xD42EF786, v1, -1, "androidx.compose.foundation.lazy.LazyListScopeImpl.item.<anonymous> (LazyListScopeImpl.kt:55)");
                }
                this.e.invoke(lazyItemScope0, composer0, ((int)(v1 & 14)));
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }
        })));
    }

    @Override  // androidx.compose.foundation.lazy.LazyListScope
    @ExperimentalFoundationApi
    public void e(@m Object object0, @m Object object1, @l p p0) {
        L.p(p0, "content");
        List list0 = this.c;
        if(list0 == null) {
            list0 = new ArrayList();
            this.c = list0;
        }
        list0.add(this.a.getSize());
        this.d(object0, object1, p0);
    }

    @l
    public final List f() {
        return this.c == null ? u.H() : this.c;
    }

    @l
    public final IntervalList g() {
        return this.b;
    }
}

