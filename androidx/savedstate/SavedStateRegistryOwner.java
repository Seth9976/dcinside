package androidx.savedstate;

import androidx.lifecycle.LifecycleOwner;
import y4.l;

public interface SavedStateRegistryOwner extends LifecycleOwner {
    @l
    SavedStateRegistry getSavedStateRegistry();
}

