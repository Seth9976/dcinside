package androidx.media3.extractor.text;

import androidx.media3.common.Format;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.IndexSeekMap;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.d;
import com.google.common.primitives.l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@UnstableApi
public class SubtitleExtractor implements Extractor {
    static class Sample implements Comparable {
        private final long a;
        private final byte[] b;

        private Sample(long v, byte[] arr_b) {
            this.a = v;
            this.b = arr_b;
        }

        Sample(long v, byte[] arr_b, androidx.media3.extractor.text.SubtitleExtractor.1 subtitleExtractor$10) {
            this(v, arr_b);
        }

        public int c(Sample subtitleExtractor$Sample0) {
            return Long.compare(this.a, subtitleExtractor$Sample0.a);
        }

        @Override
        public int compareTo(Object object0) {
            return this.c(((Sample)object0));
        }
    }

    private final SubtitleParser d;
    private final CueEncoder e;
    private final Format f;
    private final List g;
    private final ParsableByteArray h;
    private byte[] i;
    private TrackOutput j;
    private int k;
    private int l;
    private long[] m;
    private long n;
    private static final int o = 0;
    private static final int p = 1;
    private static final int q = 2;
    private static final int r = 3;
    private static final int s = 4;
    private static final int t = 5;
    private static final int u = 0x400;

    public SubtitleExtractor(SubtitleParser subtitleParser0, Format format0) {
        this.d = subtitleParser0;
        this.e = new CueEncoder();
        this.i = Util.f;
        this.h = new ParsableByteArray();
        this.f = format0.a().o0("application/x-media3-cues").O(format0.n).S(subtitleParser0.b()).K();
        this.g = new ArrayList();
        this.l = 0;
        this.m = Util.g;
        this.n = 0x8000000000000001L;
    }

    @Override  // androidx.media3.extractor.Extractor
    public void a(long v, long v1) {
        Assertions.i(this.l != 0 && this.l != 5);
        this.n = v1;
        if(this.l == 2) {
            this.l = 1;
        }
        if(this.l == 4) {
            this.l = 3;
        }
    }

    @Override  // androidx.media3.extractor.Extractor
    public Extractor c() {
        return this;
    }

    @Override  // androidx.media3.extractor.Extractor
    public List d() {
        return d.a(this);
    }

    @Override  // androidx.media3.extractor.Extractor
    public int e(ExtractorInput extractorInput0, PositionHolder positionHolder0) throws IOException {
        Assertions.i(this.l != 0 && this.l != 5);
        if(this.l == 1) {
            int v = extractorInput0.getLength() == -1L ? 0x400 : l.d(extractorInput0.getLength());
            if(v > this.i.length) {
                this.i = new byte[v];
            }
            this.k = 0;
            this.l = 2;
        }
        if(this.l == 2 && this.j(extractorInput0)) {
            this.i();
            this.l = 4;
        }
        if(this.l == 3 && this.k(extractorInput0)) {
            this.l();
            this.l = 4;
        }
        return this.l == 4 ? -1 : 0;
    }

    // 检测为 Lambda 实现
    private void f(CuesWithTiming cuesWithTiming0) [...]

    @Override  // androidx.media3.extractor.Extractor
    public boolean g(ExtractorInput extractorInput0) throws IOException {
        return true;
    }

    @Override  // androidx.media3.extractor.Extractor
    public void h(ExtractorOutput extractorOutput0) {
        Assertions.i(this.l == 0);
        TrackOutput trackOutput0 = extractorOutput0.b(0, 3);
        this.j = trackOutput0;
        trackOutput0.d(this.f);
        extractorOutput0.m();
        extractorOutput0.r(new IndexSeekMap(new long[]{0L}, new long[]{0L}, 0x8000000000000001L));
        this.l = 1;
    }

    private void i() throws IOException {
        try {
            OutputOptions subtitleParser$OutputOptions0 = this.n == 0x8000000000000001L ? OutputOptions.b() : OutputOptions.c(this.n);
            byte[] arr_b = this.i;
            int v = this.k;
            c c0 = (CuesWithTiming cuesWithTiming0) -> {
                byte[] arr_b = this.e.a(cuesWithTiming0.a, cuesWithTiming0.c);
                Sample subtitleExtractor$Sample0 = new Sample(cuesWithTiming0.b, arr_b, null);
                this.g.add(subtitleExtractor$Sample0);
                if(this.n == 0x8000000000000001L || cuesWithTiming0.b >= this.n) {
                    this.m(subtitleExtractor$Sample0);
                }
            };
            this.d.a(arr_b, 0, v, subtitleParser$OutputOptions0, c0);
            Collections.sort(this.g);
            this.m = new long[this.g.size()];
            for(int v1 = 0; v1 < this.g.size(); ++v1) {
                long[] arr_v = this.m;
                arr_v[v1] = ((Sample)this.g.get(v1)).a;
            }
            this.i = Util.f;
            return;
        }
        catch(RuntimeException runtimeException0) {
        }
        throw ParserException.a("SubtitleParser failed.", runtimeException0);
    }

    private boolean j(ExtractorInput extractorInput0) throws IOException {
        byte[] arr_b = this.i;
        if(arr_b.length == this.k) {
            this.i = Arrays.copyOf(arr_b, arr_b.length + 0x400);
        }
        int v = extractorInput0.read(this.i, this.k, this.i.length - this.k);
        if(v != -1) {
            this.k += v;
        }
        long v1 = extractorInput0.getLength();
        return v1 != -1L && ((long)this.k) == v1 || v == -1;
    }

    private boolean k(ExtractorInput extractorInput0) throws IOException {
        return extractorInput0.g((extractorInput0.getLength() == -1L ? 0x400 : l.d(extractorInput0.getLength()))) == -1;
    }

    private void l() {
        for(int v = this.n == 0x8000000000000001L ? 0 : Util.n(this.m, this.n, true, true); v < this.g.size(); ++v) {
            this.m(((Sample)this.g.get(v)));
        }
    }

    private void m(Sample subtitleExtractor$Sample0) {
        Assertions.k(this.j);
        byte[] arr_b = subtitleExtractor$Sample0.b;
        byte[] arr_b1 = subtitleExtractor$Sample0.b;
        this.h.V(arr_b1);
        this.j.b(this.h, arr_b.length);
        this.j.f(subtitleExtractor$Sample0.a, 1, arr_b.length, 0, null);
    }

    @Override  // androidx.media3.extractor.Extractor
    public void release() {
        if(this.l == 5) {
            return;
        }
        this.d.reset();
        this.l = 5;
    }

    class androidx.media3.extractor.text.SubtitleExtractor.1 {
    }

}

