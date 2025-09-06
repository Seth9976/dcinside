package androidx.compose.foundation.lazy.staggeredgrid;

import A3.o;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.T;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@ExperimentalFoundationApi
@s0({"SMAP\nLazyStaggeredGridScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridScrollPosition.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 7 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,117:1\n76#2:118\n102#2,2:119\n76#2:121\n102#2,2:122\n16594#3,14:124\n1#4:138\n116#5,2:139\n33#5,6:141\n118#5:147\n480#6,4:148\n485#6:157\n480#6,4:158\n485#6:167\n122#7,5:152\n122#7,5:162\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridScrollPosition.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition\n*L\n34#1:118\n34#1:119,2\n35#1:121\n35#1:122,2\n47#1:124,14\n51#1:139,2\n51#1:141,6\n51#1:147\n58#1:148,4\n58#1:157\n95#1:158,4\n95#1:167\n58#1:152,5\n95#1:162,5\n*E\n"})
public final class LazyStaggeredGridScrollPosition {
    @l
    private final o a;
    @l
    private final MutableState b;
    @l
    private final MutableState c;
    private boolean d;
    @m
    private Object e;

    public LazyStaggeredGridScrollPosition(@l int[] arr_v, @l int[] arr_v1, @l o o0) {
        L.p(arr_v, "initialIndices");
        L.p(arr_v1, "initialOffsets");
        L.p(o0, "fillIndices");
        super();
        this.a = o0;
        this.b = SnapshotStateKt__SnapshotStateKt.g(arr_v, null, 2, null);
        this.c = SnapshotStateKt__SnapshotStateKt.g(arr_v1, null, 2, null);
    }

    @l
    public final int[] a() {
        return (int[])this.b.getValue();
    }

    @l
    public final int[] b() {
        return (int[])this.c.getValue();
    }

    public final void c(int v, int v1) {
        Integer integer0 = (int)this.a().length;
        int[] arr_v = (int[])this.a.invoke(v, integer0);
        int[] arr_v1 = new int[arr_v.length];
        for(int v2 = 0; v2 < arr_v.length; ++v2) {
            arr_v1[v2] = v1;
        }
        this.f(arr_v, arr_v1);
        this.e = null;
    }

    public final void d(@l int[] arr_v) {
        L.p(arr_v, "<set-?>");
        this.b.setValue(arr_v);
    }

    public final void e(@l int[] arr_v) {
        L.p(arr_v, "<set-?>");
        this.c.setValue(arr_v);
    }

    private final void f(int[] arr_v, int[] arr_v1) {
        if(!Arrays.equals(arr_v, this.a())) {
            this.d(arr_v);
        }
        if(!Arrays.equals(arr_v1, this.b())) {
            this.e(arr_v1);
        }
    }

    public final void g(@l LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult0) {
        Object object1;
        Object object0;
        L.p(lazyStaggeredGridMeasureResult0, "measureResult");
        int[] arr_v = lazyStaggeredGridMeasureResult0.n();
        if(arr_v.length == 0) {
            throw new NoSuchElementException();
        }
        int v1 = arr_v[0];
        int v2 = kotlin.collections.l.ue(arr_v);
        if(v2 != 0) {
            int v3 = v1 == -1 ? 0x7FFFFFFF : v1;
            T t0 = new kotlin.ranges.l(1, v2).j();
            while(t0.hasNext()) {
                int v4 = arr_v[t0.b()];
                int v5 = v4 == -1 ? 0x7FFFFFFF : v4;
                if(v3 > v5) {
                    v1 = v4;
                    v3 = v5;
                }
            }
        }
        if(v1 == 0x7FFFFFFF) {
            v1 = 0;
        }
        List list0 = lazyStaggeredGridMeasureResult0.f();
        int v6 = list0.size();
        for(int v = 0; true; ++v) {
            object0 = null;
            object1 = null;
            if(v >= v6) {
                break;
            }
            Object object2 = list0.get(v);
            if(((LazyStaggeredGridItemInfo)object2).getIndex() == v1) {
                object0 = object2;
                break;
            }
        }
        if(((LazyStaggeredGridItemInfo)object0) != null) {
            object1 = ((LazyStaggeredGridItemInfo)object0).getKey();
        }
        this.e = object1;
        if(this.d || lazyStaggeredGridMeasureResult0.c() > 0) {
            this.d = true;
            Snapshot snapshot0 = Snapshot.e.a();
            try {
                Snapshot snapshot1 = snapshot0.p();
                try {
                    this.f(lazyStaggeredGridMeasureResult0.n(), lazyStaggeredGridMeasureResult0.o());
                }
                catch(Throwable throwable0) {
                    snapshot0.w(snapshot1);
                    throw throwable0;
                }
                snapshot0.w(snapshot1);
            }
            finally {
                snapshot0.d();
            }
        }
    }

    @ExperimentalFoundationApi
    public final void h(@l LazyLayoutItemProvider lazyLayoutItemProvider0) {
        L.p(lazyLayoutItemProvider0, "itemProvider");
        Snapshot snapshot0 = Snapshot.e.a();
        try {
            Snapshot snapshot1 = snapshot0.p();
            try {
                Object object0 = this.e;
                int v2 = 0;
                Integer integer0 = kotlin.collections.l.Ne(this.a(), 0);
                if(integer0 != null) {
                    v2 = (int)integer0;
                }
                int v3 = LazyLayoutItemProviderKt.c(lazyLayoutItemProvider0, object0, v2);
                if(!kotlin.collections.l.q8(this.a(), v3)) {
                    Integer integer1 = (int)this.a().length;
                    this.f(((int[])this.a.invoke(v3, integer1)), this.b());
                }
            }
            finally {
                snapshot0.w(snapshot1);
            }
        }
        finally {
            snapshot0.d();
        }
    }
}

