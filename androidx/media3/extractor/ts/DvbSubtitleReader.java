package androidx.media3.extractor.ts;

import androidx.media3.common.Format.Builder;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import java.util.Collections;
import java.util.List;

@UnstableApi
public final class DvbSubtitleReader implements ElementaryStreamReader {
    private final List a;
    private final TrackOutput[] b;
    private boolean c;
    private int d;
    private int e;
    private long f;

    public DvbSubtitleReader(List list0) {
        this.a = list0;
        this.b = new TrackOutput[list0.size()];
        this.f = 0x8000000000000001L;
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void a(ParsableByteArray parsableByteArray0) {
        if(!this.c || this.d == 2 && !this.f(parsableByteArray0, 0x20)) {
            return;
        }
        if(this.d == 1 && !this.f(parsableByteArray0, 0)) {
            return;
        }
        int v1 = parsableByteArray0.f();
        int v2 = parsableByteArray0.a();
        TrackOutput[] arr_trackOutput = this.b;
        for(int v = 0; v < arr_trackOutput.length; ++v) {
            TrackOutput trackOutput0 = arr_trackOutput[v];
            parsableByteArray0.Y(v1);
            trackOutput0.b(parsableByteArray0, v2);
        }
        this.e += v2;
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void b() {
        this.c = false;
        this.f = 0x8000000000000001L;
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void c(ExtractorOutput extractorOutput0, TrackIdGenerator tsPayloadReader$TrackIdGenerator0) {
        for(int v = 0; v < this.b.length; ++v) {
            DvbSubtitleInfo tsPayloadReader$DvbSubtitleInfo0 = (DvbSubtitleInfo)this.a.get(v);
            tsPayloadReader$TrackIdGenerator0.a();
            TrackOutput trackOutput0 = extractorOutput0.b(tsPayloadReader$TrackIdGenerator0.c(), 3);
            trackOutput0.d(new Builder().a0(tsPayloadReader$TrackIdGenerator0.b()).o0("application/dvbsubs").b0(Collections.singletonList(tsPayloadReader$DvbSubtitleInfo0.c)).e0(tsPayloadReader$DvbSubtitleInfo0.a).K());
            this.b[v] = trackOutput0;
        }
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void d(long v, int v1) {
        if((v1 & 4) == 0) {
            return;
        }
        this.c = true;
        this.f = v;
        this.e = 0;
        this.d = 2;
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void e(boolean z) {
        if(this.c) {
            Assertions.i(this.f != 0x8000000000000001L);
            TrackOutput[] arr_trackOutput = this.b;
            for(int v = 0; v < arr_trackOutput.length; ++v) {
                arr_trackOutput[v].f(this.f, 1, this.e, 0, null);
            }
            this.c = false;
        }
    }

    private boolean f(ParsableByteArray parsableByteArray0, int v) {
        if(parsableByteArray0.a() == 0) {
            return false;
        }
        if(parsableByteArray0.L() != v) {
            this.c = false;
        }
        --this.d;
        return this.c;
    }
}

