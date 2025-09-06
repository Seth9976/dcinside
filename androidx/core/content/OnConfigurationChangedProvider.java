package androidx.core.content;

import androidx.core.util.Consumer;
import y4.l;

public interface OnConfigurationChangedProvider {
    void addOnConfigurationChangedListener(@l Consumer arg1);

    void removeOnConfigurationChangedListener(@l Consumer arg1);
}

