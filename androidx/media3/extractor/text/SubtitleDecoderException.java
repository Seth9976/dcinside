package androidx.media3.extractor.text;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderException;

@UnstableApi
public class SubtitleDecoderException extends DecoderException {
    public SubtitleDecoderException(String s) {
        super(s);
    }

    public SubtitleDecoderException(String s, @Nullable Throwable throwable0) {
        super(s, throwable0);
    }

    public SubtitleDecoderException(@Nullable Throwable throwable0) {
        super(throwable0);
    }
}

