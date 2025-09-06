package androidx.media3.extractor.ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.BinarySearchSeeker.DefaultSeekTimestampConverter;
import androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult;
import androidx.media3.extractor.BinarySearchSeeker.TimestampSeeker;
import androidx.media3.extractor.BinarySearchSeeker;
import androidx.media3.extractor.ExtractorInput;
import java.io.IOException;

final class TsBinarySearchSeeker extends BinarySearchSeeker {
    static final class TsPcrSeeker implements TimestampSeeker {
        private final TimestampAdjuster a;
        private final ParsableByteArray b;
        private final int c;
        private final int d;

        public TsPcrSeeker(int v, TimestampAdjuster timestampAdjuster0, int v1) {
            this.c = v;
            this.a = timestampAdjuster0;
            this.d = v1;
            this.b = new ParsableByteArray();
        }

        @Override  // androidx.media3.extractor.BinarySearchSeeker$TimestampSeeker
        public TimestampSearchResult a(ExtractorInput extractorInput0, long v) throws IOException {
            long v1 = extractorInput0.getPosition();
            long v2 = extractorInput0.getLength();
            int v3 = (int)Math.min(this.d, v2 - v1);
            this.b.U(v3);
            extractorInput0.k(this.b.e(), 0, v3);
            return this.c(this.b, v, v1);
        }

        @Override  // androidx.media3.extractor.BinarySearchSeeker$TimestampSeeker
        public void b() {
            this.b.V(Util.f);
        }

        private TimestampSearchResult c(ParsableByteArray parsableByteArray0, long v, long v1) {
            int v2 = parsableByteArray0.g();
            long v3 = -1L;
            long v4 = -1L;
            long v5 = 0x8000000000000001L;
            while(parsableByteArray0.a() >= 0xBC) {
                int v6 = TsUtil.a(parsableByteArray0.e(), parsableByteArray0.f(), v2);
                if(v6 + 0xBC > v2) {
                    break;
                }
                long v7 = TsUtil.c(parsableByteArray0, v6, this.c);
                if(v7 != 0x8000000000000001L) {
                    long v8 = this.a.b(v7);
                    if(v8 > v) {
                        return v5 == 0x8000000000000001L ? TimestampSearchResult.d(v8, v1) : TimestampSearchResult.e(v1 + v4);
                    }
                    if(v8 + 100000L > v) {
                        return TimestampSearchResult.e(v1 + ((long)v6));
                    }
                    v4 = (long)v6;
                    v5 = v8;
                }
                parsableByteArray0.Y(v6 + 0xBC);
                v3 = (long)(v6 + 0xBC);
            }
            return v5 == 0x8000000000000001L ? TimestampSearchResult.h : TimestampSearchResult.f(v5, v1 + v3);
        }
    }

    private static final long f = 100000L;
    private static final int g = 940;

    public TsBinarySearchSeeker(TimestampAdjuster timestampAdjuster0, long v, long v1, int v2, int v3) {
        super(new DefaultSeekTimestampConverter(), new TsPcrSeeker(v2, timestampAdjuster0, v3), v, 0L, v + 1L, 0L, v1, 0xBCL, 940);
    }
}

