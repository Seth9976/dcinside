package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public interface PressInteraction extends Interaction {
    @StabilityInferred(parameters = 0)
    public static final class Cancel implements PressInteraction {
        @l
        private final Press a;
        public static final int b;

        static {
        }

        public Cancel(@l Press pressInteraction$Press0) {
            L.p(pressInteraction$Press0, "press");
            super();
            this.a = pressInteraction$Press0;
        }

        @l
        public final Press a() {
            return this.a;
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class Press implements PressInteraction {
        private final long a;
        public static final int b;

        static {
        }

        private Press(long v) {
            this.a = v;
        }

        public Press(long v, w w0) {
            this(v);
        }

        public final long a() {
            return this.a;
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class Release implements PressInteraction {
        @l
        private final Press a;
        public static final int b;

        static {
        }

        public Release(@l Press pressInteraction$Press0) {
            L.p(pressInteraction$Press0, "press");
            super();
            this.a = pressInteraction$Press0;
        }

        @l
        public final Press a() {
            return this.a;
        }
    }

}

