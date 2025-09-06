package androidx.media3.extractor.flac;

import androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult;
import androidx.media3.extractor.BinarySearchSeeker.TimestampSeeker;
import androidx.media3.extractor.BinarySearchSeeker;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.FlacFrameReader.SampleNumberHolder;
import androidx.media3.extractor.FlacFrameReader;
import androidx.media3.extractor.FlacStreamMetadata;
import j..util.Objects;
import java.io.IOException;

final class FlacBinarySearchSeeker extends BinarySearchSeeker {
    static final class FlacTimestampSeeker implements TimestampSeeker {
        private final FlacStreamMetadata a;
        private final int b;
        private final SampleNumberHolder c;

        private FlacTimestampSeeker(FlacStreamMetadata flacStreamMetadata0, int v) {
            this.a = flacStreamMetadata0;
            this.b = v;
            this.c = new SampleNumberHolder();
        }

        FlacTimestampSeeker(FlacStreamMetadata flacStreamMetadata0, int v, androidx.media3.extractor.flac.FlacBinarySearchSeeker.1 flacBinarySearchSeeker$10) {
            this(flacStreamMetadata0, v);
        }

        @Override  // androidx.media3.extractor.BinarySearchSeeker$TimestampSeeker
        public TimestampSearchResult a(ExtractorInput extractorInput0, long v) throws IOException {
            long v1 = extractorInput0.getPosition();
            long v2 = this.c(extractorInput0);
            long v3 = extractorInput0.p();
            extractorInput0.q(Math.max(6, this.a.c));
            long v4 = this.c(extractorInput0);
            long v5 = extractorInput0.p();
            if(v2 <= v && v4 > v) {
                return TimestampSearchResult.e(v3);
            }
            return v4 > v ? TimestampSearchResult.d(v2, v1) : TimestampSearchResult.f(v4, v5);
        }

        @Override  // androidx.media3.extractor.BinarySearchSeeker$TimestampSeeker
        public void b() {
        }

        private long c(ExtractorInput extractorInput0) throws IOException {
            while(extractorInput0.p() < extractorInput0.getLength() - 6L && !FlacFrameReader.h(extractorInput0, this.a, this.b, this.c)) {
                extractorInput0.q(1);
            }
            if(extractorInput0.p() >= extractorInput0.getLength() - 6L) {
                extractorInput0.q(((int)(extractorInput0.getLength() - extractorInput0.p())));
                return this.a.j;
            }
            return this.c.a;
        }
    }

    public FlacBinarySearchSeeker(FlacStreamMetadata flacStreamMetadata0, int v, long v1, long v2) {
        Objects.requireNonNull(flacStreamMetadata0);
        a a0 = new a(flacStreamMetadata0);
        FlacTimestampSeeker flacBinarySearchSeeker$FlacTimestampSeeker0 = new FlacTimestampSeeker(flacStreamMetadata0, v, null);
        long v3 = flacStreamMetadata0.h();
        long v4 = flacStreamMetadata0.e();
        super(a0, flacBinarySearchSeeker$FlacTimestampSeeker0, v3, 0L, flacStreamMetadata0.j, v1, v2, v4, Math.max(6, flacStreamMetadata0.c));
    }

    class androidx.media3.extractor.flac.FlacBinarySearchSeeker.1 {
    }

}

