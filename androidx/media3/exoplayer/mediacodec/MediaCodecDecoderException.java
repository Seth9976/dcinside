package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec.CodecException;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderException;

@UnstableApi
public class MediaCodecDecoderException extends DecoderException {
    @Nullable
    public final MediaCodecInfo a;
    @Nullable
    public final String b;
    public final int c;

    public MediaCodecDecoderException(Throwable throwable0, @Nullable MediaCodecInfo mediaCodecInfo0) {
        String s = null;
        super("Decoder failed: " + (mediaCodecInfo0 == null ? null : mediaCodecInfo0.a), throwable0);
        this.a = mediaCodecInfo0;
        int v = Util.a;
        if(v >= 21) {
            s = MediaCodecDecoderException.a(throwable0);
        }
        this.b = s;
        this.c = v < 23 ? Util.r0(s) : MediaCodecDecoderException.b(throwable0);
    }

    // 去混淆评级： 低(20)
    @Nullable
    @RequiresApi(21)
    private static String a(Throwable throwable0) {
        return throwable0 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException)throwable0).getDiagnosticInfo() : null;
    }

    // 去混淆评级： 低(20)
    @RequiresApi(23)
    private static int b(Throwable throwable0) {
        return throwable0 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException)throwable0).getErrorCode() : 0;
    }
}

