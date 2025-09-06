package androidx.media3.extractor;

import androidx.media3.common.Format.Builder;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import h4.m;
import java.io.IOException;
import java.util.List;

@UnstableApi
public final class SingleSampleExtractor implements Extractor {
    private final int d;
    private final int e;
    private final String f;
    private int g;
    private int h;
    private ExtractorOutput i;
    private TrackOutput j;
    private static final int k = 1;
    private static final int l = 2;
    public static final int m = 0x400;
    private static final int n = 0x400;

    public SingleSampleExtractor(int v, int v1, String s) {
        this.d = v;
        this.e = v1;
        this.f = s;
    }

    @Override  // androidx.media3.extractor.Extractor
    public void a(long v, long v1) {
        if(v == 0L || this.h == 1) {
            this.h = 1;
            this.g = 0;
        }
    }

    @m({"this.extractorOutput"})
    private void b(String s) {
        TrackOutput trackOutput0 = this.i.b(0x400, 4);
        this.j = trackOutput0;
        trackOutput0.d(new Builder().o0(s).K());
        this.i.m();
        this.i.r(new SingleSampleSeekMap(0x8000000000000001L));
        this.h = 1;
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
        switch(this.h) {
            case 1: {
                this.f(extractorInput0);
                return 0;
            }
            case 2: {
                return -1;
            }
            default: {
                throw new IllegalStateException();
            }
        }
    }

    private void f(ExtractorInput extractorInput0) throws IOException {
        int v = ((TrackOutput)Assertions.g(this.j)).e(extractorInput0, 0x400, true);
        if(v == -1) {
            this.h = 2;
            this.j.f(0L, 1, this.g, 0, null);
            this.g = 0;
            return;
        }
        this.g += v;
    }

    @Override  // androidx.media3.extractor.Extractor
    public boolean g(ExtractorInput extractorInput0) throws IOException {
        Assertions.i(this.d != -1 && this.e != -1);
        ParsableByteArray parsableByteArray0 = new ParsableByteArray(this.e);
        extractorInput0.k(parsableByteArray0.e(), 0, this.e);
        return parsableByteArray0.R() == this.d;
    }

    @Override  // androidx.media3.extractor.Extractor
    public void h(ExtractorOutput extractorOutput0) {
        this.i = extractorOutput0;
        this.b(this.f);
    }

    @Override  // androidx.media3.extractor.Extractor
    public void release() {
    }
}

