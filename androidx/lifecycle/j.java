package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry.SavedStateProvider;

public final class j implements SavedStateProvider {
    public final SavedStateHandle a;

    public j(SavedStateHandle savedStateHandle0) {
        this.a = savedStateHandle0;
    }

    @Override  // androidx.savedstate.SavedStateRegistry$SavedStateProvider
    public final Bundle a() {
        return SavedStateHandle.p(this.a);
    }
}

