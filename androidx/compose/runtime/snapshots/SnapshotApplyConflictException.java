package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import y4.l;

@StabilityInferred(parameters = 0)
public final class SnapshotApplyConflictException extends Exception {
    @l
    private final Snapshot a;
    public static final int b = 8;

    static {
    }

    public SnapshotApplyConflictException(@l Snapshot snapshot0) {
        L.p(snapshot0, "snapshot");
        this.a = snapshot0;
    }

    @l
    public final Snapshot a() {
        return this.a;
    }
}

