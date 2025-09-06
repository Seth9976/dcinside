package androidx.compose.ui.text.input;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.AnnotatedString;
import y4.l;

@Immutable
public interface VisualTransformation {
    public static final class Companion {
        static final Companion a;
        @l
        private static final VisualTransformation b;

        static {
            Companion.a = new Companion();
            Companion.b = VisualTransformation.Companion.None.1.b;
        }

        @l
        public final VisualTransformation a() {
            return Companion.b;
        }

        @Stable
        public static void b() {
        }
    }

    @l
    public static final Companion a;

    static {
        VisualTransformation.a = Companion.a;
    }

    @l
    TransformedText a(@l AnnotatedString arg1);
}

