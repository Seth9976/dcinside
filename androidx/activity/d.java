package androidx.activity;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry.SavedStateProvider;

public final class d implements SavedStateProvider {
    public final ComponentActivity a;

    public d(ComponentActivity componentActivity0) {
        this.a = componentActivity0;
    }

    @Override  // androidx.savedstate.SavedStateRegistry$SavedStateProvider
    public final Bundle a() {
        return ComponentActivity.p0(this.a);
    }
}

