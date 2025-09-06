package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.w;
import y4.l;

abstract class TransformEvent {
    @StabilityInferred(parameters = 0)
    public static final class TransformDelta extends TransformEvent {
        private final float a;
        private final long b;
        private final float c;
        public static final int d;

        static {
        }

        private TransformDelta(float f, long v, float f1) {
            super(null);
            this.a = f;
            this.b = v;
            this.c = f1;
        }

        public TransformDelta(float f, long v, float f1, w w0) {
            this(f, v, f1);
        }

        public final long a() {
            return this.b;
        }

        public final float b() {
            return this.c;
        }

        public final float c() {
            return this.a;
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class TransformStarted extends TransformEvent {
        @l
        public static final TransformStarted a;
        public static final int b;

        static {
            TransformStarted.a = new TransformStarted();
        }

        private TransformStarted() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class TransformStopped extends TransformEvent {
        @l
        public static final TransformStopped a;
        public static final int b;

        static {
            TransformStopped.a = new TransformStopped();
        }

        private TransformStopped() {
            super(null);
        }
    }

    private TransformEvent() {
    }

    public TransformEvent(w w0) {
    }
}

