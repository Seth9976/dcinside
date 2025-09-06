package androidx.fragment.app;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry.SavedStateProvider;

public final class j implements SavedStateProvider {
    public final FragmentManager a;

    public j(FragmentManager fragmentManager0) {
        this.a = fragmentManager0;
    }

    @Override  // androidx.savedstate.SavedStateRegistry$SavedStateProvider
    public final Bundle a() {
        return this.a.e1();
    }
}

