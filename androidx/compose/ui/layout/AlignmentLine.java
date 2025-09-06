package androidx.compose.ui.layout;

import A3.o;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.w;
import y4.l;

@Immutable
public abstract class AlignmentLine {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    private final o a;
    @l
    public static final Companion b = null;
    public static final int c = 0;
    public static final int d = 0x80000000;

    static {
        AlignmentLine.b = new Companion(null);
    }

    private AlignmentLine(o o0) {
        this.a = o0;
    }

    public AlignmentLine(o o0, w w0) {
        this(o0);
    }

    @l
    public final o a() {
        return this.a;
    }
}

