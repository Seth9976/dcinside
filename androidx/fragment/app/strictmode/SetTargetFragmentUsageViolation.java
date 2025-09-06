package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.L;
import y4.l;

public final class SetTargetFragmentUsageViolation extends TargetFragmentUsageViolation {
    @l
    private final Fragment b;
    private final int c;

    public SetTargetFragmentUsageViolation(@l Fragment fragment0, @l Fragment fragment1, int v) {
        L.p(fragment0, "fragment");
        L.p(fragment1, "targetFragment");
        super(fragment0, "Attempting to set target fragment " + fragment1 + " with request code " + v + " for fragment " + fragment0);
        this.b = fragment1;
        this.c = v;
    }

    public final int b() {
        return this.c;
    }

    @l
    public final Fragment c() {
        return this.b;
    }
}

