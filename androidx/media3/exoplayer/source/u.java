package androidx.media3.exoplayer.source;

import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.analytics.PlayerId;

public final class u {
    @UnstableApi
    public static boolean a(MediaSource mediaSource0, MediaItem mediaItem0) [...] // Inlined contents

    @Nullable
    @UnstableApi
    public static Timeline b(MediaSource mediaSource0) [...] // Inlined contents

    @UnstableApi
    public static boolean c(MediaSource mediaSource0) [...] // Inlined contents

    @UnstableApi
    @Deprecated
    public static void d(MediaSource mediaSource0, MediaSourceCaller mediaSource$MediaSourceCaller0, @Nullable TransferListener transferListener0) {
        mediaSource0.I(mediaSource$MediaSourceCaller0, transferListener0, PlayerId.d);
    }

    @UnstableApi
    public static void e(MediaSource mediaSource0, MediaItem mediaItem0) {
    }
}

