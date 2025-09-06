package androidx.core.app;

import androidx.core.util.Consumer;
import y4.l;

public interface OnMultiWindowModeChangedProvider {
    void addOnMultiWindowModeChangedListener(@l Consumer arg1);

    void removeOnMultiWindowModeChangedListener(@l Consumer arg1);
}

