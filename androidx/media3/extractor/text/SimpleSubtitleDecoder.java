package androidx.media3.extractor.text;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.DecoderOutputBuffer;
import androidx.media3.decoder.SimpleDecoder;
import java.nio.ByteBuffer;

@UnstableApi
public abstract class SimpleSubtitleDecoder extends SimpleDecoder implements SubtitleDecoder {
    private final String o;

    protected SimpleSubtitleDecoder(String s) {
        super(new SubtitleInputBuffer[2], new SubtitleOutputBuffer[2]);
        this.o = s;
        this.w(0x400);
    }

    protected final SubtitleDecoderException A(Throwable throwable0) {
        return new SubtitleDecoderException("Unexpected decode error", throwable0);
    }

    protected abstract Subtitle B(byte[] arg1, int arg2, boolean arg3) throws SubtitleDecoderException;

    @Nullable
    protected final SubtitleDecoderException C(SubtitleInputBuffer subtitleInputBuffer0, SubtitleOutputBuffer subtitleOutputBuffer0, boolean z) {
        try {
            ByteBuffer byteBuffer0 = (ByteBuffer)Assertions.g(subtitleInputBuffer0.d);
            Subtitle subtitle0 = this.B(byteBuffer0.array(), byteBuffer0.limit(), z);
            subtitleOutputBuffer0.r(subtitleInputBuffer0.f, subtitle0, subtitleInputBuffer0.m);
            subtitleOutputBuffer0.d = false;
            return null;
        }
        catch(SubtitleDecoderException subtitleDecoderException0) {
            return subtitleDecoderException0;
        }
    }

    @Override  // androidx.media3.extractor.text.SubtitleDecoder
    public void f(long v) {
    }

    @Override  // androidx.media3.decoder.Decoder
    public final String getName() {
        return this.o;
    }

    @Override  // androidx.media3.decoder.SimpleDecoder
    protected DecoderInputBuffer i() {
        return this.y();
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
        return this.C(((SubtitleInputBuffer)decoderInputBuffer0), ((SubtitleOutputBuffer)decoderOutputBuffer0), z);
    }

    protected final SubtitleInputBuffer y() {
        return new SubtitleInputBuffer();
    }

    protected final SubtitleOutputBuffer z() {
        return new SubtitleOutputBuffer() {
            final SimpleSubtitleDecoder g;

            @Override  // androidx.media3.decoder.DecoderOutputBuffer
            public void p() {
                SimpleSubtitleDecoder.this.t(this);
            }
        };
    }
}

