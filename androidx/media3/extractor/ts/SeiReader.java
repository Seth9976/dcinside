package androidx.media3.extractor.ts;

import androidx.media3.common.Format.Builder;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.CeaUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import java.util.List;

@UnstableApi
public final class SeiReader {
    private final List a;
    private final TrackOutput[] b;

    public SeiReader(List list0) {
        this.a = list0;
        this.b = new TrackOutput[list0.size()];
    }

    public void a(long v, ParsableByteArray parsableByteArray0) {
        CeaUtil.a(v, parsableByteArray0, this.b);
    }

    public void b(ExtractorOutput extractorOutput0, TrackIdGenerator tsPayloadReader$TrackIdGenerator0) {
        for(int v = 0; v < this.b.length; ++v) {
            tsPayloadReader$TrackIdGenerator0.a();
            TrackOutput trackOutput0 = extractorOutput0.b(tsPayloadReader$TrackIdGenerator0.c(), 3);
            Format format0 = (Format)this.a.get(v);
            Assertions.b("application/cea-608".equals(format0.n) || "application/cea-708".equals(format0.n), "Invalid closed caption MIME type provided: " + format0.n);
            String s = format0.a == null ? tsPayloadReader$TrackIdGenerator0.b() : format0.a;
            trackOutput0.d(new Builder().a0(s).o0(format0.n).q0(format0.e).e0(format0.d).L(format0.G).b0(format0.q).K());
            this.b[v] = trackOutput0;
        }
    }
}

