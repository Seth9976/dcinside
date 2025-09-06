package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nLazyGridScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridScrollPosition.kt\nandroidx/compose/foundation/lazy/grid/LazyGridScrollPosition\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,113:1\n76#2:114\n102#2,2:115\n76#2:117\n102#2,2:118\n1#3:120\n480#4,4:121\n485#4:130\n480#4,4:131\n485#4:140\n122#5,5:125\n122#5,5:135\n*S KotlinDebug\n*F\n+ 1 LazyGridScrollPosition.kt\nandroidx/compose/foundation/lazy/grid/LazyGridScrollPosition\n*L\n35#1:114\n35#1:115,2\n38#1:117\n38#1:118,2\n59#1:121,4\n59#1:130\n95#1:131,4\n95#1:140\n59#1:125,5\n95#1:135,5\n*E\n"})
public final class LazyGridScrollPosition {
    @l
    private final MutableState a;
    @l
    private final MutableState b;
    private boolean c;
    @m
    private Object d;

    public LazyGridScrollPosition() {
        this(0, 0, 3, null);
    }

    public LazyGridScrollPosition(int v, int v1) {
        this.a = SnapshotStateKt__SnapshotStateKt.g(ItemIndex.a(v), null, 2, null);
        this.b = SnapshotStateKt__SnapshotStateKt.g(v1, null, 2, null);
    }

    public LazyGridScrollPosition(int v, int v1, int v2, w w0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        this(v, v1);
    }

    public final int a() {
        return ((ItemIndex)this.a.getValue()).n();
    }

    public final int b() {
        return ((Number)this.b.getValue()).intValue();
    }

    public final void c(int v, int v1) {
        this.f(v, v1);
        this.d = null;
    }

    private final void d(int v) {
        ItemIndex itemIndex0 = ItemIndex.a(v);
        this.a.setValue(itemIndex0);
    }

    private final void e(int v) {
        this.b.setValue(v);
    }

    private final void f(int v, int v1) {
        if(((float)v) < 0.0f) {
            throw new IllegalArgumentException(("Index should be non-negative (" + v + ')').toString());
        }
        if(!ItemIndex.f(v, this.a())) {
            this.d(v);
        }
        if(v1 != this.b()) {
            this.e(v1);
        }
    }

    public final void g(@l LazyGridMeasureResult lazyGridMeasureResult0) {
        int v3;
        Object object0;
        L.p(lazyGridMeasureResult0, "measureResult");
        LazyGridMeasuredLine lazyGridMeasuredLine0 = lazyGridMeasureResult0.n();
        if(lazyGridMeasuredLine0 == null) {
            object0 = null;
        }
        else {
            LazyGridMeasuredItem[] arr_lazyGridMeasuredItem = lazyGridMeasuredLine0.b();
            if(arr_lazyGridMeasuredItem == null) {
                object0 = null;
            }
            else {
                LazyGridMeasuredItem lazyGridMeasuredItem0 = (LazyGridMeasuredItem)kotlin.collections.l.nc(arr_lazyGridMeasuredItem);
                object0 = lazyGridMeasuredItem0 == null ? null : lazyGridMeasuredItem0.c();
            }
        }
        this.d = object0;
        if(this.c || lazyGridMeasureResult0.c() > 0) {
            this.c = true;
            int v = lazyGridMeasureResult0.o();
            if(((float)v) < 0.0f) {
                throw new IllegalStateException(("scrollOffset should be non-negative (" + v + ')').toString());
            }
            Snapshot snapshot0 = Snapshot.e.a();
            try {
                Snapshot snapshot1 = snapshot0.p();
                try {
                    LazyGridMeasuredLine lazyGridMeasuredLine1 = lazyGridMeasureResult0.n();
                    if(lazyGridMeasuredLine1 == null) {
                        v3 = 0;
                    }
                    else {
                        LazyGridMeasuredItem[] arr_lazyGridMeasuredItem1 = lazyGridMeasuredLine1.b();
                        if(arr_lazyGridMeasuredItem1 == null) {
                            v3 = 0;
                        }
                        else {
                            LazyGridMeasuredItem lazyGridMeasuredItem1 = (LazyGridMeasuredItem)kotlin.collections.l.nc(arr_lazyGridMeasuredItem1);
                            v3 = lazyGridMeasuredItem1 == null ? 0 : lazyGridMeasuredItem1.b();
                        }
                    }
                    this.f(v3, v);
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

    public final void h(@l LazyGridItemProvider lazyGridItemProvider0) {
        L.p(lazyGridItemProvider0, "itemProvider");
        Snapshot snapshot0 = Snapshot.e.a();
        try {
            Snapshot snapshot1 = snapshot0.p();
            try {
                this.f(ItemIndex.c(LazyLayoutItemProviderKt.c(lazyGridItemProvider0, this.d, this.a())), this.b());
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

