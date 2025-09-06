package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

@StabilityInferred(parameters = 0)
public abstract class SnapshotApplyResult {
    @StabilityInferred(parameters = 0)
    public static final class Failure extends SnapshotApplyResult {
        @l
        private final Snapshot b;
        public static final int c = 8;

        static {
        }

        public Failure(@l Snapshot snapshot0) {
            L.p(snapshot0, "snapshot");
            super(null);
            this.b = snapshot0;
        }

        @Override  // androidx.compose.runtime.snapshots.SnapshotApplyResult
        public void a() {
            this.b.d();
            throw new SnapshotApplyConflictException(this.b);
        }

        @Override  // androidx.compose.runtime.snapshots.SnapshotApplyResult
        public boolean b() {
            return false;
        }

        @l
        public final Snapshot c() {
            return this.b;
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class Success extends SnapshotApplyResult {
        @l
        public static final Success b;
        public static final int c;

        static {
            Success.b = new Success();
        }

        private Success() {
            super(null);
        }

        @Override  // androidx.compose.runtime.snapshots.SnapshotApplyResult
        public void a() {
        }

        @Override  // androidx.compose.runtime.snapshots.SnapshotApplyResult
        public boolean b() {
            return true;
        }
    }

    public static final int a;

    static {
    }

    private SnapshotApplyResult() {
    }

    public SnapshotApplyResult(w w0) {
    }

    public abstract void a();

    public abstract boolean b();
}

