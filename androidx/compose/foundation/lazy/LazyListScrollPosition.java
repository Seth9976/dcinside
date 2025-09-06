package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nLazyListScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListScrollPosition.kt\nandroidx/compose/foundation/lazy/LazyListScrollPosition\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,110:1\n76#2:111\n102#2,2:112\n76#2:114\n102#2,2:115\n1#3:117\n480#4,4:118\n485#4:127\n480#4,4:128\n485#4:137\n122#5,5:122\n122#5,5:132\n*S KotlinDebug\n*F\n+ 1 LazyListScrollPosition.kt\nandroidx/compose/foundation/lazy/LazyListScrollPosition\n*L\n34#1:111\n34#1:112,2\n36#1:114\n36#1:115,2\n57#1:118,4\n57#1:127\n92#1:128,4\n92#1:137\n57#1:122,5\n92#1:132,5\n*E\n"})
public final class LazyListScrollPosition {
    @l
    private final MutableState a;
    @l
    private final MutableState b;
    private boolean c;
    @m
    private Object d;

    public LazyListScrollPosition() {
        this(0, 0, 3, null);
    }

    public LazyListScrollPosition(int v, int v1) {
        this.a = SnapshotStateKt__SnapshotStateKt.g(DataIndex.a(v), null, 2, null);
        this.b = SnapshotStateKt__SnapshotStateKt.g(v1, null, 2, null);
    }

    public LazyListScrollPosition(int v, int v1, int v2, w w0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        this(v, v1);
    }

    public final int a() {
        return ((DataIndex)this.a.getValue()).n();
    }

    public final int b() {
        return ((Number)this.b.getValue()).intValue();
    }

    public final void c(int v, int v1) {
        this.f(v, v1);
        this.d = null;
    }

    public final void d(int v) {
        DataIndex dataIndex0 = DataIndex.a(v);
        this.a.setValue(dataIndex0);
    }

    private final void e(int v) {
        this.b.setValue(v);
    }

    private final void f(int v, int v1) {
        if(((float)v) < 0.0f) {
            throw new IllegalArgumentException(("Index should be non-negative (" + v + ')').toString());
        }
        if(!DataIndex.f(v, this.a())) {
            this.d(v);
        }
        if(v1 != this.b()) {
            this.e(v1);
        }
    }

    public final void g(@l LazyListMeasureResult lazyListMeasureResult0) {
        L.p(lazyListMeasureResult0, "measureResult");
        LazyMeasuredItem lazyMeasuredItem0 = lazyListMeasureResult0.n();
        this.d = lazyMeasuredItem0 == null ? null : lazyMeasuredItem0.c();
        if(this.c || lazyListMeasureResult0.c() > 0) {
            this.c = true;
            int v = lazyListMeasureResult0.o();
            if(((float)v) < 0.0f) {
                throw new IllegalStateException(("scrollOffset should be non-negative (" + v + ')').toString());
            }
            Snapshot snapshot0 = Snapshot.e.a();
            try {
                Snapshot snapshot1 = snapshot0.p();
                try {
                    LazyMeasuredItem lazyMeasuredItem1 = lazyListMeasureResult0.n();
                    this.f((lazyMeasuredItem1 == null ? 0 : lazyMeasuredItem1.b()), v);
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

    @ExperimentalFoundationApi
    public final void h(@l LazyListItemProvider lazyListItemProvider0) {
        L.p(lazyListItemProvider0, "itemProvider");
        Snapshot snapshot0 = Snapshot.e.a();
        try {
            Snapshot snapshot1 = snapshot0.p();
            try {
                this.f(DataIndex.c(LazyLayoutItemProviderKt.c(lazyListItemProvider0, this.d, this.a())), this.b());
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

