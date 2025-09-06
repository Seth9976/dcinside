package androidx.compose.ui.text.input;

import y4.l;

public interface OffsetMapping {
    public static final class Companion {
        static final Companion a;
        @l
        private static final OffsetMapping b;

        static {
            Companion.a = new Companion();
            Companion.b = new OffsetMapping.Companion.Identity.1();
        }

        @l
        public final OffsetMapping a() {
            return Companion.b;
        }
    }

    @l
    public static final Companion a;

    static {
        OffsetMapping.a = Companion.a;
    }

    int a(int arg1);

    int b(int arg1);
}

