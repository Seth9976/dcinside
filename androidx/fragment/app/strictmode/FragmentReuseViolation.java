package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.L;
import y4.l;

public final class FragmentReuseViolation extends Violation {
    @l
    private final String b;

    public FragmentReuseViolation(@l Fragment fragment0, @l String s) {
        L.p(fragment0, "fragment");
        L.p(s, "previousFragmentId");
        super(fragment0, "Attempting to reuse fragment " + fragment0 + " with previous ID " + s);
        this.b = s;
    }

    @l
    public final String b() {
        return this.b;
    }
}

