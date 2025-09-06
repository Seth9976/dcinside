package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.w;
import y4.m;

@StabilityInferred(parameters = 0)
public final class GestureCancellationException extends CancellationException {
    public static final int a;

    static {
    }

    public GestureCancellationException() {
        this(null, 1, null);
    }

    public GestureCancellationException(@m String s) {
        super(s);
    }

    public GestureCancellationException(String s, int v, w w0) {
        if((v & 1) != 0) {
            s = null;
        }
        this(s);
    }
}

