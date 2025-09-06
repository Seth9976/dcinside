package androidx.compose.foundation.lazy;

import A3.o;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.gestures.c;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Stable
@s0({"SMAP\nLazyListState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,457:1\n76#2:458\n102#2,2:459\n76#2:461\n102#2,2:462\n76#2:464\n102#2,2:465\n76#2:467\n102#2,2:468\n76#2:470\n102#2,2:471\n76#2:473\n102#2,2:474\n*S KotlinDebug\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListState\n*L\n158#1:458\n158#1:459,2\n199#1:461\n199#1:462,2\n217#1:464\n217#1:465,2\n222#1:467\n222#1:468,2\n277#1:470\n277#1:471,2\n279#1:473\n279#1:474,2\n*E\n"})
public final class LazyListState implements ScrollableState {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final Saver a() {
            return LazyListState.x;
        }
    }

    @l
    private final LazyListScrollPosition a;
    @l
    private final LazyListAnimateScrollScope b;
    @l
    private final MutableState c;
    @l
    private final MutableInteractionSource d;
    private float e;
    @l
    private final MutableState f;
    @l
    private final ScrollableState g;
    private int h;
    private boolean i;
    private int j;
    @m
    private PrefetchHandle k;
    private boolean l;
    @l
    private final MutableState m;
    @l
    private final RemeasurementModifier n;
    @l
    private final AwaitFirstLayoutModifier o;
    @l
    private final MutableState p;
    @l
    private final MutableState q;
    @l
    private final LazyLayoutPinnedItemList r;
    @l
    private final MutableState s;
    @l
    private final MutableState t;
    @l
    private final LazyLayoutPrefetchState u;
    @l
    public static final Companion v;
    public static final int w;
    @l
    private static final Saver x;

    static {
        LazyListState.v = new Companion(null);
        LazyListState.x = ListSaverKt.a(LazyListState.Companion.Saver.1.e, LazyListState.Companion.Saver.2.e);
    }

    public LazyListState() {
        this(0, 0, 3, null);
    }

    public LazyListState(int v, int v1) {
        this.a = new LazyListScrollPosition(v, v1);
        this.b = new LazyListAnimateScrollScope(this);
        this.c = SnapshotStateKt__SnapshotStateKt.g(EmptyLazyListLayoutInfo.a, null, 2, null);
        this.d = InteractionSourceKt.a();
        this.f = SnapshotStateKt__SnapshotStateKt.g(DensityKt.a(1.0f, 1.0f), null, 2, null);
        this.g = ScrollableStateKt.a(new Function1() {
            final LazyListState e;

            {
                this.e = lazyListState0;
                super(1);
            }

            @l
            public final Float b(float f) {
                return (float)(-this.e.C(-f));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.b(((Number)object0).floatValue());
            }
        });
        this.i = true;
        this.j = -1;
        this.m = SnapshotStateKt__SnapshotStateKt.g(null, null, 2, null);
        this.n = new RemeasurementModifier() {
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
                this.a.L(remeasurement0);
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
        this.o = new AwaitFirstLayoutModifier();
        this.p = SnapshotStateKt__SnapshotStateKt.g(null, null, 2, null);
        this.q = SnapshotStateKt__SnapshotStateKt.g(Constraints.b(ConstraintsKt.b(0, 0, 0, 0, 15, null)), null, 2, null);
        this.r = new LazyLayoutPinnedItemList();
        this.s = SnapshotStateKt__SnapshotStateKt.g(Boolean.FALSE, null, 2, null);
        this.t = SnapshotStateKt__SnapshotStateKt.g(Boolean.FALSE, null, 2, null);
        this.u = new LazyLayoutPrefetchState();
    }

    public LazyListState(int v, int v1, int v2, w w0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        this(v, v1);
    }

    public final float A() {
        return this.e;
    }

    private final void B(float f) {
        if(!this.i) {
            return;
        }
        LazyListLayoutInfo lazyListLayoutInfo0 = this.r();
        if(!lazyListLayoutInfo0.f().isEmpty()) {
            int v = f < 0.0f ? ((LazyListItemInfo)u.p3(lazyListLayoutInfo0.f())).getIndex() + 1 : ((LazyListItemInfo)u.B2(lazyListLayoutInfo0.f())).getIndex() - 1;
            if(v != this.j && v >= 0 && v < lazyListLayoutInfo0.c()) {
                if(this.l != f < 0.0f) {
                    PrefetchHandle lazyLayoutPrefetchState$PrefetchHandle0 = this.k;
                    if(lazyLayoutPrefetchState$PrefetchHandle0 != null) {
                        lazyLayoutPrefetchState$PrefetchHandle0.cancel();
                    }
                }
                this.l = f < 0.0f;
                this.j = v;
                long v1 = this.x();
                this.k = this.u.b(v, v1);
            }
        }
    }

    public final float C(float f) {
        if(f < 0.0f && !this.a() || f > 0.0f && !this.e()) {
            return 0.0f;
        }
        if(Math.abs(this.e) > 0.5f) {
            throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.e).toString());
        }
        float f1 = this.e + f;
        this.e = f1;
        if(Math.abs(f1) > 0.5f) {
            float f2 = this.e;
            Remeasurement remeasurement0 = this.y();
            if(remeasurement0 != null) {
                remeasurement0.d();
            }
            if(this.i) {
                this.B(f2 - this.e);
            }
        }
        if(Math.abs(this.e) <= 0.5f) {
            return f;
        }
        float f3 = f - this.e;
        this.e = 0.0f;
        return f3;
    }

    @m
    public final Object D(int v, int v1, @l d d0) {
        Object object0 = c.e(this, null, new o(v, v1, null) {
            int k;
            final LazyListState l;
            final int m;
            final int n;

            {
                this.l = lazyListState0;
                this.m = v;
                this.n = v1;
                super(2, d0);
            }

            @m
            public final Object a(@l ScrollScope scrollScope0, @m d d0) {
                return ((androidx.compose.foundation.lazy.LazyListState.scrollToItem.2)this.create(scrollScope0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new androidx.compose.foundation.lazy.LazyListState.scrollToItem.2(this.l, this.m, this.n, d0);
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
                this.l.M(this.m, this.n);
                return S0.a;
            }
        }, d0, 1, null);
        return object0 == kotlin.coroutines.intrinsics.b.l() ? object0 : S0.a;
    }

    public static Object E(LazyListState lazyListState0, int v, int v1, d d0, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        return lazyListState0.D(v, v1, d0);
    }

    private void F(boolean z) {
        this.t.setValue(Boolean.valueOf(z));
    }

    private void G(boolean z) {
        this.s.setValue(Boolean.valueOf(z));
    }

    public final void H(@l Density density0) {
        L.p(density0, "<set-?>");
        this.f.setValue(density0);
    }

    public final void I(@m LazyListItemPlacementAnimator lazyListItemPlacementAnimator0) {
        this.p.setValue(lazyListItemPlacementAnimator0);
    }

    public final void J(boolean z) {
        this.i = z;
    }

    public final void K(long v) {
        Constraints constraints0 = Constraints.b(v);
        this.q.setValue(constraints0);
    }

    private final void L(Remeasurement remeasurement0) {
        this.m.setValue(remeasurement0);
    }

    public final void M(int v, int v1) {
        this.a.c(v, v1);
        LazyListItemPlacementAnimator lazyListItemPlacementAnimator0 = this.u();
        if(lazyListItemPlacementAnimator0 != null) {
            lazyListItemPlacementAnimator0.h();
        }
        Remeasurement remeasurement0 = this.y();
        if(remeasurement0 != null) {
            remeasurement0.d();
        }
    }

    public final void N(@l LazyListItemProvider lazyListItemProvider0) {
        L.p(lazyListItemProvider0, "itemProvider");
        this.a.h(lazyListItemProvider0);
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean a() {
        return ((Boolean)this.s.getValue()).booleanValue();
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public float b(float f) {
        return this.g.b(f);
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean c() {
        return this.g.c();
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    @m
    public Object d(@l MutatePriority mutatePriority0, @l o o0, @l d d0) {
        LazyListState lazyListState0;
        androidx.compose.foundation.lazy.LazyListState.scroll.1 lazyListState$scroll$10;
        if(d0 instanceof androidx.compose.foundation.lazy.LazyListState.scroll.1) {
            lazyListState$scroll$10 = (androidx.compose.foundation.lazy.LazyListState.scroll.1)d0;
            int v = lazyListState$scroll$10.p;
            if((v & 0x80000000) == 0) {
                lazyListState$scroll$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                lazyListState$scroll$10.p = v ^ 0x80000000;
            }
        }
        else {
            lazyListState$scroll$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
        Object object0 = lazyListState$scroll$10.n;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(lazyListState$scroll$10.p) {
            case 0: {
                f0.n(object0);
                lazyListState$scroll$10.k = this;
                lazyListState$scroll$10.l = mutatePriority0;
                lazyListState$scroll$10.m = o0;
                lazyListState$scroll$10.p = 1;
                if(this.o.a(lazyListState$scroll$10) == object1) {
                    return object1;
                }
                lazyListState0 = this;
                break;
            }
            case 1: {
                o0 = (o)lazyListState$scroll$10.m;
                mutatePriority0 = (MutatePriority)lazyListState$scroll$10.l;
                lazyListState0 = (LazyListState)lazyListState$scroll$10.k;
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
        lazyListState$scroll$10.k = null;
        lazyListState$scroll$10.l = null;
        lazyListState$scroll$10.m = null;
        lazyListState$scroll$10.p = 2;
        return lazyListState0.g.d(mutatePriority0, o0, lazyListState$scroll$10) == object1 ? object1 : S0.a;
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean e() {
        return ((Boolean)this.t.getValue()).booleanValue();
    }

    @m
    public final Object h(int v, int v1, @l d d0) {
        Object object0 = LazyAnimateScrollKt.d(this.b, v, v1, d0);
        return object0 == kotlin.coroutines.intrinsics.b.l() ? object0 : S0.a;
    }

    public static Object i(LazyListState lazyListState0, int v, int v1, d d0, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        return lazyListState0.h(v, v1, d0);
    }

    public final void j(@l LazyListMeasureResult lazyListMeasureResult0) {
        L.p(lazyListMeasureResult0, "result");
        this.a.g(lazyListMeasureResult0);
        this.e -= lazyListMeasureResult0.m();
        this.c.setValue(lazyListMeasureResult0);
        this.G(lazyListMeasureResult0.j());
        LazyMeasuredItem lazyMeasuredItem0 = lazyListMeasureResult0.n();
        this.F((lazyMeasuredItem0 == null ? 0 : lazyMeasuredItem0.b()) != 0 || lazyListMeasureResult0.o() != 0);
        ++this.h;
        this.k(lazyListMeasureResult0);
    }

    private final void k(LazyListLayoutInfo lazyListLayoutInfo0) {
        if(this.j != -1 && !lazyListLayoutInfo0.f().isEmpty()) {
            int v = this.l ? ((LazyListItemInfo)u.p3(lazyListLayoutInfo0.f())).getIndex() + 1 : ((LazyListItemInfo)u.B2(lazyListLayoutInfo0.f())).getIndex() - 1;
            if(this.j != v) {
                this.j = -1;
                PrefetchHandle lazyLayoutPrefetchState$PrefetchHandle0 = this.k;
                if(lazyLayoutPrefetchState$PrefetchHandle0 != null) {
                    lazyLayoutPrefetchState$PrefetchHandle0.cancel();
                }
                this.k = null;
            }
        }
    }

    @l
    public final AwaitFirstLayoutModifier l() {
        return this.o;
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
        return this.d;
    }

    @l
    public final MutableInteractionSource q() {
        return this.d;
    }

    @l
    public final LazyListLayoutInfo r() {
        return (LazyListLayoutInfo)this.c.getValue();
    }

    public final int s() {
        return this.h;
    }

    @l
    public final LazyLayoutPinnedItemList t() {
        return this.r;
    }

    @m
    public final LazyListItemPlacementAnimator u() {
        return (LazyListItemPlacementAnimator)this.p.getValue();
    }

    @l
    public final LazyLayoutPrefetchState v() {
        return this.u;
    }

    public final boolean w() {
        return this.i;
    }

    public final long x() {
        return ((Constraints)this.q.getValue()).x();
    }

    @m
    public final Remeasurement y() {
        return (Remeasurement)this.m.getValue();
    }

    @l
    public final RemeasurementModifier z() {
        return this.n;
    }
}

