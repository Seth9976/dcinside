package androidx.fragment.app.strictmode;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.L;
import y4.l;

public final class WrongFragmentContainerViolation extends Violation {
    @l
    private final ViewGroup b;

    public WrongFragmentContainerViolation(@l Fragment fragment0, @l ViewGroup viewGroup0) {
        L.p(fragment0, "fragment");
        L.p(viewGroup0, "container");
        super(fragment0, "Attempting to add fragment " + fragment0 + " to container " + viewGroup0 + " which is not a FragmentContainerView");
        this.b = viewGroup0;
    }

    @l
    public final ViewGroup b() {
        return this.b;
    }
}

