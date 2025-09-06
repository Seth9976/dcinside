package androidx.media3.extractor.ogg;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorUtil;
import androidx.media3.extractor.SeekMap.SeekPoints;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;

final class DefaultOggSeeker implements OggSeeker {
    final class OggSeekMap implements SeekMap {
        final DefaultOggSeeker d;

        private OggSeekMap() {
        }

        OggSeekMap(androidx.media3.extractor.ogg.DefaultOggSeeker.1 defaultOggSeeker$10) {
        }

        @Override  // androidx.media3.extractor.SeekMap
        public long c1() {
            return DefaultOggSeeker.this.d.b(DefaultOggSeeker.this.f);
        }

        @Override  // androidx.media3.extractor.SeekMap
        public SeekPoints d1(long v) {
            long v1 = DefaultOggSeeker.this.d.c(v);
            return new SeekPoints(new SeekPoint(v, Util.x(DefaultOggSeeker.this.b + BigInteger.valueOf(v1).multiply(BigInteger.valueOf(DefaultOggSeeker.this.c - DefaultOggSeeker.this.b)).divide(BigInteger.valueOf(DefaultOggSeeker.this.f)).longValue() - 30000L, DefaultOggSeeker.this.b, DefaultOggSeeker.this.c - 1L)));
        }

        @Override  // androidx.media3.extractor.SeekMap
        public boolean e1() {
            return true;
        }
    }

    private final OggPageHeader a;
    private final long b;
    private final long c;
    private final StreamReader d;
    private int e;
    private long f;
    private long g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;
    private static final int m = 72000;
    private static final int n = 100000;
    private static final int o = 30000;
    private static final int p = 0;
    private static final int q = 1;
    private static final int r = 2;
    private static final int s = 3;
    private static final int t = 4;

    public DefaultOggSeeker(StreamReader streamReader0, long v, long v1, long v2, long v3, boolean z) {
        Assertions.a(v >= 0L && v1 > v);
        this.d = streamReader0;
        this.b = v;
        this.c = v1;
        if(v2 == v1 - v || z) {
            this.f = v3;
            this.e = 4;
        }
        else {
            this.e = 0;
        }
        this.a = new OggPageHeader();
    }

    @Override  // androidx.media3.extractor.ogg.OggSeeker
    public long a(ExtractorInput extractorInput0) throws IOException {
        int v = this.e;
        if(v == 0) {
            long v2 = extractorInput0.getPosition();
            this.g = v2;
            this.e = 1;
            long v3 = this.c - 0xFF1BL;
            if(v3 > v2) {
                return v3;
            }
        }
        else if(v != 1) {
            switch(v) {
                case 2: {
                    long v1 = this.i(extractorInput0);
                    if(v1 != -1L) {
                        return v1;
                    }
                    this.e = 3;
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {
                    return -1L;
                }
                default: {
                    throw new IllegalStateException();
                }
            }
            this.k(extractorInput0);
            this.e = 4;
            return -(this.k + 2L);
        }
        this.f = this.j(extractorInput0);
        this.e = 4;
        return this.g;
    }

    @Override  // androidx.media3.extractor.ogg.OggSeeker
    @Nullable
    public SeekMap b() {
        return this.h();
    }

    @Override  // androidx.media3.extractor.ogg.OggSeeker
    public void c(long v) {
        this.h = Util.x(v, 0L, this.f - 1L);
        this.e = 2;
        this.i = this.b;
        this.j = this.c;
        this.k = 0L;
        this.l = this.f;
    }

    @Nullable
    public OggSeekMap h() {
        return this.f == 0L ? null : new OggSeekMap(this, null);
    }

    private long i(ExtractorInput extractorInput0) throws IOException {
        if(this.i == this.j) {
            return -1L;
        }
        long v = extractorInput0.getPosition();
        if(!this.a.d(extractorInput0, this.j)) {
            long v1 = this.i;
            if(v1 == v) {
                throw new IOException("No ogg page can be found.");
            }
            return v1;
        }
        this.a.a(extractorInput0, false);
        extractorInput0.o();
        long v2 = this.a.c;
        long v3 = this.h - v2;
        int v4 = this.a.h + this.a.i;
        if(0L <= v3 && v3 < 72000L) {
            return -1L;
        }
        int v5 = Long.compare(v3, 0L);
        if(v5 < 0) {
            this.j = v;
            this.l = v2;
        }
        else {
            this.i = extractorInput0.getPosition() + ((long)v4);
            this.k = this.a.c;
        }
        long v6 = this.i;
        if(this.j - v6 < 100000L) {
            this.j = v6;
            return v6;
        }
        return v5 > 0 ? Util.x(extractorInput0.getPosition() - ((long)v4) + v3 * (this.j - this.i) / (this.l - this.k), this.i, this.j - 1L) : Util.x(extractorInput0.getPosition() - ((long)v4) * 2L + v3 * (this.j - this.i) / (this.l - this.k), this.i, this.j - 1L);
    }

    @VisibleForTesting
    long j(ExtractorInput extractorInput0) throws IOException {
        this.a.b();
        if(!this.a.c(extractorInput0)) {
            throw new EOFException();
        }
        this.a.a(extractorInput0, false);
        extractorInput0.r(this.a.h + this.a.i);
        long v;
        for(v = this.a.c; (this.a.b & 4) != 4 && this.a.c(extractorInput0) && extractorInput0.getPosition() < this.c && this.a.a(extractorInput0, true) && ExtractorUtil.e(extractorInput0, this.a.h + this.a.i); v = this.a.c) {
        }
        return v;
    }

    private void k(ExtractorInput extractorInput0) throws IOException {
        while(true) {
            this.a.c(extractorInput0);
            this.a.a(extractorInput0, false);
            OggPageHeader oggPageHeader0 = this.a;
            if(oggPageHeader0.c > this.h) {
                break;
            }
            extractorInput0.r(oggPageHeader0.h + oggPageHeader0.i);
            this.i = extractorInput0.getPosition();
            this.k = this.a.c;
        }
        extractorInput0.o();
    }

    class androidx.media3.extractor.ogg.DefaultOggSeeker.1 {
    }

}

