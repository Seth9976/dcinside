package androidx.media3.extractor.ogg;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorUtil;
import java.io.IOException;

final class OggPageHeader {
    public int a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public int g;
    public int h;
    public int i;
    public final int[] j;
    private final ParsableByteArray k;
    public static final int l = 27;
    public static final int m = 0xFF;
    public static final int n = 0xFE01;
    public static final int o = 0xFF1B;
    private static final int p = 0x4F676753;
    private static final int q = 4;

    OggPageHeader() {
        this.j = new int[0xFF];
        this.k = new ParsableByteArray(0xFF);
    }

    public boolean a(ExtractorInput extractorInput0, boolean z) throws IOException {
        this.b();
        this.k.U(27);
        if(ExtractorUtil.b(extractorInput0, this.k.e(), 0, 27, z) && this.k.N() == 0x4F676753L) {
            int v1 = this.k.L();
            this.a = v1;
            if(v1 != 0) {
                if(!z) {
                    throw ParserException.e("unsupported bit stream revision");
                }
                return false;
            }
            this.b = this.k.L();
            this.c = this.k.y();
            this.d = this.k.A();
            this.e = this.k.A();
            this.f = this.k.A();
            int v2 = this.k.L();
            this.g = v2;
            this.h = v2 + 27;
            this.k.U(v2);
            if(!ExtractorUtil.b(extractorInput0, this.k.e(), 0, this.g, z)) {
                return false;
            }
            for(int v = 0; v < this.g; ++v) {
                this.j[v] = this.k.L();
                this.i += this.j[v];
            }
            return true;
        }
        return false;
    }

    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.g = 0;
        this.h = 0;
        this.i = 0;
    }

    public boolean c(ExtractorInput extractorInput0) throws IOException {
        return this.d(extractorInput0, -1L);
    }

    public boolean d(ExtractorInput extractorInput0, long v) throws IOException {
        Assertions.a(extractorInput0.getPosition() == extractorInput0.p());
        this.k.U(4);
        while(true) {
            int v1 = Long.compare(v, -1L);
            if(v1 != 0 && extractorInput0.getPosition() + 4L >= v || !ExtractorUtil.b(extractorInput0, this.k.e(), 0, 4, true)) {
                break;
            }
            this.k.Y(0);
            if(this.k.N() == 0x4F676753L) {
                extractorInput0.o();
                return true;
            }
            extractorInput0.r(1);
        }
        while((v1 == 0 || extractorInput0.getPosition() < v) && extractorInput0.g(1) != -1) {
        }
        return false;
    }
}

