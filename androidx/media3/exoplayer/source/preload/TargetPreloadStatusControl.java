package androidx.media3.exoplayer.source.preload;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public interface TargetPreloadStatusControl {
    public interface PreloadStatus {
        int a();

        long getValue();
    }

    @Nullable
    PreloadStatus a(Object arg1);
}

