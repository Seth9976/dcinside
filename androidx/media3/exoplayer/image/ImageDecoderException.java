package androidx.media3.exoplayer.image;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderException;

@UnstableApi
public final class ImageDecoderException extends DecoderException {
    public ImageDecoderException(String s) {
        super(s);
    }

    public ImageDecoderException(String s, @Nullable Throwable throwable0) {
        super(s, throwable0);
    }

    public ImageDecoderException(@Nullable Throwable throwable0) {
        super(throwable0);
    }
}

