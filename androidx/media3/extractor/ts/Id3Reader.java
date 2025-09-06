package androidx.media3.extractor.ts;

import androidx.media3.common.Format.Builder;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;

@UnstableApi
public final class Id3Reader implements ElementaryStreamReader {
    private final ParsableByteArray a;
    private TrackOutput b;
    private boolean c;
    private long d;
    private int e;
    private int f;
    private static final String g = "Id3Reader";

    public Id3Reader() {
        this.a = new ParsableByteArray(10);
        this.d = 0x8000000000000001L;
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void a(ParsableByteArray parsableByteArray0) {
        Assertions.k(this.b);
        if(!this.c) {
            return;
        }
        int v = parsableByteArray0.a();
        int v1 = this.f;
        if(v1 < 10) {
            int v2 = Math.min(v, 10 - v1);
            System.arraycopy(parsableByteArray0.e(), parsableByteArray0.f(), this.a.e(), this.f, v2);
            if(this.f + v2 == 10) {
                this.a.Y(0);
                if(73 == this.a.L() && 68 == this.a.L() && 51 == this.a.L()) {
                    this.a.Z(3);
                    this.e = this.a.K() + 10;
                    goto label_17;
                }
                Log.n("Id3Reader", "Discarding invalid ID3 tag");
                this.c = false;
                return;
            }
        }
    label_17:
        int v3 = Math.min(v, this.e - this.f);
        this.b.b(parsableByteArray0, v3);
        this.f += v3;
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void b() {
        this.c = false;
        this.d = 0x8000000000000001L;
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void c(ExtractorOutput extractorOutput0, TrackIdGenerator tsPayloadReader$TrackIdGenerator0) {
        tsPayloadReader$TrackIdGenerator0.a();
        TrackOutput trackOutput0 = extractorOutput0.b(tsPayloadReader$TrackIdGenerator0.c(), 5);
        this.b = trackOutput0;
        trackOutput0.d(new Builder().a0(tsPayloadReader$TrackIdGenerator0.b()).o0("application/id3").K());
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void d(long v, int v1) {
        if((v1 & 4) == 0) {
            return;
        }
        this.c = true;
        this.d = v;
        this.e = 0;
        this.f = 0;
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void e(boolean z) {
        Assertions.k(this.b);
        if(this.c && (this.e != 0 && this.f == this.e)) {
            Assertions.i(this.d != 0x8000000000000001L);
            this.b.f(this.d, 1, this.e, 0, null);
            this.c = false;
        }
    }
}

