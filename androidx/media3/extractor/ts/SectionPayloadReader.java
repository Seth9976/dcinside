package androidx.media3.extractor.ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ExtractorOutput;

@UnstableApi
public interface SectionPayloadReader {
    void a(ParsableByteArray arg1);

    void c(TimestampAdjuster arg1, ExtractorOutput arg2, TrackIdGenerator arg3);
}

