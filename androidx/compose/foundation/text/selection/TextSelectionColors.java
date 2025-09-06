package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Immutable
public final class TextSelectionColors {
    private final long a;
    private final long b;
    public static final int c;

    static {
    }

    private TextSelectionColors(long v, long v1) {
        this.a = v;
        this.b = v1;
    }

    public TextSelectionColors(long v, long v1, w w0) {
        this(v, v1);
    }

    public final long a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TextSelectionColors)) {
            return false;
        }
        return Color.y(this.a, ((TextSelectionColors)object0).a) ? Color.y(this.b, ((TextSelectionColors)object0).b) : false;
    }

    @Override
    public int hashCode() {
        return Color.K(this.a) * 0x1F + Color.K(this.b);
    }

    @Override
    @l
    public String toString() {
        return "SelectionColors(selectionHandleColor=" + Color.L(this.a) + ", selectionBackgroundColor=" + Color.L(this.b) + ')';
    }
}

