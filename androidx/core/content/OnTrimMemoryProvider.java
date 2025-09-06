package androidx.core.content;

import androidx.core.util.Consumer;
import y4.l;

public interface OnTrimMemoryProvider {
    void addOnTrimMemoryListener(@l Consumer arg1);

    void removeOnTrimMemoryListener(@l Consumer arg1);
}

