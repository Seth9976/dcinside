package androidx.compose.runtime.snapshots;

import y4.l;

public final class SnapshotStateListKt {
    @l
    private static final Object a;

    static {
        SnapshotStateListKt.a = new Object();
    }

    private static final Void d() {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    private static final void e(int v, int v1) {
        if(v < 0 || v >= v1) {
            throw new IndexOutOfBoundsException("index (" + v + ") is out of bound of [0, " + v1 + ')');
        }
    }
}

