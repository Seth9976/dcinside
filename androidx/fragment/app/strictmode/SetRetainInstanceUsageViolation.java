package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.L;
import y4.l;

public final class SetRetainInstanceUsageViolation extends RetainInstanceUsageViolation {
    public SetRetainInstanceUsageViolation(@l Fragment fragment0) {
        L.p(fragment0, "fragment");
        super(fragment0, "Attempting to set retain instance for fragment " + fragment0);
    }
}

