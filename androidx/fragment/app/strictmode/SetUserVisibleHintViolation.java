package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.L;
import y4.l;

public final class SetUserVisibleHintViolation extends Violation {
    private final boolean b;

    public SetUserVisibleHintViolation(@l Fragment fragment0, boolean z) {
        L.p(fragment0, "fragment");
        super(fragment0, "Attempting to set user visible hint to " + z + " for fragment " + fragment0);
        this.b = z;
    }

    public final boolean b() {
        return this.b;
    }
}

