package androidx.compose.ui.layout;

import A3.a;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot.Companion;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nLookaheadScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadScope.kt\nandroidx/compose/ui/layout/LookaheadScope\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,52:1\n122#2,5:53\n*S KotlinDebug\n*F\n+ 1 LookaheadScope.kt\nandroidx/compose/ui/layout/LookaheadScope\n*L\n44#1:53,5\n*E\n"})
public final class LookaheadScope {
    @l
    private final LayoutNode a;
    @m
    private MutableSnapshot b;

    public LookaheadScope(@l LayoutNode layoutNode0) {
        L.p(layoutNode0, "root");
        super();
        this.a = layoutNode0;
    }

    @l
    public final LayoutNode a() {
        return this.a;
    }

    public final Object b(@l a a0) {
        Object object0;
        L.p(a0, "block");
        if(this.b == null) {
            MutableSnapshot mutableSnapshot0 = Companion.n(Snapshot.e, null, null, 3, null);
            this.b = mutableSnapshot0;
            try {
                Snapshot snapshot0 = mutableSnapshot0.p();
                try {
                    object0 = a0.invoke();
                }
                catch(Throwable throwable0) {
                    mutableSnapshot0.w(snapshot0);
                    throw throwable0;
                }
                mutableSnapshot0.w(snapshot0);
                return object0;
            }
            finally {
                mutableSnapshot0.d();
                this.b = null;
            }
        }
        throw new IllegalStateException("Disposable snapshot is already active");
    }
}

