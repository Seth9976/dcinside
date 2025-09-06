package androidx.media3.extractor.ts;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ExtractorOutput;

@UnstableApi
public interface ElementaryStreamReader {
    void a(ParsableByteArray arg1) throws ParserException;

    void b();

    void c(ExtractorOutput arg1, TrackIdGenerator arg2);

    void d(long arg1, int arg2);

    void e(boolean arg1);
}

