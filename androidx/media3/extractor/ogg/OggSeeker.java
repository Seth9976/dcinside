package androidx.media3.extractor.ogg;

import androidx.annotation.Nullable;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.SeekMap;
import java.io.IOException;

interface OggSeeker {
    long a(ExtractorInput arg1) throws IOException;

    @Nullable
    SeekMap b();

    void c(long arg1);
}

