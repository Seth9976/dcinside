package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Stable;
import y4.l;

@Stable
public interface PointerIcon {
    public static final class Companion {
        static final Companion a;
        @l
        private static final PointerIcon b;
        @l
        private static final PointerIcon c;
        @l
        private static final PointerIcon d;
        @l
        private static final PointerIcon e;

        static {
            Companion.a = new Companion();
            Companion.b = PointerIcon_androidKt.d();
            Companion.c = PointerIcon_androidKt.c();
            Companion.d = PointerIcon_androidKt.f();
            Companion.e = PointerIcon_androidKt.e();
        }

        @l
        public final PointerIcon a() {
            return Companion.c;
        }

        @l
        public final PointerIcon b() {
            return Companion.b;
        }

        @l
        public final PointerIcon c() {
            return Companion.e;
        }

        @l
        public final PointerIcon d() {
            return Companion.d;
        }
    }

    @l
    public static final Companion a;

    static {
        PointerIcon.a = Companion.a;
    }
}

