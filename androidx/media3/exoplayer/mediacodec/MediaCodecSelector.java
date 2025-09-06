package androidx.media3.exoplayer.mediacodec;

import androidx.media3.common.util.UnstableApi;
import java.util.List;

@UnstableApi
public interface MediaCodecSelector {
    public static final MediaCodecSelector a;

    static {
        MediaCodecSelector.a = new v();
    }

    List a(String arg1, boolean arg2, boolean arg3) throws DecoderQueryException;
}

