package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

@UnstableApi
public final class TrueHdSampleRechunker {
    private final byte[] a;
    private boolean b;
    private int c;
    private long d;
    private int e;
    private int f;
    private int g;

    public TrueHdSampleRechunker() {
        this.a = new byte[10];
    }

    public void a(TrackOutput trackOutput0, @Nullable CryptoData trackOutput$CryptoData0) {
        if(this.c > 0) {
            trackOutput0.f(this.d, this.e, this.f, this.g, trackOutput$CryptoData0);
            this.c = 0;
        }
    }

    public void b() {
        this.b = false;
        this.c = 0;
    }

    public void c(TrackOutput trackOutput0, long v, int v1, int v2, int v3, @Nullable CryptoData trackOutput$CryptoData0) {
        Assertions.j(this.g <= v2 + v3, "TrueHD chunk samples must be contiguous in the sample queue.");
        if(!this.b) {
            return;
        }
        int v4 = this.c;
        this.c = v4 + 1;
        if(v4 == 0) {
            this.d = v;
            this.e = v1;
            this.f = 0;
        }
        this.f += v2;
        this.g = v3;
        if(v4 + 1 >= 16) {
            this.a(trackOutput0, trackOutput$CryptoData0);
        }
    }

    public void d(ExtractorInput extractorInput0) throws IOException {
        if(this.b) {
            return;
        }
        extractorInput0.k(this.a, 0, 10);
        extractorInput0.o();
        if(Ac3Util.j(this.a) == 0) {
            return;
        }
        this.b = true;
    }
}

