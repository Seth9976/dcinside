package androidx.media3.extractor.ts;

import androidx.media3.common.Format.Builder;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import h4.d;

@UnstableApi
public final class PassthroughSectionPayloadReader implements SectionPayloadReader {
    private Format a;
    private TimestampAdjuster b;
    private TrackOutput c;

    public PassthroughSectionPayloadReader(String s) {
        this.a = new Builder().o0(s).K();
    }

    @Override  // androidx.media3.extractor.ts.SectionPayloadReader
    public void a(ParsableByteArray parsableByteArray0) {
        this.b();
        long v = this.b.e();
        long v1 = this.b.f();
        if(v != 0x8000000000000001L && v1 != 0x8000000000000001L) {
            Format format0 = this.a;
            if(v1 != format0.s) {
                Format format1 = format0.a().s0(v1).K();
                this.a = format1;
                this.c.d(format1);
            }
            int v2 = parsableByteArray0.a();
            this.c.b(parsableByteArray0, v2);
            this.c.f(v, 1, v2, 0, null);
        }
    }

    @d({"timestampAdjuster", "output"})
    private void b() {
        Assertions.k(this.b);
    }

    @Override  // androidx.media3.extractor.ts.SectionPayloadReader
    public void c(TimestampAdjuster timestampAdjuster0, ExtractorOutput extractorOutput0, TrackIdGenerator tsPayloadReader$TrackIdGenerator0) {
        this.b = timestampAdjuster0;
        tsPayloadReader$TrackIdGenerator0.a();
        TrackOutput trackOutput0 = extractorOutput0.b(tsPayloadReader$TrackIdGenerator0.c(), 5);
        this.c = trackOutput0;
        trackOutput0.d(this.a);
    }
}

