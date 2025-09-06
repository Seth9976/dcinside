package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import y4.l;

public interface HoverInteraction extends Interaction {
    @StabilityInferred(parameters = 0)
    public static final class Enter implements HoverInteraction {
        public static final int a;

        static {
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class Exit implements HoverInteraction {
        @l
        private final Enter a;
        public static final int b;

        static {
        }

        public Exit(@l Enter hoverInteraction$Enter0) {
            L.p(hoverInteraction$Enter0, "enter");
            super();
            this.a = hoverInteraction$Enter0;
        }

        @l
        public final Enter a() {
            return this.a;
        }
    }

}

