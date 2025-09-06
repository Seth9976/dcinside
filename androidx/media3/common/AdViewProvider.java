package androidx.media3.common;

import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.List;

public interface AdViewProvider {
    List getAdOverlayInfos();

    @Nullable
    ViewGroup getAdViewGroup();
}

