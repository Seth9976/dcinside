package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public abstract class TargetFragmentUsageViolation extends Violation {
    public TargetFragmentUsageViolation(@l Fragment fragment0, @m String s) {
        L.p(fragment0, "fragment");
        super(fragment0, s);
    }

    public TargetFragmentUsageViolation(Fragment fragment0, String s, int v, w w0) {
        if((v & 2) != 0) {
            s = null;
        }
        this(fragment0, s);
    }
}

