package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import y4.l;

public interface FocusInteraction extends Interaction {
    @StabilityInferred(parameters = 0)
    public static final class Focus implements FocusInteraction {
        public static final int a;

        static {
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class Unfocus implements FocusInteraction {
        @l
        private final Focus a;
        public static final int b;

        static {
        }

        public Unfocus(@l Focus focusInteraction$Focus0) {
            L.p(focusInteraction$Focus0, "focus");
            super();
            this.a = focusInteraction$Focus0;
        }

        @l
        public final Focus a() {
            return this.a;
        }
    }

}

