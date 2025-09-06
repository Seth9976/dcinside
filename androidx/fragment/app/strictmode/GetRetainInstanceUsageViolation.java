package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.L;
import y4.l;

public final class GetRetainInstanceUsageViolation extends RetainInstanceUsageViolation {
    public GetRetainInstanceUsageViolation(@l Fragment fragment0) {
        L.p(fragment0, "fragment");
        super(fragment0, "Attempting to get retain instance for fragment " + fragment0);
    }
}

