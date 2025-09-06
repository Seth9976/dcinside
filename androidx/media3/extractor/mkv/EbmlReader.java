package androidx.media3.extractor.mkv;

import androidx.media3.extractor.ExtractorInput;
import java.io.IOException;

interface EbmlReader {
    boolean a(ExtractorInput arg1) throws IOException;

    void b(EbmlProcessor arg1);

    void reset();
}

