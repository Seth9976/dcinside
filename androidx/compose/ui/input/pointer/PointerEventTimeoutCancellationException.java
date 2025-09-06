package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.CancellationException;

@StabilityInferred(parameters = 0)
public final class PointerEventTimeoutCancellationException extends CancellationException {
    public static final int a;

    static {
    }

    public PointerEventTimeoutCancellationException(long v) {
        super("Timed out waiting for " + v + " ms");
    }
}

