package androidx.media3.extractor.ogg;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorUtil;
import java.io.IOException;
import java.util.Arrays;

final class OggPacket {
    private final OggPageHeader a;
    private final ParsableByteArray b;
    private int c;
    private int d;
    private boolean e;

    OggPacket() {
        this.a = new OggPageHeader();
        this.b = new ParsableByteArray(new byte[0xFE01], 0);
        this.c = -1;
    }

    private int a(int v) {
        int v1 = 0;
        this.d = 0;
        do {
            int v2 = this.d;
            OggPageHeader oggPageHeader0 = this.a;
            if(v + v2 >= oggPageHeader0.g) {
                break;
            }
            this.d = v2 + 1;
            int v3 = oggPageHeader0.j[v2 + v];
            v1 += v3;
        }
        while(v3 == 0xFF);
        return v1;
    }

    public OggPageHeader b() {
        return this.a;
    }

    public ParsableByteArray c() {
        return this.b;
    }

    public boolean d(ExtractorInput extractorInput0) throws IOException {
        int v1;
        Assertions.i(extractorInput0 != null);
        if(this.e) {
            this.e = false;
            this.b.U(0);
        }
        while(!this.e) {
            if(this.c < 0) {
                if(this.a.c(extractorInput0) && this.a.a(extractorInput0, true)) {
                    int v = this.a.h;
                    if((this.a.b & 1) != 1 || this.b.g() != 0) {
                        v1 = 0;
                    }
                    else {
                        v += this.a(0);
                        v1 = this.d;
                    }
                    if(!ExtractorUtil.e(extractorInput0, v)) {
                        return false;
                    }
                    this.c = v1;
                    goto label_18;
                }
                return false;
            }
        label_18:
            int v2 = this.a(this.c);
            int v3 = this.c + this.d;
            if(v2 > 0) {
                this.b.c(this.b.g() + v2);
                if(!ExtractorUtil.d(extractorInput0, this.b.e(), this.b.g(), v2)) {
                    return false;
                }
                this.b.X(this.b.g() + v2);
                this.e = this.a.j[v3 - 1] != 0xFF;
            }
            if(v3 == this.a.g) {
                v3 = -1;
            }
            this.c = v3;
        }
        return true;
    }

    public void e() {
        this.a.b();
        this.b.U(0);
        this.c = -1;
        this.e = false;
    }

    public void f() {
        if(this.b.e().length == 0xFE01) {
            return;
        }
        byte[] arr_b = Arrays.copyOf(this.b.e(), Math.max(0xFE01, this.b.g()));
        this.b.W(arr_b, this.b.g());
    }
}

