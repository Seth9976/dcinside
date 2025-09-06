package androidx.media3.decoder;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public class DecoderException extends Exception {
    public DecoderException(String s) {
        super(s);
    }

    public DecoderException(String s, @Nullable Throwable throwable0) {
        super(s, throwable0);
    }

    public DecoderException(@Nullable Throwable throwable0) {
        super(throwable0);
    }
}

