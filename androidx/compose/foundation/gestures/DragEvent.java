package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.w;
import y4.l;

abstract class DragEvent {
    @StabilityInferred(parameters = 0)
    public static final class DragCancelled extends DragEvent {
        @l
        public static final DragCancelled a;
        public static final int b;

        static {
            DragCancelled.a = new DragCancelled();
        }

        private DragCancelled() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class DragDelta extends DragEvent {
        private final long a;
        public static final int b;

        static {
        }

        private DragDelta(long v) {
            super(null);
            this.a = v;
        }

        public DragDelta(long v, w w0) {
            this(v);
        }

        public final long a() {
            return this.a;
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class DragStarted extends DragEvent {
        private final long a;
        public static final int b;

        static {
        }

        private DragStarted(long v) {
            super(null);
            this.a = v;
        }

        public DragStarted(long v, w w0) {
            this(v);
        }

        public final long a() {
            return this.a;
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class DragStopped extends DragEvent {
        private final long a;
        public static final int b;

        static {
        }

        private DragStopped(long v) {
            super(null);
            this.a = v;
        }

        public DragStopped(long v, w w0) {
            this(v);
        }

        public final long a() {
            return this.a;
        }
    }

    private DragEvent() {
    }

    public DragEvent(w w0) {
    }
}

