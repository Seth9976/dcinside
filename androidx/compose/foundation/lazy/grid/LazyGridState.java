package androidx.compose.foundation.lazy.grid;

import A3.o;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.gestures.c;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import java.util.List;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Stable
@s0({"SMAP\nLazyGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridState\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,460:1\n1182#2:461\n1161#2,2:462\n76#3:464\n102#3,2:465\n76#3:467\n102#3,2:468\n76#3:470\n102#3,2:471\n76#3:473\n102#3,2:474\n76#3:476\n102#3,2:477\n76#3:479\n102#3,2:480\n76#3:482\n102#3,2:483\n76#3:485\n102#3,2:486\n460#4,11:488\n460#4,11:505\n33#5,6:499\n*S KotlinDebug\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridState\n*L\n191#1:461\n191#1:462,2\n151#1:464\n151#1:465,2\n156#1:467\n156#1:468,2\n161#1:470\n161#1:471,2\n203#1:473\n203#1:474,2\n224#1:476\n224#1:477,2\n226#1:479\n226#1:480,2\n283#1:482\n283#1:483,2\n285#1:485\n285#1:486,2\n354#1:488,11\n381#1:505,11\n359#1:499,6\n*E\n"})
public final class LazyGridState implements ScrollableState {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final Saver a() {
            return LazyGridState.z;
        }
    }

    @l
    private final LazyGridScrollPosition a;
    @l
    private final MutableState b;
    @l
    private final MutableInteractionSource c;
    private float d;
    @l
    private final MutableState e;
    @l
    private final MutableState f;
    @l
    private final MutableState g;
    @l
    private final ScrollableState h;
    private int i;
    private boolean j;
    private int k;
    @l
    private final MutableVector l;
    private boolean m;
    @l
    private final MutableState n;
    @l
    private final RemeasurementModifier o;
    @l
    private final AwaitFirstLayoutModifier p;
    @l
    private final MutableState q;
    @l
    private final MutableState r;
    @l
    private final LazyGridAnimateScrollScope s;
    @l
    private final LazyLayoutPinnedItemList t;
    @l
    private final MutableState u;
    @l
    private final MutableState v;
    @l
    private final LazyLayoutPrefetchState w;
    @l
    public static final Companion x;
    public static final int y;
    @l
    private static final Saver z;

    static {
        LazyGridState.x = new Companion(null);
        LazyGridState.z = ListSaverKt.a(LazyGridState.Companion.Saver.1.e, LazyGridState.Companion.Saver.2.e);
    }

    public LazyGridState() {
        this(0, 0, 3, null);
    }

    public LazyGridState(int v, int v1) {
        this.a = new LazyGridScrollPosition(v, v1);
        this.b = SnapshotStateKt__SnapshotStateKt.g(EmptyLazyGridLayoutInfo.a, null, 2, null);
        this.c = InteractionSourceKt.a();
        this.e = SnapshotStateKt__SnapshotStateKt.g(0, null, 2, null);
        this.f = SnapshotStateKt__SnapshotStateKt.g(DensityKt.a(1.0f, 1.0f), null, 2, null);
        this.g = SnapshotStateKt__SnapshotStateKt.g(Boolean.TRUE, null, 2, null);
        this.h = ScrollableStateKt.a(new Function1() {
            final LazyGridState e;

            {
                this.e = lazyGridState0;
                super(1);
            }

            @l
            public final Float b(float f) {
                return (float)(-this.e.E(-f));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.b(((Number)object0).floatValue());
            }
        });
        this.j = true;
        this.k = -1;
        this.l = new MutableVector(new PrefetchHandle[16], 0);
        this.n = SnapshotStateKt__SnapshotStateKt.g(null, null, 2, null);
        this.o = new RemeasurementModifier() {
            @Override  // androidx.compose.ui.Modifier$Element
            public boolean H(Function1 function10) {
                return b.b(this, function10);
            }

            @Override  // androidx.compose.ui.Modifier$Element
            public Object P(Object object0, o o0) {
                return b.c(this, object0, o0);
            }

            @Override  // androidx.compose.ui.Modifier$Element
            public Object U(Object object0, o o0) {
                return b.d(this, object0, o0);
            }

            @Override  // androidx.compose.ui.layout.RemeasurementModifier
            public void h1(@l Remeasurement remeasurement0) {
                L.p(remeasurement0, "remeasurement");
                this.a.N(remeasurement0);
            }

            @Override  // androidx.compose.ui.Modifier
            public Modifier r0(Modifier modifier0) {
                return a.a(this, modifier0);
            }

            @Override  // androidx.compose.ui.Modifier$Element
            public boolean u(Function1 function10) {
                return b.a(this, function10);
            }
        };
        this.p = new AwaitFirstLayoutModifier();
        this.q = SnapshotStateKt__SnapshotStateKt.g(androidx.compose.foundation.lazy.grid.LazyGridState.prefetchInfoRetriever.2.e, null, 2, null);
        this.r = SnapshotStateKt__SnapshotStateKt.g(null, null, 2, null);
        this.s = new LazyGridAnimateScrollScope(this);
        this.t = new LazyLayoutPinnedItemList();
        this.u = SnapshotStateKt__SnapshotStateKt.g(Boolean.FALSE, null, 2, null);
        this.v = SnapshotStateKt__SnapshotStateKt.g(Boolean.FALSE, null, 2, null);
        this.w = new LazyLayoutPrefetchState();

        final class androidx.compose.foundation.lazy.grid.LazyGridState.prefetchInfoRetriever.2 extends N implements Function1 {
            public static final androidx.compose.foundation.lazy.grid.LazyGridState.prefetchInfoRetriever.2 e;

            static {
                androidx.compose.foundation.lazy.grid.LazyGridState.prefetchInfoRetriever.2.e = new androidx.compose.foundation.lazy.grid.LazyGridState.prefetchInfoRetriever.2();
            }

            androidx.compose.foundation.lazy.grid.LazyGridState.prefetchInfoRetriever.2() {
                super(1);
            }

            @l
            public final List a(int v) {
                return u.H();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((LineIndex)object0).n());
            }
        }

    }

    public LazyGridState(int v, int v1, int v2, w w0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        this(v, v1);
    }

    public final float A() {
        return this.d;
    }

    public final int B() {
        return ((Number)this.e.getValue()).intValue();
    }

    public final boolean C() {
        return ((Boolean)this.g.getValue()).booleanValue();
    }

    private final void D(float f) {
        int v2;
        int v1;
        LazyLayoutPrefetchState lazyLayoutPrefetchState0 = this.w;
        if(!this.j) {
            return;
        }
        LazyGridLayoutInfo lazyGridLayoutInfo0 = this.r();
        if(!lazyGridLayoutInfo0.f().isEmpty()) {
            if(f < 0.0f) {
                LazyGridItemInfo lazyGridItemInfo0 = (LazyGridItemInfo)u.p3(lazyGridLayoutInfo0.f());
                v1 = (this.C() ? lazyGridItemInfo0.c() : lazyGridItemInfo0.getColumn()) + 1;
                v2 = ((LazyGridItemInfo)u.p3(lazyGridLayoutInfo0.f())).getIndex() + 1;
            }
            else {
                LazyGridItemInfo lazyGridItemInfo1 = (LazyGridItemInfo)u.B2(lazyGridLayoutInfo0.f());
                v1 = (this.C() ? lazyGridItemInfo1.c() : lazyGridItemInfo1.getColumn()) - 1;
                v2 = ((LazyGridItemInfo)u.B2(lazyGridLayoutInfo0.f())).getIndex() - 1;
            }
            if(v1 != this.k && v2 >= 0 && v2 < lazyGridLayoutInfo0.c()) {
                if(this.m != f < 0.0f) {
                    MutableVector mutableVector0 = this.l;
                    int v3 = mutableVector0.J();
                    if(v3 > 0) {
                        Object[] arr_object = mutableVector0.F();
                        int v4 = 0;
                        while(true) {
                            ((PrefetchHandle)arr_object[v4]).cancel();
                            ++v4;
                            if(v4 >= v3) {
                                break;
                            }
                        }
                    }
                }
                this.m = f < 0.0f;
                this.k = v1;
                this.l.l();
                List list0 = (List)this.v().invoke(LineIndex.a(v1));
                int v5 = list0.size();
                for(int v = 0; v < v5; ++v) {
                    V v6 = (V)list0.get(v);
                    PrefetchHandle lazyLayoutPrefetchState$PrefetchHandle0 = lazyLayoutPrefetchState0.b(((Number)v6.e()).intValue(), ((Constraints)v6.f()).x());
                    this.l.b(lazyLayoutPrefetchState$PrefetchHandle0);
                }
            }
        }
    }

    public final float E(float f) {
        if(f < 0.0f && !this.a() || f > 0.0f && !this.e()) {
            return 0.0f;
        }
        if(Math.abs(this.d) > 0.5f) {
            throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.d).toString());
        }
        float f1 = this.d + f;
        this.d = f1;
        if(Math.abs(f1) > 0.5f) {
            float f2 = this.d;
            Remeasurement remeasurement0 = this.y();
            if(remeasurement0 != null) {
                remeasurement0.d();
            }
            if(this.j) {
                this.D(f2 - this.d);
            }
        }
        if(Math.abs(this.d) <= 0.5f) {
            return f;
        }
        float f3 = f - this.d;
        this.d = 0.0f;
        return f3;
    }

    @m
    public final Object F(int v, int v1, @l d d0) {
        Object object0 = c.e(this, null, new o(v, v1, null) {
            int k;
            final LazyGridState l;
            final int m;
            final int n;

            {
                this.l = lazyGridState0;
                this.m = v;
                this.n = v1;
                super(2, d0);
            }

            @m
            public final Object a(@l ScrollScope scrollScope0, @m d d0) {
                return ((androidx.compose.foundation.lazy.grid.LazyGridState.scrollToItem.2)this.create(scrollScope0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new androidx.compose.foundation.lazy.grid.LazyGridState.scrollToItem.2(this.l, this.m, this.n, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((ScrollScope)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.Q(this.m, this.n);
                return S0.a;
            }
        }, d0, 1, null);
        return object0 == kotlin.coroutines.intrinsics.b.l() ? object0 : S0.a;
    }

    public static Object G(LazyGridState lazyGridState0, int v, int v1, d d0, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        return lazyGridState0.F(v, v1, d0);
    }

    private void H(boolean z) {
        this.v.setValue(Boolean.valueOf(z));
    }

    private void I(boolean z) {
        this.u.setValue(Boolean.valueOf(z));
    }

    public final void J(@l Density density0) {
        L.p(density0, "<set-?>");
        this.f.setValue(density0);
    }

    public final void K(@m LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator0) {
        this.r.setValue(lazyGridItemPlacementAnimator0);
    }

    public final void L(@l Function1 function10) {
        L.p(function10, "<set-?>");
        this.q.setValue(function10);
    }

    public final void M(boolean z) {
        this.j = z;
    }

    private final void N(Remeasurement remeasurement0) {
        this.n.setValue(remeasurement0);
    }

    public final void O(int v) {
        this.e.setValue(v);
    }

    public final void P(boolean z) {
        this.g.setValue(Boolean.valueOf(z));
    }

    public final void Q(int v, int v1) {
        this.a.c(v, v1);
        LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator0 = this.u();
        if(lazyGridItemPlacementAnimator0 != null) {
            lazyGridItemPlacementAnimator0.i();
        }
        Remeasurement remeasurement0 = this.y();
        if(remeasurement0 != null) {
            remeasurement0.d();
        }
    }

    public final void R(@l LazyGridItemProvider lazyGridItemProvider0) {
        L.p(lazyGridItemProvider0, "itemProvider");
        this.a.h(lazyGridItemProvider0);
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean a() {
        return ((Boolean)this.u.getValue()).booleanValue();
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public float b(float f) {
        return this.h.b(f);
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean c() {
        return this.h.c();
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    @m
    public Object d(@l MutatePriority mutatePriority0, @l o o0, @l d d0) {
        LazyGridState lazyGridState0;
        androidx.compose.foundation.lazy.grid.LazyGridState.scroll.1 lazyGridState$scroll$10;
        if(d0 instanceof androidx.compose.foundation.lazy.grid.LazyGridState.scroll.1) {
            lazyGridState$scroll$10 = (androidx.compose.foundation.lazy.grid.LazyGridState.scroll.1)d0;
            int v = lazyGridState$scroll$10.p;
            if((v & 0x80000000) == 0) {
                lazyGridState$scroll$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    Object m;
                    Object n;
                    int p;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.n = object0;
                        this.p |= 0x80000000;
                        return d0.d(null, null, this);
                    }
                };
            }
            else {
                lazyGridState$scroll$10.p = v ^ 0x80000000;
            }
        }
        else {
            lazyGridState$scroll$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                Object l;
                Object m;
                Object n;
                int p;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.n = object0;
                    this.p |= 0x80000000;
                    return d0.d(null, null, this);
                }
            };
        }
        Object object0 = lazyGridState$scroll$10.n;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(lazyGridState$scroll$10.p) {
            case 0: {
                f0.n(object0);
                lazyGridState$scroll$10.k = this;
                lazyGridState$scroll$10.l = mutatePriority0;
                lazyGridState$scroll$10.m = o0;
                lazyGridState$scroll$10.p = 1;
                if(this.p.a(lazyGridState$scroll$10) == object1) {
                    return object1;
                }
                lazyGridState0 = this;
                break;
            }
            case 1: {
                o0 = (o)lazyGridState$scroll$10.m;
                mutatePriority0 = (MutatePriority)lazyGridState$scroll$10.l;
                lazyGridState0 = (LazyGridState)lazyGridState$scroll$10.k;
                f0.n(object0);
                break;
            }
            case 2: {
                f0.n(object0);
                return S0.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        lazyGridState$scroll$10.k = null;
        lazyGridState$scroll$10.l = null;
        lazyGridState$scroll$10.m = null;
        lazyGridState$scroll$10.p = 2;
        return lazyGridState0.h.d(mutatePriority0, o0, lazyGridState$scroll$10) == object1 ? object1 : S0.a;
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean e() {
        return ((Boolean)this.v.getValue()).booleanValue();
    }

    @m
    public final Object h(int v, int v1, @l d d0) {
        Object object0 = LazyAnimateScrollKt.d(this.s, v, v1, d0);
        return object0 == kotlin.coroutines.intrinsics.b.l() ? object0 : S0.a;
    }

    public static Object i(LazyGridState lazyGridState0, int v, int v1, d d0, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        return lazyGridState0.h(v, v1, d0);
    }

    public final void j(@l LazyGridMeasureResult lazyGridMeasureResult0) {
        L.p(lazyGridMeasureResult0, "result");
        this.a.g(lazyGridMeasureResult0);
        this.d -= lazyGridMeasureResult0.m();
        this.b.setValue(lazyGridMeasureResult0);
        this.I(lazyGridMeasureResult0.j());
        LazyGridMeasuredLine lazyGridMeasuredLine0 = lazyGridMeasureResult0.n();
        this.H((lazyGridMeasuredLine0 == null ? 0 : lazyGridMeasuredLine0.a()) != 0 || lazyGridMeasureResult0.o() != 0);
        ++this.i;
        this.k(lazyGridMeasureResult0);
    }

    private final void k(LazyGridLayoutInfo lazyGridLayoutInfo0) {
        int v;
        if(this.k != -1 && !lazyGridLayoutInfo0.f().isEmpty()) {
            if(this.m) {
                LazyGridItemInfo lazyGridItemInfo0 = (LazyGridItemInfo)u.p3(lazyGridLayoutInfo0.f());
                v = (this.C() ? lazyGridItemInfo0.c() : lazyGridItemInfo0.getColumn()) + 1;
            }
            else {
                LazyGridItemInfo lazyGridItemInfo1 = (LazyGridItemInfo)u.B2(lazyGridLayoutInfo0.f());
                v = (this.C() ? lazyGridItemInfo1.c() : lazyGridItemInfo1.getColumn()) - 1;
            }
            if(this.k != v) {
                this.k = -1;
                MutableVector mutableVector0 = this.l;
                int v1 = mutableVector0.J();
                if(v1 > 0) {
                    Object[] arr_object = mutableVector0.F();
                    int v2 = 0;
                    while(true) {
                        ((PrefetchHandle)arr_object[v2]).cancel();
                        ++v2;
                        if(v2 >= v1) {
                            break;
                        }
                    }
                }
                this.l.l();
            }
        }
    }

    @l
    public final AwaitFirstLayoutModifier l() {
        return this.p;
    }

    @l
    public final Density m() {
        return (Density)this.f.getValue();
    }

    public final int n() {
        return this.a.a();
    }

    public final int o() {
        return this.a.b();
    }

    @l
    public final InteractionSource p() {
        return this.c;
    }

    @l
    public final MutableInteractionSource q() {
        return this.c;
    }

    @l
    public final LazyGridLayoutInfo r() {
        return (LazyGridLayoutInfo)this.b.getValue();
    }

    public final int s() {
        return this.i;
    }

    @l
    public final LazyLayoutPinnedItemList t() {
        return this.t;
    }

    @m
    public final LazyGridItemPlacementAnimator u() {
        return (LazyGridItemPlacementAnimator)this.r.getValue();
    }

    @l
    public final Function1 v() {
        return (Function1)this.q.getValue();
    }

    @l
    public final LazyLayoutPrefetchState w() {
        return this.w;
    }

    public final boolean x() {
        return this.j;
    }

    private final Remeasurement y() {
        return (Remeasurement)this.n.getValue();
    }

    @l
    public final RemeasurementModifier z() {
        return this.o;
    }
}

