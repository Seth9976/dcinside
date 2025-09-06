package androidx.core.app;

import androidx.core.util.Consumer;
import y4.l;

public interface OnNewIntentProvider {
    void addOnNewIntentListener(@l Consumer arg1);

    void removeOnNewIntentListener(@l Consumer arg1);
}

