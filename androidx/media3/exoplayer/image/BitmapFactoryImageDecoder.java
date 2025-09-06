package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.BitmapUtil;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.DecoderOutputBuffer;
import androidx.media3.decoder.SimpleDecoder;
import java.io.IOException;
import java.nio.ByteBuffer;

@UnstableApi
public final class BitmapFactoryImageDecoder extends SimpleDecoder implements ImageDecoder {
    @VisibleForTesting(otherwise = 2)
    public interface BitmapDecoder {
        Bitmap a(byte[] arg1, int arg2) throws ImageDecoderException;
    }

    public static final class Factory implements androidx.media3.exoplayer.image.ImageDecoder.Factory {
        private final BitmapDecoder b;

        public Factory() {
            this.b = (byte[] arr_b, int v) -> BitmapFactoryImageDecoder.B(arr_b, v);
        }

        public Factory(BitmapDecoder bitmapFactoryImageDecoder$BitmapDecoder0) {
            this.b = bitmapFactoryImageDecoder$BitmapDecoder0;
        }

        // 去混淆评级： 低(30)
        @Override  // androidx.media3.exoplayer.image.ImageDecoder$Factory
        public int a(Format format0) {
            if(format0.n != null && MimeTypes.r(format0.n)) {
                return Util.d1(format0.n) ? 0x84 : 0x81;
            }
            return 0x80;
        }

        @Override  // androidx.media3.exoplayer.image.ImageDecoder$Factory
        public ImageDecoder b() {
            return this.d();
        }

        // 检测为 Lambda 实现
        public static Bitmap c(byte[] arr_b, int v) [...]

        public BitmapFactoryImageDecoder d() {
            return new BitmapFactoryImageDecoder(this.b, null);
        }
    }

    private final BitmapDecoder o;

    private BitmapFactoryImageDecoder(BitmapDecoder bitmapFactoryImageDecoder$BitmapDecoder0) {
        super(new DecoderInputBuffer[1], new ImageOutputBuffer[1]);
        this.o = bitmapFactoryImageDecoder$BitmapDecoder0;
    }

    BitmapFactoryImageDecoder(BitmapDecoder bitmapFactoryImageDecoder$BitmapDecoder0, androidx.media3.exoplayer.image.BitmapFactoryImageDecoder.1 bitmapFactoryImageDecoder$10) {
        this(bitmapFactoryImageDecoder$BitmapDecoder0);
    }

    protected ImageDecoderException A(Throwable throwable0) {
        return new ImageDecoderException("Unexpected decode error", throwable0);
    }

    private static Bitmap B(byte[] arr_b, int v) throws ImageDecoderException {
        try {
            return BitmapUtil.a(arr_b, v, null);
        }
        catch(ParserException parserException0) {
            throw new ImageDecoderException("Could not decode image data with BitmapFactory. (data.length = " + arr_b.length + ", input length = " + v + ")", parserException0);
        }
        catch(IOException iOException0) {
            throw new ImageDecoderException(iOException0);
        }
    }

    @Nullable
    protected ImageDecoderException C(DecoderInputBuffer decoderInputBuffer0, ImageOutputBuffer imageOutputBuffer0, boolean z) {
        try {
            ByteBuffer byteBuffer0 = (ByteBuffer)Assertions.g(decoderInputBuffer0.d);
            Assertions.i(byteBuffer0.hasArray());
            Assertions.a(byteBuffer0.arrayOffset() == 0);
            byte[] arr_b = byteBuffer0.array();
            imageOutputBuffer0.e = this.o.a(arr_b, byteBuffer0.remaining());
            imageOutputBuffer0.b = decoderInputBuffer0.f;
            return null;
        }
        catch(ImageDecoderException imageDecoderException0) {
            return imageDecoderException0;
        }
    }

    @Override  // androidx.media3.exoplayer.image.ImageDecoder
    @Nullable
    public ImageOutputBuffer a() throws ImageDecoderException {
        return (ImageOutputBuffer)super.o();
    }

    @Override  // androidx.media3.decoder.Decoder
    public String getName() {
        return "BitmapFactoryImageDecoder";
    }

    @Override  // androidx.media3.decoder.SimpleDecoder
    protected DecoderInputBuffer i() {
        return new DecoderInputBuffer(1);
    }

    @Override  // androidx.media3.decoder.SimpleDecoder
    protected DecoderOutputBuffer j() {
        return this.z();
    }

    @Override  // androidx.media3.decoder.SimpleDecoder
    protected DecoderException k(Throwable throwable0) {
        return this.A(throwable0);
    }

    @Override  // androidx.media3.decoder.SimpleDecoder
    @Nullable
    protected DecoderException l(DecoderInputBuffer decoderInputBuffer0, DecoderOutputBuffer decoderOutputBuffer0, boolean z) {
        return this.C(decoderInputBuffer0, ((ImageOutputBuffer)decoderOutputBuffer0), z);
    }

    protected ImageOutputBuffer z() {
        return new ImageOutputBuffer() {
            final BitmapFactoryImageDecoder f;

            @Override  // androidx.media3.decoder.DecoderOutputBuffer
            public void p() {
                BitmapFactoryImageDecoder.this.t(this);
            }
        };
    }
}

