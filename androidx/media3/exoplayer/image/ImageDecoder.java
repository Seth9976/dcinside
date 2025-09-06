package androidx.media3.exoplayer.image;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.Decoder;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;

@UnstableApi
public interface ImageDecoder extends Decoder {
    public interface Factory {
        public static final Factory a;

        static {
            Factory.a = new androidx.media3.exoplayer.image.BitmapFactoryImageDecoder.Factory();
        }

        int a(Format arg1);

        ImageDecoder b();
    }

    @Nullable
    ImageOutputBuffer a() throws ImageDecoderException;

    @Override  // androidx.media3.decoder.Decoder
    @Nullable
    Object a() throws DecoderException;

    @Override  // androidx.media3.decoder.Decoder
    void b(Object arg1) throws DecoderException;

    void e(DecoderInputBuffer arg1) throws ImageDecoderException;
}

