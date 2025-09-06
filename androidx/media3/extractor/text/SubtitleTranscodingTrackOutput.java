package androidx.media3.extractor.text;

import androidx.annotation.Nullable;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.TrackOutput.CryptoData;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.g;
import java.io.EOFException;
import java.io.IOException;

final class SubtitleTranscodingTrackOutput implements TrackOutput {
    private final TrackOutput d;
    private final Factory e;
    private final CueEncoder f;
    private final ParsableByteArray g;
    private int h;
    private int i;
    private byte[] j;
    @Nullable
    private SubtitleParser k;
    private Format l;

    public SubtitleTranscodingTrackOutput(TrackOutput trackOutput0, Factory subtitleParser$Factory0) {
        this.d = trackOutput0;
        this.e = subtitleParser$Factory0;
        this.f = new CueEncoder();
        this.h = 0;
        this.i = 0;
        this.j = Util.f;
        this.g = new ParsableByteArray();
    }

    @Override  // androidx.media3.extractor.TrackOutput
    public void a(ParsableByteArray parsableByteArray0, int v, int v1) {
        if(this.k == null) {
            this.d.a(parsableByteArray0, v, v1);
            return;
        }
        this.h(v);
        parsableByteArray0.n(this.j, this.i, v);
        this.i += v;
    }

    @Override  // androidx.media3.extractor.TrackOutput
    public void b(ParsableByteArray parsableByteArray0, int v) {
        g.b(this, parsableByteArray0, v);
    }

    @Override  // androidx.media3.extractor.TrackOutput
    public int c(DataReader dataReader0, int v, boolean z, int v1) throws IOException {
        if(this.k == null) {
            return this.d.c(dataReader0, v, z, v1);
        }
        this.h(v);
        int v2 = dataReader0.read(this.j, this.i, v);
        if(v2 == -1) {
            if(!z) {
                throw new EOFException();
            }
            return -1;
        }
        this.i += v2;
        return v2;
    }

    @Override  // androidx.media3.extractor.TrackOutput
    public void d(Format format0) {
        Assertions.g(format0.n);
        Assertions.a(MimeTypes.m(format0.n) == 3);
        if(!format0.equals(this.l)) {
            this.l = format0;
            this.k = this.e.a(format0) ? this.e.c(format0) : null;
        }
        if(this.k == null) {
            this.d.d(format0);
            return;
        }
        Format format1 = format0.a().o0("application/x-media3-cues").O(format0.n).s0(0x7FFFFFFFFFFFFFFFL).S(this.e.b(format0)).K();
        this.d.d(format1);
    }

    @Override  // androidx.media3.extractor.TrackOutput
    public int e(DataReader dataReader0, int v, boolean z) {
        return g.a(this, dataReader0, v, z);
    }

    @Override  // androidx.media3.extractor.TrackOutput
    public void f(long v, int v1, int v2, int v3, @Nullable CryptoData trackOutput$CryptoData0) {
        if(this.k == null) {
            this.d.f(v, v1, v2, v3, trackOutput$CryptoData0);
            return;
        }
        Assertions.b(trackOutput$CryptoData0 == null, "DRM on subtitles is not supported");
        int v4 = this.i - v3 - v2;
        this.k.a(this.j, v4, v2, OutputOptions.b(), (CuesWithTiming cuesWithTiming0) -> this.j(cuesWithTiming0, v, v1));
        int v5 = v4 + v2;
        this.h = v5;
        if(v5 == this.i) {
            this.h = 0;
            this.i = 0;
        }
    }

    private void h(int v) {
        int v1 = this.i;
        if(this.j.length - v1 >= v) {
            return;
        }
        int v2 = v1 - this.h;
        int v3 = Math.max(v2 * 2, v + v2);
        byte[] arr_b = this.j;
        byte[] arr_b1 = v3 > arr_b.length ? new byte[v3] : arr_b;
        System.arraycopy(arr_b, this.h, arr_b1, 0, v2);
        this.h = 0;
        this.i = v2;
        this.j = arr_b1;
    }

    // 检测为 Lambda 实现
    private void i(long v, int v1, CuesWithTiming cuesWithTiming0) [...]

    private void j(CuesWithTiming cuesWithTiming0, long v, int v1) {
        Assertions.k(this.l);
        byte[] arr_b = this.f.a(cuesWithTiming0.a, cuesWithTiming0.c);
        this.g.V(arr_b);
        this.d.b(this.g, arr_b.length);
        long v2 = cuesWithTiming0.b;
        if(v2 == 0x8000000000000001L) {
            Assertions.i(this.l.s == 0x7FFFFFFFFFFFFFFFL);
        }
        else {
            long v3 = this.l.s;
            v = v3 == 0x7FFFFFFFFFFFFFFFL ? v + v2 : v2 + v3;
        }
        this.d.f(v, v1, arr_b.length, 0, null);
    }

    public void k() {
        SubtitleParser subtitleParser0 = this.k;
        if(subtitleParser0 != null) {
            subtitleParser0.reset();
        }
    }
}

