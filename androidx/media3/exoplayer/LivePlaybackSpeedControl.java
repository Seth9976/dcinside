package androidx.media3.exoplayer;

import androidx.media3.common.MediaItem.LiveConfiguration;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public interface LivePlaybackSpeedControl {
    void a(LiveConfiguration arg1);

    float b(long arg1, long arg2);

    long c();

    void d();

    void e(long arg1);
}

