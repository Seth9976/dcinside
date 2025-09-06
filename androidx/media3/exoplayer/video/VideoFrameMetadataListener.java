package androidx.media3.exoplayer.video;

import android.media.MediaFormat;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public interface VideoFrameMetadataListener {
    void l(long arg1, long arg2, Format arg3, @Nullable MediaFormat arg4);
}

