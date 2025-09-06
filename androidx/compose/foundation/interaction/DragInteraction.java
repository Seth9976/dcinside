package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import y4.l;

public interface DragInteraction extends Interaction {
    @StabilityInferred(parameters = 0)
    public static final class Cancel implements DragInteraction {
        @l
        private final Start a;
        public static final int b;

        static {
        }

        public Cancel(@l Start dragInteraction$Start0) {
            L.p(dragInteraction$Start0, "start");
            super();
            this.a = dragInteraction$Start0;
        }

        @l
        public final Start a() {
            return this.a;
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class Start implements DragInteraction {
        public static final int a;

        static {
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class Stop implements DragInteraction {
        @l
        private final Start a;
        public static final int b;

        static {
        }

        public Stop(@l Start dragInteraction$Start0) {
            L.p(dragInteraction$Start0, "start");
            super();
            this.a = dragInteraction$Start0;
        }

        @l
        public final Start a() {
            return this.a;
        }
    }

}

