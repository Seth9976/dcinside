package androidx.activity;

import androidx.lifecycle.LifecycleOwner;
import y4.l;

public interface OnBackPressedDispatcherOwner extends LifecycleOwner {
    @l
    OnBackPressedDispatcher getOnBackPressedDispatcher();
}

