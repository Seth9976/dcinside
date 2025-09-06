package androidx.media3.extractor.ogg;

import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap.Unseekable;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import h4.d;
import h4.e;
import h4.m;
import java.io.IOException;

abstract class StreamReader {
    static class SetupData {
        Format a;
        OggSeeker b;

    }

    static final class UnseekableOggSeeker implements OggSeeker {
        private UnseekableOggSeeker() {
        }

        UnseekableOggSeeker(androidx.media3.extractor.ogg.StreamReader.1 streamReader$10) {
        }

        @Override  // androidx.media3.extractor.ogg.OggSeeker
        public long a(ExtractorInput extractorInput0) {
            return -1L;
        }

        @Override  // androidx.media3.extractor.ogg.OggSeeker
        public SeekMap b() {
            return new Unseekable(0x8000000000000001L);
        }

        @Override  // androidx.media3.extractor.ogg.OggSeeker
        public void c(long v) {
        }
    }

    private final OggPacket a;
    private TrackOutput b;
    private ExtractorOutput c;
    private OggSeeker d;
    private long e;
    private long f;
    private long g;
    private int h;
    private int i;
    private SetupData j;
    private long k;
    private boolean l;
    private boolean m;
    private static final int n = 0;
    private static final int o = 1;
    private static final int p = 2;
    private static final int q = 3;

    public StreamReader() {
        this.a = new OggPacket();
        this.j = new SetupData();
    }

    @d({"trackOutput", "extractorOutput"})
    private void a() {
        Assertions.k(this.b);
    }

    protected long b(long v) {
        return v * 1000000L / ((long)this.i);
    }

    protected long c(long v) {
        return ((long)this.i) * v / 1000000L;
    }

    void d(ExtractorOutput extractorOutput0, TrackOutput trackOutput0) {
        this.c = extractorOutput0;
        this.b = trackOutput0;
        this.l(true);
    }

    protected void e(long v) {
        this.g = v;
    }

    protected abstract long f(ParsableByteArray arg1);

    final int g(ExtractorInput extractorInput0, PositionHolder positionHolder0) throws IOException {
        this.a();
        int v = this.h;
        if(v != 0) {
            switch(v) {
                case 1: {
                    extractorInput0.r(((int)this.f));
                    this.h = 2;
                    return 0;
                }
                case 2: {
                    return this.k(extractorInput0, positionHolder0);
                }
                default: {
                    if(v != 3) {
                        throw new IllegalStateException();
                    }
                    return -1;
                }
            }
        }
        return this.j(extractorInput0);
    }

    @e(expression = {"#3.format"}, result = false)
    protected abstract boolean h(ParsableByteArray arg1, long arg2, SetupData arg3) throws IOException;

    @e(expression = {"setupData.format"}, result = true)
    private boolean i(ExtractorInput extractorInput0) throws IOException {
        while(true) {
            if(!this.a.d(extractorInput0)) {
                this.h = 3;
                return false;
            }
            this.k = extractorInput0.getPosition() - this.f;
            if(!this.h(this.a.c(), this.f, this.j)) {
                break;
            }
            this.f = extractorInput0.getPosition();
        }
        return true;
    }

    @m({"trackOutput"})
    private int j(ExtractorInput extractorInput0) throws IOException {
        if(!this.i(extractorInput0)) {
            return -1;
        }
        Format format0 = this.j.a;
        this.i = format0.C;
        if(!this.m) {
            this.b.d(format0);
            this.m = true;
        }
        OggSeeker oggSeeker0 = this.j.b;
        if(oggSeeker0 != null) {
            this.d = oggSeeker0;
        }
        else if(extractorInput0.getLength() == -1L) {
            this.d = new UnseekableOggSeeker(null);
        }
        else {
            OggPageHeader oggPageHeader0 = this.a.b();
            boolean z = (oggPageHeader0.b & 4) != 0;
            this.d = new DefaultOggSeeker(this, this.f, extractorInput0.getLength(), ((long)(oggPageHeader0.h + oggPageHeader0.i)), oggPageHeader0.c, z);
        }
        this.h = 2;
        this.a.f();
        return 0;
    }

    @m({"trackOutput", "oggSeeker", "extractorOutput"})
    private int k(ExtractorInput extractorInput0, PositionHolder positionHolder0) throws IOException {
        long v = this.d.a(extractorInput0);
        if(v >= 0L) {
            positionHolder0.a = v;
            return 1;
        }
        if(v < -1L) {
            this.e(-(v + 2L));
        }
        if(!this.l) {
            SeekMap seekMap0 = (SeekMap)Assertions.k(this.d.b());
            this.c.r(seekMap0);
            this.l = true;
        }
        if(this.k <= 0L && !this.a.d(extractorInput0)) {
            this.h = 3;
            return -1;
        }
        this.k = 0L;
        ParsableByteArray parsableByteArray0 = this.a.c();
        long v1 = this.f(parsableByteArray0);
        if(v1 >= 0L) {
            long v2 = this.g;
            if(v2 + v1 >= this.e) {
                long v3 = this.b(v2);
                this.b.b(parsableByteArray0, parsableByteArray0.g());
                this.b.f(v3, 1, parsableByteArray0.g(), 0, null);
                this.e = -1L;
            }
        }
        this.g += v1;
        return 0;
    }

    protected void l(boolean z) {
        if(z) {
            this.j = new SetupData();
            this.f = 0L;
            this.h = 0;
        }
        else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }

    final void m(long v, long v1) {
        this.a.e();
        if(v == 0L) {
            this.l(!this.l);
            return;
        }
        if(this.h != 0) {
            this.e = this.c(v1);
            this.d.c(this.e);
            this.h = 2;
        }
    }

    class androidx.media3.extractor.ogg.StreamReader.1 {
    }

}

