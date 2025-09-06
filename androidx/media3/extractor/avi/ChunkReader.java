package androidx.media3.extractor.avi;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.SeekMap.SeekPoints;
import androidx.media3.extractor.SeekPoint;
import androidx.media3.extractor.TrackOutput;
import java.io.IOException;
import java.util.Arrays;

final class ChunkReader {
    protected final TrackOutput a;
    private final int b;
    private final int c;
    private final long d;
    private final int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private long[] k;
    private int[] l;
    private static final int m = 0x200;
    private static final int n = 0x63640000;
    private static final int o = 0x62640000;
    private static final int p = 0x62770000;

    public ChunkReader(int v, int v1, long v2, int v3, TrackOutput trackOutput0) {
        Assertions.a(v1 == 1 || v1 == 2);
        this.d = v2;
        this.e = v3;
        this.a = trackOutput0;
        this.b = v % 10 + 0x30 << 8 | v / 10 + 0x30 | (v1 == 2 ? 0x63640000 : 0x62770000);
        this.c = v1 == 2 ? v % 10 + 0x30 << 8 | v / 10 + 0x30 | 0x62640000 : -1;
        this.k = new long[0x200];
        this.l = new int[0x200];
    }

    public void a() {
        ++this.h;
    }

    public void b(long v) {
        if(this.j == this.l.length) {
            this.k = Arrays.copyOf(this.k, this.k.length * 3 / 2);
            this.l = Arrays.copyOf(this.l, this.l.length * 3 / 2);
        }
        int v1 = this.j;
        this.k[v1] = v;
        this.l[v1] = this.i;
        this.j = v1 + 1;
    }

    public void c() {
        this.k = Arrays.copyOf(this.k, this.j);
        this.l = Arrays.copyOf(this.l, this.j);
    }

    private static int d(int v, int v1) [...] // Inlined contents

    private long e(int v) {
        return this.d * ((long)v) / ((long)this.e);
    }

    public long f() {
        return this.e(this.h);
    }

    public long g() {
        return this.e(1);
    }

    private SeekPoint h(int v) {
        return new SeekPoint(((long)this.l[v]) * this.g(), this.k[v]);
    }

    public SeekPoints i(long v) {
        int v1 = (int)(v / this.g());
        int v2 = Util.m(this.l, v1, true, true);
        if(this.l[v2] == v1) {
            return new SeekPoints(this.h(v2));
        }
        SeekPoint seekPoint0 = this.h(v2);
        return v2 + 1 >= this.k.length ? new SeekPoints(seekPoint0) : new SeekPoints(seekPoint0, this.h(v2 + 1));
    }

    public boolean j(int v) {
        return this.b == v || this.c == v;
    }

    public void k() {
        ++this.i;
    }

    public boolean l() {
        return (this.b & 0x62770000) == 0x62770000;
    }

    public boolean m() {
        return Arrays.binarySearch(this.l, this.h) >= 0;
    }

    public boolean n() {
        return (this.b & 0x63640000) == 0x63640000;
    }

    public boolean o(ExtractorInput extractorInput0) throws IOException {
        int v = this.g - this.a.e(extractorInput0, this.g, false);
        this.g = v;
        if(v == 0) {
            if(this.f > 0) {
                long v1 = this.f();
                boolean z = this.m();
                this.a.f(v1, ((int)z), this.f, 0, null);
            }
            this.a();
        }
        return false;
    }

    public void p(int v) {
        this.f = v;
        this.g = v;
    }

    public void q(long v) {
        if(this.j == 0) {
            this.h = 0;
            return;
        }
        this.h = this.l[Util.n(this.k, v, true, true)];
    }
}

