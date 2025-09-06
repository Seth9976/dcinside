package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import y4.l;

@Stable
public interface PinnableContainer {
    public interface PinnedHandle {
        void release();
    }

    @l
    PinnedHandle a();
}

