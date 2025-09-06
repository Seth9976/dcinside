package androidx.compose.foundation.lazy.staggeredgrid;

import A3.a;
import A3.o;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.gestures.c;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.S0;
import kotlin.collections.T;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@ExperimentalFoundationApi
@StabilityInferred(parameters = 0)
@s0({"SMAP\nLazyStaggeredGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,477:1\n76#2:478\n76#2:479\n76#2:480\n102#2,2:481\n76#2:483\n102#2,2:484\n1855#3,2:486\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState\n*L\n101#1:478\n115#1:479\n152#1:480\n152#1:481,2\n154#1:483\n154#1:484,2\n408#1:486,2\n*E\n"})
public final class LazyStaggeredGridState implements ScrollableState {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final Saver a() {
            return LazyStaggeredGridState.z;
        }
    }

    @l
    private final State a;
    @l
    private final State b;
    @l
    private final LazyStaggeredGridScrollPosition c;
    @l
    private final MutableState d;
    @l
    private final LazyStaggeredGridLaneInfo e;
    @l
    private final MutableState f;
    @l
    private final MutableState g;
    @l
    private final LazyStaggeredGridAnimateScrollScope h;
    @m
    private Remeasurement i;
    @l
    private final RemeasurementModifier j;
    private boolean k;
    @l
    private final LazyLayoutPrefetchState l;
    @l
    private final ScrollableState m;
    private float n;
    private int o;
    private boolean p;
    @l
    private int[] q;
    @m
    private LazyStaggeredGridSpanProvider r;
    private int s;
    @l
    private final Map t;
    @l
    private Density u;
    @l
    private final MutableInteractionSource v;
    @l
    private final LazyLayoutPinnedItemList w;
    @l
    public static final Companion x;
    public static final int y;
    @l
    private static final Saver z;

    static {
        LazyStaggeredGridState.x = new Companion(null);
        LazyStaggeredGridState.y = 8;
        LazyStaggeredGridState.z = ListSaverKt.a(LazyStaggeredGridState.Companion.Saver.1.e, LazyStaggeredGridState.Companion.Saver.2.e);
    }

    public LazyStaggeredGridState(int v, int v1) {
        this(new int[]{v}, new int[]{v1});
    }

    public LazyStaggeredGridState(int v, int v1, int v2, w w0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        this(v, v1);
    }

    private LazyStaggeredGridState(int[] arr_v, int[] arr_v1) {
        this.a = SnapshotStateKt.d(SnapshotStateKt.w(), new a() {
            final LazyStaggeredGridState e;

            {
                this.e = lazyStaggeredGridState0;
                super(0);
            }

            @l
            public final Integer b() {
                Integer integer0;
                int[] arr_v = this.e.D().a();
                int v = 0;
                if(arr_v.length == 0) {
                    integer0 = null;
                }
                else {
                    int v1 = arr_v[0];
                    if(v1 == -1) {
                        v1 = 0;
                    }
                    Integer integer1 = v1;
                    T t0 = new kotlin.ranges.l(1, kotlin.collections.l.ue(arr_v)).j();
                    while(t0.hasNext()) {
                        int v2 = arr_v[t0.b()];
                        if(v2 == -1) {
                            v2 = 0;
                        }
                        Integer integer2 = v2;
                        if(integer1.compareTo(integer2) > 0) {
                            integer1 = integer2;
                        }
                    }
                    integer0 = integer1;
                }
                if(integer0 != null) {
                    v = (int)integer0;
                }
                return v;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        });
        this.b = SnapshotStateKt.d(SnapshotStateKt.w(), new a() {
            final LazyStaggeredGridState e;

            {
                this.e = lazyStaggeredGridState0;
                super(0);
            }

            @l
            public final Integer b() {
                int[] arr_v = this.e.D().b();
                int v = this.e.q();
                int[] arr_v1 = this.e.D().a();
                int v1 = 0;
                int v3 = 0x7FFFFFFF;
                for(int v2 = 0; v2 < arr_v.length; ++v2) {
                    if(arr_v1[v2] == v) {
                        v3 = Math.min(v3, arr_v[v2]);
                    }
                }
                if(v3 != 0x7FFFFFFF) {
                    v1 = v3;
                }
                return v1;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        });
        this.c = new LazyStaggeredGridScrollPosition(arr_v, arr_v1, new o() {
            {
                super(2, object0, LazyStaggeredGridState.class, "fillNearestIndices", "fillNearestIndices(II)[I", 0);
            }

            @l
            public final int[] a(int v, int v1) {
                return ((LazyStaggeredGridState)this.receiver).o(v, v1);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((Number)object0).intValue(), ((Number)object1).intValue());
            }
        });
        this.d = SnapshotStateKt__SnapshotStateKt.g(EmptyLazyStaggeredGridLayoutInfo.a, null, 2, null);
        this.e = new LazyStaggeredGridLaneInfo();
        this.f = SnapshotStateKt__SnapshotStateKt.g(Boolean.FALSE, null, 2, null);
        this.g = SnapshotStateKt__SnapshotStateKt.g(Boolean.FALSE, null, 2, null);
        this.h = new LazyStaggeredGridAnimateScrollScope(this);
        this.j = new RemeasurementModifier() {
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
                this.a.i = remeasurement0;
            }

            @Override  // androidx.compose.ui.Modifier
            public Modifier r0(Modifier modifier0) {
                return androidx.compose.ui.a.a(this, modifier0);
            }

            @Override  // androidx.compose.ui.Modifier$Element
            public boolean u(Function1 function10) {
                return b.a(this, function10);
            }
        };
        this.k = true;
        this.l = new LazyLayoutPrefetchState();
        this.m = ScrollableStateKt.a(new Function1() {
            final LazyStaggeredGridState e;

            {
                this.e = lazyStaggeredGridState0;
                super(1);
            }

            @l
            public final Float b(float f) {
                return (float)(-this.e.I(-f));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.b(((Number)object0).floatValue());
            }
        });
        this.q = new int[0];
        this.s = -1;
        this.t = new LinkedHashMap();
        this.u = DensityKt.a(1.0f, 1.0f);
        this.v = InteractionSourceKt.a();
        this.w = new LazyLayoutPinnedItemList();
    }

    public LazyStaggeredGridState(int[] arr_v, int[] arr_v1, w w0) {
        this(arr_v, arr_v1);
    }

    @l
    public final LazyLayoutPrefetchState A() {
        return this.l;
    }

    public final boolean B() {
        return this.k;
    }

    @l
    public final RemeasurementModifier C() {
        return this.j;
    }

    @l
    public final LazyStaggeredGridScrollPosition D() {
        return this.c;
    }

    public final float E() {
        return this.n;
    }

    @m
    public final LazyStaggeredGridSpanProvider F() {
        return this.r;
    }

    public final boolean G() {
        return this.p;
    }

    private final void H(float f) {
        LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo0 = (LazyStaggeredGridLayoutInfo)this.d.getValue();
        if(!lazyStaggeredGridLayoutInfo0.f().isEmpty()) {
            int v = f < 0.0f ? ((LazyStaggeredGridItemInfo)u.p3(lazyStaggeredGridLayoutInfo0.f())).getIndex() : ((LazyStaggeredGridItemInfo)u.B2(lazyStaggeredGridLayoutInfo0.f())).getIndex();
            if(v == this.s) {
                return;
            }
            this.s = v;
            LinkedHashSet linkedHashSet0 = new LinkedHashSet();
            for(int v1 = 0; v1 < this.q.length; ++v1) {
                v = f < 0.0f ? this.e.e(v, v1) : this.e.f(v, v1);
                if(v < 0 || v >= lazyStaggeredGridLayoutInfo0.c() || linkedHashSet0.contains(v)) {
                    break;
                }
                linkedHashSet0.add(v);
                if(!this.t.containsKey(v)) {
                    boolean z = this.r != null && this.r.b(v);
                    int v2 = z ? 0 : v1;
                    int v3 = this.q[(z ? this.t() : 1) + v2 - 1] - (v2 == 0 ? 0 : this.q[v2 - 1]);
                    long v4 = this.p ? Constraints.b.e(v3) : Constraints.b.d(v3);
                    PrefetchHandle lazyLayoutPrefetchState$PrefetchHandle0 = this.l.b(v, v4);
                    this.t.put(v, lazyLayoutPrefetchState$PrefetchHandle0);
                }
            }
            this.n(linkedHashSet0);
        }
    }

    private final float I(float f) {
        if(f < 0.0f && !this.a() || f > 0.0f && !this.e()) {
            return 0.0f;
        }
        if(Math.abs(this.n) > 0.5f) {
            throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.n).toString());
        }
        float f1 = this.n + f;
        this.n = f1;
        if(Math.abs(f1) > 0.5f) {
            float f2 = this.n;
            Remeasurement remeasurement0 = this.i;
            if(remeasurement0 != null) {
                remeasurement0.d();
            }
            if(this.k) {
                this.H(f2 - this.n);
            }
        }
        if(Math.abs(this.n) <= 0.5f) {
            return f;
        }
        float f3 = f - this.n;
        this.n = 0.0f;
        return f3;
    }

    @m
    public final Object J(int v, int v1, @l d d0) {
        Object object0 = c.e(this, null, new o(v, v1, null) {
            int k;
            private Object l;
            final LazyStaggeredGridState m;
            final int n;
            final int o;

            {
                this.m = lazyStaggeredGridState0;
                this.n = v;
                this.o = v1;
                super(2, d0);
            }

            @m
            public final Object a(@l ScrollScope scrollScope0, @m d d0) {
                return ((androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.scrollToItem.2)this.create(scrollScope0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.scrollToItem.2(this.m, this.n, this.o, d0);
                d1.l = object0;
                return d1;
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
                this.m.T(((ScrollScope)this.l), this.n, this.o);
                return S0.a;
            }
        }, d0, 1, null);
        return object0 == kotlin.coroutines.intrinsics.b.l() ? object0 : S0.a;
    }

    public static Object K(LazyStaggeredGridState lazyStaggeredGridState0, int v, int v1, d d0, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        return lazyStaggeredGridState0.J(v, v1, d0);
    }

    private void L(boolean z) {
        this.g.setValue(Boolean.valueOf(z));
    }

    private void M(boolean z) {
        this.f.setValue(Boolean.valueOf(z));
    }

    public final void N(@l Density density0) {
        L.p(density0, "<set-?>");
        this.u = density0;
    }

    public final void O(@l int[] arr_v) {
        L.p(arr_v, "<set-?>");
        this.q = arr_v;
    }

    public final void P(int v) {
        this.o = v;
    }

    public final void Q(boolean z) {
        this.k = z;
    }

    public final void R(@m LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider0) {
        this.r = lazyStaggeredGridSpanProvider0;
    }

    public final void S(boolean z) {
        this.p = z;
    }

    public final void T(@l ScrollScope scrollScope0, int v, int v1) {
        L.p(scrollScope0, "<this>");
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo0 = LazyStaggeredGridMeasureResultKt.a(this.w(), v);
        if(lazyStaggeredGridItemInfo0 != null) {
            boolean z = this.p;
            long v2 = lazyStaggeredGridItemInfo0.b();
            scrollScope0.a(((float)((z ? ((int)(v2 & 0xFFFFFFFFL)) : ((int)(v2 >> 0x20))) + v1)));
            return;
        }
        this.c.c(v, v1);
        Remeasurement remeasurement0 = this.i;
        if(remeasurement0 != null) {
            remeasurement0.d();
        }
    }

    public final void U(@l LazyLayoutItemProvider lazyLayoutItemProvider0) {
        L.p(lazyLayoutItemProvider0, "itemProvider");
        this.c.h(lazyLayoutItemProvider0);
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean a() {
        return ((Boolean)this.f.getValue()).booleanValue();
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public float b(float f) {
        return this.m.b(f);
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean c() {
        return this.m.c();
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    @m
    public Object d(@l MutatePriority mutatePriority0, @l o o0, @l d d0) {
        Object object0 = this.m.d(mutatePriority0, o0, d0);
        return object0 == kotlin.coroutines.intrinsics.b.l() ? object0 : S0.a;
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean e() {
        return ((Boolean)this.g.getValue()).booleanValue();
    }

    @m
    public final Object j(int v, int v1, @l d d0) {
        Object object0 = LazyAnimateScrollKt.d(this.h, v, v1, d0);
        return object0 == kotlin.coroutines.intrinsics.b.l() ? object0 : S0.a;
    }

    public static Object k(LazyStaggeredGridState lazyStaggeredGridState0, int v, int v1, d d0, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        return lazyStaggeredGridState0.j(v, v1, d0);
    }

    public final void l(@l LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult0) {
        L.p(lazyStaggeredGridMeasureResult0, "result");
        this.n -= lazyStaggeredGridMeasureResult0.m();
        this.L(lazyStaggeredGridMeasureResult0.i());
        this.M(lazyStaggeredGridMeasureResult0.j());
        this.d.setValue(lazyStaggeredGridMeasureResult0);
        this.m(lazyStaggeredGridMeasureResult0);
        this.c.g(lazyStaggeredGridMeasureResult0);
        ++this.o;
    }

    private final void m(LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo0) {
        List list0 = lazyStaggeredGridLayoutInfo0.f();
        if(this.s != -1 && !list0.isEmpty()) {
            int v = ((LazyStaggeredGridItemInfo)u.B2(list0)).getIndex();
            int v1 = ((LazyStaggeredGridItemInfo)u.p3(list0)).getIndex();
            if(v > this.s || this.s > v1) {
                this.s = -1;
                for(Object object0: this.t.values()) {
                    ((PrefetchHandle)object0).cancel();
                }
                this.t.clear();
            }
        }
    }

    private final void n(Set set0) {
        Iterator iterator0 = this.t.entrySet().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(!set0.contains(map$Entry0.getKey())) {
                ((PrefetchHandle)map$Entry0.getValue()).cancel();
                iterator0.remove();
            }
        }
    }

    private final int[] o(int v, int v1) {
        int[] arr_v = new int[v1];
        if(this.r != null && this.r.b(v)) {
            kotlin.collections.l.T1(arr_v, v, 0, 0, 6, null);
            return arr_v;
        }
        this.e.d(v + v1);
        int v2 = this.e.h(v);
        int v3 = v2 == -1 ? 0 : Math.min(v2, v1);
        int v4 = v3 - 1;
        int v5 = v;
        while(-1 < v4) {
            v5 = this.e.f(v5, v4);
            arr_v[v4] = v5;
            if(v5 == -1) {
                kotlin.collections.l.T1(arr_v, -1, 0, v4, 2, null);
                break;
            }
            --v4;
        }
        arr_v[v3] = v;
        for(int v6 = v3 + 1; v6 < v1; ++v6) {
            v = this.e.e(v, v6);
            arr_v[v6] = v;
        }
        return arr_v;
    }

    @l
    public final Density p() {
        return this.u;
    }

    public final int q() {
        return ((Number)this.a.getValue()).intValue();
    }

    public final int r() {
        return ((Number)this.b.getValue()).intValue();
    }

    @l
    public final InteractionSource s() {
        return this.v;
    }

    public final int t() {
        return this.q.length;
    }

    @l
    public final LazyStaggeredGridLaneInfo u() {
        return this.e;
    }

    @l
    public final int[] v() {
        return this.q;
    }

    @l
    public final LazyStaggeredGridLayoutInfo w() {
        return (LazyStaggeredGridLayoutInfo)this.d.getValue();
    }

    public final int x() {
        return this.o;
    }

    @l
    public final MutableInteractionSource y() {
        return this.v;
    }

    @l
    public final LazyLayoutPinnedItemList z() {
        return this.w;
    }
}

