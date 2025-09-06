package androidx.media3.exoplayer.image;

import androidx.annotation.Nullable;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;

public final class b {
    @Nullable
    public static Object a(ImageDecoder imageDecoder0) throws DecoderException {
        return imageDecoder0.a();
    }

    public static void b(ImageDecoder imageDecoder0, Object object0) throws DecoderException {
        imageDecoder0.e(((DecoderInputBuffer)object0));
    }
}

