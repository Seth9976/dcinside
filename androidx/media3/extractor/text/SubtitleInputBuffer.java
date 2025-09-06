package androidx.media3.extractor.text;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderInputBuffer;

@UnstableApi
public class SubtitleInputBuffer extends DecoderInputBuffer {
    public long m;

    public SubtitleInputBuffer() {
        super(1);
    }
}

