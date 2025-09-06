package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.L;
import y4.l;

public final class GetTargetFragmentRequestCodeUsageViolation extends TargetFragmentUsageViolation {
    public GetTargetFragmentRequestCodeUsageViolation(@l Fragment fragment0) {
        L.p(fragment0, "fragment");
        super(fragment0, "Attempting to get target request code from fragment " + fragment0);
    }
}

