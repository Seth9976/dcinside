package androidx.media3.extractor.flac;

import androidx.media3.extractor.BinarySearchSeeker.SeekTimestampConverter;
import androidx.media3.extractor.FlacStreamMetadata;

public final class a implements SeekTimestampConverter {
    public final FlacStreamMetadata a;

    public a(FlacStreamMetadata flacStreamMetadata0) {
        this.a = flacStreamMetadata0;
    }

    @Override  // androidx.media3.extractor.BinarySearchSeeker$SeekTimestampConverter
    public final long a(long v) {
        return this.a.l(v);
    }
}

