package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.TextUnit;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Immutable
public final class TextIndent {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final TextIndent a() {
            return TextIndent.e;
        }

        @Stable
        public static void b() {
        }
    }

    private final long a;
    private final long b;
    @l
    public static final Companion c;
    public static final int d;
    @l
    private static final TextIndent e;

    static {
        TextIndent.c = new Companion(null);
        TextIndent.e = new TextIndent(0L, 0L, 3, null);
    }

    private TextIndent(long v, long v1) {
        this.a = v;
        this.b = v1;
    }

    public TextIndent(long v, long v1, int v2, w w0) {
        if((v2 & 1) != 0) {
            v = 0x100000000L;
        }
        if((v2 & 2) != 0) {
            v1 = 0x100000000L;
        }
        this(v, v1, null);
    }

    public TextIndent(long v, long v1, w w0) {
        this(v, v1);
    }

    @l
    public final TextIndent b(long v, long v1) {
        return new TextIndent(v, v1, null);
    }

    public static TextIndent c(TextIndent textIndent0, long v, long v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = textIndent0.a;
        }
        if((v2 & 2) != 0) {
            v1 = textIndent0.b;
        }
        return textIndent0.b(v, v1);
    }

    public final long d() {
        return this.a;
    }

    public final long e() {
        return this.b;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TextIndent)) {
            return false;
        }
        return TextUnit.j(this.a, ((TextIndent)object0).a) ? TextUnit.j(this.b, ((TextIndent)object0).b) : false;
    }

    @Override
    public int hashCode() {
        return TextUnit.o(this.a) * 0x1F + TextUnit.o(this.b);
    }

    @Override
    @l
    public String toString() {
        return "TextIndent(firstLine=" + TextUnit.u(this.a) + ", restLine=" + TextUnit.u(this.b) + ')';
    }
}

