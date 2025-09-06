package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.internal.w;
import y4.l;

@Immutable
@ExperimentalComposeUiApi
public final class HistoricalChange {
    private final long a;
    private final long b;
    public static final int c;

    static {
    }

    private HistoricalChange(long v, long v1) {
        this.a = v;
        this.b = v1;
    }

    public HistoricalChange(long v, long v1, w w0) {
        this(v, v1);
    }

    public final long a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.a + ", position=" + Offset.y(this.b) + ')';
    }
}

