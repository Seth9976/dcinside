package androidx.media3.common.audio;

import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public interface AudioProcessorChain {
    AudioProcessor[] a();

    PlaybackParameters b(PlaybackParameters arg1);

    long c();

    long d(long arg1);

    boolean e(boolean arg1);
}

