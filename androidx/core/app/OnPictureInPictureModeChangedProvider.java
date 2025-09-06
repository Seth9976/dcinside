package androidx.core.app;

import androidx.core.util.Consumer;
import y4.l;

public interface OnPictureInPictureModeChangedProvider {
    void addOnPictureInPictureModeChangedListener(@l Consumer arg1);

    void removeOnPictureInPictureModeChangedListener(@l Consumer arg1);
}

