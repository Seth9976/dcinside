package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.PinnableContainer.PinnedHandle;
import androidx.compose.ui.layout.PinnableContainer;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nLazyLayoutPinnableItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItem\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n76#2:162\n102#2,2:163\n76#2:165\n102#2,2:166\n76#2:168\n102#2,2:169\n76#2:171\n102#2,2:172\n480#3,4:174\n485#3:183\n122#4,5:178\n1#5:184\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItem\n*L\n104#1:162\n104#1:163,2\n110#1:165\n110#1:166,2\n115#1:168\n115#1:169,2\n121#1:171\n121#1:172,2\n124#1:174,4\n124#1:183\n124#1:178,5\n*E\n"})
final class LazyLayoutPinnableItem implements PinnedItem, PinnedHandle, PinnableContainer {
    @m
    private final Object a;
    @l
    private final LazyLayoutPinnedItemList b;
    @l
    private final MutableState c;
    @l
    private final MutableState d;
    @l
    private final MutableState e;
    @l
    private final MutableState f;

    public LazyLayoutPinnableItem(@m Object object0, @l LazyLayoutPinnedItemList lazyLayoutPinnedItemList0) {
        L.p(lazyLayoutPinnedItemList0, "pinnedItemList");
        super();
        this.a = object0;
        this.b = lazyLayoutPinnedItemList0;
        this.c = SnapshotStateKt__SnapshotStateKt.g(-1, null, 2, null);
        this.d = SnapshotStateKt__SnapshotStateKt.g(0, null, 2, null);
        this.e = SnapshotStateKt__SnapshotStateKt.g(null, null, 2, null);
        this.f = SnapshotStateKt__SnapshotStateKt.g(null, null, 2, null);
    }

    @Override  // androidx.compose.ui.layout.PinnableContainer
    @l
    public PinnedHandle a() {
        if(this.d() == 0) {
            this.b.j(this);
            PinnableContainer pinnableContainer0 = this.c();
            this.h((pinnableContainer0 == null ? null : pinnableContainer0.a()));
        }
        this.j(this.d() + 1);
        return this;
    }

    private final PinnedHandle b() {
        return (PinnedHandle)this.e.getValue();
    }

    @m
    public final PinnableContainer c() {
        return this.e();
    }

    private final int d() {
        return ((Number)this.d.getValue()).intValue();
    }

    private final PinnableContainer e() {
        return (PinnableContainer)this.f.getValue();
    }

    public final void f() {
        int v = this.d();
        for(int v1 = 0; v1 < v; ++v1) {
            this.release();
        }
    }

    public void g(int v) {
        this.c.setValue(v);
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList$PinnedItem
    public int getIndex() {
        return ((Number)this.c.getValue()).intValue();
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList$PinnedItem
    @m
    public Object getKey() {
        return this.a;
    }

    private final void h(PinnedHandle pinnableContainer$PinnedHandle0) {
        this.e.setValue(pinnableContainer$PinnedHandle0);
    }

    public final void i(@m PinnableContainer pinnableContainer0) {
        Snapshot snapshot0 = Snapshot.e.a();
        try {
            Snapshot snapshot1 = snapshot0.p();
            try {
                if(pinnableContainer0 != this.e()) {
                    this.k(pinnableContainer0);
                    if(this.d() > 0) {
                        PinnedHandle pinnableContainer$PinnedHandle0 = this.b();
                        if(pinnableContainer$PinnedHandle0 != null) {
                            pinnableContainer$PinnedHandle0.release();
                        }
                        this.h((pinnableContainer0 == null ? null : pinnableContainer0.a()));
                    }
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

    private final void j(int v) {
        this.d.setValue(v);
    }

    private final void k(PinnableContainer pinnableContainer0) {
        this.f.setValue(pinnableContainer0);
    }

    @Override  // androidx.compose.ui.layout.PinnableContainer$PinnedHandle
    public void release() {
        if(this.d() <= 0) {
            throw new IllegalStateException("Release should only be called once");
        }
        this.j(this.d() - 1);
        if(this.d() == 0) {
            this.b.k(this);
            PinnedHandle pinnableContainer$PinnedHandle0 = this.b();
            if(pinnableContainer$PinnedHandle0 != null) {
                pinnableContainer$PinnedHandle0.release();
            }
            this.h(null);
        }
    }
}

