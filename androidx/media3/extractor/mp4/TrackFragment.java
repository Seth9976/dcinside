package androidx.media3.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ExtractorInput;
import java.io.IOException;

final class TrackFragment {
    public DefaultSampleValues a;
    public long b;
    public long c;
    public long d;
    public int e;
    public int f;
    public long[] g;
    public int[] h;
    public int[] i;
    public long[] j;
    public boolean[] k;
    public boolean l;
    public boolean[] m;
    @Nullable
    public TrackEncryptionBox n;
    public final ParsableByteArray o;
    public boolean p;
    public long q;
    public boolean r;

    public TrackFragment() {
        this.g = new long[0];
        this.h = new int[0];
        this.i = new int[0];
        this.j = new long[0];
        this.k = new boolean[0];
        this.m = new boolean[0];
        this.o = new ParsableByteArray();
    }

    public void a(ParsableByteArray parsableByteArray0) {
        parsableByteArray0.n(this.o.e(), 0, this.o.g());
        this.o.Y(0);
        this.p = false;
    }

    public void b(ExtractorInput extractorInput0) throws IOException {
        extractorInput0.readFully(this.o.e(), 0, this.o.g());
        this.o.Y(0);
        this.p = false;
    }

    public long c(int v) {
        return this.j[v];
    }

    public void d(int v) {
        this.o.U(v);
        this.l = true;
        this.p = true;
    }

    public void e(int v, int v1) {
        this.e = v;
        this.f = v1;
        if(this.h.length < v) {
            this.g = new long[v];
            this.h = new int[v];
        }
        if(this.i.length < v1) {
            int v2 = v1 * 0x7D / 100;
            this.i = new int[v2];
            this.j = new long[v2];
            this.k = new boolean[v2];
            this.m = new boolean[v2];
        }
    }

    public void f() {
        this.e = 0;
        this.q = 0L;
        this.r = false;
        this.l = false;
        this.p = false;
        this.n = null;
    }

    // 去混淆评级： 低(20)
    public boolean g(int v) {
        return this.l && this.m[v];
    }
}

