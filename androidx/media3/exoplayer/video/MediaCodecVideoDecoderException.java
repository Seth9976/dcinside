package androidx.media3.exoplayer.video;

import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecInfo;

@UnstableApi
public class MediaCodecVideoDecoderException extends MediaCodecDecoderException {
    public final int d;
    public final boolean e;

    public MediaCodecVideoDecoderException(Throwable throwable0, @Nullable MediaCodecInfo mediaCodecInfo0, @Nullable Surface surface0) {
        super(throwable0, mediaCodecInfo0);
        this.d = System.identityHashCode(surface0);
        this.e = surface0 == null || surface0.isValid();
    }
}

