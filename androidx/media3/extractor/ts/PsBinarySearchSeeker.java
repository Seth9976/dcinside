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

final class PsBinarySearchSeeker extends BinarySearchSeeker {
    static final class PsScrSeeker implements TimestampSeeker {
        private final TimestampAdjuster a;
        private final ParsableByteArray b;

        private PsScrSeeker(TimestampAdjuster timestampAdjuster0) {
            this.a = timestampAdjuster0;
            this.b = new ParsableByteArray();
        }

        PsScrSeeker(TimestampAdjuster timestampAdjuster0, androidx.media3.extractor.ts.PsBinarySearchSeeker.1 psBinarySearchSeeker$10) {
            this(timestampAdjuster0);
        }

        @Override  // androidx.media3.extractor.BinarySearchSeeker$TimestampSeeker
        public TimestampSearchResult a(ExtractorInput extractorInput0, long v) throws IOException {
            long v1 = extractorInput0.getPosition();
            int v2 = (int)Math.min(20000L, extractorInput0.getLength() - v1);
            this.b.U(v2);
            extractorInput0.k(this.b.e(), 0, v2);
            return this.c(this.b, v, v1);
        }

        @Override  // androidx.media3.extractor.BinarySearchSeeker$TimestampSeeker
        public void b() {
            this.b.V(Util.f);
        }

        private TimestampSearchResult c(ParsableByteArray parsableByteArray0, long v, long v1) {
            int v2 = -1;
            long v3 = 0x8000000000000001L;
            int v4 = -1;
            while(parsableByteArray0.a() >= 4) {
                if(PsBinarySearchSeeker.k(parsableByteArray0.e(), parsableByteArray0.f()) == 442) {
                    parsableByteArray0.Z(4);
                    long v5 = PsDurationReader.l(parsableByteArray0);
                    if(v5 != 0x8000000000000001L) {
                        long v6 = this.a.b(v5);
                        if(v6 > v) {
                            return v3 == 0x8000000000000001L ? TimestampSearchResult.d(v6, v1) : TimestampSearchResult.e(v1 + ((long)v4));
                        }
                        if(v6 + 100000L > v) {
                            return TimestampSearchResult.e(v1 + ((long)parsableByteArray0.f()));
                        }
                        v4 = parsableByteArray0.f();
                        v3 = v6;
                    }
                    PsScrSeeker.d(parsableByteArray0);
                    v2 = parsableByteArray0.f();
                }
                else {
                    parsableByteArray0.Z(1);
                }
            }
            return v3 == 0x8000000000000001L ? TimestampSearchResult.h : TimestampSearchResult.f(v3, v1 + ((long)v2));
        }

        private static void d(ParsableByteArray parsableByteArray0) {
            int v = parsableByteArray0.g();
            if(parsableByteArray0.a() < 10) {
                parsableByteArray0.Y(v);
                return;
            }
            parsableByteArray0.Z(9);
            int v1 = parsableByteArray0.L();
            if(parsableByteArray0.a() < (v1 & 7)) {
                parsableByteArray0.Y(v);
                return;
            }
            parsableByteArray0.Z(v1 & 7);
            if(parsableByteArray0.a() < 4) {
                parsableByteArray0.Y(v);
                return;
            }
            if(PsBinarySearchSeeker.k(parsableByteArray0.e(), parsableByteArray0.f()) == 443) {
                parsableByteArray0.Z(4);
                int v2 = parsableByteArray0.R();
                if(parsableByteArray0.a() < v2) {
                    parsableByteArray0.Y(v);
                    return;
                }
                parsableByteArray0.Z(v2);
            }
            while(parsableByteArray0.a() >= 4) {
                int v3 = PsBinarySearchSeeker.k(parsableByteArray0.e(), parsableByteArray0.f());
                if(v3 == 441 || v3 == 442 || v3 >>> 8 != 1) {
                    break;
                }
                parsableByteArray0.Z(4);
                if(parsableByteArray0.a() < 2) {
                    parsableByteArray0.Y(v);
                    return;
                }
                parsableByteArray0.Y(Math.min(parsableByteArray0.g(), parsableByteArray0.f() + parsableByteArray0.R()));
            }
        }
    }

    private static final long f = 100000L;
    private static final int g = 1000;
    private static final int h = 20000;

    public PsBinarySearchSeeker(TimestampAdjuster timestampAdjuster0, long v, long v1) {
        super(new DefaultSeekTimestampConverter(), new PsScrSeeker(timestampAdjuster0, null), v, 0L, v + 1L, 0L, v1, 0xBCL, 1000);
    }

    private static int k(byte[] arr_b, int v) {
        return arr_b[v + 3] & 0xFF | ((arr_b[v] & 0xFF) << 24 | (arr_b[v + 1] & 0xFF) << 16 | (arr_b[v + 2] & 0xFF) << 8);
    }

    class androidx.media3.extractor.ts.PsBinarySearchSeeker.1 {
    }

}

