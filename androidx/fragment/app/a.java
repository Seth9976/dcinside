package androidx.fragment.app;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry.SavedStateProvider;

public final class a implements SavedStateProvider {
    public final FragmentActivity a;

    public a(FragmentActivity fragmentActivity0) {
        this.a = fragmentActivity0;
    }

    @Override  // androidx.savedstate.SavedStateRegistry$SavedStateProvider
    public final Bundle a() {
        return this.a.C0();
    }
}

