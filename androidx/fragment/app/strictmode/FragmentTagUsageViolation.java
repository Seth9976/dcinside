package androidx.fragment.app.strictmode;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class FragmentTagUsageViolation extends Violation {
    @m
    private final ViewGroup b;

    public FragmentTagUsageViolation(@l Fragment fragment0, @m ViewGroup viewGroup0) {
        L.p(fragment0, "fragment");
        super(fragment0, "Attempting to use <fragment> tag to add fragment " + fragment0 + " to container " + viewGroup0);
        this.b = viewGroup0;
    }

    @m
    public final ViewGroup b() {
        return this.b;
    }
}

