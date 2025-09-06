package androidx.media3.decoder;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public interface Decoder {
    @Nullable
    Object a() throws DecoderException;

    void b(Object arg1) throws DecoderException;

    void c(long arg1);

    @Nullable
    Object d() throws DecoderException;

    void flush();

    String getName();

    void release();
}

